

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;


/**
 * Servlet implementation class Car
 */
@WebServlet("/send")
public class Car extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
	public Car() {
        super();
      
    }
    

    
    
    private HttpSession start_Ses(HttpServletRequest request) {
    	HttpSession	session = request.getSession();
    	return session;
    }
    

    public String Session_cart(int id, String builder, HttpServletRequest request) {
		StringBuilder build = new StringBuilder();
		StringBuilder bu;
		build= build.append((String.valueOf(id).concat(builder+", ")));
	
		
		if(start_Ses(request).getAttribute("cart") == null)
			start_Ses(request).setAttribute("cart", build);
		else {
			bu =  (StringBuilder) start_Ses(request).getAttribute("cart");
			build.append(bu);
			start_Ses(request).setAttribute("cart", build);
		
		}
		
		return start_Ses(request).getId();
	}




	
	public Snippet cart_pay(String builder, HttpServletRequest request) {
		
		
		Snippet c = new Snippet();
			 c.setItem( start_Ses(request).getAttribute("cart"));
		
		return c;
	}


	
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		Snippet x =cart_pay(request.getParameter("m1"), request);
		//PrintWriter  writer = response.getWriter();
		request.setAttribute("carts", x.getItem());
		//writer.println(x.getItem());	
		System.out.println(x.getItem());
		request.getRequestDispatcher("view.jsp").forward(request, response);

	}

	
	
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		
		String x=	Session_cart(1, request.getParameter("m1"), request);
//		PrintWriter  writer = response.getWriter();
//		writer.println(x);
		request.setAttribute("ID", x);
		request.getRequestDispatcher("index.jsp").forward(request, response);
}
	
	

}