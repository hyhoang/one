package myPack;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletConfig;
import javax.servlet.ServletContext;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class RequestCounter
 */
@WebServlet("/RequestCounter")
public class RequestCounter extends HttpServlet {
	private static final long serialVersionUID = 1L;
       int counter;
    /**
     * @see HttpServlet#HttpServlet()
     */
    public RequestCounter() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see Servlet#init(ServletConfig)
	 */
	public void init(ServletConfig config) throws ServletException {
		// TODO Auto-generated method stub
		super.init(config);
		Integer counter = 0;
		ServletContext context = getServletContext();
		context.setAttribute("Counter",counter);
	}

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		ServletContext context = getServletContext();
		Integer counter = (Integer)context.getAttribute("Counter");
		
		++counter;
		
		context.setAttribute("Counter", counter);
		
		PrintWriter out = response.getWriter();
		out.println("<html><head><title>RequestCounter</title></head><body>");
		out.println("You are visitor #" + counter + ".");
		out.println("</body></html>");
	}

}
