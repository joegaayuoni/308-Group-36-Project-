package Sanashopping;

import java.sql.*;

public class MyTest {
    public static void main(String[] args) throws SQLException, ClassNotFoundException {

        Class.forName("java.sql.Driver");
        Connection connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/308project", "root", " ");

        Statement statement = connection.createStatement();

        ResultSet resultSet = statement.executeQuery("select * from products");

        while (resultSet.next()) {
            System.out.println(resultSet.getString("productname"));
        }
    }
}
