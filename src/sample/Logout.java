package sample;
//Controller class of logout
import javafx.beans.property.SimpleDoubleProperty;
import javafx.beans.property.SimpleStringProperty;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;
import javafx.scene.control.TextField;
import javafx.scene.control.cell.PropertyValueFactory;

public class Logout {

    public Main main;

    @FXML
    public TableView bookTable;

    @FXML
    public Button stockButton;

    @FXML
    public Button addButton;

    @FXML
    private Button logoutButton;

    @FXML
    public TextField itemName;

    @FXML
    public TextField itemPrice;

    @FXML
    public TextField Catagory;

    @FXML
    public TextField Writer;

    private boolean init = true;

    public void initializeColumns() {
        TableColumn<BookItem, String> catagory = new TableColumn<>("Catagory");
        catagory.setMinWidth(80);
        catagory.setCellValueFactory(new PropertyValueFactory<>("catagory"));

        TableColumn<BookItem, String> name = new TableColumn<>("Name");
        name.setMinWidth(80);
        name.setCellValueFactory(new PropertyValueFactory<>("name"));

        TableColumn<BookItem, String> writer = new TableColumn<>("Writer");
        writer.setMinWidth(80);
        writer.setCellValueFactory(new PropertyValueFactory<>("writer"));

        TableColumn<BookItem, Double> price = new TableColumn<>("Price");
        price.setMinWidth(80);
        price.setCellValueFactory(new PropertyValueFactory<>("price"));

        TableColumn<BookItem, String> button = new TableColumn<>("Remove");
        button.setMinWidth(80);
        button.setCellValueFactory(new PropertyValueFactory<>("button"));

        bookTable.getColumns().addAll(catagory, name, writer, price, button);
    }

    public void logoutAction(ActionEvent event){
        try {
            main.showLoginPage();

        } catch (Exception e) {
            e.printStackTrace();
        }
    }
    public void load() {
        if (init) {
            initializeColumns();
            init = false;
        }
        bookTable.setEditable(true);
        bookTable.setItems(main.data);
    }

    @FXML
    void stockButtonAction(ActionEvent event) {
        load();
    }

    @FXML
    void addButtonAction(ActionEvent event) {
        String name = itemName.getText();
        String catagory = Catagory.getText();
        String writer = Writer.getText();
        Double price = Double.parseDouble(itemPrice.getText());
        main.data.add(new BookItem(catagory, name, writer, price, main));
        bookTable.refresh();
    }

    public void setMain(Main main)
    {
        this.main = main;
    }
}