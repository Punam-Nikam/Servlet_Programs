package com.demo;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class GetCookie extends HttpServlet {

    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {

        response.setContentType("text/html");
        PrintWriter out = response.getWriter();

        Cookie[] cookies = request.getCookies();

        String language = "Not Found";

        if(cookies != null) {
            for(Cookie c : cookies) {
                if(c.getName().equals("language")) {
                    language = c.getValue();
                }
            }
        }

        out.println("<h2>Your Selected Language: " + language + "</h2>");
    }
}
