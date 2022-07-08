import org.testng.annotations.Test;

import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class DBTest extends BaseTest {

    @Test
    public void testConnectionToBD() throws SQLException {
//        Statement sqlStatement = getConnection().createStatement();
//        ResultSet resultSet = sqlStatement.executeQuery("SELECT first_name, last_name, id FROM student");
//        ResultSet resultSet2 = sqlStatement.executeQuery("SELECT count(*) FROM student");

//        while(resultSet.next()) {
//            System.out.printf("%s %s %s \n", resultSet.getInt("id"), resultSet.getString(1), resultSet.getString(2));
//        }

//        resultSet2.next();
//        System.out.println(resultSet2.getInt(1));
//
//        String sqlPattern = "SELECT * FROM student WHERE first_name=? AND last_name=?";
//        PreparedStatement preparedStatement = getConnection().prepareStatement(sqlPattern);
//        preparedStatement.setString(1, "Stepan");
//        preparedStatement.setString(2, "Petrenko");
//        ResultSet resultSet = preparedStatement.executeQuery();
//        while (resultSet.next()) {
//            System.out.printf("Student's name is %s \n", resultSet.getString("first_name"));
//        }
//
//        preparedStatement.setString(1, "Mykola");
//        preparedStatement.setString(2, "Sydorenko");
//        resultSet = preparedStatement.executeQuery();
//        while (resultSet.next()) {
//            System.out.printf("Student's name is %s %s\n", resultSet.getString("first_name"), resultSet.getString("id"));
//        }
        String sqlPattern = "SELECT * FROM student WHERE id <?";
        PreparedStatement preparedStatement = getConnection().prepareStatement(
                sqlPattern,
                ResultSet.TYPE_FORWARD_ONLY,
                ResultSet.CONCUR_UPDATABLE
        );
        preparedStatement.setInt(1, 10);

        ResultSet rs = preparedStatement.executeQuery();

        rs.next();
        rs.updateString(3, "Blah");
        rs.updateRow();

    }

}