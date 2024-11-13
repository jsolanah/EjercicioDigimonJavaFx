package org.example;

import java.io.IOException;
import javafx.fxml.FXML;
import javafx.scene.control.Label;

public class SecondaryController {

    @FXML
    private Label id;
    @FXML
    private Label name;

    public void setDatosDigimond(Digimon digimond){
        try {
            id.setText("Id: " + digimond.getId());
            name.setText("Name: " + digimond.getName());
        }catch (Exception e){
            e.printStackTrace();
        }
    }
}