/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.codideep.dataaccesslayer;

import com.codideep.app.datatransferlayer.DtoPerson;
import com.codideep.app.repositorylayer.RepoPerson;
import java.sql.PreparedStatement;
import java.sql.SQLException;

/**
 *
 * @author KAAF0
 */
public class QPerson implements RepoPerson {
    String query;
    int quantityRowsAffected;

    @Override
    public int insert(DtoPerson dto) {
        DataBaseContext dbc = new DataBaseContext();
        
        query = "insert into tperson(idPerson, firstName, surName, dni, birthDate, gender, createdAt, updatedAt) values(?, ?, ?, ?, ?, ?, ?, ?)";
        
        try {
            PreparedStatement ps = dbc.connection.prepareStatement(query);
            
            ps.setString(1, dto.getIdPerson());
            ps.setString(2, dto.getFirstName());
            ps.setString(3, dto.getSurName());
            ps.setString(4, dto.getDni());
            ps.setString(5, "1991-01-03");
            ps.setBoolean(6, dto.isGender());
            ps.setString(7, "2024-12-30");
            ps.setString(8, "2024-12-30");
            
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
    
}
