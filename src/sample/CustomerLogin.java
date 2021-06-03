package sample;

import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.PasswordField;
import javafx.scene.control.TextField;

public class CustomerLogin {
    private Main main;

    @FXML
    private TextField userField;
    @FXML
    private PasswordField passwordField;
    @FXML
    private Button buttonLogin;
    @FXML
    private Button buttonBack;

    public ObservableList<Register> data = FXCollections.observableArrayList(
            new Register("nila akter","nilaakter@gmail.com","123"),
            new Register("nowrin meher","nowrinmeher@gmail.com","123"),
            new Register("akibul haque","akibulhaque@gmail.com","123"),
            new Register("anisul haque","anisulhaque@gmail.com","123"),
            new Register("rabiul islam","rabiulislam@gmail.com","123"),
            new Register("rabeya khatun","rabeyakhatun@gmail.com","123"),
            new Register("iftekhar alam","iftekharalam@gmail.com","123")
    );

    public void loginAction(ActionEvent event){
        String username=userField.getText();
        String password=passwordField.getText();
        int f=0;
        for(int i=0; i<data.size(); i++){
            if(username.equals(data.get(i).getUsername())&&
                    password.equals(data.get(i).getPword())){
                   f=1;
            }
        }
        if(f==1){
            try {
                main.showcsLogoutPage();
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
    public void setMain(Main main)
    {
        this.main = main;
    }
}
