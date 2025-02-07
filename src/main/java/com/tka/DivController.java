 package com.tka;

import java.io.IOException;
import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class DivController extends HttpServlet {
    private static final long serialVersionUID = 1L;

    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        System.out.println("We are in DivisionController");

        // STEP 1: Get all data from the request
        String num1 = request.getParameter("n1");
        String num2 = request.getParameter("n2");

        System.out.println(num1 + " ----> " + num2);

        String resultMessage;
        double result = 0;

        try {
            // STEP 2: Process data
            if (num1 != null && num2 != null) {
                double numerator = Double.parseDouble(num1);
                double denominator = Double.parseDouble(num2);

                if (denominator != 0) {
                    result = numerator / denominator;
                    resultMessage = "Result: " + result;
                } else {
                    resultMessage = "Error: Division by zero is not allowed.";
                }
            } else {
                resultMessage = "Error: Missing input values.";
            }
        } catch (NumberFormatException e) {
            resultMessage = "Invalid input: " + e.getMessage();
            System.err.println(resultMessage);
        }

        System.out.println(resultMessage);

        // STEP 3: Navigation -> JSP
        request.setAttribute("result", resultMessage);
        RequestDispatcher rd = request.getRequestDispatcher("division.jsp");
        rd.forward(request, response);
    }

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        System.out.println("We are in Post Controller");
    }
}
