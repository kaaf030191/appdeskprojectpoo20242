/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.codideep.app.businesslayer;

import com.codideep.app.datatransferlayer.DtoPerson;
import com.codideep.app.repositorylayer.RepoPerson;
import com.codideep.dataaccesslayer.QPerson;
import java.util.Calendar;
import java.util.Date;
import java.util.List;
import java.util.UUID;

/**
 *
 * @author KAAF0
 */
public class BusinessPerson {
    private final RepoPerson repoPerson;
    
    public BusinessPerson() {
        repoPerson = new QPerson();
    }
    
    public boolean insert(String firstName, String surName, String dni, int birthDateDay, int birthDateMonth, int birthDateYear, boolean gender) {
        DtoPerson dtoPerson = new DtoPerson();
        
        dtoPerson.setFirstName(firstName);
        dtoPerson.setSurName(surName);
        dtoPerson.setDni(dni);
        
        Calendar calenader = Calendar.getInstance();
        
        calenader.set(Calendar.YEAR, birthDateYear);
        calenader.set(Calendar.MONTH, birthDateMonth - 1);
        calenader.set(Calendar.DAY_OF_MONTH, birthDateDay);
        
        dtoPerson.setBirthDate(calenader.getTime());
        dtoPerson.setGender(gender);
        
        dtoPerson.setIdPerson(UUID.randomUUID().toString());
        dtoPerson.setCreatedAt(new Date());
        dtoPerson.setUpdatedAt(dtoPerson.getCreatedAt());
        
        repoPerson.insert(dtoPerson);
        
        return true;
    }
    
    public List<DtoPerson> getAll() {
        return repoPerson.getAll();
    }
}
