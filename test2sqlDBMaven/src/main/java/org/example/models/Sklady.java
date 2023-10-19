package org.example.models;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;

@Entity
public class Sklady {

    @Id
    private int idSklada;

    private String nazvanieSklada;
    private String adressSklada;

    public Sklady() {
    }

    public Sklady(int idSklada, String nazvanieSklada, String adressSklada) {
        this.idSklada = idSklada;
        this.nazvanieSklada = nazvanieSklada;
        this.adressSklada = adressSklada;
    }

    public int getIdSklada() {
        return idSklada;
    }

    public void setIdSklada(int idSklada) {
        this.idSklada = idSklada;
    }

    public String getNazvanieSklada() {
        return nazvanieSklada;
    }

    public void setNazvanieSklada(String nazvanieSklada) {
        this.nazvanieSklada = nazvanieSklada;
    }

    public String getAdressSklada() {
        return adressSklada;
    }

    public void setAdressSklada(String adressSklada) {
        this.adressSklada = adressSklada;
    }
}
