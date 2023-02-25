/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package az.bina.config;

import az.bina.dao.impl.ElanDaoImpl;
import az.bina.dao.inter.ElanDaoInter;

/**
 *
 * @author Perfect
 */
public class Context {

    public static ElanDaoInter instanceElanDao() {
        return new ElanDaoImpl();
    }
    
    
 
}
