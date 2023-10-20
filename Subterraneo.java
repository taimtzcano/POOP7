/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package poop71;

/**
 *
 * @author tania
 */
public class Subterraneo extends TransportesTerrestres {
    private int costo;

    public Subterraneo() {
    }

    public Subterraneo(int costo, int velocidad, String capacidad, String nombre, String combustible) {
        super(velocidad, capacidad, nombre, combustible);
        this.costo = costo;
    }

    public int getCosto() {
        return costo;
    }

    public void setCosto(int costo) {
        this.costo = costo;
    }
    
    public void iniciarViaje(){
        System.out.println("Comenzamosss...");
    }

    @Override
    public String toString() {
        return "Subterraneo{" + "costo=" + costo + '}';
    }
    
    
}
