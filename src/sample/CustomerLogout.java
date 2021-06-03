package sample;
import javafx.beans.property.SimpleDoubleProperty;
import javafx.beans.property.SimpleStringProperty;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.collections.transformation.FilteredList;
import javafx.collections.transformation.SortedList;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.*;
import javafx.scene.control.cell.PropertyValueFactory;

public class CustomerLogout {

    public Main main;

    @FXML
    private TextField SearchOption;

    @FXML
    public TableView <CustomerBookItem>customerTable;

    @FXML
    private Button logoutButton;

    @FXML
    private Button listButton;

    @FXML
    private Button searchButton;

    private boolean init = true;

    public void initializeColumns() {
        TableColumn<CustomerBookItem, String> catagory = new TableColumn<>("Category");
        catagory.setMinWidth(80);
        catagory.setCellValueFactory(new PropertyValueFactory<>("catagory"));

        TableColumn<CustomerBookItem, String> name = new TableColumn<>("Name");
        name.setMinWidth(80);
        name.setCellValueFactory(new PropertyValueFactory<>("name"));

        TableColumn<CustomerBookItem, String> writer = new TableColumn<>("Writer");
        writer.setMinWidth(80);
        writer.setCellValueFactory(new PropertyValueFactory<>("writer"));

        TableColumn<CustomerBookItem, Double> price = new TableColumn<>("Price");
        price.setMinWidth(80);
        price.setCellValueFactory(new PropertyValueFactory<>("price"));

        TableColumn<CustomerBookItem, String> button = new TableColumn<>("Buy");
        button.setMinWidth(80);
        button.setCellValueFactory(new PropertyValueFactory<>("button"));

        customerTable.getColumns().addAll(catagory,name, writer, price, button);
    }

    public void logoutAction(ActionEvent event){
        try {
            main.showcsLoginPage();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
    public void load() {
        if (init) {
            initializeColumns();
            init = false;
        }

        customerTable.setEditable(true);
        customerTable.setItems(main.data1);
    }

    @FXML
    void stockButtonAction(ActionEvent event) {
        load();
    } //list view

    @FXML
    void searchAction(ActionEvent event) {
        String search = SearchOption.getText();
        int f=0;
        for (int i = 0; i < main.data1.size(); i++) {
            if (search.equals(main.data1.get(i).getCatagory()) ||
                    search.equals(main.data1.get(i).getName()) ||
                    search.equals(main.data1.get(i).getWriter())) {
                    f=1;
            }
        }
        if(f==1){
            main.showSearch();
            load();
        }
        else{
            main.showNotfound();
        }
    }
    public void setMain(Main main)
    {
        this.main = main;
    }
}

