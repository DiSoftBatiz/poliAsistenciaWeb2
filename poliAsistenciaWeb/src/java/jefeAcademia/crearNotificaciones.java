/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package jefeAcademia;

/**
 *
 * @author Caleb
 */
public class crearNotificaciones {

    private int _idPersona = 0;
    private int _idTipo = 0;
    private String _numero = "";
    private String _nombre = "";
    private String _notificacion = "";
    private String _paterno = "";
    private String _materno = "";

    public crearNotificaciones(int idPersona, int idTipo, String numero, String nombre, String paterno, String materno) {
        _idPersona = idPersona;
        _idTipo = idTipo;
        _numero = numero;
        _nombre = nombre;
        _paterno = paterno;
        _materno = materno;
    }

    public String dibujarCreadorNotificaciones(String mensaje) {
        String script = "<script>\n"
                + "            window.onload = function () {\n"
                + "                var barrita = document.getElementById('barrita');\n"
                + "                barrita.style.visibility = 'hidden';\n"
                + "                barrita.style.opacity = '0';\n"
                + "            };\n"
                + "            \n"
                + "        </script>";
        String cargar = "<div id=\"barrita\">\n"
                + "            <div id=\"cargar\" class=\"mdl-progress mdl-js-progress mdl-progress__indeterminate\"><br><center><span class=\"titulo\">Cargando...</span></center></div> \n"
                + "        </div>";
        String html = "";
        String msj = mensaje;
        if (!msj.equals("")) {
            script = "<script>\n"
                    + "            window.onload = function () {\n"
                    + "                var notification = document.querySelector('.mdl-js-snackbar');\n"
                    + "                notification.MaterialSnackbar.showSnackbar(\n"
                    + "                        {\n"
                    + "                            message: '" + mensaje + "'\n"
                    + "                        }\n"
                    + "                );\n"
                    + "            };\n"
                    + "\n"
                    + "        </script>";
            html = "<div id=\"demo-toast-example\" class=\"mdl-js-snackbar mdl-snackbar\">\n"
                    + "                    <div class=\"mdl-snackbar__text\"></div>\n"
                    + "                    <button class=\"mdl-snackbar__action\" type=\"button\"></button>\n"
                    + "                </div>";
            cargar="";
        }
        
        _notificacion = "\n"
                + "<!DOCTYPE html>\n"
                + "<html>\n"
                + "    <head>\n"
                + "        <meta http-equiv=\"Content-Type\" content=\"text/html; charset=UTF-8\">\n"
                + "        <meta name=\"description\" content=\"PoliAsistencia\">\n"
                + "        <meta name=\"viewport\" content=\"width=device-width, initial-scale=1.0, minimum-scale=1.0\">\n"
                + "        <title>Crear Notificación</title>\n"
                + "        <link href=\"../css/mdl/material.css\" rel=\"stylesheet\" type=\"text/css\"/>\n"
                + "        <script src=\"../css/mdl/material.js\" type=\"text/javascript\"></script>\n"
                + "        <link href=\"../css/mdl/material.min.css\" rel=\"stylesheet\" type=\"text/css\"/>\n"
                + "        <script src=\"../css/mdl/material.min.js\" type=\"text/javascript\"></script>\n"
                + "        <link rel=\"shortcut icon\" href=\"../imagenes/iconos/poliAsistIcono.ico\" />\n"
                + "        <link href=\"https://fonts.googleapis.com/icon?family=Material+Icons\" rel=\"stylesheet\">\n"
                + "        <meta name=\"theme-color\" content=\"#00B0FF\" />\n"
                + "        <script src=\"https://cdnjs.cloudflare.com/ajax/libs/Chart.js/2.4.0/Chart.min.js\"></script>\n"
                + "        <script src=\"scripts/parallax.js\" type=\"text/javascript\"></script>\n"
                + "        <script src=\"https://ajax.googleapis.com/ajax/libs/jquery/1.11.0/jquery.min.js\"></script>\n"
                + "        <meta name=\"viewport\" content=\"width=device-width, initial-scale=1.0\">\n"
                + "        <meta name=\"HandheldFriendly\" content=\"true\">\n"
                + "        <style>\n"
                + "@font-face{\n"
                + "                font-family: Calibri;\n"
                + "                src: URL(\"../fuentes/calibri.ttf\") format(\"opentype\");\n"
                + "            }"
                + "            .titulo{\n"
                + "                font-size: 35px;\n"
                + "                color: #00B0FF;\n"
                + "                font-family: Calibri;\n"
                + "                padding-top: 30px;\n"
                + "            }\n"
                + "            .tituloBold{\n"
                + "                font-size: 40px;\n"
                + "                color: #0091EA;\n"
                + "                font-weight: bold;\n"
                + "                font-family: Calibri;\n"
                + "                padding-top: 30px;\n"
                + "            }\n"
                + "            .titulob{\n"
                + "                font-size: 35px;\n"
                + "                color: white;\n"
                + "                font-family: Calibri;\n"
                + "                padding-top: 33px;\n"
                + "            }\n"
                + "            .tituloBoldb{\n"
                + "                font-size: 40px;\n"
                + "                color: white;\n"
                + "                font-weight: bold;\n"
                + "                font-family: Calibri;\n"
                + "                padding-top: 33px;\n"
                + "            }\n"
                + "            #tarjeta{\n"
                + "                background-color: rgba(250, 250, 250, 0.4);\n"
                + "                text-align: left;\n"
                + "                color: white;\n"
                + "                font-size: 30px;\n"
                + "                width: auto;\n"
                + "                height: 30px;\n"
                + "                position: relative;\n"
                + "                border-radius: 5px;\n"
                + "                padding-top: 5px;\n"
                + "                font-family: Calibri; \n"
                + "            }\n"
                + "            .centrado{\n"
                + "                position: absolute;\n"
                + "                width: auto;\n"
                + "                height: auto;\n"
                + "                padding-left: 35%;\n"
                + "            }\n"
                + "            .persona{\n"
                + "                background-color: rgba(250, 250, 250, 0.0);\n"
                + "                color: white;\n"
                + "                font-size: 20px;\n"
                + "                border: 2px solid rgba(250, 250, 250, 0.0);\n"
                + "                width: auto;\n"
                + "            }\n"
                + "            #cuenta, #salir{\n"
                + "                display: none;\n"
                + "            }\n"
                + "            #barrita{\n"
                + "                background-color: white;\n"
                + "                height: 100%;\n"
                + "                width: 100%;\n"
                + "                position: fixed;\n"
                + "                -webkit-transition: all 1s ease;\n"
                + "                -o-transition: all 1s ease;\n"
                + "                transition: all 1s ease;\n"
                + "                z-index: 10000;\n"
                + "\n"
                + "            }\n"
                + "            #cargar{\n"
                + "                position: absolute;\n"
                + "                top: 0;\n"
                + "                left: 0;\n"
                + "                right: 0;\n"
                + "                bottom: 0;\n"
                + "                margin: auto;\n"
                + "            }\n"
                + "            .demo-card-wide.mdl-card {\n"
                + "                width: 700px;\n"
                + "            }\n"
                + "            #load{\n"
                + "                background-color: rgba(0, 0, 0, 0.7);\n"
                + "                height: 100%;\n"
                + "                width: 100%;\n"
                + "                position: fixed;\n"
                + "                -webkit-transition: all 1s ease;\n"
                + "                -o-transition: all 1s ease;\n"
                + "                transition: all 1s ease;\n"
                + "                z-index: 10000; visibility: hidden;\n"
                + "                opacity: 0;"
                + "\n"
                + "            }\n"
                + "            #subirF{\n"
                + "                position: absolute;\n"
                + "                top: 0;\n"
                + "                left: 0;\n"
                + "                right: 0;\n"
                + "                bottom: 0;\n"
                + "                margin: auto;\n"
                + "            }\n"
                + "            .demo-card-wide > .mdl-card__title {\n"
                + "                color: #fff;\n"
                + "                height: auto;\n"
                + "                background-color: black;\n"
                + "            }\n"
                + "            .demo-card-wide > .mdl-card__menu {\n"
                + "                color: #fff;\n"
                + "            }\n"
                + "            .notificacion{\n"
                + "                padding-top: 15px;\n"
                + "                padding-bottom: 15px;\n"
                + "            }\n"
                + "            .editor{\n"
                + "                background-color: #fff; width: 30%; height: auto; float: left; margin: 30px; box-shadow: 0 6px 20px 0 rgba(0, 0, 0, 0.19); overflow: scroll;\n"
                + "            }\n"
                + "            .notificacionEditor{\n"
                + "                margin-top: 70px; margin-left: 50px;\n"
                + "            }\n"
                + "            .mdl-textfield{\n"
                + "                width:70%;\n"
                + "            }\n"
                + "            /* Rules for sizing the icon. */\n"
                + "            .material-icons.md-18 { font-size: 18px; }\n"
                + "            .material-icons.md-24 { font-size: 24px; }\n"
                + "            .material-icons.md-36 { font-size: 26px; }\n"
                + "            .material-icons.md-48 { font-size: 54px; }\n"
                + "\n"
                + "            /* Rules for using icons as black on a light background. */\n"
                + "            .material-icons.md-dark { color: rgba(0, 0, 0, 0.54); }\n"
                + "            .material-icons.md-dark.md-inactive { color: rgba(0, 0, 0, 0.26); }\n"
                + "\n"
                + "            /* Rules for using icons as white on a dark background. */\n"
                + "            .material-icons.md-light { color: rgba(255, 255, 255, 1); }\n"
                + "            .material-icons.md-light.md-inactive { color: rgba(255, 255, 255, 0.3); }\n"
                + "\n"
                + "            .tarjetas{\n"
                + "                background-color: white;\n"
                + "                width: auto;\n"
                + "                height: 200px;\n"
                + "                transition: all 0.3s cubic-bezier(.25,.8,.25,1);\n"
                + "                box-shadow: 0px 1px 2px rgba(0,0,0,0.09), 0 1px 2px rgba(0,0,0,0.25);\n" 
                +                  "border-radius: 8px 8px;"
                + "                text-decoration: none;\n"
                + "                height: auto;\n"
                + "                overflow: hidden;\n"
                + "            }\n"
                + "            a{\n"
                + "                text-decoration: none;\n"
                + "                color: inherit;\n"
                + "            }\n"
                + "            .tarjetas:hover{\n"
                + "                box-shadow: 0 10px 20px rgba(0,0,0,0.19), 0 6px 6px rgba(0,0,0,0.23);\n"
                + "            }\n"
                + "            .mdl-grid.center-items {\n"
                + "                justify-content: center;\n"
                + "            }\n"
                + "            .iconos{\n"
                + "                width: 100%; height: 50px; position: relative; float: left;\n"
                + "                display: flex; justify-content: center; align-content: center; flex-direction: column; text-align: center;\n"
                + "                color: white; font-size: 30px;\n"
                + "\n"
                + "            }\n"
                + "            .descripcion{\n"
                + "                width: 100%; height: inherit; position: relative; float: left; color: gray; height: 150px;\n"
                + "                font-size: 20px; display: flex; justify-content: center; align-content: center; flex-direction: column; text-align: center;\n"
                + "            }\n"
                + "            .paralaje{\n"
                + "                display: flex; justify-content: center; align-content: center; flex-direction: column; text-align: center; height: 50px;\n"
                + "                font-size: 30px; color: white;\n"
                + "                background-image: url(\"imagenes/fondo.jpg\") !important;\n"
                + "                background-repeat: no-repeat;\n"
                + "                background-size: 100%, 100%;\n"
                + "\n"
                + "            }\n"
                + "\n"
                + "            .seleccionado{\n"
                + "                background: linear-gradient(to right, rgb(0, 145, 234), rgb(0, 158, 255));\n"
                + "                color: white !important;\n"
                + "                font-size: 20px;\n"
                + "\n"
                + "            }\n"
                + "            .disponible{\n"
                + "                font-size: 20px;\n"
                + "                transition: all 0.3s;\n"
                + "            }\n"
                + "            input[type=file]::-webkit-file-upload-button {\n"
                + "                \n"
                + "                line-height: 30px;\n"
                + "                text-align: center;\n"
                + "                background: #0091EA;\n"
                + "                transition: background 0.2s;\n"
                + "                border: 1px solid rgba(0,0,0,0.1);\n"
                + "                color: #fff;\n"
                + "                display: inline-block;\n"
                + "            }\n"
                + "            input[type=file]::-webkit-file-upload-button:hover {\n"
                + "                background: white;\n"
                + "                color: #0091EA;\n"
                + "  \n"
                + "            }\n"
                + "            input[type=file]{\n"
                + "                border: 2px solid whitesmoke;\n"
                + "                border-radius: 3px;\n"
                + "            }\n"
                + "\n"
                + "\n"
                + "            @media screen and (max-width: 479px){\n"
                + "                .mdl-grid{\n"
                + "\n"
                + "                }\n"
                + "            }\n"
                + "            @media screen and (max-width: 500px){\n"
                + "                .titulob{\n"
                + "                    font-size: 35px;\n"
                + "                    color: transparent;\n"
                + "                    font-family: Calibri;\n"
                + "                    padding-top: 33px;\n"
                + "                }\n"
                + "                .tituloBoldb{\n"
                + "                    font-size: 40px;\n"
                + "                    color: transparent;\n"
                + "                    font-weight: bold;\n"
                + "                    font-family: Calibri;\n"
                + "                    padding-top: 33px;\n"
                + "                }\n"
                + "                .notificacion{\n"
                + "                    padding-left: 5px;\n"
                + "                    padding-right: 5px;\n"
                + "                }\n"
                + "                .editor{\n"
                + "                    width: 100%;\n"
                + "                }\n"
                + "                .notificacionEditor{\n"
                + "                    margin-top: auto; margin-left: auto; width: 90%; left: 10%;\n"
                + "                }\n"
                + "                .mdl-grid{\n"
                + "\n"
                + "                }\n"
                + "\n"
                + "\n"
                + "\n"
                + "            }\n"
                + "            @media screen and (max-width: 839px){\n"
                + "                .mdl-grid{\n"
                + "\n"
                + "                }\n"
                + "            }\n"
                + "\n"
                + "            @media screen and (max-width: 1024px){\n"
                + "                .titulob{\n"
                + "                    font-size: 0px;\n"
                + "                    position: absolute;\n"
                + "                    float: right;\n"
                + "                }\n"
                + "                .tituloBoldb{\n"
                + "                    font-size: 0px;\n"
                + "                    position: absolute;\n"
                + "                    float: right;\n"
                + "                }\n"
                + "                #cuenta, #salir{\n"
                + "                    display: block;\n"
                + "                }\n"
                + "                .notificacion{\n"
                + "                    padding-left: 50px;\n"
                + "                    padding-right: 50px;\n"
                + "                }\n"
                + "                .editor{\n"
                + "\n"
                + "                }\n"
                + "                .notificacionEditor{\n"
                + "                    padding-left: 50px;\n"
                + "                    padding-right: 50px;\n"
                + "                }\n"
                + "\n"
                + "\n"
                + "\n"
                + "            }\n"
                + "        </style>\n"
                + "        "+script+"\n"
                + "    </head>\n"
                + "    <body>\n"
                + "        "+cargar+"\n"
                + "        <div id=\"load\">\n"
                + "            <div id=\"subirF\" class=\"mdl-progress mdl-js-progress mdl-progress__indeterminate\"><br><center><span class=\"titulo\" style=\"color: white;\">Subiendo notificación...</span></center></div> \n"
                + "        </div>\n"
                + "        <!-- Always shows a header, even in smaller screens. -->\n"
                + "        <div class=\"mdl-layout mdl-js-layout mdl-layout--fixed-header\">\n"
                + "            <header class=\"mdl-layout__header\" style=\"background-color: transparent;\">\n"
                + "                <div class=\"mdl-layout__header-row\" style=\"background: linear-gradient(to right, #0091EA, #00D4FF);\">\n"
                + "                    <!-- Title -->\n"
                + "                    <div id=\"tarjeta\">&nbsp;Notificaciones&nbsp;</div><div class=\"centrado\"><span class=\"titulob\">&nbsp;Poli<span class=\"tituloBoldb\">Asistencia</span></span></div>\n"
                + "                    <!-- Add spacer, to align navigation to the right -->\n"
                + "                    <div class=\"mdl-layout-spacer\"></div>\n"
                + "\n"
                + "                    <!-- Navigation. We hide it in small screens. -->\n"
                + "                    <nav class=\"mdl-navigation mdl-layout--large-screen-only\">\n"
                + "                        <button id=\"demo-menu-lower-right\"\n"
                + "                                class=\"persona\">\n"
                + "                            "+_nombre+"\n"
                + "                        </button>\n"
                + "                        <ul class=\"mdl-menu mdl-menu--bottom-right mdl-js-menu mdl-js-ripple-effect\"\n"
                + "                            for=\"demo-menu-lower-right\">\n"
                + "                            <a href=\"../configuracion\"><li class=\"mdl-menu__item\">Configuración de la cuenta</li></a>\n"
                + "                            <a href=\"../cerrarSesion\"><li class=\"mdl-menu__item\">Cerrar Sesión</li></a>\n"
                + "                        </ul>\n"
                + "                    </nav>\n"
                + "                </div>\n"
                + "            </header>\n"
                + "            <div class=\"mdl-layout__drawer\">\n"
                + "                <span class=\"titulo\">&nbsp;Poli<span class=\"tituloBold\">Asistencia</span></span>\n"
                + "                <nav class=\"mdl-navigation\">\n"


                + "                    <a class=\"mdl-navigation__link disponible\" href=\"../inicio\"><i class=\"material-icons md-36 md-dark\">home</i> Inicio</a>\n"
                + "                    <a class=\"mdl-navigation__link disponible\" href=\"../horario\" ><i class=\"material-icons md-36 md-dark\">date_range</i> Horario</a>\n"
                + "                    <a class=\"mdl-navigation__link disponible\" href=\"../estadisticas\"><i class=\"material-icons md-36 md-dark\">insert_chart</i> Estadisticas</a>\n"
                + "                    <a class=\"mdl-navigation__link seleccionado\" href=\"../notificaciones\"><i class=\"material-icons md-36 md-light\">list</i> Notificaciones</a>\n"
                + "                    <a class=\"mdl-navigation__link disponible\" href=\"../configuracion\"><i class=\"material-icons md-36 md-dark\">settings</i> Configuración</a>\n"
                + "                    <a class=\"mdl-navigation__link disponible\" href=\"../cerrarSesion\"><i class=\"material-icons md-36 md-dark\">exit_to_app</i> Cerrar Sesión</a>\n"
                + "\n"
                + "                </nav>\n"
                + "            </div>\n"
                + "            <main class=\"mdl-layout__content\" style=\"background-color: #F9F9F9;\">\n"
                + "                <div class=\"mdl-grid center-items\">\n"
                + "                    <div class=\"mdl-cell mdl-cell--6-col\" style=\"\">\n"
                + "                        <div class=\"tarjetas\" style=\"height: auto; overflow: auto; padding: 10px;\">\n"
                + "                            <center>\n"
                + "                                <br><br>\n"
                + "                                <form action=\"../consumoSubirImagenNotificacionProfesor\" method=\"POST\" enctype=\"multipart/form-data\" id=\"subir\">\n"
                + "                                    <div class=\"mdl-textfield mdl-js-textfield mdl-textfield--floating-label\">\n"
                + "                                        <input class=\"mdl-textfield__input\" type=\"text\" id=\"tit\" name=\"tit\" required>\n"
                + "                                        <label class=\"mdl-textfield__label\" for=\"tit\" style=\"\">Título</label>\n"
                + "                                    </div>\n"
                + "                                    <br>\n"
                + "                                    <div class=\"mdl-textfield mdl-js-textfield\">\n"
                + "                                        <textarea class=\"mdl-textfield__input\" type=\"text\" rows= \"3\" id=\"info\" name=\"info\" required></textarea>\n"
                + "                                        <label class=\"mdl-textfield__label\" for=\"info\">Información</label>\n"
                + "                                    </div>\n"
                + "\n"
                + "                                    <br><br>\n"
                + "                                    <div class=\"mdl-textfield mdl-js-textfield mdl-textfield--floating-label\">\n"
                + "                                        <input class=\"mdl-textfield__input\" type=\"text\" id=\"url\" name=\"url\" required>\n"
                + "                                        <label class=\"mdl-textfield__label\" for=\"url\">Añadir URL</label>\n"
                + "                                    </div><br>\n"
                + "                                    <input type=\"file\" name=\"subir\" accept=\"image/*\"  id=\"subir\" ><br><br>\n"
                + "                                    \n"
                + "                                     <div style=\"text-align: left; display: table; margin: 0 auto;\"><label class=\"mdl-switch mdl-js-switch mdl-js-ripple-effect\" for=\"mail\">\n" +
                "                                       <input type=\"checkbox\" id=\"mail\" class=\"mdl-switch__input\" name=\"mail\">\n" +
                "                                       <span class=\"mdl-switch__label\">Enviar correo a los destinatarios</span>\n" +
                "                                       </label></div><br><br>\n"
                + "                                    <input type=\"submit\" class=\"mdl-button mdl-js-button mdl-button--raised mdl-js-ripple-effect mdl-button--primary\" value=\"subir notificación\" id=\"subirNotificacion\">\n"
                + "                                    <br>\n"
                + "                                </form>\n"
                + "                            </center>\n"
                + "                        </div>\n"
                + "                    </div>\n"
                + "                    <div class=\"mdl-cell mdl-cell--6-col\">\n"
                + "                        <div style=\"text-align: center; font-size: 30px; color: #0091EA; margin-bottom: 30px; margin-top: 20px;\">Vista previa</div>\n"
                + "        <div class=\"mdl-grid center-items\">\n"
                + "            <div class=\"mdl-cell mdl-cell--12-col\" style=\"transition: all 0.3s cubic-bezier(.25,.8,.25,1); box-shadow: 0px 1px 2px rgba(0,0,0,0.09), 0 1px 2px rgba(0,0,0,0.25); border-radius: 3px 3px;  background-color: white;\">\n"
                + "                <div class=\"mdl-grid\">\n"
                + "                    <div class=\"mdl-cell mdl-cell--12-col\">\n"
                + "                        <div class=\"mdl-grid\" style=\"padding: 0px\">\n"
                + "                            <div class=\"mdl-cell mdl-cell--4-col\" style=\"width: 50px; height: 50px; border-radius: 50%; background-repeat: no-repeat; background-position: center center; background-size: cover; background-image: url('../"+traerUrl(_idPersona)+"'); margin: 0px; padding: 0px; /**/position: relative; position: relative; float: left; display: flex; justify-content: center; align-content: center; flex-direction: column; text-align: center;\"></div>\n"
                + "                            <div class=\"mdl-cell mdl-cell--8-col\" style=\"margin-top: 5px; /**/position: relative; position: relative; float: left; display: flex; justify-content: center; align-content: center; flex-direction: column; height: auto; overflow: hidden;\">\n"
                + "                                <div style=\"font-weight: bold; font-size: 12px;\">"+_nombre+" "+_paterno+" "+_materno+"</div>\n"
                + "                                <div style=\"color: #0091EA; font-weight: bold; font-size: 17px;\" id=\"titTarjeta\">Titulo</div>\n"
                + "                            </div>\n"
                + "                        </div>\n"
                + "                    </div>\n"
                + "                </div>\n"
                + "                <div class=\"mdl-grid \">\n"
                + "                    <div class=\"mdl-cell mdl-cell--12-col\" id=\"infoTarjeta\">\n"
                + "                        Descripcion xd\n"
                + "                    </div>\n"
                + "                </div>\n"
                + "                <div class=\"mdl-grid\" style=\"margin: 0px; padding: 0px\">\n"
                + "                    <div class=\"mdl-cell mdl-cell--12-col\" style=\"margin: 0px; padding: 0px\">\n"
                + "                        <div class=\"mdl-grid\" style=\"margin: 0px; padding: 0px\">\n"
                + "                            <div class=\"mdl-cell mdl-cell--3-col\" style=\"float: right;\">\n"
                + "                                <button class=\"mdl-button mdl-js-button mdl-button--primary\" style=\"color: rgb(0, 229, 10); width: 100%; margin: 5px;\" onclick=\"verUrl('a')\">\n"
                + "                                    Ver mas\n"
                + "                                </button>\n"
                + "                            </div>\n"
                + "                        </div>\n"
                + "                    </div>\n"
                + "                </div>\n"
                + "            </div>\n"
                + "        </div>"
                + "                    </div>\n"
                + "                    \n"
                + "                </div>\n"
                + " "+html+"\n"
                + "            </main>\n"
                + "        </div>\n"
                + "        <script>\n"
                + "            function llenarTitulo(event) {\n"
                + "                var texto = event.target.value;\n"
                + "                if (texto === '') {\n"
                + "                    document.getElementById(\"titTarjeta\").innerHTML = 'Titulo';\n"
                + "                } else {\n"
                + "                    document.getElementById(\"titTarjeta\").innerHTML = texto;\n"
                + "                }\n"
                + "\n"
                + "            }\n"
                + "            document.querySelector('#tit').addEventListener('keyup', llenarTitulo, false);\n"
                + "\n"
                + "            function llenarInfo(event) {\n"
                + "                var texto = event.target.value;\n"
                + "                if (texto === '') {\n"
                + "                    document.getElementById(\"infoTarjeta\").innerHTML = 'Descripcion';\n"
                + "                } else {\n"
                + "                    document.getElementById(\"infoTarjeta\").innerHTML = texto;\n"
                + "                }\n"
                + "\n"
                + "            }\n"
                + "            document.querySelector('#info').addEventListener('keyup', llenarInfo, false);\n"
                + "\n"
                + "            function llenarBoton(event) {\n"
                + "                var texto = event.target.value;\n"
                + "                if (texto === '') {\n"
                + "                    document.getElementById(\"boton\").innerHTML = '';\n"
                + "                } else {\n"
                + "                    document.getElementById(\"boton\").innerHTML = '<button  class=\\\"mdl-button mdl-js-button mdl-button--primary\\\" style=\\\"color: rgb(0, 229, 10); width: 50%; margin: 5px;\\\">Ver mas detalles</button>';\n"
                + "                }\n"
                + "\n"
                + "            }\n"
                + "            document.querySelector('#url').addEventListener('keyup', llenarBoton, false);\n"
                + "\n"
                + "            document.getElementById(\"subirNotificacion\").onclick = function () {\n"
                + "                 var tit = document.getElementById('tit').value;"
                + "                 var info = document.getElementById('info').value;"
                + "                 var url = document.getElementById('url').value;"
                + "                 if (tit !== ''  && info !== '' && url !== ''){"
                + "                      var sub = document.getElementById('load');\n"
                + "                      sub.style.visibility='visible';"
                + "                      sub.style.opacity='1';"
                + "                 }"
                + "            };\n"
                + "        </script>\n"
                + "    </body>\n"
                + "</html>\n"
                + "";
        return _notificacion;
    }

    private static String traerUrl(int idPer) {
        serviciosWeb.Usuario_Service service = new serviciosWeb.Usuario_Service();
        serviciosWeb.Usuario port = service.getUsuarioPort();
        return port.traerUrl(idPer);
    }
}
