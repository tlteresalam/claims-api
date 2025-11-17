package com.example.claimsapi.model;

// Allows Java to communicate with SQL database using objects (@Entity and @Table)
import jakarta.persistence.*;

// @Entity tells Spring and JPA that this class represents a table in the database
// Java Class --> Provider.java , SQL table --> Provider. Every row in the table becomes a Provider object
@Entity

// Tells Spring map (or connect) this Java class to the SQL table called providers
@Table(name = "providers")


// Database entities (rows) for Provider
public class Provider {
    // Tells JPA primary key. Same as provider_id INT AUTO_INCREMENT PRIMARY KEY
    @Id
    // Tells JPA how key providerID key created. Database will automatically generate ID
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer providerId;
    private String name;
    private String specialty;

    // Constructors
    public Provider() {}

    public Provider(String name, String specialty) {
        this.name = name;
        this.specialty = specialty;
    }

    // Getters and Setters
    public Integer getProviderId(){
        return providerId;
    }

    public void setProviderId(Integer providerId) {
        this.providerId = providerId;
    }

    public String getName(){
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSpecialty(){
        return specialty;
    }

    public void setSpecialty(String specialty) {
        this.specialty = specialty;
    }
}
