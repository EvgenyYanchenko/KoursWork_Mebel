package org.example.models;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;

import java.util.Date;

@Entity
public class Kartochki_sotrudnikov {

    @Id
    private Long id_kartochki;
    private Date data_prinyatiya;
    private Date data_uvolneniya;
    private String dolgnost;
}
