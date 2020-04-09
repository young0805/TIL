package TestTextServlet;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/TestTextServlet")
public class TestTextServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
   
    public TestTextServlet() {
    }
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		String udesc= request.getParameter("desc");
		String str= "<html>Text: " + udesc+ "</html>";
		PrintWriter out = response.getWriter();
		out.print(str);

	}
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		doGet(request, response);
	}

}
