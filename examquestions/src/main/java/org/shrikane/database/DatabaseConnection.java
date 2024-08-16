package org.shrikane.database;

import java.sql.*;

public class DatabaseConnection {
    public static void main(String[] args) throws SQLException {
        final String url = "jdbc:hsqldb:file:zoo";
        try (final Connection connection = DriverManager.getConnection(url))
//             final PreparedStatement preparedStatement = connection.prepareStatement(
//                     "SELECT name from public.player"
//             );
//             final ResultSet resultSet = preparedStatement.executeQuery()) {
        {
            System.out.println(connection.getSchema());
//            while (resultSet.next()) {
//                System.out.println(resultSet.getString(1));
//            }
        }
    }
}
