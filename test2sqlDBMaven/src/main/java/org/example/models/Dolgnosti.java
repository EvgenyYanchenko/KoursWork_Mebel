package org.example.models;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;

@Entity
public class Dolgnosti {
    public Dolgnosti() {
    }

    public Dolgnosti(String nazvanie_Dolgnosti, String kategoriya, int oklad) {
        this.nazvanie_Dolgnosti = nazvanie_Dolgnosti;
        this.kategoriya = kategoriya;
        this.oklad = oklad;
    }

    @Id
    private String nazvanie_Dolgnosti;

    private String kategoriya;
    private int oklad;

    public String getNazvanie_Dolgnosti() {
        return nazvanie_Dolgnosti;
    }

    public void setNazvanie_Dolgnosti(String nazvanie_Dolgnosti) {
        this.nazvanie_Dolgnosti = nazvanie_Dolgnosti;
    }

    public String getKategoriya() {
        return kategoriya;
    }

    public void setKategoriya(String kategoriya) {
        this.kategoriya = kategoriya;
    }

    public int getOklad() {
        return oklad;
    }

    public void setOklad(int oklad) {
        this.oklad = oklad;
    }
}
