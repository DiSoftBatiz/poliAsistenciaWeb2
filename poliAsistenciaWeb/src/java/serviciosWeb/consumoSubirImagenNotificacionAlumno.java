/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package serviciosWeb;

import conexion.imagenes;
import java.io.File;
import java.io.IOException;
import java.io.InputStream;
import java.io.PrintWriter;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.nio.file.StandardCopyOption;
import javax.activation.MimetypesFileTypeMap;
import javax.servlet.ServletException;
import javax.servlet.annotation.MultipartConfig;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import javax.servlet.http.Part;
import javax.xml.ws.WebServiceRef;
import serviciosWebGestion.Gestion_Service;

/**
 *
 * @author Caleb
 */
@WebServlet(name = "consumoSubirImagenNotificacionAlumno", urlPatterns = {"/consumoSubirImagenNotificacionAlumno"})
@MultipartConfig(fileSizeThreshold = 1024 * 1024, // 1 MB 
        maxFileSize = 1024 * 1024 * 2, // 2 MB
        maxRequestSize = 1024 * 1024 * 100)      // 3 MB
public class consumoSubirImagenNotificacionAlumno extends HttpServlet {

    @WebServiceRef(wsdlLocation = "WEB-INF/wsdl/localhost_8080/serviciosWebPoliAsistencia/gestion.wsdl")
    private Gestion_Service service;

    /**
     * Processes requests for both HTTP <code>GET</code> and <code>POST</code>
     * methods.
     *
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
    protected void processRequest(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {

    }

    // <editor-fold defaultstate="collapsed" desc="HttpServlet methods. Click on the + sign on the left to edit the code.">
    /**
     * Handles the HTTP <code>GET</code> method.
     *
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        processRequest(request, response);
    }

    /**
     * Handles the HTTP <code>POST</code> method.
     *
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        processRequest(request, response);
        String mensaje = "";
        try (PrintWriter out = response.getWriter()) {
            HttpSession usr = request.getSession();
            if (usr.getAttribute("idpersona") == null || usr.getAttribute("idtipo") == null) {
                response.sendRedirect("iniciarSesion");
                return;
            }
            int idPersona = Integer.parseInt((String) usr.getAttribute("idpersona"));
            String titulo = new String(request.getParameter("tit").getBytes(), "UTF-8") != null ? new String(request.getParameter("tit").getBytes(), "UTF-8") : "";
            String info = new String(request.getParameter("info").getBytes(), "UTF-8") != null ? new String(request.getParameter("info").getBytes(), "UTF-8") : "";
            String url = new String(request.getParameter("url").getBytes(), "UTF-8") != null ? new String(request.getParameter("url").getBytes(), "UTF-8") : "";
            if(titulo.length() > 100 || info.length() > 200 || url.length() > 300){
                response.sendRedirect("notificaciones/crearNotificaciones?mensaje=El contenido excede a la cantidad de caracteres que soporta una notificacion");
                return;
            }
            Part foto = request.getPart("subir");
            if (foto.getSize() == 0) {
                boolean guardarSinFoto = guardarNotificaciones(1, idPersona, titulo, info, url, "");
                if (guardarSinFoto) {
                    response.sendRedirect("notificaciones/crearNotificaciones?mensaje=Notificacion subida");
                    return;
                } else {
                    response.sendRedirect("notificaciones/crearNotificaciones?mensaje=Error al subir la notificacion, No rebases el numero de caracteres");
                    return;
                }
            } else {
                String identificador = usr.getAttribute("idpersona") + "_" + usr.getAttribute("idtipo");
                String nombreArchivo = Paths.get(foto.getSubmittedFileName()).toString();
                String tipoArchivo = Paths.get(foto.getContentType()).getFileName().toString();
                if (tipoArchivo.equals("png") || tipoArchivo.equals("jpeg")) {
                    File carpeta = new File(conexion.imagenes.NOTIFICACIONES_CALEB_MAC);
                    carpeta.mkdirs();
                    File archivo = File.createTempFile(identificador + "notificacionAlumno" + nombreArchivo, "." + tipoArchivo, carpeta);
                    String contenidoArchivo = new MimetypesFileTypeMap().getContentType(archivo);//mimetype, para saber el contenido del archivo
                    String tipo = contenidoArchivo.split("/")[0];
                    if(!tipo.equals("image")){
                        mensaje = "La imagen que subiste esta alterada o corrompida, intentalo de nuevo";
                        response.sendRedirect("notificaciones/crearNotificaciones?mensaje=" + mensaje);
                        return;
                    }
                    try (InputStream input = foto.getInputStream()) {
                        Files.copy(input, archivo.toPath(), StandardCopyOption.REPLACE_EXISTING);
                    } catch (Exception error) {
                        mensaje = "Error al subir la imagen";
                        response.sendRedirect("notificaciones/crearNotificaciones?mensaje=" + mensaje);
                        return;
                    }
                    String urlbase = "imagenes/notificaciones/alumno/" + archivo.getName();
                    out.println(urlbase);
                    int id = Integer.parseInt((String) usr.getAttribute("idpersona"));
                    boolean guardado = guardarNotificaciones(1, idPersona, titulo, info, url, urlbase);
                    if (guardado) {
                        try {
                            Thread.sleep(2 * 10000);
                        } catch (Exception e) {
                        }
                        mensaje = "Notificacion subida";
                        response.sendRedirect("notificaciones/crearNotificaciones?mensaje=" + mensaje);
                        return;

                    } else {
                        mensaje = "Error";
                    }

                } else {
                    //response.sendRedirect("");
                    mensaje = "Solo se aceptan imagenes con formato jpg y png";
                    response.sendRedirect("notificaciones/crearNotificaciones?mensaje=" + mensaje);
                    return;
                }
            }
        } catch (Exception e) {
            mensaje = "Error";
            response.sendRedirect("notificaciones/crearNotificaciones?mensaje=" + mensaje);
            return;
        }
        response.sendRedirect("notificaciones/crearNotificaciones?mensaje=" + mensaje);

    }

    /**
     * Returns a short description of the servlet.
     *
     * @return a String containing servlet description
     */
    @Override
    public String getServletInfo() {
        return "Short description";
    }// </editor-fold>

    private boolean guardarNotificaciones(int tipoNotificacion, int idPersona, java.lang.String titulo, java.lang.String descripcion, java.lang.String url, java.lang.String urlImg) {
        // Note that the injected javax.xml.ws.Service reference as well as port objects are not thread safe.
        // If the calling of port operations may lead to race condition some synchronization is required.
        serviciosWebGestion.Gestion port = service.getGestionPort();
        return port.guardarNotificaciones(tipoNotificacion, idPersona, titulo, descripcion, url, urlImg);
    }



}
