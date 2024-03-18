package com.rdubouski.accounting.models;

import jakarta.persistence.*;

import java.util.Date;

@Entity
public class ListExtinguishers {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "id", updatable = false, nullable = false, unique=true)
    private Long id;

    private String department, fio, number, brand, place;
    private java.sql.Date date_load, date_reload;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getDepartment() {
        return department;
    }

    public void setDepartment(String department) {
        this.department = department;
    }

    public String getFio() {
        return fio;
    }

    public void setFio(String fio) {
        this.fio = fio;
    }

    public String getNumber() {
        return number;
    }

    public void setNumber(String number) {
        this.number = number;
    }

    public String getBrand() {
        return brand;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    public String getPlace() {
        return place;
    }

    public void setPlace(String place) {
        this.place = place;
    }

    public Date getDate_load() {
        return date_load;
    }

    public void setDate_load(java.sql.Date date_load) {
        this.date_load = date_load;
    }

    public java.sql.Date getDate_reload() {
        return date_reload;
    }

    public void setDate_reload(java.sql.Date date_reload) {
        this.date_reload = date_reload;
    }

    public ListExtinguishers() {
    }

    public ListExtinguishers(String department, String fio, String number, String brand, String place, java.sql.Date date_load, java.sql.Date date_reload) {
        this.department = department;
        this.fio = fio;
        this.number = number;
        this.brand = brand;
        this.place = place;
        this.date_load = date_load;
        this.date_reload = date_reload;
    }

}
