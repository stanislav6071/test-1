package jm.task.core.jdbc.dao;

import jm.task.core.jdbc.model.User;
import jm.task.core.jdbc.util.Util;

import java.sql.*;
import java.util.ArrayList;
import java.util.List;

public class UserDaoJDBCImpl implements UserDao {

    public UserDaoJDBCImpl() {
    }

    @Override
    public void createUsersTable() {
//        String createTableSQL = "CREATE TABLE IF NOT EXISTS users (" +
//                "id BIGINT PRIMARY KEY AUTO_INCREMENT, " +
//                "name VARCHAR(100), " +
//                "lastName VARCHAR(100), " +
//                "age TINYINT)";
//
//        try (Connection connection = Util.getConnection();
//             Statement statement = connection.createStatement()) {
//            statement.executeUpdate(createTableSQL);
//            System.out.println("Таблица users успешно создана или уже существует.");
//        } catch (SQLException e) {
//            e.printStackTrace();
//        }
    }

    @Override
    public void dropUsersTable() {
//        String dropTableSQL = "DROP TABLE IF EXISTS users";
//
//        try (Connection connection = Util.getConnection();
//             Statement statement = connection.createStatement()) {
//            statement.executeUpdate(dropTableSQL);
//            System.out.println("Таблица users удалена, если существовала.");
//        } catch (SQLException e) {
//            e.printStackTrace();
//        }
    }

    @Override
    public void saveUser(String name, String lastName, byte age) {
//        String insertUserSQL = "INSERT INTO Users (name, lastName, age) VALUES (?, ?, ?)";
//
//        try (Connection connection = Util.getConnection();
//             PreparedStatement pstmt = connection.prepareStatement(insertUserSQL)) {
//            pstmt.setString(1, name);
//            pstmt.setString(2, lastName);
//            pstmt.setByte(3, age);
//            pstmt.executeUpdate();
//            System.out.println("User с именем – " + name + " добавлен в базу данных.");
//        } catch (SQLException e) {
//            e.printStackTrace();
//        }
    }

    @Override
    public void removeUserById(long id) {
//        String deleteUserSQL = "DELETE FROM Users WHERE id = ?";
//
//        try (Connection connection = Util.getConnection();
//             PreparedStatement pstmt = connection.prepareStatement(deleteUserSQL)) {
//            pstmt.setLong(1, id);
//            pstmt.executeUpdate();
//            System.out.println("User с id – " + id + " удален из базы данных.");
//        } catch (SQLException e) {
//            e.printStackTrace();
//        }
    }

    @Override
    public List<User> getAllUsers() {
        return null;
//        List<User> userList = new ArrayList<>();
//        String selectAllUsersSQL = "SELECT * FROM Users";
//
//        try (Connection connection = Util.getConnection();
//             Statement statement = connection.createStatement();
//             ResultSet rs = statement.executeQuery(selectAllUsersSQL)) {
//
//            while (rs.next()) {
//                User user = new User();
//                user.setId(rs.getLong("id"));
//                user.setName(rs.getString("name"));
//                user.setLastName(rs.getString("lastName"));
//                user.setAge(rs.getByte("age"));
//                userList.add(user);
//            }
//        } catch (SQLException e) {
//            e.printStackTrace();
//        }
//        return userList;
    }

    @Override
    public void cleanUsersTable() {
//        String cleanTableSQL = "DELETE FROM Users";
//
//        try (Connection connection = Util.getConnection();
//             Statement statement = connection.createStatement()) {
//            statement.executeUpdate(cleanTableSQL);
//            System.out.println("Таблица users очищена.");
//        } catch (SQLException e) {
//            e.printStackTrace();
//        }
    }
}