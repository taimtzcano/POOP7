/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package poop71;

/**
 *
 * @author tania
 */
public class Trajinera extends Acuatico {
    private String name;

    public Trajinera() {
    }

    public Trajinera(int name, int velocidad, String capacidad, String nombre, String combustible) {
        super(velocidad, capacidad, nombre, combustible);
        this.name = name;
    }

    public int getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
    
    public void iniciarPaseo(){
        System.out.println("Yeiiii...");
    }

    @Override
    public String toString() {
        return "Trajinera{" + "name=" + name + '}';
    }
    
    
}
