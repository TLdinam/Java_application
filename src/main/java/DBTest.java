import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.testng.annotations.Test;

import java.sql.PreparedStatement;
import java.sql.SQLException;

public class DBTest extends BaseTest {
    private static final Logger log = LogManager.getLogger(DBTest.class);

    @Test
    public void testInsert() throws SQLException {
        String sqlPattern = "INSERT INTO student (first_name, id, last_name) VALUES (?, ?, ?)";
        PreparedStatement preparedStatement = getConnection().prepareStatement(sqlPattern);
        preparedStatement.setString(1, "Ivan");
        preparedStatement.setInt(2, 4);
        preparedStatement.setString(3, "Ivanovich");
        try {
            preparedStatement.executeUpdate();
            preparedStatement.close();
        } catch (SQLException e) {
            log.error("Failed to insert data because of {}", e.getMessage());
        }
    }

    @Test
    public void testSelect() throws SQLException {
        String sqlPattern = "SELECT * FROM student WHERE first_name = ?";
        PreparedStatement preparedStatement = getConnection().prepareStatement(sqlPattern);
        preparedStatement.setString(1, "Ivan");
        try {
            preparedStatement.executeQuery();
            preparedStatement.close();
        } catch (SQLException e) {
            log.error("Failed to select data because of {}", e.getMessage());
        }
    }

    @Test
    public void testUpdate() throws SQLException {
        String sqlPattern = "UPDATE student SET first_name = ?, last_name = ? WHERE id = ?";
        PreparedStatement preparedStatement = getConnection().prepareStatement(sqlPattern);
        preparedStatement.setString(1, "Rinata");
        preparedStatement.setString(2, "Litvinova");
        preparedStatement.setInt(3, 4);
        try {
            preparedStatement.executeUpdate();
            preparedStatement.close();
        } catch (SQLException e) {
            log.error("Failed to update data because of {}", e.getMessage());
        }
    }

    @Test
    public void testDelete() throws SQLException {
        String sqlPattern = "DELETE FROM student WHERE id = ?";
        PreparedStatement preparedStatement = getConnection().prepareStatement(sqlPattern);
        preparedStatement.setInt(1, 4);
        try {
            preparedStatement.executeUpdate();
            preparedStatement.close();
        } catch (SQLException e) {
            log.error("Failed to delete data because of {}", e.getMessage());
        }
    }
}