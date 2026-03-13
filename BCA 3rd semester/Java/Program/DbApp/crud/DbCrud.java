//step 1: import database related packages

import java.sql.*;

public class DbCrud {

    static Statement stmt;
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


            //prepare statement
            stmt = conn.createStatement();

            //select all record
            // select();

            //select one record
            //selectOne(2);


            //insert record

            String name = "Archita Rana";
            String program = "BCA";
            String semester = "3";
            insertRecord(name, program, semester);
            select();


            //cleanup
            stmt.close();
            conn.close();

        } catch (ClassNotFoundException e) {
            System.out.println("Please load db driver: " + e.getMessage());
        } catch (SQLException e) {
            System.out.println("SQL Error: " + e.getMessage());
        }
    }

    public static void select() throws SQLException {
        ResultSet rs = stmt.executeQuery("select * from tbl_students order by id DESC");

        while (rs.next()) {
            System.out.print(rs.getString("id") + "\t");
            System.out.print(rs.getString("name") + "\t");
            System.out.print(rs.getString("program") + "\t");
            System.out.print(rs.getString("semester") + "\n");
        }

    }

    public static void selectOne(int id) throws SQLException {
        String sql = "select * from tbl_students where id=" + id;
        ResultSet rs = stmt.executeQuery(sql);
        while (rs.next()) {
            System.out.print(rs.getString("id") + "\t");
            System.out.print(rs.getString("name") + "\t");
            System.out.print(rs.getString("program") + "\t");
            System.out.print(rs.getString("semester") + "\n");
        }

    }

    public static void insertRecord(String name, String program, String semester) throws SQLException {

        String sql = "insert into tbl_students(name, program, semester) values ('" + name + "','" + program + "','" + semester + "')";

        int re = stmt.executeUpdate(sql);
        if ((re > 0)) {
            System.out.println("Insert Successful");
        }
    }


    public static void insertRecordPS(String name, String program, String semester) throws SQLException {

        String sql = "insert into tbl_students(name, program, semester) values (?,?,?)";

        PreparedStatement stmt = conn.prepareStatement(sql);
        stmt.setString(1, name);
        stmt.setString(2, program);
        stmt.setString(3, semester);

        int re = stmt.executeUpdate();
        if ((re > 0)) {
            System.out.println("Insert Successful");
        }
    }
}
