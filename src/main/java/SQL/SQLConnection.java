package SQL;

import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import java.io.FileInputStream;
import java.io.IOException;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.Properties;

public class SQLConnection {

    @BeforeClass
    public static Connection connectSQL() throws SQLException {
        Connection Connection = null;
        try (FileInputStream file = new FileInputStream("src/main/resources/User.properties")) {
            Properties prop = new Properties();
            prop.load(file);

            String url = prop.getProperty("url");
            String user = prop.getProperty("user");
            String password = prop.getProperty("password");

            Connection = DriverManager.getConnection(url, user, password);

        } catch (IOException e) {
            System.out.println(e.getMessage());
        }
        return Connection;

    }
}