package com.cognizant.orm_learn.model;



import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name = "country") // maps to your SQL table
public class Country {

    @Id
    @Column(name = "co_code") // maps to the actual column in DB
    private String code;

    @Column(name = "co_name") // maps to the actual column in DB
    private String name;

    // Getters and setters
    public String getCode() {
        return code;
    }

    public void setCode(String code) {
        this.code = code;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    // toString for printing
    @Override
    public String toString() {
        return "Country [code=" + code + ", name=" + name + "]";
    }
}
