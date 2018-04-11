import java.sql.*;

public class SQLConnector {

    public static void addTask(String title, String description, int dueDate, boolean finished) {

        Connection connection = null;

        try {
            connection = DriverManager.getConnection("jdbc:sqlite:C:/sqlite/databases/TaskManager.db");
            PreparedStatement statement = connection.prepareStatement("INSERT INTO tasks(title, description, dueDate) VALUES(?, ?, ?)");
            statement.setString(1, title);
            statement.setString(2, description);
            statement.setInt(3, dueDate);
            statement.executeUpdate();
        } catch (SQLException e) {
            System.err.println(e.getMessage());
        } finally {
            try {
                if (connection!=null) {
                    connection.close();
                }
            } catch (SQLException e) {
                System.err.println(e.getMessage());
            }
        }
    }

    public static void getAllTasks() {
        Connection connection = null;

        try {
            connection = DriverManager.getConnection("jdbc:sqlite:C:/sqlite/databases/TaskManager.db");
            PreparedStatement statement = connection.prepareStatement("SELECT * FROM tasks");
            ResultSet rs = statement.executeQuery();
            while (rs.next()) {
                System.out.println(rs.getString(1) + rs.getString(2) + rs.getString(3) + rs.getString(4) + rs.getString(5));
            }
        } catch (SQLException e) {
            System.err.println(e.getMessage());
        } finally {
            try {
                if (connection!=null) {
                    connection.close();
                }
            } catch (SQLException e) {
                System.err.println(e.getMessage());
            }
        }
    }
}
