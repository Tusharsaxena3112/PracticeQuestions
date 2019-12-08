package endTerm.question9;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.Scanner;

public class Insert {
    public void insertDetails(Connection connection) throws SQLException {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter your name:");
        String name = scanner.nextLine();
        System.out.println("Enter birthMonth");
        String month = scanner.nextLine();
        PreparedStatement preparedStatement = connection.prepareStatement("INSERT INTO birthday VALUES(?,?)");
        preparedStatement.setString(1, name);
        preparedStatement.setString(2, month);
        int rows = preparedStatement.executeUpdate();
        if (rows != 0) {
            System.out.println("Successfully Added.....");
        }
    }
}
