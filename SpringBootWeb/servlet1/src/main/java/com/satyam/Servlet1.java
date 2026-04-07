package com.satyam;

import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class Servlet1 extends HttpServlet{
  @Override
  public void service(HttpServletRequest req, HttpServletResponse res) {
    System.out.println("In Service !");
  }
}
