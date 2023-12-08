package org.example.models;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;

@Entity
public class Zakazchiki {
    @Id
    private Long ID_zakazchika;
    private String name_Zakazchika;
    private Long id_form_sobstv;

    public Zakazchiki() {
    }

    public Zakazchiki(Long ID_zakazchika, String name_Zakazchika, Long id_form_sobstv) {
        this.ID_zakazchika = ID_zakazchika;
        this.name_Zakazchika = name_Zakazchika;
        this.id_form_sobstv = id_form_sobstv;
    }

    public Long getID_zakazchika() {
        return ID_zakazchika;
    }

    public void setID_zakazchika(Long ID_zakazchika) {
        this.ID_zakazchika = ID_zakazchika;
    }

    public String getName_Zakazchika() {
        return name_Zakazchika;
    }

    public void setName_Zakazchika(String name_Zakazchika) {
        this.name_Zakazchika = name_Zakazchika;
    }

    public Long getId_form_sobstv() {
        return id_form_sobstv;
    }

    public void setId_form_sobstv(Long id_form_sobstv) {
        this.id_form_sobstv = id_form_sobstv;
    }
}
