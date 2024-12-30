/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.codideep.app.businesslayer;

import com.codideep.app.datatransferlayer.DtoPerson;
import com.codideep.app.repositorylayer.RepoPerson;
import com.codideep.dataaccesslayer.QPerson;
import java.util.Date;
import java.util.UUID;

/**
 *
 * @author KAAF0
 */
public class BusinessPerson {
    public boolean insert(String firstName, String surName, String dni, int birthDateDay, int birthDateMonth, int birthDateYear, boolean gender) {
        DtoPerson dtoPerson = new DtoPerson();
        
        dtoPerson.setFirstName(firstName);
        dtoPerson.setSurName(surName);
        dtoPerson.setDni(dni);
        dtoPerson.setBirthDate(new Date(birthDateYear, birthDateMonth, birthDateDay));
        dtoPerson.setGender(gender);
        
        dtoPerson.setIdPerson(UUID.randomUUID().toString());
        dtoPerson.setCreatedAt(new Date());
        dtoPerson.setUpdatedAt(dtoPerson.getCreatedAt());
        
        RepoPerson repoPerson = new QPerson();
        
        repoPerson.insert(dtoPerson);
        
        return true;
    }
}
