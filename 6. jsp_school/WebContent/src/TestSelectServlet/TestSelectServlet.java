package TestSelectServlet;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
@WebServlet("/TestSelectServlet")
public class TestSelectServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
    public TestSelectServlet() {
    }
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		String ugen= request.getParameter("gender");
		String str= "<html>Selected value: " + ugen+ "</html>";
		PrintWriter out = response.getWriter();
		out.print(str);
	
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		doGet(request, response);
	}

}
