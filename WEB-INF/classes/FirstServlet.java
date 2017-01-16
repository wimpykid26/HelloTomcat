import javax.servlet.*;
import javax.servlet.http.*;
import java.io.*;
import java.util.*;

public class FirstServlet extends HttpServlet {
  public void doGet(HttpServletRequest req, HttpServletResponse res) throws ServletException, IOException {
    res.setContentType("text/html");
    PrintWriter out = res.getWriter();
    out.println("<html>");
    out.println("<head>");
    out.println("<title>First Servlet</title>");
    out.println("<body>");
    out.println("<h3>Welcome bencho</h3>");
    out.println("</body>");
    out.println("</html>");
  }
}
