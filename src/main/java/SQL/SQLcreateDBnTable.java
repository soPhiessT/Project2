package SQL;

import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import java.sql.Connection;
import java.sql.SQLException;
import java.sql.Statement;

public class SQLcreateDBnTable {
    @Test
    public void createDB()throws SQLException{
        Connection con = SQLConnection.connectSQL();
        Statement stmt = con.createStatement();
        String
                database = "create database users";
        String
                Table = "create table users.dbo.users ("
                + "   id INT NOT NULL IDENTITY(1,1) PRIMARY KEY,"
                + "   firstName varchar(50),"
                + "   lastName varchar(50),"
                + "   phone varchar(50),"
                + "   password varchar(50),"
                + "   address varchar(50),"
                + "   email varchar(50),"
                + "   state varchar(50),"
                + "   city varchar(50),"
                + "   zip int";

        stmt.executeUpdate(database);
        stmt.executeUpdate(Table);
        stmt.close();
        con.close();



    }
}
