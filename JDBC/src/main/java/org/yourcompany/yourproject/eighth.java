package org.yourcompany.yourproject;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
public class eighth {
  public static void main(String[] args) throws Exception {
    String Name = "RAJA";
    int Salery = 55000;
    Connection con = DriverManager.getConnection("jdbc:postgresql://localhost:5432/JDBC1", "postgres", "Satyam@9334@");
    String sql = ("insert into \"Workers\" values(?,?)");
    PreparedStatement st = con.prepareStatement(sql);
    st.setString(1, Name);
    st.setInt(2, Salery);
    st.execute();
  }
}
