
import java.io.*;
import javax.servlet.*;
import javax.servlet.annotation.*;

@WebServlet("/count")
public class CountServlet extends GenericServlet {
	int count = 0;

	public void service(ServletRequest req, ServletResponse res) {
		try {
			count++;
			PrintWriter pw = res.getWriter();
			pw.println("<html><body bgcolor=grey><h1>");
			pw.println("this page has been accessed " + count + " times");
			pw.println("</h1></body></html>");
		} catch (Exception e) {
			System.err.println(e);
		}
	}
}