package org.example.models;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;

import java.util.Date;

@Entity
public class Employee {

    @Id
    private int idEmployee;

    private String lastNAme;
    private String firstName;
    private String sourName;
    private String adressEmployee;
    private String phoneEmployee;
    private Date dateOfBirth;
    private String positon;

    }
