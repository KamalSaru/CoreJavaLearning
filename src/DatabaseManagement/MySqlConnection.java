package DatabaseManagement;

import java.sql.Connection;
import java.sql.DriverManager;

public class MySqlConnection {
    public static void main(String[] args) {
        Connection connection = null;
        try {
            Class.forName("com.mysql.jdbc.Driver"); //provide database driver name
            connection =
                    DriverManager.getConnection("jdbc:mysql://localhost:3306/myfirstproject", "root", "Tanuja123");
            System.out.println(connection);
        } catch (Exception e) {
            e.printStackTrace(); //it prints exception details
        }
    }
}
