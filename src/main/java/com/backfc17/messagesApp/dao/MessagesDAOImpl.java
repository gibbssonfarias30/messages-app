package com.backfc17.messagesApp.dao;

import com.backfc17.messagesApp.model.Messages;
import com.backfc17.messagesApp.util.ConnectionBD;

import java.sql.*;
import java.time.LocalDate;

public class MessagesDAOImpl implements IMessagesDAO {
    @Override
    public void createMessage(Messages messages) {
        try {
            Connection conn = ConnectionBD.returnsConnection();
            String SQLStatement = "INSERT INTO messages (message, authorMessage, dateMessage) VALUES(?,?,?)";
            PreparedStatement ps = conn.prepareStatement(SQLStatement);
            ps.setString(1, messages.getMessage());
            ps.setString(2, messages.getAuthorMessage());
            ps.setDate(3, Date.valueOf(LocalDate.now()));
            ps.executeUpdate();
            System.out.println("Message created");
        } catch (SQLException e) {
            System.out.println("Error: " + e);
        }
    }

    @Override
    public void readMessages() {
        PreparedStatement ps = null;
        ResultSet rs = null;

        try{
            Connection conn = ConnectionBD.returnsConnection();
            String SQLStatement = "SELECT * FROM messages";
            ps = conn.prepareStatement(SQLStatement);
            rs= ps.executeQuery();

            while(rs.next()){
                System.out.println("ID: "+ rs.getInt("id"));
                System.out.println("Message: "+ rs.getString("message"));
                System.out.println("Author: "+ rs.getString("authorMessage"));
                System.out.println("Date: "+ rs.getDate("dateMessage"));
                System.out.println("");

            }

        } catch (SQLException e) {
            System.out.println("Failed to retrieve data");
            System.out.println("Error: " + e);
        }
    }

    @Override
    public void deleteMessage(int id) {
        PreparedStatement ps = null;

        try {
            Connection conn = ConnectionBD.returnsConnection();
            String SQLStatement = "DELETE FROM messages WHERE id = ?";
            ps = conn.prepareStatement(SQLStatement);
            ps.setInt(1, id);
            ps.executeUpdate();
            System.out.println("The message has been deleted successfully.");


        } catch (SQLException e) {
            System.out.println("Could not delete message");
            System.out.println("Error: " + e);
        }
    }

    @Override
    public void updateMessage(Messages messages) {

        Connection conn = ConnectionBD.returnsConnection();
        PreparedStatement ps = null;
        try {
            String SQLStatement = "UPDATE messages SET message = ? WHERE id = ?";
            ps = conn.prepareStatement(SQLStatement);
            ps.setString(1, messages.getMessage());
            ps.setInt(2, messages.getId());
            ps.executeUpdate();
            System.out.println("Modified message");
        } catch (SQLException e) {
            System.out.println("Could not update message");
            System.out.println("Error: " + e);
        }
    }
}
