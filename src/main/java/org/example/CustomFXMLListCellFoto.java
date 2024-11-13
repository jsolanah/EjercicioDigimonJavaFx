package org.example;

import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.control.ListCell;

public class CustomFXMLListCellFoto extends ListCell<Digimon> {
    @Override
    protected void updateItem(Digimon digimon, boolean empty) {
        super.updateItem(digimon, empty);

        if (empty || digimon == null) {
            setText(null);
            setGraphic(null);
        } else {
            try {
                FXMLLoader loader = new FXMLLoader(getClass().getResource("foto.fxml"));
                Parent root = loader.load();
                MuestraFoto mostrarFoto = loader.getController();
                mostrarFoto.setDatosDigimondFoto(digimon);

                setGraphic(root);
            } catch (Exception e) {
                e.printStackTrace();
            }
        }
    }
}
