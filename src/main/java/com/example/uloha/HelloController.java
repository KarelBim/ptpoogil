package com.example.uloha;

import javafx.fxml.FXML;
import javafx.scene.control.*;

import java.util.ArrayList;

public class HelloController {
    @FXML
    private Label hodnoty;
    @FXML
    private ToggleGroup lvl;
    @FXML
    private RadioButton zacatek;
    @FXML
    private CheckBox ch1;
    @FXML
    private CheckBox ch2;
    @FXML
    private CheckBox ch3;
    @FXML
    protected void zobrazit(){
        ArrayList<String> checkBoxy = new ArrayList<>();
        if(ch1.isSelected()){
            checkBoxy.add(ch1.getText());
        }
        if(ch2.isSelected()){
            checkBoxy.add(ch2.getText());
        }
        if(ch3.isSelected()){
            checkBoxy.add(ch3.getText());
        }
        RadioButton radio = (RadioButton)((Toggle)(lvl.getSelectedToggle()));
        hodnoty.setText(String.join(", ", checkBoxy) + "," + radio.getText());
    }
    @FXML
    protected void vychStav(){
        zacatek.setSelected(true);
        ch1.setSelected(false);
        ch2.setSelected(false);
        ch3.setSelected(false);
        hodnoty.setText("");
    }

}
