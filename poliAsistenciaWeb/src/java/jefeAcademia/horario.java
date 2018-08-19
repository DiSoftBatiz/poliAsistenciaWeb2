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
public class horario {

    private int _idPersona = 0;
    private int _idTipo = 0;
    private String _numero = "";
    private String _nombre = "";
    private String _horario = "";

    public horario(int idPersona, int idTipo, String numero, String nombre) {
        _idPersona = idPersona;
        _idTipo = idTipo;
        _numero = numero;
        _nombre = nombre;
    }

    public String dibujarHorario() {
        profesor.horario hor = new profesor.horario(_idPersona, _idTipo, _numero, _nombre);
        _horario = "<!DOCTYPE html>\n"
                + "<html>\n"
                + "    <head>\n"
                + "        <meta http-equiv=\"Content-Type\" content=\"text/html; charset=UTF-8\">\n"
                + "        <meta name=\"description\" content=\"PoliAsistencia\">\n"
                + "        <meta name=\"viewport\" content=\"width=device-width, initial-scale=1.0, minimum-scale=1.0\">\n"
                + "        <title>Horario</title>\n"
                + "        <link href=\"css/mdl/material.css\" rel=\"stylesheet\" type=\"text/css\"/>\n"
                + "        <script src=\"css/mdl/material.js\" type=\"text/javascript\"></script>\n"
                + "        <link href=\"css/mdl/material.min.css\" rel=\"stylesheet\" type=\"text/css\"/>\n"
                + "        <script src=\"css/mdl/material.min.js\" type=\"text/javascript\"></script>\n"
                + "        <link rel=\"shortcut icon\" href=\"imagenes/iconos/poliAsistIcono.ico\" />\n"
                + "        <link href=\"https://fonts.googleapis.com/icon?family=Material+Icons\" rel=\"stylesheet\">\n"
                + "        <meta name=\"theme-color\" content=\"#00B0FF\" />\n"
                + "        <meta name=\"viewport\" content=\"width=device-width, initial-scale=1.0\">\n"
                + "        <meta name=\"HandheldFriendly\" content=\"true\">\n"
                + "        <style>\n"
                + "@font-face{\n"
                + "                font-family: Calibri;\n"
                + "                src: URL(\"fuentes/calibri.ttf\") format(\"opentype\");\n"
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
                + "                position: fixed;\n"
                + "                width: 100%;\n"
                + "                height: auto;\n"
                + "                text-align: center; left: 0%\n"
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
                + "                transition: all 0.3s cubic-bezier(.25,.8,.25,1);\n"
                + "                box-shadow: 0px 1px 2px rgba(0,0,0,0.09), 0 1px 2px rgba(0,0,0,0.25);\n" 
                +                  "border-radius: 8px 8px;"
                + "                text-decoration: none;               \n"
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
                + "                width: 30%; height: inherit; position: relative; float: left; border-top-left-radius: 8px; border-bottom-left-radius: 8px;\n"
                + "                display: flex; justify-content: center; align-content: center; flex-direction: column; text-align: center; height: 50px;\n"
                + "            }\n"
                + "            .descripcion{\n"
                + "                width: 100%; height: inherit; position: relative; float: left; color: gray; height: 150px;\n"
                + "                font-size: 20px; display: flex; justify-content: center; align-content: center; flex-direction: column; text-align: center;\n"
                + "            }\n"
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
                + "            .tituloTabla{\n"
                + "                color: white; font-size: 34px; text-align: center; width: 100%; height: 54px; box-shadow: 0 4px 8px 0 rgba(0, 0, 0, 0.2), 0 6px 20px 0 rgba(0, 0, 0, 0.19);\n"
                + "            }\n"
                + "\n"
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
                + "                .demo-card-wide.mdl-card {\n"
                + "                    width: auto;\n"
                + "                }\n"
                + "                .demo-card-wide > .mdl-card__title {\n"
                + "                    height: auto;\n"
                + "                }\n"
                + "                .mdl-card__supporting-text{\n"
                + "                    height: auto;\n"
                + "                }\n"
                + "                .notificacion{\n"
                + "                    padding-left: 50px;\n"
                + "                    padding-right: 50px;\n"
                + "                }\n"
                + "            }\n"
                + "        </style>\n"
                + "        <script>\n"
                + "            window.onload = function () {\n"
                + "                var barrita = document.getElementById('barrita');\n"
                + "                barrita.style.visibility = 'hidden';\n"
                + "                barrita.style.opacity = '0';\n"
                + "            }\n"
                + "        </script>\n"
                + "    </head>\n"
                + "    <body>\n"
                + "        <div id=\"barrita\">\n"
                + "            <div id=\"cargar\" class=\"mdl-progress mdl-js-progress mdl-progress__indeterminate\"><br><center><span class=\"titulo\">Cargando...</span></center></div> \n"
                + "        </div>\n"
                + "        <!-- Always shows a header, even in smaller screens. -->\n"
                + "        <div class=\"mdl-layout mdl-js-layout mdl-layout--fixed-header\">\n"
                + "            <header class=\"mdl-layout__header\" style=\"background-color: transparent;\">\n"
                + "                <div class=\"mdl-layout__header-row\" style=\"background: linear-gradient(to right, #0091EA, #00D4FF);\">\n"
                + "                    <!-- Title -->\n"
                + "                    <div id=\"tarjeta\">&nbsp;Horario&nbsp;</div><div class=\"centrado\"><span class=\"titulob\">Poli<span class=\"tituloBoldb\">Asistencia</span></span></div>\n"
                + "                    <!-- Add spacer, to align navigation to the right -->\n"
                + "                    <div class=\"mdl-layout-spacer\"></div>\n"
                + "\n"
                + "                    <!-- Navigation. We hide it in small screens. -->\n"
                + "                    <nav class=\"mdl-navigation mdl-layout--large-screen-only\" style=\"position: sticky;\">\n"
                + "                        <button id=\"demo-menu-lower-right\"\n"
                + "                                class=\"persona\">\n"
                + "                            "+_nombre+"\n"
                + "                        </button>\n"
                + "                        <ul class=\"mdl-menu mdl-menu--bottom-right mdl-js-menu mdl-js-ripple-effect\"\n"
                + "                            for=\"demo-menu-lower-right\">\n"
                + "                            <a href=\"configuracion\"><li class=\"mdl-menu__item\">Configuración de la cuenta</li></a>\n"
                + "                            <a href=\"cerrarSesion\"><li class=\"mdl-menu__item\">Cerrar Sesión</li></a>\n"
                + "                        </ul>\n"
                + "                    </nav>\n"
                + "                </div>\n"
                + "            </header>\n"
                + "            <div class=\"mdl-layout__drawer\">\n"
                + "                <span class=\"titulo\">&nbsp;Poli<span class=\"tituloBold\">Asistencia</span></span>\n"
                + "                <nav class=\"mdl-navigation\">\n"
                + "                    <a class=\"mdl-navigation__link disponible\" href=\"inicio\"><i class=\"material-icons md-36 md-dark\">home</i> Inicio</a>\n"
                + "                    <a class=\"mdl-navigation__link seleccionado\" href=\"#\" ><i class=\"material-icons md-36 md-light\">date_range</i> Horario</a>\n"
                + "                    <a class=\"mdl-navigation__link disponible\" href=\"estadisticas\"><i class=\"material-icons md-36 md-dark\">insert_chart</i> Estadisticas</a>\n"
                + "                    <a class=\"mdl-navigation__link disponible\" href=\"notificaciones\"><i class=\"material-icons md-36 md-dark\">list</i> Notificaciones</a>\n"
                + "                    <a class=\"mdl-navigation__link disponible\" href=\"configuracion\"><i class=\"material-icons md-36 md-dark\">settings</i> Configuración</a>\n"
                + "                    <a class=\"mdl-navigation__link disponible\" href=\"cerrarSesion\"><i class=\"material-icons md-36 md-dark\">exit_to_app</i> Cerrar Sesión</a>\n"
                + "\n"
                + "                </nav>\n"
                + "            </div>\n"
                + "            <main class=\"mdl-layout__content\" style=\"background-color: #F9F9F9;\">\n"
                + "                <style>\n"
                + "                    table{}\n"
                + "                    .tabla{\n"
                + "                        width: 100%;\n"
                + "\n"
                + "                    }\n"
                + "                    .tabla th{\n"
                + "                        height: 40px;\n"
                + "                        width: 150px;\n"
                + "                    }\n"
                + "                    .tabla td{\n"
                + "                        height: 80px;\n"
                + "                        width: auto;\n"
                + "                        text-align: center;\n"
                + "                        background-color: whitesmoke;\n"
                + "                        color: white;\n"
                + "                        font-size: 20px;\n"
                + "                    }\n"
                + "\n"
                + "                    .hora{\n"
                + "                        background-color: #c5c8cc !important;\n"
                + "                        width: 70px;\n"
                + "                    }\n"
                + "                    .ajustarTabla{\n"
                + "                        width: 100%; height: 250px; overflow: auto;\n"
                + "                    }\n"
                + "\n"
                + "                </style> \n"
                + "                <div class=\"mdl-grid center-items\">\n"
                + "                    <div class=\"mdl-cell mdl-cell--12-col\"></div>\n"
                + "                    <div class=\"mdl-cell mdl-cell--12-col\">\n"
                + "                        <div class=\"tarjetas\">\n"
                + "                            <table class=\"tabla\"><!-- class=\"mdl-data-table mdl-js-data-table mdl-shadow--2dp\" -->\n"
                + "                                <thead>\n"
                + "                                    <tr>\n"
                + "                                        <th class=\"hora\">Hora</th>\n"
                + "                                        <th>Lunes</th>\n"
                + "                                        <th>Martes</th>\n"
                + "                                        <th>Miercoles</th>\n"
                + "                                        <th>Jueves</th>\n"
                + "                                        <th>Viernes</th>\n"
                + "                                    </tr>\n"
                + "                                </thead>\n"
                + "                                <tbody>\n"
                + "                                    <tr>\n"
                + "                                        <td class=\"hora\">7:00</td>\n"
                + "                                        <td id=\"L7\">L7</td>\n"
                + "                                        <td id=\"M7\">M7</td>\n"
                + "                                        <td id=\"Mi7\">Mi7</td>\n"
                + "                                        <td id=\"J7\">J7</td>\n"
                + "                                        <td id=\"V7\">V7</td>\n"
                + "                                    </tr>\n"
                + "                                    <tr>\n"
                + "                                        <td class=\"hora\">8:00</td>\n"
                + "                                        <td id=\"L8\">L8</td>\n"
                + "                                        <td id=\"M8\">M8</td>\n"
                + "                                        <td id=\"Mi8\">Mi8</td>\n"
                + "                                        <td id=\"J8\">J8</td>\n"
                + "                                        <td id=\"V8\">V8</td>\n"
                + "                                    </tr>\n"
                + "                                    <tr>\n"
                + "                                        <td class=\"hora\">9:00</td>\n"
                + "                                        <td id=\"L9\">L9</td>\n"
                + "                                        <td id=\"M9\">M9</td>\n"
                + "                                        <td id=\"Mi9\">Mi9</td>\n"
                + "                                        <td id=\"J9\">J9</td>\n"
                + "                                        <td id=\"V9\">V9</td>\n"
                + "                                    </tr>\n"
                + "                                    <tr>\n"
                + "                                        <td class=\"hora\">10:00</td>\n"
                + "                                        <td id=\"L10\">L10</td>\n"
                + "                                        <td id=\"M10\">M10</td>\n"
                + "                                        <td id=\"Mi10\">Mi10</td>\n"
                + "                                        <td id=\"J10\">J10</td>\n"
                + "                                        <td id=\"V10\">V10</td>\n"
                + "                                    </tr>\n"
                + "                                    <tr>\n"
                + "                                        <td class=\"hora\">11:00</td>\n"
                + "                                        <td id=\"L11\">L11</td>\n"
                + "                                        <td id=\"M11\">M11</td>\n"
                + "                                        <td id=\"Mi11\">Mi11</td>\n"
                + "                                        <td id=\"J11\">J11</td>\n"
                + "                                        <td id=\"V11\">V11</td>\n"
                + "                                    </tr>\n"
                + "                                    <tr>\n"
                + "                                        <td class=\"hora\">12:00</td>\n"
                + "                                        <td id=\"L12\">L12</td>\n"
                + "                                        <td id=\"M12\">M12</td>\n"
                + "                                        <td id=\"Mi12\">Mi12</td>\n"
                + "                                        <td id=\"J12\">J12</td>\n"
                + "                                        <td id=\"V12\">V12</td>\n"
                + "                                    </tr>\n"
                + "                                    <tr>\n"
                + "                                        <td class=\"hora\">13:00</td>\n"
                + "                                        <td id=\"L13\">L13</td>\n"
                + "                                        <td id=\"M13\">M13</td>\n"
                + "                                        <td id=\"Mi13\">Mi13</td>\n"
                + "                                        <td id=\"J13\">J13</td>\n"
                + "                                        <td id=\"V13\">V13</td>\n"
                + "                                    </tr>\n"
                + "                                    <tr>\n"
                + "                                        <td class=\"hora\">14:00</td>\n"
                + "                                        <td id=\"L14\">L14</td>\n"
                + "                                        <td id=\"M14\">M14</td>\n"
                + "                                        <td id=\"Mi14\">Mi14</td>\n"
                + "                                        <td id=\"J14\">J14</td>\n"
                + "                                        <td id=\"V14\">V14</td>\n"
                + "                                    </tr>\n"
                + "                                    <tr>\n"
                + "                                        <td class=\"hora\">15:00</td>\n"
                + "                                        <td id=\"L15\">L15</td>\n"
                + "                                        <td id=\"M15\">M15</td>\n"
                + "                                        <td id=\"Mi15\">Mi15</td>\n"
                + "                                        <td id=\"J15\">J15</td>\n"
                + "                                        <td id=\"V15\">V15</td>\n"
                + "                                    </tr>\n"
                + "                                    <tr>\n"
                + "                                        <td class=\"hora\">16:00</td>\n"
                + "                                        <td id=\"L16\">L16</td>\n"
                + "                                        <td id=\"M16\">M16</td>\n"
                + "                                        <td id=\"Mi16\">Mi16</td>\n"
                + "                                        <td id=\"J16\">J16</td>\n"
                + "                                        <td id=\"V16\">V16</td>\n"
                + "                                    </tr>\n"
                + "                                    <tr>\n"
                + "                                        <td class=\"hora\">17:00</td>\n"
                + "                                        <td id=\"L17\">L17</td>\n"
                + "                                        <td id=\"M17\">M17</td>\n"
                + "                                        <td id=\"Mi17\">Mi17</td>\n"
                + "                                        <td id=\"J17\">J17</td>\n"
                + "                                        <td id=\"V17\">V17</td>\n"
                + "                                    </tr>\n"
                + "                                    <tr>\n"
                + "                                        <td class=\"hora\">18:00</td>\n"
                + "                                        <td id=\"L18\">L18</td>\n"
                + "                                        <td id=\"M18\">M18</td>\n"
                + "                                        <td id=\"Mi18\">Mi18</td>\n"
                + "                                        <td id=\"J18\">J18</td>\n"
                + "                                        <td id=\"V18\">V18</td>\n"
                + "                                    </tr>\n"
                + "                                    <tr>\n"
                + "                                        <td class=\"hora\">19:00</td>\n"
                + "                                        <td id=\"L19\">L19</td>\n"
                + "                                        <td id=\"M19\">M19</td>\n"
                + "                                        <td id=\"Mi19\">Mi19</td>\n"
                + "                                        <td id=\"J19\">J19</td>\n"
                + "                                        <td id=\"V19\">V19</td>\n"
                + "                                    </tr>\n"
                + "                                    <tr>\n"
                + "                                        <td class=\"hora\">20:00</td>\n"
                + "                                        <td id=\"L20\">L20</td>\n"
                + "                                        <td id=\"M20\">M20</td>\n"
                + "                                        <td id=\"Mi20\">Mi20</td>\n"
                + "                                        <td id=\"J20\">J20</td>\n"
                + "                                        <td id=\"V20\">V20</td>\n"
                + "                                    </tr>\n"
                + "                                    <tr>\n"
                + "                                        <td class=\"hora\">21:00</td>\n"
                + "                                        <td id=\"L21\">L21</td>\n"
                + "                                        <td id=\"M21\">M21</td>\n"
                + "                                        <td id=\"Mi21\">Mi21</td>\n"
                + "                                        <td id=\"J21\">J21</td>\n"
                + "                                        <td id=\"V21\">V21</td>\n"
                + "                                    </tr>\n"
                + "                                </tbody>\n"
                + "                            </table>\n"
                + "                        </div>\n"
                + "                    </div>\n"
                + "                    <!-- <div class=\"mdl-cell mdl-cell--10-col\">\n"
                + "                        <div class=\"tarjetas\" style=\"\">\n"
                + "                            <div style=\"background-color: rgb(237, 155, 3);\" class=\"tituloTabla\"><br>Grupos</div>\n"
                + "                            <div class=\"ajustarTabla\">\n"
                + "                            <table class=\"mdl-data-table mdl-js-data-table\" style=\"width: 100%; color: black !important;\">\n"
                + "                                <thead>\n"
                + "                                    <tr >\n"
                + "                                        <th class=\"mdl-data-table__cell--non-numeric\">Grupo</th>\n"
                + "                                        <th class=\"mdl-data-table__cell--non-numeric\">Unidad de Aprendizaje</th>\n"
                + "                                        <th>Alumnos</th>\n"
                + "                                        <th class=\"mdl-data-table__cell--non-numeric\">Especialidad</th>\n"
                + "                                    </tr>\n"
                + "                                </thead>\n"
                + "                                <tbody style=\"color: black !important;\">\n"
                + "                                    <tr>\n"
                + "                                        <td class=\"mdl-data-table__cell--non-numeric\">5IM7</td>\n"
                + "                                        <td class=\"mdl-data-table__cell--non-numeric\">Química III</td>\n"
                + "                                        <td>40</td>\n"
                + "                                        <td class=\"mdl-data-table__cell--non-numeric\">Programación</td>\n"
                + "                                    </tr>\n"
                + "                                    \n"
                + "                                </tbody>\n"
                + "                            </table>\n"
                + "                            </div>\n"
                + "                        </div>\n"
                + "                    </div>\n"
                + "                </div> -->\n"
                + "\n"
                + "                <script>\n"
                + hor.horarioDeLaBase()
                + "                </script>\n"
                + "\n"
                + "            </main>\n"
                + "        </div>\n"
                + "    </body>\n"
                + "</html>\n"
                + "";
        return _horario;
    }
    
}
