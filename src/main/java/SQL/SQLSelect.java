package SQL;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class SQLSelect {
    public String
            firstName, lastName, phone, password, address, email, city, zip;

    public void SQLSelect() throws SQLException {

        Connection con = SQLConnection.connectSQL();
        Statement stmt = con.createStatement();
        String qry = "SELECT*FROM users";
        ResultSet res = stmt.executeQuery(qry);

        while (res.next()) {
            firstName = res.getString("firstName");
            lastName = res.getString("lastName");
            phone = res.getString("phone");
            password = res.getString("password");
            address = res.getString("address");
            email = res.getString("email");
            city = res.getString("city");
            zip = res.getString("zip");

        }
        con.close();

    }
}
