package com.example.entities;

import com.fasterxml.jackson.annotation.JsonProperty;

import javax.persistence.*;

@Entity
@Table (name = "Records")
public class RecordEntity {

    @JsonProperty("X")
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long recordID;
    @Column(name = "name")
    private String name;
    @Column(name = "phone")
    private String phone;
    @Column(name = "company")
    private String company;
    @Column(name = "street")
    private String street;
    @Column(name = "city")
    private String city;
    @Column(name = "mail")
    private String mail;
    @Column(name = "country")
    private String country;
    @Column(name = "date")
    private String date;

    public RecordEntity(Long recordID, String name, String phone, String company, String street, String city, String mail, String country, String date) {
        this.recordID = recordID;
        this.name = name;
        this.phone = phone;
        this.company = company;
        this.street = street;
        this.city = city;
        this.mail = mail;
        this.country = country;
        this.date = date;
    }

    public Long getRecordID() {
        return recordID;
    }

    public void setRecordID(Long recordID) {
        this.recordID = recordID;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public String getCompany() {
        return company;
    }

    public void setCompany(String company) {
        this.company = company;
    }

    public String getStreet() {
        return street;
    }

    public void setStreet(String street) {
        this.street = street;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public String getMail() {
        return mail;
    }

    public void setMail(String mail) {
        this.mail = mail;
    }

    public String getCountry() {
        return country;
    }

    public void setCountry(String country) {
        this.country = country;
    }

    public String getDate() {
        return date;
    }

    public void setDate(String date) {
        this.date = date;
    }
}
