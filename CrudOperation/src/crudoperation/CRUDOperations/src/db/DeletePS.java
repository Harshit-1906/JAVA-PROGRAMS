
package db;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.Scanner;

public class DeletePS {
         public static void main(String[] args) {
         try {
            //step 1
            Class.forName("com.mysql.cj.jdbc.Driver");
            //System.out.println("drivers loaded ");
            //step 2
            Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/dhruvidb", "root", "");
           // System.out.println("connection established"); 
           //step 3 
           Scanner sc=new Scanner(System.in);
          
              System.out.println("enter id u want to delete  ");    
              int x=sc.nextInt();
           String query="delete from register where id=?";
           PreparedStatement ps=con.prepareStatement(query);
           //step 4 execute query
         
           ps.setInt(1, x);
           int i=ps.executeUpdate();
           if(i>0)
           {
               System.out.println(i+"record deleted  ");
           }
           else
           {
               System.out.println("record not updated  ");
           }
               
       } catch (SQLException | ClassNotFoundException ex) {
            System.out.println("error in code "+ex);
        }
    }
}
