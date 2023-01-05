package com.backfc17.messagesApp.util;

import java.sql.Connection;
import java.sql.DriverManager;

public class ConnectionBD {
    public static Connection returnsConnection(){
        String root = "root";
        String password = "gibb";

        Connection conn = null;
        try {
            Class.forName("com.mysql.cj.jdbc.Driver");
            conn= DriverManager.getConnection("jdbc:mysql://localhost:3306/messages_app", root, password);
        } catch (Exception e) {
            System.out.println(e);
        }
        return conn;
    }
}
