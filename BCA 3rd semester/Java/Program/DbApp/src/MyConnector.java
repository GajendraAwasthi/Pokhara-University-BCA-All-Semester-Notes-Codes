import java.sql.*;

public class MyConnector {
    public static void main(String... args) {
        try {
           // createUser("lalita", "lalita@123#", "STUDENT");
            //selectAll();
            //selectOne(1)
            // updateUser(2,"lalitabhatta","lalita@123#","STD");
         //   deleteUser(2);

        //   authenticate("lalita","lalita@123#");
            countUser("STD");

        } catch (Exception e) {
            System.out.println("Exception: " + e.getMessage());
        }
    }

    public static Connection connect() throws Exception {
        Class.forName("com.mysql.cj.jdbc.Driver");
        System.out.println("Driver loaded....");
        Connection conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/bibhu", "root", "");
        System.out.println("Database connected.... ");
        return conn;
    }

    public static void createUser(String name, String pas, String role) throws Exception {
        Connection conn = connect();
        //record save
        //	id	username	password	role	status
        String sql = "INSERT INTO tbl_users (username, password, role,status) VALUES(?,?,?,?)";
        PreparedStatement stmt = conn.prepareStatement(sql);
        stmt.setString(1, name);
        stmt.setString(2, pas);
        stmt.setString(3, role);
        stmt.setInt(4, 1);

        int r = stmt.executeUpdate();
        if (r > 0) {
            System.out.println("User registered..");
        } else {
            System.out.println("Unable to register");
        }

    }

    public static void selectAll(int id) throws Exception {
        Connection con = MyConnector.connect();
        String sql = "SELECT * FROM tbl_users";
        PreparedStatement stmt = con.prepareStatement(sql);
        ResultSet rs = stmt.executeQuery();
        while (rs.next()) {
            System.out.print("ID: " + rs.getInt("id"));
            System.out.print("\tUSERNAME: " + rs.getString("username"));
            System.out.print("\tPASSWORD: " + rs.getString("password"));
            System.out.print("\tROLE: " + rs.getString("role"));
            System.out.print("\tSTATUS: ");
            if (rs.getInt("status") > 0) {
                System.out.print("Active");
            } else {
                System.out.print("Inactive");
            }
            System.out.println();
        }
        rs.close();
        con.close();
    }

    public static void selectOne(int id) throws Exception {
        Connection con = MyConnector.connect();
        String sql = "SELECT * FROM tbl_users WHERE id=?";

        PreparedStatement stmt = con.prepareStatement(sql);
        stmt.setInt(1, id);

        ResultSet rs = stmt.executeQuery();
        while (rs.next()) {
            System.out.print("ID: " + rs.getInt("id"));
            System.out.print("\tUSERNAME: " + rs.getString("username"));
            System.out.print("\tPASSWORD: " + rs.getString("password"));
            System.out.print("\tROLE: " + rs.getString("role"));
            System.out.print("\tSTATUS: ");
            if (rs.getInt("status") > 0) {
                System.out.print("Active");
            } else {
                System.out.print("Inactive");
            }
            System.out.println();
        }
        rs.close();
        con.close();
    }

    public static void authenticate(String username, String password) throws Exception {
        Connection con = MyConnector.connect();
        String sql = "SELECT * FROM tbl_users WHERE username=? AND password=?";

        PreparedStatement stmt = con.prepareStatement(sql);
        stmt.setString(1, username);
        stmt.setString(2, password);

        ResultSet rs = stmt.executeQuery();
        boolean isAuthenticated=false;
        while (rs.next()) {
            isAuthenticated=true;
        }
        rs.close();
        con.close();
        if(isAuthenticated){
            System.out.println("Login Success...");
        }else{
            System.out.println("Login Failed...");
        }
    }

    public static void updateUser(int id, String name, String pass, String role) throws Exception {
        Connection conn = connect();
        //record save
        //	id	username	password	role	status
        String sql = "UPDATE tbl_users SET username=?, password=?, role=?,status=? WHERE id=?";
        PreparedStatement stmt = conn.prepareStatement(sql);
        stmt.setString(1, name);
        stmt.setString(2, pass);
        stmt.setString(3, role);
        stmt.setInt(4, 1);
        stmt.setInt(5, id);

        int r = stmt.executeUpdate();
        if (r > 0) {
            System.out.println("User record updated..");
        } else {
            System.out.println("Unable to update user record");
        }

    }

    public static void deleteUser(int id) throws Exception {
        Connection conn = connect();
        //record save
        //	id	username	password	role	status
        String sql = "DELETE FROM tbl_users WHERE id=?";
        PreparedStatement stmt = conn.prepareStatement(sql);
        stmt.setInt(1, id);

        int r = stmt.executeUpdate();
        if (r > 0) {
            System.out.println("User record deleted..");
        } else {
            System.out.println("Unable to delete user record");
        }
    }

    public static void countUser(String role) throws Exception {
        Connection con = MyConnector.connect();
        String sql = "SELECT count(*) AS total_user FROM tbl_users WHERE role=?";

        PreparedStatement stmt = con.prepareStatement(sql);
        stmt.setString(1, role);

        ResultSet rs = stmt.executeQuery();
        while (rs.next()) {
            System.out.print("Total User having : "+ role +" role is:" + rs.getInt("total_user"));
        }
        rs.close();
        con.close();
    }
}
