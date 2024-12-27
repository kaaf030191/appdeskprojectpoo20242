/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.codideep.app.datatransferlayer;

import java.util.Date;

/**
 *
 * @author KAAF0
 */
public class DtoPerson extends DtoGeneric{

    public String idPerson;
    public String firstName;
    public String surName;
    public String dni;
    public Date birthDate;
    public boolean gender;

    public String getIdPerson() {
        return idPerson;
    }

    public String getFirstName() {
        return firstName;
    }

    public String getSurName() {
        return surName;
    }

    public String getDni() {
        return dni;
    }

    public Date getBirthDate() {
        return birthDate;
    }

    public boolean isGender() {
        return gender;
    }

    public void setIdPerson(String idPerson) {
        this.idPerson = idPerson;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public void setSurName(String surName) {
        this.surName = surName;
    }

    public void setDni(String dni) {
        this.dni = dni;
    }

    public void setBirthDate(Date birthDate) {
        this.birthDate = birthDate;
    }

    public void setGender(boolean gender) {
        this.gender = gender;
    }
}
