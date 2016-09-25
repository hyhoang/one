package myPack;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletContext;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class temp
 */
@WebServlet("/temp")
public class temp extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public temp() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
ServletContext servletContext = getServletContext();
		
		Integer counter = (Integer) servletContext.getAttribute("Counter");
		
		PrintWriter out = response.getWriter();
		
		response.setContentType("text/html");
		out.println("<html><head><title>Display Counter</title></head><body>");
		out.println("<p>The counter value is currently:" + counter + "</p>");
		out.println("<p>it's is check</p>");
		out.println("</body></html>");
	}

}
