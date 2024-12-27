/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.codideep.app.repositorylayer;

/**
 *
 * @author KAAF0
 * @param <Dto>
 */
public interface RepoGeneric<Dto> {
    int insert(Dto dto);
    int update(Dto dto);
    Dto getById(String id);
    int delete(String id);
}
