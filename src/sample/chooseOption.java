package sample;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.image.ImageView;

public class chooseOption {
    private Main main;
    @FXML
    private Button Admin;
    @FXML
    private Button Customer;
    @FXML
    private ImageView Image;

    public void adminAction(ActionEvent event){
        try {
            main.showLoginPage();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public void customerAction(ActionEvent event){
        try {
            main.showcsLoginPage();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public void setMain(Main main)
    {
        this.main = main;
    }
}
