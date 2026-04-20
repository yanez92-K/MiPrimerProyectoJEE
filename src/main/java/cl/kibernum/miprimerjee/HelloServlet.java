package cl.kibernum.miprimerjee;

import java.io.*;
import jakarta.servlet.http.*;
import jakarta.servlet.annotation.*;

@WebServlet(name = "supernaturalServlet", value = "/ver-info")
public class HelloServlet extends HttpServlet {
    private String titulo;
    private String fraseCelebre;

    public void init() {
        titulo = "ARCHIVOS DEL BÚNKER: HOMBRES DE LETRAS";
        fraseCelebre = "Salvar personas, cazar cosas... el negocio familiar.";
    }

    public void doGet(HttpServletRequest request, HttpServletResponse response) throws IOException {
        response.setContentType("text/html;charset=UTF-8");

        PrintWriter out = response.getWriter();
        out.println("<html>");
        out.println("<head>");
        out.println("<style>");
        // CSS inyectado directamente en el Servlet
        out.println("body { font-family: 'Garamond', serif; background-color: #1a1a1a; color: #dcdcdc; display: flex; justify-content: center; align-items: center; min-height: 100vh; margin: 0; }");
        out.println(".card { background-color: #262626; padding: 40px; border-radius: 8px; border-left: 10px solid #b71c1c; box-shadow: 0 10px 30px rgba(0,0,0,0.5); max-width: 500px; }");
        out.println("h1 { color: #b71c1c; letter-spacing: 2px; text-transform: uppercase; border-bottom: 1px solid #444; padding-bottom: 10px; }");
        out.println("h2 { color: #888; font-size: 1.2em; }");
        out.println("ul { list-style: none; padding: 0; }");
        out.println("li { margin-bottom: 15px; padding-left: 15px; border-left: 2px solid #b71c1c; }");
        out.println("strong { color: #fff; }");
        out.println(".btn-volver { display: inline-block; margin-top: 25px; color: #b71c1c; text-decoration: none; font-weight: bold; border: 1px solid #b71c1c; padding: 10px 20px; transition: 0.3s; }");
        out.println(".btn-volver:hover { background-color: #b71c1c; color: white; }");
        out.println("</style>");
        out.println("</head>");

        out.println("<body>");
        out.println("<div class='card'>");
        out.println("  <h1>" + titulo + "</h1>");
        out.println("  <h2><i>\"" + fraseCelebre + "\"</i></h2>");
        out.println("  <hr style='border: 0; border-top: 1px solid #444; margin: 20px 0;'>");
        out.println("  <h2>EXPEDIENTES ACTIVOS:</h2>");
        out.println("  <ul>");
        out.println("    <li><strong>Dean Winchester:</strong> Especialista en combate y armas.</li>");
        out.println("    <li><strong>Sam Winchester:</strong> Especialista en investigación y leyes antiguas.</li>");
        out.println("    <li><strong>Castiel:</strong> Enlace celestial (Estatus: Vigilando).</li>");
        out.println("  </ul>");
        out.println("  <p><b>Vehículo:</b> Chevrolet Impala 67 - 'Baby'</p>");
        out.println("  <a href='index.jsp' class='btn-volver'>CERRAR ARCHIVOS</a>");
        out.println("</div>");
        out.println("</body></html>");
    }

    public void destroy() {
    }
}