package DatabaseManagement;

import java.sql.Connection;
import java.sql.DriverManager;

public class JoinSQlTable {
    public static Connection getDBConnection() throws Exception
    {
        Connection connection=null;
        try {
            Class.forName("com.mysql.jdbc.Driver"); //provide database driver name
            //connecting string
            connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/employee", "root", "Tanuja123");
            return connection;
        }
        catch (Exception e)
        {
            e.printStackTrace();
            throw e;
        }
    }
}
