package jm.task.core.jdbc.util;
import java.sql.*;

import jm.task.core.jdbc.model.User;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;


public class Util {
    private static final String URL = "jdbc:postgresql://localhost:5432/postgres";
    private static final String USER = "postgres";
    private static final String PASSWORD = "ek50sent73";

    public static Connection createConnection() throws SQLException {

        return DriverManager.getConnection(URL, USER, PASSWORD);


    }



    private static SessionFactory sessionFactory;

    static {
        try {
            Configuration configuration = new Configuration();

            configuration.setProperty("hibernate.dialect", "org.hibernate.dialect.PostgreSQLDialect");
            configuration.setProperty("hibernate.connection.driver_class", "org.postgresql.Driver");
            configuration.setProperty("hibernate.connection.url", "jdbc:postgresql://localhost:5432/postgres");
            configuration.setProperty("hibernate.connection.username", "postgres");
            configuration.setProperty("hibernate.connection.password", "ek50sent73");
            configuration.setProperty("hibernate.hbm2ddl.auto", "update");
            configuration.setProperty("hibernate.show_sql", "true");

            configuration.addAnnotatedClass(User.class);

            sessionFactory = configuration.buildSessionFactory();

        } catch (Throwable ex) {
            System.err.println("Initial SessionFactory creation failed." + ex);
        }
    }

    public static SessionFactory getSessionFactory() {
        return sessionFactory;
    }
}
//    //HIBERNATE
//    private static final SessionFactory sessionFactory = buildSessionFactory();
//
//    private static SessionFactory buildSessionFactory() {
//        try {
//            Configuration configuration = new Configuration();
//            configuration.setProperty("hibernate.connection.driver_class", "com.mysql.cj.jdbc.Driver");
//            configuration.setProperty("hibernate.connection.url", "jdbc:mysql://localhost:3306/weqw");
//            configuration.setProperty("hibernate.connection.username", "weqw");
//            configuration.setProperty("hibernate.connection.password", "qwerty");
//            configuration.setProperty("hibernate.dialect", "org.hibernate.dialect.MySQLDialect");
//            configuration.setProperty("hibernate.hbm2ddl.auto", "update");
//            configuration.addAnnotatedClass(User.class);
//            return configuration.buildSessionFactory();
//        } catch (Throwable ex) {
//            throw new ExceptionInInitializerError(ex);
//        }
//    }
//
//    public static SessionFactory getSessionFactory() {
//        return sessionFactory;
//    }
//
//
//    // JDBS
//    public static Connection getConnection() throws SQLException {
//        // Параметры подключения
//        String url = "jdbc:mysql://127.0.0.1:3306/weqw";
//        String user = "weqw";
//        String password = "qwerty";
//
//        // Установка соединения
//        return DriverManager.getConnection(url, user, password);
//    }
//}


