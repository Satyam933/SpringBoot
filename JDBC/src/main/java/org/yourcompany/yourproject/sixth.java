package org.yourcompany.yourproject;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.Statement;
public class sixth {
  public static void main(String[] args) throws Exception{
    Connection con = DriverManager.getConnection("jdbc:postgresql://localhost:5432/JDBC1", "postgres", "Satyam@9334@");
    Statement st = con.createStatement();
    String sql = ("DELETE FROM \"Workers\" WHERE \"Name\"='Riya'");
    st.execute(sql);
    System.out.println("Query Executed Successfully !");
  }
}
