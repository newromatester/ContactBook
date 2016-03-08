package FXMLService;

import ContactManager.*;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.*;
import javafx.scene.control.cell.PropertyValueFactory;
import javafx.scene.layout.AnchorPane;
import javafx.scene.layout.VBox;

import java.net.URL;
import java.util.ResourceBundle;

public class FXMLController implements Initializable {

    @FXML
    private AnchorPane anchorPane;

    @FXML
    private TableView<Table> tableView;
    @FXML
    private TableColumn<Table, Integer> idColumn;
    @FXML
    private TableColumn<Table, String> nameColumn;
    @FXML
    private TableColumn<Table, Integer> phoneColumn;
    @FXML
    private TableColumn<Table, String > emailColumn;

    @FXML
    private VBox fieldsBox;

    @FXML
    private TextField nameField;
    @FXML
    private TextField phoneField;
    @FXML
    private TextField emailField;
    @FXML
    private Button addContactButton;

    @FXML
    private Label showMessage;

    @FXML
    private Button closeButton;

    public void addContact() {
        try {
            String contactName = nameField.getText();
            Integer contactPhone = Integer.valueOf(phoneField.getText());
            String contactEmail = emailField.getText();

            if (contactName != null && contactPhone != null && contactEmail != null) {
                ContactManager contactManager = new ContactManager();
                contactManager.add(new Contact(contactName, contactPhone, contactEmail));
            } else {
                showMessage.setText("Поля ввода имя, телефон и email не должы быть пустыми");
            }
        }catch (Exception ex) {
            showMessage.setText("Уупс.. что-то пошло не так");
            ex.printStackTrace();
        }
    }

    public void closeButton() {
        System.exit(0);
    }


    @Override
    public void initialize(URL location, ResourceBundle resources) {
        idColumn.setCellValueFactory(new PropertyValueFactory<Table, Integer>("id"));
        nameColumn.setCellValueFactory(new PropertyValueFactory<Table, String>("name"));
        phoneColumn.setCellValueFactory(new PropertyValueFactory<Table, Integer>("phone"));
        emailColumn.setCellValueFactory(new PropertyValueFactory<Table, String>("email"));
    }
}
