package sample;

import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.fxml.FXML;
import javafx.scene.control.ComboBox;
import javafx.scene.control.TextField;
import org.controlsfx.control.textfield.TextFields;


public class Controller {
    ObservableList<String> options =
            FXCollections.observableArrayList(
                    "one",
                    "two",
                    "three"
            );
    @FXML
    ComboBox comboBox;

    @FXML
    TextField textField;

    @FXML
    void initialize() {
      comboBox.setItems(options);


        TextFields.bindAutoCompletion(comboBox.getEditor(), comboBox.getItems());

    }

    @FXML
    void button() {
        String s = (String) comboBox.getValue();
        if (!options.contains(s))
            options.add(s);
        textField.setText(s);
    }

/*    void update(String value) {
        comboBox.set
    }*/
}
