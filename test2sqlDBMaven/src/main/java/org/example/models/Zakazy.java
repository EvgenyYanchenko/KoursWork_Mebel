package org.example.models;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

import java.util.Date;

@Entity
public class Zakazy {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long ID_zakaza;
    private Long id_Zakazchika;
    private Long id_sotrudnika;
    private Date data_zakaza;
    private Long id_tovara;
    private Integer kolichestvo_tovara;

    public Zakazy() {
    }

    public Zakazy(Long ID_zakaza, Long id_Zakazchika, Long id_sotrudnika, Date data_zakaza, Long id_tovara, Integer kolichestvo_tovara) {
        this.ID_zakaza = ID_zakaza;
        this.id_Zakazchika = id_Zakazchika;
        this.id_sotrudnika = id_sotrudnika;
        this.data_zakaza = data_zakaza;
        this.id_tovara = id_tovara;
        this.kolichestvo_tovara = kolichestvo_tovara;
    }


    public Long getID_zakaza() {
        return ID_zakaza;
    }

    public void setID_zakaza(Long ID_zakaza) {
        this.ID_zakaza = ID_zakaza;
    }

    public Long getId_Zakazchika() {
        return id_Zakazchika;
    }

    public void setId_Zakazchika(Long id_Zakazchika) {
        this.id_Zakazchika = id_Zakazchika;
    }

    public Long getId_sotrudnika() {
        return id_sotrudnika;
    }

    public void setId_sotrudnika(Long id_sotrudnika) {
        this.id_sotrudnika = id_sotrudnika;
    }

    public Date getData_zakaza() {
        return data_zakaza;
    }

    public void setData_zakaza(Date data_zakaza) {
        this.data_zakaza = data_zakaza;
    }

    public Long getId_tovara() {
        return id_tovara;
    }

    public void setId_tovara(Long id_tovara) {
        this.id_tovara = id_tovara;
    }

    public Integer getKolichestvo_tovara() {
        return kolichestvo_tovara;
    }

    public void setKolichestvo_tovara(Integer kolichestvo_tovara) {
        this.kolichestvo_tovara = kolichestvo_tovara;
    }
}
