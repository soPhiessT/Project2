package SQL;

import DataObject.RegistrationData;
import org.testng.annotations.Test;

import java.sql.*;

public class InsertDataSQL implements RegistrationData {
    public void insert() throws SQLException {
        Connection con = SQLConnection.connectSQL();
        Statement stmt = con.createStatement();
        String qry = "SELECT*FROM users";
        ResultSet res = stmt.executeQuery(qry);

        String sql = " insert into [users].[dbo].[users] (firstName,lastName,phone, password, address, email, city, zip)"
                + " values(?,?,?,?,?,?,?,?)";
        PreparedStatement pstmt = con.prepareStatement(sql, Statement.RETURN_GENERATED_KEYS);

        pstmt.setString(1, firstName);
        pstmt.setString(2, lastName);
        pstmt.setString(3, phone);
        pstmt.setString(4, password);
        pstmt.setString(5, address);
        pstmt.setString(6, email);
        pstmt.setString(7, city);
        pstmt.setString(8, zip);
        pstmt.executeUpdate(sql);
        stmt.close();
        con.close();


    }
}
