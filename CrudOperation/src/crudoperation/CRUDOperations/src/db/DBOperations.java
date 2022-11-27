package db;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.PreparedStatement;
import java.util.Scanner;
import java.sql.ResultSet;

public class DBOperations {

    static Connection con;
    static PreparedStatement ps;
    static ResultSet rs;

    //connection 
    static void createConnection() throws ClassNotFoundException, SQLException {
        Class.forName("com.mysql.cj.jdbc.Driver");
        //System.out.println("drivers loaded ");
        //step 2
        con = DriverManager.getConnection("jdbc:mysql://localhost:3306/dhruvidb", "root", "");

    }

    void displayAllRecords() throws ClassNotFoundException, SQLException {
        createConnection();//call conne tion method 
        String query = "select *from register";
        ps = con.prepareStatement(query);
        //step 4 execute query 

        rs = ps.executeQuery();
        while (rs.next()) {

            System.out.println(rs.getInt("id") + " " + rs.getString("username") + " " + rs.getString("password") + " "
                    + rs.getString("emailid"));
        }
    }

    void insertRecord() throws SQLException, ClassNotFoundException {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter id,username,password and emailid ");
        int x = sc.nextInt();
        String un = sc.nextLine();
        String pwd = sc.nextLine();
        String e = sc.nextLine();
        createConnection();
        String query = "insert into register(id,username,password,emailid)values(?,?,?,?)";
        ps = con.prepareStatement(query);
        //step 4 execute query 
        ps.setInt(1, x);
        ps.setString(2, un);
        ps.setString(3, pwd);
        ps.setString(4, e);
        int i = ps.executeUpdate();
        if (i > 0) {
            System.out.println(i + "record inserted ");
        } else {
            System.out.println("record not inserted ");
        }
    }

    void updateRecord() throws SQLException, ClassNotFoundException {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter username ");
        String un = sc.nextLine();
        System.out.println("enter password ");
        String pwd = sc.nextLine();
        System.out.println("enter emaild  ");
        String e = sc.nextLine();
        System.out.println("enter id u want to update  ");
        int x = sc.nextInt();
        String query = "update register set username=?,password=?,emailid=? where id=?";
        createConnection();
        ps = con.prepareStatement(query);
        //step 4 execute query
        ps.setString(1, un);
        ps.setString(2, pwd);
        ps.setString(3, e);
        ps.setInt(4, x);
        int i = ps.executeUpdate();
        if (i > 0) {
            System.out.println(i + "record updated  ");
        } else {
            System.out.println("record not updated  ");
        }
    }

    void deleteRecord() throws SQLException, ClassNotFoundException {
        //step 3 
        Scanner sc = new Scanner(System.in);

        System.out.println("enter id u want to delete  ");
        int x = sc.nextInt();
        String query = "delete from register where id=?";

        createConnection();
        ps = con.prepareStatement(query);
        //step 4 execute query

        ps.setInt(1, x);
        int i = ps.executeUpdate();
        if (i > 0) {
            System.out.println(i + "record deleted  ");
        } else {
            System.out.println("record not updated  ");
        }
    }
    public static void main(String[] args) {
        DBOperations obj=new DBOperations();
        Scanner sc=new Scanner(System.in);
          try {
            while (true) {
                System.out.println("1.display all\n2.Insert new record \n3.Update record\n4.Delete Record\n5.exit\n");
                System.out.println("enter your choice ");
                int ch = sc.nextInt();
                switch (ch) {
                    case 1:
                        obj.displayAllRecords();
                        break;
                    case 2:
                        obj.insertRecord();
                        break;
                    case 3:
                        obj.updateRecord();
                        break;
                    case 4:
                        obj.deleteRecord();
                        ;
                        break;
                    case 5:
                        System.exit(0);
                        break;
                    default:
                        System.out.println("wrong choice ");
                }

            }
        } catch (Exception e) {
            System.out.println("error " + e);
        }
    }

}
