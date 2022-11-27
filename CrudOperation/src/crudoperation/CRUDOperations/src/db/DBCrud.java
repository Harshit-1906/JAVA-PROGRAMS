package db;

import java.util.Scanner;

public class DBCrud {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        //create an object 
        DBOperations obj = new DBOperations();
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
