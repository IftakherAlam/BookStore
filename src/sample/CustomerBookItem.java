package sample;

import javafx.beans.property.SimpleDoubleProperty;
import javafx.beans.property.SimpleStringProperty;
import javafx.scene.control.Alert;
import javafx.scene.control.Button;

public class CustomerBookItem {
    private final SimpleStringProperty catagory;
    private final SimpleStringProperty name;
    private final SimpleStringProperty writer;
    private final SimpleDoubleProperty price;
    private final Button button;
    public Main main;
    public CustomerBookItem(String catagory,String name,String writer, Double price, Main main) {
        this.catagory = new SimpleStringProperty(catagory);
        this.name = new SimpleStringProperty(name);
        this.writer = new SimpleStringProperty(writer);
        this.price = new SimpleDoubleProperty(price);
        this.button = new Button("Buy");
        button.setOnAction( e -> {
                    this.main.data1.remove(this);
                    main.showBought();
                }
        );
        this.main = main;
    }

    public String getCatagory() {
        return catagory.get();
    }
    public void setCatagory(String Catagory) {
        catagory.set(Catagory);
    }

    public String getName() {
        return name.get();
    }
    public void setName(String Name) {
        name.set(Name);
    }

    public String getWriter() {
        return writer.get();
    }
    public void setWriter(String Writer) {
        name.set(Writer);
    }

    public Double getPrice() {
        return price.get();
    }
    public void setPrice(Double Price) {
        price.set(Price);
    }

    public Button getButton() {
        return button;
    }

}
