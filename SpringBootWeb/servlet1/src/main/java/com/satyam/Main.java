package com.satyam;

import org.apache.catalina.Context;
import org.apache.catalina.LifecycleException;
import org.apache.catalina.startup.Tomcat;

public class Main {
    public static void main(String[] args) throws LifecycleException{
        System.out.println("Hello world!");
        Tomcat tomcat = new Tomcat();
        tomcat.setPort(8080);
        tomcat.getConnector();
        Context context = tomcat.addContext("", new java.io.File(".").getAbsolutePath());
        Tomcat.addServlet(context, "Servlet1", new Servlet1());
        context.addServletMappingDecoded("/hello","Servlet1");
        tomcat.start();
        tomcat.getServer().await();
    }
}