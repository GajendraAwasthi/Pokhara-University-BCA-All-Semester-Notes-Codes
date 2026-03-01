import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;

public class CrudRepo {


    public static Connection connect() throws Exception {
        Class.forName("com.mysql.cj.jdbc.Driver");
        Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/sunil_db", "root", "");
        System.out.println("DB Connected successfully...");
        return con;
    }

    public static void main(String[] args) {

    }

    public static void createUser(String username, String password, String role) throws Exception {

        //connect to db
        Connection con = CrudRepo.connect();

        //statement
        String sql = "INSERT INTO tbl_users (username,password,role,status) VALUES(?,?,?,?)";
        PreparedStatement statement = con.prepareStatement(sql);
        statement.setString(1, username);
        statement.setString(2, password);
        statement.setString(3, role);
        statement.setInt(4, 1);

        int re = statement.executeUpdate();
        if (re > 0) {
            System.out.println("User info saved successfully....");
        } else {
            System.out.println("Sorry, unable to save user info");
        }
        con.close();
    }

    public static void updateUser(String username, String password, String role, int id) throws Exception {

        //connect to db
        Connection con = CrudRepo.connect();

        //statement
        String sql = "UPDATE tbl_users SET username=?,password=?,role=?,status=? WHERE id=?";
        PreparedStatement statement = con.prepareStatement(sql);
        statement.setString(1, username);
        statement.setString(2, password);
        statement.setString(3, role);
        statement.setInt(4, 1);
        statement.setInt(4,id);

        int re = statement.executeUpdate();
        if (re > 0) {
            System.out.println("User info updated successfully....");
        } else {
            System.out.println("Sorry, unable to update user info");
        }
        con.close();
    }

    public static void deleteUser(int id) throws Exception {

        //connect to db
        Connection con = CrudRepo.connect();

        //statement
        String sql = "DELETE FROM tbl_users WHERE id=?";
        PreparedStatement statement = con.prepareStatement(sql);

        statement.setInt(1,id);

        int re = statement.executeUpdate();
        if (re > 0) {
            System.out.println("User info deleted successfully....");
        } else {
            System.out.println("Sorry, unable to delete user info");
        }
        con.close();
    }

}
