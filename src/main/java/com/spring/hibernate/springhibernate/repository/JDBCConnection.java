package com.spring.hibernate.springhibernate.repository;

import com.spring.hibernate.springhibernate.config.PropertiesLoader;

import java.sql.*;
import java.util.Properties;

public class JDBCConnection {

    public static Connection getConnection() throws Exception {
        Connection con = null;
        try {
            Properties properties = PropertiesLoader.loadPropertiesFile();
            String driverClass = properties.getProperty("mysql.jdbc.driver");
            String URL = properties.getProperty("mysql.jdbc.url");
            String USERNAME = properties.getProperty("mysql.jdbc.username");
            String PASSWORD = properties.getProperty("mysql.jdbc.password");

            Class.forName(driverClass);

            con = DriverManager.getConnection(URL, USERNAME, PASSWORD);

        } catch (SQLException | ClassNotFoundException e) {
            System.out.println(e);
        }
        return con;
    }

    public static void closeConnection(Connection conn, Statement stmt, ResultSet rs) {
        try {
            if (conn != null) {
                conn.close();
            }
            if (stmt != null) {
                stmt.close();
            }
            if (rs != null) {
                rs.close();
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }
}
