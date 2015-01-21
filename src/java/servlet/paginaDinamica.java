/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package servlet;

import java.io.IOException;
import java.io.PrintWriter;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 *
 * @author Alumno
 */
@WebServlet(name = "paginaDinamica", urlPatterns = {"/paginaDinamica"})
public class paginaDinamica extends HttpServlet {

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
        response.setContentType("text/html;charset=UTF-8");
        try (PrintWriter out = response.getWriter()) {
            /* TODO output your page here. You may use following sample code. */
            //out.println("<!DOCTYPE html>");
            String pagina = request.getParameter("pagina");

            if(pagina.equals("1"))
            {
                out.print("
                    <!DOCTYPE html>
                    <html lang="es">
                    <head>
                      <meta charset="utf-8"/>
                      <meta name="description" content="Pagina en servlet"/>
                      <meta name="viewport" content="width=device-width, minimum-scale=1 maximum-scale=1"/>
                      <title>Servlet Response</title>
                      <link href='http://fonts.googleapis.com/css?family=Open+Sans:400,700' rel='stylesheet' type='text/css'>
                      <link rel="stylesheet" type="text/css" href="normalize.css">
                      <link rel="stylesheet" type="text/css" href="estilos.css">
                    </head>
                    <body>
                      <header>
                      <h1><a href="#">Hola bienvenido al registro</a></h1>
                    </header>
                      <div id="contenido">
                      <form action="paginaDinamica\" method="post" id="form">
                        <input type="text" placeholder="Nombre"/><br /><br />
                        <input type="text" placeholder="Apellido Paterno"/><br /><br />
                        <input type="text" placeholder="Apellido Materno"/><br /><br />
                        <input type="email" placeholder="Correo"/><br /><br />
                        <input type="submit"/>
                      </form>
                      </div>
                    <footer>
                      <p>
                        <strong>Powered by Me</strong>
                      </p>
                      <p>
                          Hasta footer tiene :3
                      </p>
                    </footer>
                      </body>
                    </html>
                ");
            }
            else
            {
                if(pagina.equals("2"))
                {
                    out.println("procesamos y pintamos pagina 2");
                }
                else
                {
                    out.println("pintamos formulario");
                }
            }


        }
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

}
