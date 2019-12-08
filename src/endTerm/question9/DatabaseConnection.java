package endTerm.question9;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class DatabaseConnection {
    private Connection connection = null;

    public Connection getConnection() {
        return connection;
    }

    public boolean attemtConnection() throws SQLException {
        boolean isConnected = false;
        connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/friends?useLegacyDatetimeCode=false&serverTimezone=UTC", "root", "");
        if (connection != null) {
            isConnected = true;
        }
        return isConnected;
    }

    public boolean closeConnection() throws SQLException {
        boolean isConnectionClosed = false;
        if (getConnection() != null) {
            connection.close();
            isConnectionClosed = true;
        }
        return isConnectionClosed;
    }
}
