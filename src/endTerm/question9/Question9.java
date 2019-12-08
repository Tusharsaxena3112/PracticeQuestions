package endTerm.question9;

import java.sql.SQLException;

public class Question9 {
    public static void main(String[] args) throws SQLException {
        DatabaseConnection db = new DatabaseConnection();
        GetName getName = new GetName();
        Insert insert = new Insert();
        System.out.println(db.attemtConnection());
//        insert.insertDetails(db.getConnection());
        getName.getNAme(db.getConnection());
    }


}
