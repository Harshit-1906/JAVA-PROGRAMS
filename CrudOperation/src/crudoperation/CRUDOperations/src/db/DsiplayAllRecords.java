
package db;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.Statement;
import java.sql.ResultSet;
import java.sql.SQLException;
public class DsiplayAllRecords {
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
           String query="select *from register";
           ResultSet rs=st.executeQuery(query);
           while(rs.next())
           {
               
            System.out.println(rs.getInt("id")+" "+rs.getString("username")+" "+rs.getString("password")+" "
          +rs.getString("emailid"));
           }
               
       } catch (SQLException | ClassNotFoundException ex) {
            System.out.println("error in code "+ex);
        }
        
    }
            
    
}
