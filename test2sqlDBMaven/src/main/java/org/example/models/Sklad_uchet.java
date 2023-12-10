package org.example.models;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

@Entity
public class Sklad_uchet {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long ID_zapisi;
    private int Kolichestvo;
    private long ID_sklada;

    public Sklad_uchet(Long ID_zapisi, int kolichestvo, long ID_sklada) {
        this.ID_zapisi = ID_zapisi;
        Kolichestvo = kolichestvo;
        this.ID_sklada = ID_sklada;
    }

    public Sklad_uchet() {
    }

    public Long getID_zapisi() {
        return ID_zapisi;
    }

    public void setID_zapisi(Long ID_zapisi) {
        this.ID_zapisi = ID_zapisi;
    }

    public int getKolichestvo() {
        return Kolichestvo;
    }

    public void setKolichestvo(int kolichestvo) {
        Kolichestvo = kolichestvo;
    }

    public long getID_sklada() {
        return ID_sklada;
    }

    public void setID_sklada(long ID_sklada) {
        this.ID_sklada = ID_sklada;
    }
}
