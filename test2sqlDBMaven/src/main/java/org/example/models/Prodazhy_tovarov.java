package org.example.models;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;

import java.util.Date;

@Entity
public class Prodazhy_tovarov {
    @Id
    private Long ID_operacii;
    private Date data;
    private  Long ID_prodavca;
    private String Torgov_objekt;
    private Long ID_Tovara;
    private Long Kolichestvo;
    private Long Stoimost_edinicy;

    public Prodazhy_tovarov(Long ID_operacii, Date data, Long ID_prodavca, String torgov_objekt, Long ID_Tovara, Long kolichestvo, Long stoimost_edinicy) {
        this.ID_operacii = ID_operacii;
        this.data = data;
        this.ID_prodavca = ID_prodavca;
        Torgov_objekt = torgov_objekt;
        this.ID_Tovara = ID_Tovara;
        Kolichestvo = kolichestvo;
        Stoimost_edinicy = stoimost_edinicy;
    }

    public Prodazhy_tovarov() {
    }

    public Long getID_operacii() {
        return ID_operacii;
    }

    public void setID_operacii(Long ID_operacii) {
        this.ID_operacii = ID_operacii;
    }

    public Date getData() {
        return data;
    }

    public void setData(Date data) {
        this.data = data;
    }

    public Long getID_prodavca() {
        return ID_prodavca;
    }

    public void setID_prodavca(Long ID_prodavca) {
        this.ID_prodavca = ID_prodavca;
    }

    public String getTorgov_objekt() {
        return Torgov_objekt;
    }

    public void setTorgov_objekt(String torgov_objekt) {
        Torgov_objekt = torgov_objekt;
    }

    public Long getID_Tovara() {
        return ID_Tovara;
    }

    public void setID_Tovara(Long ID_Tovara) {
        this.ID_Tovara = ID_Tovara;
    }

    public Long getKolichestvo() {
        return Kolichestvo;
    }

    public void setKolichestvo(Long kolichestvo) {
        Kolichestvo = kolichestvo;
    }

    public Long getStoimost_edinicy() {
        return Stoimost_edinicy;
    }

    public void setStoimost_edinicy(Long stoimost_edinicy) {
        Stoimost_edinicy = stoimost_edinicy;
    }
}
