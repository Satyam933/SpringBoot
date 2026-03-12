/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */
package org.yourcompany.yourproject;

import java.sql.Connection;
import java.sql.DriverManager;

/**
 *
 * @author satya
 */
public class first {
    public static void main(String[] args) throws Exception {
        // Class.forName("org.postgresql.Driver"); load & Register Driver done automatically after JDBC 4.0
        Connection con = DriverManager.getConnection("jdbc:postgresql://localhost:5432/JDBC1","postgres","Satyam@9334@"); 
        System.out.println("Hello World!");
    }
}
