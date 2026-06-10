package com.demo;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class HitCountServlet extends HttpServlet{

	public void doGet(HttpServletRequest req, HttpServletResponse res)
	throws ServletException,IOException{

		res.setContentType("text/html");

		PrintWriter out = res.getWriter();

		int count=1;

		boolean found=false;

		Cookie c[] = req.getCookies();

		if(c!=null)
		{
			for(int i=0;i<c.length;i++)
			{
				if(c[i].getName().equals("count"))
				{
					found=true;

					count = Integer.parseInt(c[i].getValue())+1;

					c[i].setValue(Integer.toString(count));

					res.addCookie(c[i]);
				}
			}
		}
		if(found==false)
		{
			Cookie newCookie = new Cookie("count","1");

			res.addCookie(newCookie);

			out.print("<h1>Welcome Servlet</h1>");
		}

		out.print("Hit Count:"+count);
	}
}
