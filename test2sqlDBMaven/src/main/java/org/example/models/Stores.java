package org.example.models;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;

@Entity
public class Stores {

    @Id
    private String storeName;
    private String storeAdress;
    private String storeSpace;

    public Stores() {
    }

    public Stores(String storeName, String storeAdress, String storeSpace) {
        this.storeName = storeName;
        this.storeAdress = storeAdress;
        this.storeSpace = storeSpace;
    }

    public String getStoreName() {
        return storeName;
    }

    public void setStoreName(String storeName) {
        this.storeName = storeName;
    }

    public String getStoreAdress() {
        return storeAdress;
    }

    public void setStoreAdress(String storeAdress) {
        this.storeAdress = storeAdress;
    }

    public String getStoreSpace() {
        return storeSpace;
    }

    public void setStoreSpace(String storeSpace) {
        this.storeSpace = storeSpace;
    }
}
