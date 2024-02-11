package com.rdubouski.accounting.models;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

import java.util.Date;

@Entity
public class ListExtinguishers {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;

    private String department, number, brand, place;
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
}
