package org.yourcompany.yourproject;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;
public class second {
  public static void main(String[] args) throws Exception{
    Connection con = DriverManager.getConnection("jdbc:postgresql://localhost:5432/JDBC1", "postgres", "Satyam@9334@");
    Statement st = con.createStatement();
    String sql = ("Select \"Name\" From \"Workers\"");
    ResultSet rs = st.executeQuery(sql);
    rs.next();
    String result = rs.getString("Name");
    System.out.println("Name of Worker in Column Name is : " + result);
    con.close();
  }
}
