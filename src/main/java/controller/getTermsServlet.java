package controller;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import model.LetsAdd;

/**
 * Servlet implementation class getTermsServlet
 */
@WebServlet("/getTermsServlet")
public class getTermsServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public getTermsServlet() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		String firstTerm = request.getParameter("firstTerm");
		String secondTerm = request.getParameter("secondTerm");
		
		LetsAdd userAdds = new LetsAdd(Integer.parseInt(firstTerm), Integer.parseInt(secondTerm));
		request.setAttribute("userExpression", userAdds);
		getServletContext().getRequestDispatcher("/Sum.jsp").forward(request, response);
		
		//PrintWriter writer = response.getWriter();
	    //writer.println(userAdds.toString());
	    //writer.close();
	} 
	    
 
}
