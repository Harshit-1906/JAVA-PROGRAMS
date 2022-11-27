
package db;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class InsertRecord {
    public static void main(String[] args) {
           try {
            //step 1
            Class.forName("com.mysql.cj.jdbc.Driver");
            //System.out.println("drivers loaded ");
            //step 2
            Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/dhruvidb", "root", "");
           // System.out.println("connection established"); 
           //step 3 
           Statement st=con.createStatement();
           //step 4 execute query 
           String query="insert into register(id,username,password,emailid)values(1,'hally','hally@123','h@gmail.com')";
           int i=st.executeUpdate(query);
           if(i>0)
           {
               System.out.println(i+"record inserted ");
           }
           else
           {
               System.out.println("record not inserted ");
           }
               
       } catch (SQLException | ClassNotFoundException ex) {
            System.out.println("error in code "+ex);
        }
        
    }
}
