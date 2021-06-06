import java.io.IOException;
import java.io.PrintWriter;
import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
public class Page1 extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        response.setContentType("text/html");
PrintWriter out=response.getWriter();
RequestDispatcher rd;
String login=request.getParameter("login");

if(login.equals("utsav") )
{   HttpSession hs=request.getSession();
    hs.setAttribute("s_id",login); 
    out.print("<body bgcolor='Plum'>");
    out.println("Session Created");
    out.print("<a href='Page2'>Homepage</a>");  
    out.print("</body>");
}
else
{   out.println("<p><h1>Incorrect Login Id/Password</h1></p>");
    rd=request.getRequestDispatcher("/httpsession.html");
    rd.include(request, response);}

    }
}
