package SQL;

import org.testng.annotations.AfterClass;

import java.sql.Connection;
import java.sql.SQLException;
import java.sql.Statement;

public class SQLRemove {
    @AfterClass
    public void deleteSQL() throws SQLException {

        try(Connection con = SQLConnection.connectSQL();
            Statement stmt = con.createStatement();
        ){  String remove = "DROP DATABASE users";
            stmt.executeUpdate(remove);
        } catch (SQLException e){
            e.printStackTrace();
        }

    }

}
