import java.io.IOException;

import jakarta.servlet.RequestDispatcher;
import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import model.TriangleClassify;

@SuppressWarnings("serial")
@WebServlet("/functionServlet")
public class FunctionServlet extends HttpServlet {

	@Override
	protected void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		String function = request.getParameter("function");
		int type = Integer.parseInt(request.getParameter("type"));
		String page = "";
		// Generate test cases based on selected function and type
		if ("triangle".equals(function)) {
			page = "triangle.jpp";
		} else  {
			page = "commission.jsp";
		}
		request.getSession().setAttribute("type", type);
		RequestDispatcher dispatcher = request.getRequestDispatcher(page);
		dispatcher.forward(request, response);
	}
}
