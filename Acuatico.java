/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package poop71;

/**
 *
 * @author tania
 */
public class Acuatico extends MediosdeTransporte {
    private int velocidad;
    private String capacidad;

    public Acuatico() {
    }

    public Acuatico(int velocidad, String capacidad, String nombre, String combustible) {
        super(nombre, combustible);
        this.velocidad = velocidad;
        this.capacidad = capacidad;
    }

    public int getVelocidad() {
        return velocidad;
    }

    public void setVelocidad(int velocidad) {
        this.velocidad = velocidad;
    }

    public String getCapacidad() {
        return capacidad;
    }

    public void setCapacidad(String capacidad) {
        this.capacidad = capacidad;
    }
    
    public void aumentarVelocidad(){
        System.out.println("Rummmmmmm...");
    }
    
    public void disminuirVelocidad(){
        System.out.println("A salvo");
    }

    @Override
    public String toString() {
        return "Acuatico{" + "velocidad=" + velocidad + ", capacidad=" + capacidad + '}';
    }
    
    
}
