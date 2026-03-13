package org.yourcompany.yourproject;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;
public class third {
 public static void main(String[] args) throws Exception{
   Connection con = DriverManager.getConnection("jdbc:postgresql://localhost:5432/JDBC1", "postgres","Satyam@9334@");
   Statement st = con.createStatement();
   String sql = ("SELECT * FROM \"Workers\"");
   ResultSet rs = st.executeQuery(sql);
   while (rs.next()) {
     System.out.print(rs.getString(1)+" - ");
     System.out.println(rs.getInt(2));
   }
   con.close();
 }
}
