
package database;
import java.sql.*;

public class DBConnection {
    public static void main(String[] args) {
        try {
            //step 1 load jdb drivers
            Class.forName("com.mysql.cj.jdbc.Driver");System.out.println("drivers found ");
            //step 2 create connection 
            Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/javadb", "root", "");
            System.out.println("connection done ");
            //step 3 Create Statement 
            Statement st=con.createStatement();
            String sql="select *from emp";
            ResultSet rs=st.executeQuery(sql);
            while(rs.next())
                    {
                        System.out.println(rs.getInt(1)+" "+rs.getString(2)+" "+rs.getInt(3)+" "+rs.getLong(4));
                    }
                
        } catch (SQLException | ClassNotFoundException ex) {
            System.out.println("drivers not found "+ex);
        }
    
    }
    
}
