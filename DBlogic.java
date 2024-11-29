import java.sql.*;
import java.util.stream.Stream;

public class DBlogic {

    public void addUser(String user, String pass) {
        String sql = "INSERT INTO users (user, pass) VALUES (?, ?)";

        try (Connection conn = DatabaseConnection.getConnection();
            PreparedStatement pstmt = conn.prepareStatement(sql);
        ) {
            pstmt.setString(1, user);
            pstmt.setString(2, pass);

            int rowsInserted = pstmt.executeUpdate();

            if (rowsInserted > 0){
                System.out.println("Lietotājs veiksmīgi pievienots");
            }
        }catch (SQLException e) {
            e.printStackTrace();
        }

    }

    public void getUsers (){
        String sql = "SELECT * FROM users";

        try (Connection conn = DatabaseConnection.getConnection();
             PreparedStatement pstmt = conn.prepareStatement(sql);
             ResultSet rs = pstmt.executeQuery();
        ) {
            while (rs.next()){

                System.out.println("id: " + rs.getInt("id"));
                System.out.println("id: " + rs.getString("user"));
                System.out.println("id: " + rs.getString("pass"));
                System.out.println("------------------------------------------");
            }

        }catch (SQLException e) {
            e.printStackTrace();
        }

    }
    public void delUser(int user_id) {
        String sql = "DELETE FROM users WHERE id = ?";

        try (Connection conn = DatabaseConnection.getConnection();
             PreparedStatement pstmt = conn.prepareStatement(sql);
        ) {
           pstmt.setInt(1, user_id);

            int rowsDel = pstmt.executeUpdate();

            if (rowsDel > 0){
                System.out.println("Lietotājs veiksmīgi dzēsts");
            }
        }catch (SQLException e) {
            e.printStackTrace();
        }

    }
    public void updatePass(String pass, int user_id) {
        String sql = "UPDATE users SET pass = ? where id = ?";

        try (Connection conn = DatabaseConnection.getConnection();
             PreparedStatement pstmt = conn.prepareStatement(sql);
        ) {
            pstmt.setString(1, pass);
            pstmt.setInt(2, user_id);

            int rowsUpdate = pstmt.executeUpdate();

            if (rowsUpdate> 0){
                System.out.println("Parole veiksmīgi nomainīta");
            }
        }catch (SQLException e) {
            e.printStackTrace();
        }

    }







//    String DB = "jdbc:mysql://localhost:3306/java_sql";
//    String USER = "root";
//    String PASS = "amixslv";
//
//    //Create
//    public void register(String user, String pass) throws SQLException {
//        Connection conn = DriverManager.getConnection(DB, USER, PASS);
//
//        Statement stmt = conn.createStatement();
//
//      String sql = "insert into users (user, pass) values ('"+ user +"' , '"+ pass +"')";
//
//        stmt.executeUpdate(sql);
//
//        System.out.println("User created...");
//    }
//
//    //Delete
//    public void delete(int user_id ) throws SQLException {
//        Connection conn = DriverManager.getConnection(DB, USER, PASS);
//
//        Statement stmt = conn.createStatement();
//
//        String sql = "delete from users where id =" + user_id;
//
//        stmt.executeUpdate(sql);
//
//        System.out.println("User deleted...");
//    }
//    //update
//    public void update(String pass, int user_id) throws SQLException {
//        Connection conn = DriverManager.getConnection(DB, USER, PASS);
//
//        Statement stmt = conn.createStatement();
//
//        String sql = "update users set pass = '" + pass + "' where id =" + user_id;
//
//        stmt.executeUpdate(sql);
//
//        System.out.println("User updated...");
//    }
//    //select
//    public void select() throws SQLException {
//        Connection conn = DriverManager.getConnection(DB, USER, PASS);
//
//        Statement stmt = conn.createStatement();
//
//       ResultSet rs = stmt.executeQuery("select id, user, pass from users");
//
//       while (rs.next()) {
//           System.out.println("ID: " + rs.getInt("id"));
//           System.out.println("USER: " + rs.getString("user"));
//           System.out.println("PASS: " + rs.getString("pass"));
//           System.out.println("......................................");
//       }
//
//
//    }

}
