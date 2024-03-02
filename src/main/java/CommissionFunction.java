import java.io.IOException;

import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

@WebServlet("/commissionfucntion")
public class CommissionFunction extends HttpServlet {
	@Override
	protected void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		String lock = request.getParameter("Lock");
		String stock = request.getParameter("Stock");
		String barrel = request.getParameter("Barrel");
		System.out.println("lock" + lock + "stock :" + stock + "barrel:" + barrel);

	}
}
