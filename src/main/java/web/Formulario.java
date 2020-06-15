package web;

import java.io.IOException;
import java.io.PrintWriter;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/Formulario")
public class Formulario extends HttpServlet{
    
    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws IOException{
        String user = request.getParameter("Usuario");
        String pass = request.getParameter("Password");
        String interes = request.getParameter("interes");
        String gen = request.getParameter("genero");
        String ocupacion = request.getParameter("ocupacion");
        String gustoMusical = request.getParameter("musica[]");
        String comentarios = request.getParameter("comentarios");
        
        
        PrintWriter out = response.getWriter();
        out.print("<html>");
        out.print("<body>");
        out.print("El parametro del Usuario es: "+user);
        out.print("<br/>");
        out.print("El parametro del Password es: "+pass);
        out.print("<br/>");
        
        out.print("<br/>");
        out.print("<br/>");
        out.print("La tecnologia de interes es: "+interes);
        
        out.print("<br/>");
        out.print("<br/>");
        out.print("Género: " + gen);
        
        out.print("<br/>");
        out.print("<br/>");
        out.print("La ocupacion es: "+ocupacion);
        
        out.print("<br/>");
        out.print("<br/>");
        out.print("El gusto musical es: "+gustoMusical);
        
        out.print("<br/>");
        out.print("<br/>");
        out.print("Comentarios: "+comentarios);
        
        out.print("</body>");
        out.print("</html>");
         
    }
}