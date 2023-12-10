package org.example.models;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

@Entity
public class Formy_sobstv_postavshikov {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id_form_sobstv;
    private String nazvanie_form_sobstv;

    public Formy_sobstv_postavshikov(String nazvanie_form_sobstv) {
           this.nazvanie_form_sobstv = nazvanie_form_sobstv;
    }

    public Formy_sobstv_postavshikov() {
    }

    public Long getId_form_sobstv() {
        return id_form_sobstv;
    }

    public void setId_form_sobstv(Long id_form_sobstv) {
        this.id_form_sobstv = id_form_sobstv;
    }

    public String getNazvanie_form_sobstv() {
        return nazvanie_form_sobstv;
    }

    public void setNazvanie_form_sobstv(String nazvanie_form_sobstv) {
        this.nazvanie_form_sobstv = nazvanie_form_sobstv;
    }
}
