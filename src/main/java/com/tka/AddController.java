package com.tka;

import java.io.IOException;
import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class AddController extends HttpServlet {
    private static final long serialVersionUID = 1L;

    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        System.out.println("We are in AddController");
        

        // STEP 1: Get all data from request
        String num1 = request.getParameter("n1");
        String num2 = request.getParameter("n2");

        System.out.println(num1 + " ----> " + num2);

        int sum = 0;
        try {
            // STEP 2: Process data
            if (num1 != null && num2 != null) {
                sum = Integer.parseInt(num1) + Integer.parseInt(num2);
            }
        } catch (NumberFormatException e) {
            System.err.println("Invalid input: " + e.getMessage());
        }

        System.out.println("Sum: " + sum);

        // STEP 3: Navigation -> JSP
        request.setAttribute("d1", sum);
        RequestDispatcher rd = request.getRequestDispatcher("addition.jsp");
        rd.forward(request, response);
    }
    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        System.out.println("We are in post Controller");
}
}
