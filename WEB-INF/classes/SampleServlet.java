import java.io.IOException;
import java.io.PrintWriter;

import jakarta.servlet.ServletException;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

public class SampleServlet extends HttpServlet {
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        response.setContentType("text/html");
        try {
            PrintWriter out = response.getWriter();
            out.println("<html>");
            out.println("<head><title>Hello, World!!</title></head>");
            out.println("<body>");
            out.println("<h1>This is Tomcat Web App from sample.!!!!!!</h1>");
            out.println("</body></html>");
        } catch (IOException e) {
            // IOExceptionの処理を行う
            e.printStackTrace();
        }
    }
}