package endTerm.question9;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.Scanner;

public class GetName {
    public boolean getNAme(Connection connection) throws SQLException {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the coming month:");
        String month = scanner.nextLine();
        PreparedStatement preparedStatement = connection.prepareStatement("SELECT * FROM birthday WHERE birthMonth =?");
        preparedStatement.setString(1, month);
        ResultSet resultSet = preparedStatement.executeQuery();
        while (resultSet.next()) {
            System.out.println(resultSet.getString("name"));
        }
        return resultSet.next();
    }
}
