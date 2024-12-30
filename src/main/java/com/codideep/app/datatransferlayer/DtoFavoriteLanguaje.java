/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.codideep.app.datatransferlayer;

/**
 *
 * @author KAAF0
 */
public class DtoFavoriteLanguaje extends DtoGeneric{

    private String idFavoriteLanguaje;
    private String idPerson;
    private String idLanguaje;

    public String getIdFavoriteLanguaje() {
        return idFavoriteLanguaje;
    }

    public String getIdPerson() {
        return idPerson;
    }

    public String getIdLanguaje() {
        return idLanguaje;
    }

    public void setIdFavoriteLanguaje(String idFavoriteLanguaje) {
        this.idFavoriteLanguaje = idFavoriteLanguaje;
    }

    public void setIdPerson(String idPerson) {
        this.idPerson = idPerson;
    }

    public void setIdLanguaje(String idLanguaje) {
        this.idLanguaje = idLanguaje;
    }
}
