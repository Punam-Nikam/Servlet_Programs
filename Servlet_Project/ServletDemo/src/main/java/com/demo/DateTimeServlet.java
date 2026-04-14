package com.demo;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.Date;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class DateTimeServlet extends HttpServlet {
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        response.setContentType("text/html");
        PrintWriter out = response.getWriter();

        Date currentDate = new Date();

        out.println("<html><body>");
        out.println("<h2>Current Date and Time</h2>");
        out.println("<p>" + currentDate.toString() + "</p>");
        out.println("</body></html>");
    }
}
