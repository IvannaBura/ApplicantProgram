package com.kpi.is8106.model;

import java.io.Serializable;

public class Applicant implements Serializable{
    private int id;
    private String surname;
    private String name;
    private String patronymic;
    private String address;
    private String phoneNumber;
    private int mark;

    public Applicant() {
    }

    public Applicant(int id, String surname, String name, String patronymic, int mark) {
        this.id=id;
        this.surname=surname;
        this.name=name;
        this.patronymic=patronymic;
        this.mark=mark;
    }

    public Applicant(int id, String surname, String name, String patronymic, String address, String phoneNumber, int mark) {
        this.id=id;
        this.surname=surname;
        this.name=name;
        this.patronymic=patronymic;
        this.address=address;
        this.phoneNumber=phoneNumber;
        this.mark=mark;
    }

    public int getId(){
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getSurname() {
        return surname;
    }

    public void setSurname(String surname) {
        this.surname = surname;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getPatronymic() {
        return patronymic;
    }

    public void setPatronymic(String patronymic) {
        this.patronymic = patronymic;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }

    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    public int getMark() {
        return mark;
    }

    public void setMark(int mark) {
        this.mark = mark;
    }

    @Override
    public String toString() {
        return  id+",\t"
                +surname+' '+name +" "+patronymic+", "
                +address+ ", "
                +phoneNumber+ ", "
                +mark+"\n";
    }

}
