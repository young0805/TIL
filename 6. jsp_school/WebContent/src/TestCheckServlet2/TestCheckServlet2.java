package TestCheckServlet2;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/TestCheckServlet2")
public class TestCheckServlet2 extends HttpServlet {
	private static final long serialVersionUID = 1L;
    public TestCheckServlet2() {
    }
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		String[] usci = request.getParameterValues("city");
		String str = "<html>";
		
		if (usci != null){ // null 값을 대비해서 안전하게 하기 위함
			for(int i=0 ; i< usci.length; i++){
				str += "Selected city: " + usci[i] + "<br>";
			}
		}		
		str += "<html>";
		PrintWriter out = response.getWriter();
		out.print(str);	
	}
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		doGet(request, response);
	}

}
