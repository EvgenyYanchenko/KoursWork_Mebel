package org.example.models;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

@Entity
public class Postavshiki {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long ID_postavshika;
    private String NamePostavshika;
    private Long ID_form_sobstv;
    private String Adres_postavshika;

    public Postavshiki(Long ID_postavshika, String namePostavshika, Long ID_form_sobstv, String adres_postavshika) {
        this.ID_postavshika = ID_postavshika;
        NamePostavshika = namePostavshika;
        this.ID_form_sobstv = ID_form_sobstv;
        Adres_postavshika = adres_postavshika;
    }

    public Postavshiki() {
    }

    public Long getID_postavshika() {
        return ID_postavshika;
    }

    public void setID_postavshika(Long ID_postavshika) {
        this.ID_postavshika = ID_postavshika;
    }

    public String getNamePostavshika() {
        return NamePostavshika;
    }

    public void setNamePostavshika(String namePostavshika) {
        NamePostavshika = namePostavshika;
    }

    public Long getID_form_sobstv() {
        return ID_form_sobstv;
    }

    public void setID_form_sobstv(Long ID_form_sobstv) {
        this.ID_form_sobstv = ID_form_sobstv;
    }

    public String getAdres_postavshika() {
        return Adres_postavshika;
    }

    public void setAdres_postavshika(String adres_postavshika) {
        Adres_postavshika = adres_postavshika;
    }
}
