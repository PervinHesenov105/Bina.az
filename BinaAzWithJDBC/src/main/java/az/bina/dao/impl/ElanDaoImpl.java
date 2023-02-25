/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package az.bina.dao.impl;

import az.bina.config.AbstractDao;
import az.bina.dao.inter.ElanDaoInter;
import az.bina.entity.Agentlik;
import az.bina.entity.Category;
import az.bina.entity.Elan;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author Perfect
 */
public class ElanDaoImpl extends AbstractDao implements ElanDaoInter {

    @Override
    public void insert(Elan e) {
        try ( Connection conn = connect()) {
            PreparedStatement st = conn.prepareStatement("insert into elan(id,name,price,location,contact,"
                    + "agentlik_id,category_id) values (?,?,?,?,?,?,?)");

            st.setInt(1, e.getId());
            st.setString(2, e.getName());
            st.setInt(3, e.getPrice());
            st.setString(4, e.getLocation());
            st.setString(5, e.getContact());
            st.setInt(6, e.getAgentlik().getId());
            st.setInt(7, e.getCategory().getId());

            st.execute();

        } catch (SQLException ex) {
            ex.printStackTrace();
        }
    }

    @Override
    public void update(Elan e) {

        try ( Connection conn = connect()) {
            PreparedStatement st = conn.prepareStatement("update elan set name=?,price=?,location=?,contact=?"
                    + ",agentlik_id=?,category_id=? where id=? ");

            st.setString(1, e.getName());
            st.setInt(2, e.getPrice());
            st.setString(3, e.getLocation());
            st.setString(4, e.getContact());
            st.setInt(5, e.getAgentlik().getId());
            st.setInt(6, e.getCategory().getId());
            st.setInt(7, e.getId());

            st.execute();

        } catch (SQLException ex) {
            ex.printStackTrace();
        }

    }

    @Override
    public void delete(int id) {
        try ( Connection conn = connect()) {
            Statement statement = conn.createStatement();
            statement.execute("delete from elan where id=" + id);

        } catch (SQLException ex) {
            ex.printStackTrace();
        }
    }

    @Override
    public List<Elan> getAllElan() {
        List<Elan> e = new ArrayList<>();

        try ( Connection conn = connect()) {

            Statement statement = conn.createStatement();
            ResultSet rs = statement.executeQuery("SELECT e.*,c.category_name,a.agent_name "
                    + "from elan e inner join category c on e.category_id=c.id "
                    + " left join agentlik a on e.agentlik_id=a.id ");

            while (rs.next()) {
                e.add(getElan(rs));
            }

        } catch (SQLException ex) {
            ex.printStackTrace();
        }
        return e;
    }

    @Override
    public Elan getElanById(int id
    ) {
        Elan e = null;

        try ( Connection conn = connect()) {

            Statement statement = conn.createStatement();
            ResultSet rs = statement.executeQuery("SELECT e.*,c.category_name,a.agent_name "
                    + "from elan e inner join category c on e.category_id=c.id "
                    + " left join agentlik a on e.agentlik_id=a.id where e.id=" + id);

            while (rs.next()) {
                e = getElan(rs);
            }

        } catch (SQLException ex) {
            ex.printStackTrace();
        }
        return e;
    }

    @Override
    public Elan getElan(ResultSet rs) throws SQLException {
        int eid = rs.getInt("id");
        String name = rs.getString("name");
        int price = rs.getInt("price");
        String location = rs.getString("location");
        String contact = rs.getString("contact");
        Agentlik agentlik = new Agentlik(rs.getInt("agentlik_id"), rs.getString("agent_name"));
        Category category = new Category(rs.getInt("category_id"), rs.getString("category_name"));
        Elan e = new Elan(eid, name, price, location, contact, agentlik, category);
        return e;
    }

}
