package database;

import javax.swing.*;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class Conexao {

    private static Connection conn;
    private static final String url = "jdbc:mysql://localhost/cadfunc";
    private static final String user = "root";
    private static final String password = "";

    public static Connection getConn() {

        try {

            conn = DriverManager.getConnection(url, user, password);
        } catch (SQLException e) {

            JOptionPane.showMessageDialog(null, "Configure sua conexão com o banco de dados", "Error", JOptionPane.ERROR_MESSAGE);
            System.exit(1);
        }

        return conn;
    }
}
