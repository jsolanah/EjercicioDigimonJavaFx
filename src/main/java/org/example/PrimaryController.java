package org.example;

import java.io.IOException;

import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.event.EventHandler;
import javafx.fxml.FXML;
import javafx.scene.control.ListCell;
import javafx.scene.control.ListView;
import javafx.scene.control.TextField;
import javafx.scene.input.MouseEvent;
import javafx.util.Callback;

public class PrimaryController {
    @FXML
    public ListView<Digimon>listView;
    public ListView<Digimon>listViewCarga;
    public ObservableList<Digimon> digimons;

    public ObservableList<Digimon> digimonsCarga;
    @FXML
    public TextField textField;


    public void initialize(){
        this.digimons = FXCollections.observableArrayList();
        digimons.add(new Digimon(1, "Agumon", "https://digimon.shadowsmith.com/img/agumon.jpg"));
        digimons.add(new Digimon(2, "Gabumon", "https://digimon.shadowsmith.com/img/gabumon.jpg"));
        digimons.add(new Digimon(3, "Patamon", "https://digimon.shadowsmith.com/img/patamon.jpg"));
        digimons.add(new Digimon(4, "Togemon", "https://digimon.shadowsmith.com/img/togemon.jpg"));
        digimons.add(new Digimon(5, "Kabuterimon", "https://digimon.shadowsmith.com/img/kabuterimon.jpg"));
        digimons.add(new Digimon(6, "Devimon", "https://digimon.shadowsmith.com/img/devimon.jpg"));
        digimons.add(new Digimon(7, "Greymon", "https://digimon.shadowsmith.com/img/greymon.jpg"));
        digimons.add(new Digimon(8, "Ogremon", "https://digimon.shadowsmith.com/img/ogremon.jpg"));
        digimons.add(new Digimon(9, "Seadramon", "https://digimon.shadowsmith.com/img/seadramon.jpg"));
        digimons.add(new Digimon(10, "WarGreymon", "https://digimon.shadowsmith.com/img/wargreymon.jpg"));

        listView.setItems(digimons);

        listView.setCellFactory(param -> new CustomFXMLListCell());
        listView.getSelectionModel().selectedItemProperty().addListener((observable, oldValue, newValue) -> {
            if (newValue != null) {
                mostrarDigimon(newValue);
            }
        });

    }
    @FXML
    public void mostrarDigimon(Digimon d) {
        if (digimonsCarga == null) {
            digimonsCarga = FXCollections.observableArrayList();
            listViewCarga.setItems(digimonsCarga);
            listViewCarga.setCellFactory(param -> new CustomFXMLListCellFoto());
        }

        digimonsCarga.setAll(d);
    }



    @FXML
    public void searchName(){
        String pattern = this.textField.getText();
        ObservableList<Digimon> filteredList = digimons.filtered(digimon -> digimon.contieneName(pattern));
        if (!filteredList.isEmpty()){
            listView.setItems(filteredList);
        }


    }





}
