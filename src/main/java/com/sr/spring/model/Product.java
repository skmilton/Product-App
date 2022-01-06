package com.sr.spring.model;

import javax.persistence.*;

@Entity
@Table(name = "product")
public class Product {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private  long id;
    private String name;
    private String details;
    private String status;

    public Product() {
    }

    public Product(long id, String name, String details, String status) {
        this.id = id;
        this.name = name;
        this.details = details;
        this.status = status;
    }

    public Product(String name, String details, String status) {
        this.name = name;
        this.details = details;
        this.status = status;
    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDetails() {
        return details;
    }

    public void setDetails(String details) {
        this.details = details;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }
}
