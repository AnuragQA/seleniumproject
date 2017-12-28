package com.project.testexec;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

import org.testng.annotations.Test;

public class seleniumdb_test {

 
  @Test
  public void db_test() throws ClassNotFoundException, SQLException {
  
   Class.forName("com.microsoft.sqlserver.jdbc.SQLServerDriver");

   Connection con=DriverManager.getConnection("jdbc:sqlserver://ANURAG-PC:1433","Anurag-PC","anurag007"); //established the connection
   
   Statement st=con.createStatement(); //created the statement
  /* 
   ResultSet rs=st.executeQuery("SELECT * FROM emp_table");
   while (rs.next())
   {
	  String firstname=rs.getString("firstname");
	  String depart=rs.getString("depart");
	  String desig=rs.getString("desig");
      System.out.println(firstname+"\t\t"+depart+"\t\t"+desig);
   
   }
   */
   st.executeUpdate("INSERT INTO emp_table VALUES ('9', 'bobby', 'lona', 'IT', '27', 'DEV')"); //updating the records
   
   con.close();
  
  }
}
