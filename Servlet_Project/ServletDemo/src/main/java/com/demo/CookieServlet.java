package com.demo;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
//import javax.servlet.http.HttpServlet;
//import javax.servlet.http.HttpServletRequest;
//import javax.servlet.http.HttpServletResponse;

public class CookieServlet extends HttpServlet {

    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {

        response.setContentType("text/html");
        PrintWriter out = response.getWriter();

        String language = request.getParameter("language");

        // Create cookie
        Cookie cookie = new Cookie("language", language);

        // Set expiry 
        cookie.setMaxAge(60*60 );


        // Add cookie to response
        response.addCookie(cookie);

        out.println("<h2>Preference Saved Successfully!</h2>");
        out.println("<a href='getCookie'>View Preference</a>");
    }
}