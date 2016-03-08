package FXMLService;

import javafx.beans.property.SimpleIntegerProperty;
import javafx.beans.property.SimpleStringProperty;

public class Table {

    private final SimpleIntegerProperty id;
    private final SimpleStringProperty name;
    private final SimpleIntegerProperty phone;
    private final SimpleStringProperty email;

    public int getId() {
        return id.get();
    }
    public SimpleIntegerProperty idProperty() {
        return id;
    }
    public void setId(int id) {
        this.id.set(id);
    }

    public String getName() {
        return name.get();
    }
    public SimpleStringProperty nameProperty() {
        return name;
    }
    public void setName(String name) {
        this.name.set(name);
    }

    public int getPhone() {
        return phone.get();
    }
    public SimpleIntegerProperty phoneProperty() {
        return phone;
    }
    public void setPhone(int phone) {
        this.phone.set(phone);
    }

    public String getEmail() {
        return email.get();
    }
    public SimpleStringProperty emailProperty() {
        return email;
    }
    public void setEmail(String email) {
        this.email.set(email);
    }

    public Table(SimpleIntegerProperty id, SimpleStringProperty name, SimpleIntegerProperty phone, SimpleStringProperty email) {
        this.id = id;
        this.name = name;
        this.phone = phone;
        this.email = email;
    }

}
