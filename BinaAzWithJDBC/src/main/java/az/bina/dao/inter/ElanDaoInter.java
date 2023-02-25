/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package az.bina.dao.inter;

import az.bina.entity.Elan;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.List;

/**
 *
 * @author Perfect
 */
public interface ElanDaoInter {

    void insert(Elan e);

    void update(Elan e);

    void delete(int id);

    List<Elan> getAllElan();

    Elan getElanById(int id);

    Elan getElan(ResultSet rs) throws SQLException;
}
