package sample;
//admin login
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.PasswordField;
import javafx.scene.control.TextField;

import javax.swing.*;

public class Controller {
    private Main main;
    @FXML
    private TextField emailTextField;
    @FXML
    private PasswordField passwordField;
    @FXML
    private Button loginButton;
    @FXML
    private Button Back;
    public void setMain(Main main){
        this.main=main;
    }
    public void loginButtonAction(ActionEvent event){
        String username=emailTextField.getText();
        String password=passwordField.getText();
        if(username.equals("john")&&
                password.equals("123")){
            try {
                main.showLogoutPage(username);
            } catch (Exception e) {
                e.printStackTrace();
            }
        }
        else{
            main.showAlert();
        }
    }
    public void backAction(ActionEvent event){
        try {
            main.chooseOption();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
