import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class DBConnection {
    public static Connection getConnection() {
        Connection con = null;
        try {
            Class.forName("com.mysql.cj.jdbc.Driver");
            con = DriverManager.getConnection(
                "jdbc:mysql://localhost:3306/wtpr6db?useSSL=false&serverTimezone=UTC",
                "root", ""
            );
        } catch (Exception e) {
            e.printStackTrace();
        }
        return con;
    }
}
