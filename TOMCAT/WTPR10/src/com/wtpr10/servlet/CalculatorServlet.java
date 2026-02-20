package com.wtpr10.servlet;

import java.io.IOException;
import javax.naming.InitialContext;
import javax.servlet.*;
import javax.servlet.http.*;
import com.wtpr10.beans.CalculatorRemote;

public class CalculatorServlet extends HttpServlet {
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
        throws ServletException, IOException {
        
        int num1 = Integer.parseInt(request.getParameter("num1"));
        int num2 = Integer.parseInt(request.getParameter("num2"));
        
        try {
            InitialContext ctx = new InitialContext();
            CalculatorRemote calculator = (CalculatorRemote) ctx.lookup("CalculatorBean/remote");
            int result = calculator.add(num1, num2);
            request.setAttribute("result", result);
            RequestDispatcher rd = request.getRequestDispatcher("result.jsp");
            rd.forward(request, response);
        } catch (Exception e) {
            e.printStackTrace();
            response.getWriter().println("Error calling EJB: " + e.getMessage());
        }
    }
}
