package az.bina.main;

import az.bina.config.Context;
import az.bina.dao.inter.ElanDaoInter;
import az.bina.entity.Agentlik;
import az.bina.entity.Category;
import az.bina.entity.Elan;

/**
 *
 * @author Perfect
 */
public class BinaAzWithJDBC {

    public static void main(String[] args) {

        ElanDaoInter edao = Context.instanceElanDao();

      Elan e = new Elan(4, "Qaraj Nerimanov", 70000, "nerimanov", "+994557007200", null, new Category(3, null));
      
      edao.insert(e);
    }
}
