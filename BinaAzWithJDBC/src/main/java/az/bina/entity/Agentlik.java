/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package az.bina.entity;

/**
 *
 * @author Perfect
 */
public class Agentlik {

    private int id;
    private String agent_name;

    public Agentlik() {
    }

    public Agentlik(int id, String agent_name) {
        this.id = id;
        this.agent_name = agent_name;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getAgent_name() {
        return agent_name;
    }

    public void setAgent_name(String agent_name) {
        this.agent_name = agent_name;
    }

    @Override
    public String toString() {
        return "Agentlik{" + "id=" + id + ", agent_name=" + agent_name + '}';
    }

}
