package Week_06.JDBC_Database_App;

import java.sql.*;

public class Database_App {
    public static final String DB_URL = "jdbc:mysql://localhost/employee";
    public static final String DB_USER = "root";
    public static final String DB_PASSWORD = "mysql";

    public static void main(String[] args) {
        Connection connect = null;
        String sql = "SELECT*FROM employee";

        try {
            connect = DriverManager.getConnection(DB_URL, DB_USER, DB_PASSWORD);
            Statement st = connect.createStatement();
            ResultSet data = st.executeQuery(sql);
            while (data.next()) {
                System.out.println("ID : " + data.getInt("id"));
                System.out.println("Name : " + data.getString("name"));
                System.out.println("Role : " + data.getString("position"));
                System.out.println("Salary : " + data.getInt("salary"));
                System.out.println("---------------------------------------");
            }
            connect.close();
            st.close();
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }


    }
}
