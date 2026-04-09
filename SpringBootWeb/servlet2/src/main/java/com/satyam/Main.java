package com.satyam;

import org.apache.catalina.Context;
import org.apache.catalina.LifecycleException;
import org.apache.catalina.startup.Tomcat;

public class Main {
    public static void main(String[] args) throws LifecycleException{
        System.out.println("Hello world!");
        Tomcat tomcat = new Tomcat();
        tomcat.setPort(8080);// for setting port number if 8080 is in use, we can use 8081
        tomcat.getConnector();
        Context context = tomcat.addContext("", new java.io.File(".").getAbsolutePath());
        Tomcat.addServlet(context, "Servlet2", new Servlet2());
        context.addServletMappingDecoded("/hello", "Servlet2");
        tomcat.start();
        tomcat.getServer().await();
    }
}