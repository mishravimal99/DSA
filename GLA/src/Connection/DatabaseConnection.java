package Connection;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class DatabaseConnection {
    private static Connection connection = null;

    public Connection getConnection(){
        return connection;
    }
    public void attemptConnection() throws SQLException {
        String url="jdbc:mysql://localhost:3306/vimalgf?useLegacyDateTimeCode=false&serverTime=UTC";
        String userName="root";
        String password="";
        connection= DriverManager.getConnection(url,userName,password);
        if(connection!=null)
            System.out.println("Connected Ok");
    }
}
