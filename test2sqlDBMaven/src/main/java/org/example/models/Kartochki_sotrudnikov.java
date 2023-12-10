package org.example.models;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

import java.util.Date;

@Entity
public class Kartochki_sotrudnikov {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id_kartochki;
    private Date data_prinyatiya;
    private Date data_uvolneniya;
    private String dolgnost;

    public Kartochki_sotrudnikov() {
    }

    public Kartochki_sotrudnikov(Long id_kartochki, Date data_prinyatiya, Date data_uvolneniya, String dolgnost) {
        this.id_kartochki = id_kartochki;
        this.data_prinyatiya = data_prinyatiya;
        this.data_uvolneniya = data_uvolneniya;
        this.dolgnost = dolgnost;
    }

    public Long getId_kartochki() {
        return id_kartochki;
    }

    public void setId_kartochki(Long id_kartochki) {
        this.id_kartochki = id_kartochki;
    }

    public Date getData_prinyatiya() {
        return data_prinyatiya;
    }

    public void setData_prinyatiya(Date data_prinyatiya) {
        this.data_prinyatiya = data_prinyatiya;
    }

    public Date getData_uvolneniya() {
        return data_uvolneniya;
    }

    public void setData_uvolneniya(Date data_uvolneniya) {
        this.data_uvolneniya = data_uvolneniya;
    }

    public String getDolgnost() {
        return dolgnost;
    }

    public void setDolgnost(String dolgnost) {
        this.dolgnost = dolgnost;
    }
}
