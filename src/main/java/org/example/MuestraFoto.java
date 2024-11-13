package org.example;

import javafx.fxml.FXML;
import javafx.scene.control.Label;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;

public class MuestraFoto {

    @FXML
    private Label id;
    @FXML
    private ImageView foto;
    @FXML
    private Label name;

    public void setDatosDigimondFoto(Digimon digimond){
        String urlImagen = digimond.getImageUrl();
        try {
            Image image = new Image(urlImagen);
            foto.setImage(image);
            id.setText("Id: " + digimond.getId());
            name.setText("Name: " + digimond.getName());
        }catch (Exception e){
            e.printStackTrace();
        }
    }
}
