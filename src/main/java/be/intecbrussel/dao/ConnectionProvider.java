package be.intecbrussel.dao;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class ConnectionProvider {
    private Connection connection;
    private static ConnectionProvider insatnce = new ConnectionProvider();


    public static ConnectionProvider getInstance() {
        return insatnce;
    }

    public Connection getConnection() {
        //we moeten checken dat de connectie null of niet is
        if (connection == null) {
            try {
                connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/campany_demo",//hier moeten wij de
                        //naam van database geven
                        "root", "");
            } catch (SQLException e) {


            }
        }
        return connection;
    }

}
