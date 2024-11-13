package org.example;

import javafx.scene.image.Image;

public class Digimon {
    private int id;
    private String name;
    private String imageUrl;

    public Digimon(int id, String name, String imageUrl) {
        this.id = id;
        this.name = name;
        this.imageUrl = imageUrl;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getImageUrl() {
        return imageUrl;
    }

    public void setImageUrl(String imageUrl) {
        this.imageUrl = imageUrl;
    }
    public boolean contieneName(String pattern) {
        return name.toLowerCase().contains(pattern.toLowerCase());
    }






}
