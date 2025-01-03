/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.codideep.app.repositorylayer;

import com.codideep.app.datatransferlayer.DtoPerson;
import java.util.List;

/**
 *
 * @author KAAF0
 */
public interface RepoPerson extends RepoGeneric<DtoPerson>{
    List<DtoPerson> getAll();
}
