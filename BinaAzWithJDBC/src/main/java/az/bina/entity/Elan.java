/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package az.bina.entity;

/**
 *
 * @author Perfect
 */
public class Elan {

    private int id;
    private String name;
    private int price;
    private String location;
    private String contact;
    private Agentlik agentlik;
    private Category category;

    public Elan(int id, String name, int price, String location, String contact, Agentlik agentlik, Category category) {
        this.id = id;
        this.name = name;
        this.price = price;
        this.location = location;
        this.contact = contact;
        this.agentlik = agentlik;
        this.category = category;
    }

    public Elan() {
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    public String getLocation() {
        return location;
    }

    public void setLocation(String location) {
        this.location = location;
    }

    public String getContact() {
        return contact;
    }

    public void setContact(String concat) {
        this.contact = concat;
    }

    public Agentlik getAgentlik() {
        return agentlik;
    }

    public void setAgentlik(Agentlik agentlik) {
        this.agentlik = agentlik;
    }

    public Category getCategory() {
        return category;
    }

    public void setCategory(Category category) {
        this.category = category;
    }

    @Override
    public String toString() {
        return "Elan{" + "id=" + id + ", name=" + name + ", price=" + price + ", location=" + location + ", concat=" + contact + ", agentlik=" + agentlik + ", category=" + category + '}';
    }

}
