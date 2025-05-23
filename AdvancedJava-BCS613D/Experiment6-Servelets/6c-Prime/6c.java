//6c)Build a servlet program to check the given number is prime number or not using HTML with step by step procedure.
package servlets;

import java.io.*;
import javax.servlet.*;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.*;

@WebServlet("/PrimeServlet")
public class PrimeServlet extends HttpServlet {
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        response.setContentType("text/html");
        PrintWriter out = response.getWriter();

        int num = Integer.parseInt(request.getParameter("number"));
        boolean isPrime = num > 1;

        for (int i = 2; i <= Math.sqrt(num); i++) {
            if (num % i == 0) {
                isPrime = false;
                break;
            }
        }

        out.println("<h2>" + num + (isPrime ? " is a Prime Number." : " is NOT a Prime Number.") + "</h2>");
    }
}
