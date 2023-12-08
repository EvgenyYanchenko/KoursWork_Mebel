package org.example.models;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;

@Entity
public class Prodavcy {
    @Id
    private Long ID_prodavca;
    private String FIO_prodavca;
    private Long ID_Torg_objekt;

    public Prodavcy(Long ID_prodavca, String FIO_prodavca, Long ID_Torg_objekt) {
        this.ID_prodavca = ID_prodavca;
        this.FIO_prodavca = FIO_prodavca;
        this.ID_Torg_objekt = ID_Torg_objekt;
    }

    public Prodavcy() {
    }

    public Long getID_prodavca() {
        return ID_prodavca;
    }

    public void setID_prodavca(Long ID_prodavca) {
        this.ID_prodavca = ID_prodavca;
    }

    public String getFIO_prodavca() {
        return FIO_prodavca;
    }

    public void setFIO_prodavca(String FIO_prodavca) {
        this.FIO_prodavca = FIO_prodavca;
    }

    public Long getID_Torg_objekt() {
        return ID_Torg_objekt;
    }

    public void setID_Torg_objekt(Long ID_Torg_objekt) {
        this.ID_Torg_objekt = ID_Torg_objekt;
    }
}
