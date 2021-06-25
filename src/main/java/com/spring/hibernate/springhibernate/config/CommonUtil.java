package com.spring.hibernate.springhibernate.config;

import com.spring.hibernate.springhibernate.repository.JDBCConnection;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.Date;
import java.util.Properties;
import java.util.concurrent.Executors;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.ScheduledFuture;

import static java.util.concurrent.TimeUnit.MINUTES;
import static java.util.concurrent.TimeUnit.SECONDS;

public class CommonUtil {

    private static final ScheduledExecutorService scheduler =
            Executors.newScheduledThreadPool(1);

    public static void beepForAnHour() {
        final Runnable beeper = new Runnable() {
            public void run() {
                try {
                    connectWithDB();
                } catch (Exception e) {
                    e.printStackTrace();
                }
            }
        };
        final ScheduledFuture<?> beeperHandle =
                scheduler.scheduleAtFixedRate(beeper, 3, 5, MINUTES);
        scheduler.schedule(new Runnable() {
            public void run() {
                beeperHandle.cancel(true);
            }
        }, 60*60, SECONDS);
    }

    public static void connectWithDB() throws Exception {
        Connection conn = null;
        Statement stmt = null;
        ResultSet rs = null;
        try {
            Properties properties = PropertiesLoader.loadPropertiesFile();
            conn = JDBCConnection.getConnection();
            stmt = conn.createStatement();
            rs = stmt.executeQuery(properties.getProperty("db.script"));
            while (rs.next()) {
                System.out.println(rs.getString(1) + "  " + rs.getString(2) + "  " + new Date());
            }
        } catch (SQLException e){
            e.printStackTrace();
        } finally {
            JDBCConnection.closeConnection(conn, stmt, rs);
        }
    }

    public static void main(String[] args) {
        beepForAnHour();
    }
}
