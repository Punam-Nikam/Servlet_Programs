package com.demo;
import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class ServletDemo extends HttpServlet {

    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        
        // Handle POST request
        
        response.setContentType("text/html");
        PrintWriter out = response.getWriter();
        String username = request.getParameter("username");
        String password = request.getParameter("password");
        
        // Simple authentication logic (for demonstration purposes only)
        
        if ("admin".equals(username) && "1234".equals(password)) {
            out.println("<h2>Login successful!</h2>");
        } else {
            out.println("<h2>Login failed. Invalid username or password.</h2>");
        }
      
    }

}
