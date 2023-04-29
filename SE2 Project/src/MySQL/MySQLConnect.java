package MySQL;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.Statement;

import static java.sql.DriverManager.getConnection;

public class MySQLConnect {
    private static final String DB_URL = "jdbc:mysql://127.0.0.1:3306/db";
    private static final String DB_USERNAME = "root";
    private static final String DB_PASSWORD = "Ducnguyen3602";

    public static void main(String args[]){
        try{
            Connection con = getConnection(DB_URL, DB_USERNAME,DB_PASSWORD );
            Statement stm = con.createStatement();

            String query = "SELECT*FROM student1";

            ResultSet rs = stm.executeQuery(query);
            System.out.println("Successful");

            while(rs.next()){
                System.out.println("Student ID: "+rs.getInt(1));
                System.out.println("Student Name: "+rs.getString(2));
                System.out.println("Student DOB: "+rs.getString(3));
                System.out.println("Student Course: "+rs.getString(4));
                System.out.println("----------------------");
            }
            con.close();
        }catch(Exception ex){
            ex.printStackTrace();
        }
    }
}
