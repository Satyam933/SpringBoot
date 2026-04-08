package com.satyam;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class Servlet2 extends HttpServlet {
  @Override
  public void service(HttpServletRequest req, HttpServletResponse res) throws IOException {
    System.out.println("In Service !");
    //res.getWriter().print("Hello From Servlet2 !"); if we don't want to use getWriter again and again we can do --
    res.setContentType("text/html");//Specifying contentType as html so that we can use html tags in our text.
    PrintWriter out = res.getWriter();
    out.print("<h2><b>Hello from Servlet2.</b></h2>");//EveryTime we want to print we just call out.
  }
}
