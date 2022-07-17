import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.testng.annotations.AfterSuite;

import java.sql.Connection;
import java.sql.SQLException;

public class BaseTest {
    public static final String dbAdderss = "jdbc:postgresql://rd.cfvw8lxtimwu.eu-central-1.rds.amazonaws.com/lytovchenko";
    public static final String dbUser = "lytovchenko";
    public static final String dbPassword = "TarasLyt";

    private static final Logger log = LogManager.getLogger(BaseTest.class);

    protected Connection getConnection() throws SQLException {
        return DBConnection.getInstance(dbAdderss, dbUser, dbPassword).getConnection();
    }

    @AfterSuite
    public void tearDown() {
        try {
            DBConnection.closeConnection();
        } catch (SQLException e) {
            log.error("Failed to close connection {}", e.getMessage());
        }
    }
}