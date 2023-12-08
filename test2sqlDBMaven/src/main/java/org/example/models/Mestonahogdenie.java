package org.example.models;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;

@Entity
public class Mestonahogdenie {

    @Id
    private  Long ID_mesta;
    private String name_mesta;

    public Mestonahogdenie() {
    }

    public Mestonahogdenie(Long ID_mesta, String name_mesta) {
        this.ID_mesta = ID_mesta;
        this.name_mesta = name_mesta;
    }

    public Long getID_mesta() {
        return ID_mesta;
    }

    public void setID_mesta(Long ID_mesta) {
        this.ID_mesta = ID_mesta;
    }

    public String getName_mesta() {
        return name_mesta;
    }

    public void setName_mesta(String name_mesta) {
        this.name_mesta = name_mesta;
    }
}
