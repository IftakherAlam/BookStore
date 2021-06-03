package sample;

import javafx.application.Application;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Alert;
import javafx.stage.Stage;


public class Main extends Application {
    private Stage stage;

    public ObservableList<BookItem> data = FXCollections.observableArrayList(
            new BookItem("Dictionary","Cambridge Advanced Learner's Dictionary","Cambridge University Press", 1000.0, this),
            new BookItem("Dictionary","Cambridge Advanced Learner's Dictionary","Cambridge University Press", 1000.0, this),
            new BookItem("Dictionary","Cambridge Advanced Learner's Dictionary","Cambridge University Press", 1000.0, this),
            new BookItem("Dictionary","Cambridge Advanced Learner's Dictionary","Cambridge University Press", 1000.0, this),
            new BookItem("Novel","A Passage to India","E. M. Forster",100.0, this),
            new BookItem("Novel","A Passage to India","E. M. Forster",100.0, this),
            new BookItem("Novel","A Passage to India","E. M. Forster",100.0, this),
            new BookItem("Story","The Very Hungry Caterpillar","Eric Carle",500.0, this),
            new BookItem("Story","The Cat in the Hat","Dr. Seuss",500.0, this),
            new BookItem("Story","The Rainbow Fish","Marcus Pfister",500.0, this),
            new BookItem("Story","Harry Potter"," J. K. Rowling",500.0, this),
            new BookItem("HSC","Physics 1st Paper","Azizul Haque",100.0, this),
            new BookItem("HSC","Physics 2nd Paper","Azizul Haque",100.0, this),
            new BookItem("HSC","Chemistry 1st Paper","Asis Kumar",100.0, this),
            new BookItem("HSC","Chemistry 2nd Paper","Asis Kumar",100.0, this),
            new BookItem("English","Practical English Usage","Michael Swan",100.0, this),
            new BookItem("English","Practical English Usage","Michael Swan",100.0, this),
            new BookItem("English","Practical English Usage","Michael Swan",100.0, this),
            new BookItem("English","Practical English Usage","Michael Swan",100.0, this),
            new BookItem("English","Practical English Usage","Michael Swan",100.0, this)
    );

    public ObservableList<CustomerBookItem> data1 = FXCollections.observableArrayList(
            new CustomerBookItem("Dictionary","Cambridge Advanced Learner's Dictionary","Cambridge University Press", 1000.0, this),
            new CustomerBookItem("Dictionary","Cambridge Advanced Learner's Dictionary","Cambridge University Press", 1000.0, this),
            new CustomerBookItem("Dictionary","Cambridge Advanced Learner's Dictionary","Cambridge University Press", 1000.0, this),
            new CustomerBookItem("Dictionary","Cambridge Advanced Learner's Dictionary","Cambridge University Press", 1000.0, this),
            new CustomerBookItem("Novel","A Passage to India","E. M. Forster",100.0, this),
            new CustomerBookItem("Novel","A Passage to India","E. M. Forster",100.0, this),
            new CustomerBookItem("Novel","A Passage to India","E. M. Forster",100.0, this),
            new CustomerBookItem("Story","The Very Hungry Caterpillar","Eric Carle",500.0, this),
            new CustomerBookItem("Story","The Cat in the Hat","Dr. Seuss",500.0, this),
            new CustomerBookItem("Story","The Rainbow Fish","Marcus Pfister",500.0, this),
            new CustomerBookItem("Story","Harry Potter"," J. K. Rowling",500.0, this),
            new CustomerBookItem("HSC","Physics 1st Paper","Azizul Haque",100.0, this),
            new CustomerBookItem("HSC","Physics 2nd Paper","Azizul Haque",100.0, this),
            new CustomerBookItem("HSC","Chemistry 1st Paper","Asis Kumar",100.0, this),
            new CustomerBookItem("HSC","Chemistry 2nd Paper","Asis Kumar",100.0, this),
            new CustomerBookItem("English","Practical English Usage","Michael Swan",100.0, this),
            new CustomerBookItem("English","Practical English Usage","Michael Swan",100.0, this),
            new CustomerBookItem("English","Practical English Usage","Michael Swan",100.0, this),
            new CustomerBookItem("English","Practical English Usage","Michael Swan",100.0, this),
            new CustomerBookItem("English","Practical English Usage","Michael Swan",100.0, this)
    );


    public Stage getStage() {
        return stage;
    }

    @Override
    public void start(Stage primaryStage) throws Exception {
        stage = primaryStage;
        chooseOption();
        stage.setWidth(600);
        stage.setHeight(600);
    }

    public void showLoginPage() throws Exception {
        FXMLLoader loader = new FXMLLoader();
        loader.setLocation(getClass().getResource("sample.fxml"));
        Parent root = loader.load();
        Controller controller = loader.getController();
        controller.setMain(this);
        stage.setTitle("Admin Login");
        stage.setScene(new Scene(root, 400, 250));
        stage.show();
    }

    public void showcsLoginPage() throws Exception {
        FXMLLoader loader = new FXMLLoader();
        loader.setLocation(getClass().getResource("customerLogin.fxml"));
        Parent root = loader.load();
        CustomerLogin controller = loader.getController();
        controller.setMain(this);
        stage.setTitle("Cusromer Login");
        stage.setScene(new Scene(root, 400, 250));
        stage.show();
    }

    public void showcsLogoutPage() throws Exception {
        FXMLLoader loader = new FXMLLoader();
        loader.setLocation(getClass().getResource("customerLogout.fxml"));
        Parent root = loader.load();
        CustomerLogout controller = loader.getController();
        controller.setMain(this);
        stage.setTitle("Customer");
        stage.setScene(new Scene(root, 800, 500));
        stage.show();
    }

    public void chooseOption() throws Exception {
        FXMLLoader loader = new FXMLLoader();
        loader.setLocation(getClass().getResource("chooseOption.fxml"));
        Parent root = loader.load();
        chooseOption controller = loader.getController();
        controller.setMain(this);
        stage.setTitle("Choose Option");
        stage.setScene(new Scene(root, 400, 250));
        stage.show();
    }
    public void showLogoutPage(String username) throws Exception {
        FXMLLoader loader = new FXMLLoader();
        loader.setLocation(getClass().getResource("logout.fxml"));
        Parent root = loader.load();
        Logout controller = loader.getController();
        controller.setMain(this);
        stage.setTitle("Main");
        stage.setScene(new Scene(root, 800, 500));
        stage.show();
    }

    public void showBought() {
        Alert alert = new Alert(Alert.AlertType.CONFIRMATION);
        alert.setTitle("CONFIRMATION");
        alert.setHeaderText("Congratulation!!!");
        alert.setContentText("You've bought the book");
        alert.showAndWait();
    }

    public void showSearch() {
        Alert alert = new Alert(Alert.AlertType.CONFIRMATION);
        alert.setTitle("Great");
        alert.setHeaderText("The book is available");
        alert.showAndWait();
    }

    public void showNotfound() {
        Alert alert = new Alert(Alert.AlertType.ERROR);
        alert.setTitle("Sorry");
        alert.setHeaderText("The book isn't available");
        alert.showAndWait();
    }

    public void showAlert() {
        Alert alert = new Alert(Alert.AlertType.ERROR);
        alert.setTitle("Incorrect Credentials");
        alert.setHeaderText("Incorrect Credentials");
        alert.setContentText("The username and password you provided is not correct.");
        alert.showAndWait();
    }

    public static void main(String[] args) {
        launch(args);
    }
}
