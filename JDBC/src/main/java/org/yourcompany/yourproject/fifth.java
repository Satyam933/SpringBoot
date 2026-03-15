package org.yourcompany.yourproject;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.Statement;

public class fifth {
  public static void main(String[] args) throws Exception{
    Connection con = DriverManager.getConnection("jdbc:postgresql://localhost:5432/JDBC1", "postgres", "Satyam@9334@");
    Statement st = con.createStatement();
    String sql = ("UPDATE \"Workers\" set \"Name\" = 'Bharat' WHERE \"Name\" = 'RAM'");
    boolean status = st.execute(sql);
    System.out.println(status);
  }
}
