/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.codideep.dataaccesslayer;

import com.codideep.app.datatransferlayer.DtoPerson;
import com.codideep.app.repositorylayer.RepoPerson;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author KAAF0
 */
public class QPerson implements RepoPerson {
    private DataBaseContext dbc;
    private List<DtoPerson> listDtoPerson;
    private String query;
    private int quantityRowsAffected;

    @Override
    public int insert(DtoPerson dto) {
        dbc = new DataBaseContext();
        
        query = "insert into tperson(idPerson, firstName, surName, dni, birthDate, gender, createdAt, updatedAt) values(?, ?, ?, ?, ?, ?, ?, ?)";
        
        try {
            PreparedStatement ps = dbc.connection.prepareStatement(query);
            
            ps.setString(1, dto.getIdPerson());
            ps.setString(2, dto.getFirstName());
            ps.setString(3, dto.getSurName());
            ps.setString(4, dto.getDni());
            ps.setDate(5, new java.sql.Date(dto.getBirthDate().getTime()));
            ps.setBoolean(6, dto.isGender());
            ps.setTimestamp(7, new java.sql.Timestamp(dto.getCreatedAt().getTime()));
            ps.setTimestamp(8, new java.sql.Timestamp(dto.getUpdatedAt().getTime()));
            
            quantityRowsAffected = ps.executeUpdate();
            
            dbc.connection.close();
            
            return quantityRowsAffected;
        } catch (SQLException ex) {
            System.out.println(ex.getMessage());
            
            return 0;
        }
    }

    @Override
    public int update(DtoPerson dto) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    @Override
    public DtoPerson getById(String id) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    @Override
    public int delete(String id) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    @Override
    public List<DtoPerson> getAll() {
        dbc = new DataBaseContext();
        
        listDtoPerson = new ArrayList<>();
        
        query = "select * from tperson";
        
        try {
            PreparedStatement ps = dbc.connection.prepareStatement(query);
            
            ResultSet rows = ps.executeQuery();
            
            while(rows.next()) {
                DtoPerson dtoPerson = new DtoPerson();
                
                dtoPerson.setIdPerson(rows.getString("idPerson"));
                dtoPerson.setFirstName(rows.getString("firstName"));
                dtoPerson.setSurName(rows.getString("surName"));
                dtoPerson.setDni(rows.getString("dni"));
                dtoPerson.setBirthDate(rows.getDate("birthDate"));
                dtoPerson.setGender(rows.getBoolean("gender"));
                dtoPerson.setCreatedAt(rows.getTimestamp("createdAt"));
                dtoPerson.setUpdatedAt(rows.getTimestamp("updatedAt"));
                
                listDtoPerson.add(dtoPerson);
            }
            
            dbc.connection.close();
            
            return listDtoPerson;
        } catch (SQLException ex) {
            System.out.println(ex.getMessage());
            
            return listDtoPerson;
        }
    }
    
}
