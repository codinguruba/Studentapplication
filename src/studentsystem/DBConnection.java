
package studentsystem;


import java.sql.Connection;
import java.sql.*;

public class DBConnection {

    static Connection conn;

    public static Connection createConnection() {
        try {
            String uname = "root";
            String url = "jdbc:mysql://localhost:3306/system";
            String pwd = "";
            Class.forName("com.mysql.cj.jdbc.Driver");
            conn = DriverManager.getConnection(url, uname, pwd);
        } catch (Exception ex) {
            System.out.println(ex);
        }
        return conn;
    }
    
}
