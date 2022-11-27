
package db;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.PreparedStatement;
import java.util.Scanner;

public class InsertRecordPS {
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
             System.out.println("enter id,username,password and emailid ");
             int x=sc.nextInt();
             String un=sc.nextLine();
             String pwd=sc.nextLine();
             String e=sc.nextLine();
           String query="insert into register(id,username,password,emailid)values(?,?,?,?)";
           PreparedStatement ps=con.prepareStatement(query);
           //step 4 execute query 
           ps.setInt(1, x);
           ps.setString(2, un);
           ps.setString(3, pwd);
           ps.setString(4, e);
           int i=ps.executeUpdate();
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
