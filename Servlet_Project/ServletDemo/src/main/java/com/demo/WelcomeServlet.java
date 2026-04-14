package com.demo;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

public class WelcomeServlet extends HttpServlet {

    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {

        response.setContentType("text/html");
        PrintWriter out = response.getWriter();

        HttpSession session = request.getSession(false);

        if(session != null) {
            String user = (String) session.getAttribute("user");

            out.println("<h2>Welcome " + user + "</h2>");
            out.println("<a href='logout'>Logout</a>");
        } else {
            out.println("<h2>Session Expired. Please login again.</h2>");
        }
    }
}