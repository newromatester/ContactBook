package ContactManager;

import Connection.DBConnection;

import java.sql.SQLException;

public class ContactManager {

    DBConnection connection = new DBConnection();

    public void add(Contact contact){
        String addContactQuery = String.format("INSERT INTO contacts (name, phone, email) VALUES ('%s', %s, '%s');", contact.getName(), contact.getPhone(), contact.getEmail());
        try {
            connection.getConnection().executeUpdate(addContactQuery);
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }

}
