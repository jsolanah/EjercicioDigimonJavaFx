package org.example;

import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.control.ListCell;

public class CustomFXMLListCell extends ListCell<Digimon> {
    @Override
    protected void updateItem(Digimon digimon, boolean empty) {
        super.updateItem(digimon, empty);

        if (empty || digimon == null) {
            setText(null);
            setGraphic(null);
        } else {
            try {
                FXMLLoader loader = new FXMLLoader(getClass().getResource("secondary.fxml"));
                Parent root = loader.load();
                SecondaryController controller = loader.getController();
                controller.setDatosDigimond(digimon);

                setGraphic(root);
            } catch (Exception e) {
                e.printStackTrace();
            }
        }
    }




}
