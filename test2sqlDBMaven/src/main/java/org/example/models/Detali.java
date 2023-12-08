package org.example.models;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;

@Entity
public class Detali {
    @Id
    private Long id_detali;
    private String name_detali;
    private  String edinicy;
    private Long stoimost_za_ed;
    private Long id_postavshika;

    public Detali() {
    }

    public Detali(Long id_detali, String name_detali, String edinicy, Long stoimost_za_ed, Long id_postavshika) {
        this.id_detali = id_detali;
        this.name_detali = name_detali;
        this.edinicy = edinicy;
        this.stoimost_za_ed = stoimost_za_ed;
        this.id_postavshika = id_postavshika;
    }

    public Long getId_detali() {
        return id_detali;
    }

    public void setId_detali(Long id_detali) {
        this.id_detali = id_detali;
    }

    public String getName_detali() {
        return name_detali;
    }

    public void setName_detali(String name_detali) {
        this.name_detali = name_detali;
    }

    public String getEdinicy() {
        return edinicy;
    }

    public void setEdinicy(String edinicy) {
        this.edinicy = edinicy;
    }

    public Long getStoimost_za_ed() {
        return stoimost_za_ed;
    }

    public void setStoimost_za_ed(Long stoimost_za_ed) {
        this.stoimost_za_ed = stoimost_za_ed;
    }

    public Long getId_postavshika() {
        return id_postavshika;
    }

    public void setId_postavshika(Long id_postavshika) {
        this.id_postavshika = id_postavshika;
    }
}
