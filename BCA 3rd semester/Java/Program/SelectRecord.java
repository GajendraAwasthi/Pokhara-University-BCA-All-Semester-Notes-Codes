//step 1: import database related packages

import java.sql.*;

public class SelectRecord {

    static PreparedStatement stmt;
    static Connection conn;

    public static void main(String[] args) {
        try {
            //Step 2: register database driver
            //in my case i am using sql database

            Class.forName("com.mysql.cj.jdbc.Driver");
            System.out.println("Driver loaded");

            //step 3: Create a jdbc connection
            conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/bca_db", "root", "");
            System.out.println("Connected to database successfully");


            String program="BIT";

            //prepare statement
            stmt = conn.prepareStatement("select count(*) as total_student from tbl_students where program=?");
            stmt.setString(1, program);

            ResultSet rs = stmt.executeQuery();
            while (rs.next()) {
                System.out.print("Total Student of "+program+ ": " +rs.getString("total_student"));
            }

            //cleanup
            stmt.close();
            conn.close();

        } catch (Exception e) {
            System.out.println("SQL Error: " + e.getMessage());
        }
    }
}