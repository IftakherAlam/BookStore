package sample;

import javafx.beans.property.SimpleDoubleProperty;
import javafx.beans.property.SimpleStringProperty;
import javafx.scene.control.Alert;
import javafx.scene.control.Button;

public class Register {
    private final SimpleStringProperty username;
    private final SimpleStringProperty email;
    private final SimpleStringProperty password;
    public CustomerLogin customerLogin;

    public Register(String username,String email,String password) {
        this.username = new SimpleStringProperty(username);
        this.email = new SimpleStringProperty(email);
        this.password = new SimpleStringProperty(password);
        this.customerLogin = customerLogin;
    }
    public String getUsername() {
        return username.get();
    }
    public void setUsername(String Username) {
        username.set(Username);
    }

    public String getEmail() {
        return email.get();
    }
    public void setEmail(String Email) {
        email.set(Email);
    }

    public String getPword() {
        return password.get();
    }
    public void setPword(String Pword) {
        password.set(Pword);
    }
}

