package org.example.models;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

import java.util.Date;

@Entity
public class Employee {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long idEmployee;

    private String lastNAme;
    private String firstName;
    private String sourName;
    private String adressEmployee;
    private String phoneEmployee;
    private Date dateOfBirth;

    //private Dolgnosti positonEmployee;


    public Employee() {
    }

    public Employee(String lastNAme,
                    String firstName,
                    String sourName,
                    String adressEmployee,
                    String phoneEmployee,
                    Date dateOfBirth) {

        this.lastNAme = lastNAme;
        this.firstName = firstName;
        this.sourName = sourName;
        this.adressEmployee = adressEmployee;
        this.phoneEmployee = phoneEmployee;
        this.dateOfBirth = dateOfBirth;
    }

    public Long getIdEmployee() {
        return idEmployee;
    }

    public void setIdEmployee(Long idEmployee) {
        this.idEmployee = idEmployee;
    }

    public String getLastNAme() {
        return lastNAme;
    }

    public void setLastNAme(String lastNAme) {
        this.lastNAme = lastNAme;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getSourName() {
        return sourName;
    }

    public void setSourName(String sourName) {
        this.sourName = sourName;
    }

    public String getAdressEmployee() {
        return adressEmployee;
    }

    public void setAdressEmployee(String adressEmployee) {
        this.adressEmployee = adressEmployee;
    }

    public String getPhoneEmployee() {
        return phoneEmployee;
    }

    public void setPhoneEmployee(String phoneEmployee) {
        this.phoneEmployee = phoneEmployee;
    }

    public Date getDateOfBirth() {
        return dateOfBirth;
    }

    public void setDateOfBirth(Date dateOfBirth) {
        this.dateOfBirth = dateOfBirth;
    }
}
