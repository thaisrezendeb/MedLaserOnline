package mlo.model;

import java.sql.Connection;
import java.sql.DriverManager;

public class ConnectionManager {

    public static ConnectionManager instance = null;

    public static ConnectionManager getInstance() {
        if (instance == null) {
            instance = new ConnectionManager();
        }
        return (instance);
    }
    private boolean postgree = true;
    private String url = "";
    private String pass = "";
    private String user = "";
    private String driver = "";
    private Connection conn = null;

    private ConnectionManager() {
        if (postgree) {
            // Para usar BD Postgree
            this.url = "jdbc:postgresql://localhost:5432/medlaseronline/";
            this.pass = "qwerty";
            this.user = "postgres";
            this.driver = "org.postgresql.Driver";
        }
        else {
            // Para usar BD MySQL
            this.url = "";
            this.pass = "";
            this.user = "";
            this.driver = "";
        }
    }

    public Connection getConnection() {
        try {
            if ((conn == null) || (conn.isClosed())) {
                Class.forName(driver);
                conn = DriverManager.getConnection(url, user, pass);
            }
            if (!conn.getAutoCommit()) {
                conn.setAutoCommit(true);
            }
        } catch (Exception ex) {
            ex.printStackTrace();
        }
        return (conn);
    }

    public Connection getConnectionForTransaction() {
        try {
            if ((conn == null) || (conn.isClosed())) {
                Class.forName(driver);
                conn = DriverManager.getConnection(url, user, pass);
            }
            if (conn.getAutoCommit()) {
                conn.setAutoCommit(false);
            }
        } catch (Exception ex) {
            ex.printStackTrace();
        }
        return (conn);
    }
}
