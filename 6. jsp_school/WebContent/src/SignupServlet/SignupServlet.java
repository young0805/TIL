package SignupServlet;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/SignupServlet")
public class SignupServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    
    public SignupServlet() {
        super();
       
    }

	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		String uid = request.getParameter("id");
		String upass = request.getParameter("ps");
		String upass2 = request.getParameter("ps2");
		String unick = request.getParameter("nick");

		
		String str = "<html> Input id: " + uid + "<br>";
		str += "input pass : " + upass+ "<br>";
		str += "input pass(confirm) : " + upass2+ "<br>";
		str += "input nickname : " + unick+ "<br>";
		
		
		str += "</html>";
		PrintWriter out = response.getWriter();
		out.print(str);
	}


	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		doGet(request, response);
	}

}
