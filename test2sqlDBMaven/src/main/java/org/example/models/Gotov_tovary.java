package org.example.models;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;

@Entity
public class Gotov_tovary {

    @Id
    private Long ID_tovara;
    private String nazvanie_tovara;
    private Long stoimost;
    private Long id_ispolnitelya;
    private Long tip_tovara;
    private Long id_mestonahogdenja;

    public Gotov_tovary() {
    }

    public Gotov_tovary(Long ID_tovara, String nazvanie_tovara, Long stoimost, Long id_ispolnitelya, Long tip_tovara, Long id_mestonahogdenja) {
        this.ID_tovara = ID_tovara;
        this.nazvanie_tovara = nazvanie_tovara;
        this.stoimost = stoimost;
        this.id_ispolnitelya = id_ispolnitelya;
        this.tip_tovara = tip_tovara;
        this.id_mestonahogdenja = id_mestonahogdenja;
    }

    public Long getID_tovara() {
        return ID_tovara;
    }

    public void setID_tovara(Long ID_tovara) {
        this.ID_tovara = ID_tovara;
    }

    public String getNazvanie_tovara() {
        return nazvanie_tovara;
    }

    public void setNazvanie_tovara(String nazvanie_tovara) {
        this.nazvanie_tovara = nazvanie_tovara;
    }

    public Long getStoimost() {
        return stoimost;
    }

    public void setStoimost(Long stoimost) {
        this.stoimost = stoimost;
    }

    public Long getId_ispolnitelya() {
        return id_ispolnitelya;
    }

    public void setId_ispolnitelya(Long id_ispolnitelya) {
        this.id_ispolnitelya = id_ispolnitelya;
    }

    public Long getTip_tovara() {
        return tip_tovara;
    }

    public void setTip_tovara(Long tip_tovara) {
        this.tip_tovara = tip_tovara;
    }

    public Long getId_mestonahogdenja() {
        return id_mestonahogdenja;
    }

    public void setId_mestonahogdenja(Long id_mestonahogdenja) {
        this.id_mestonahogdenja = id_mestonahogdenja;
    }
}
