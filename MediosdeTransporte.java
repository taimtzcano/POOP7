/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package poop71;

/**
 *
 * @author tania
 */
public class MediosdeTransporte {
    private String nombre;
    private String combustible;

    public MediosdeTransporte() {
    }

    public MediosdeTransporte(String nombre, String combustible) {
        this.nombre = nombre;
        this.combustible = combustible;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getCombustible() {
        return combustible;
    }

    public void setCombustible(String combustible) {
        this.combustible = combustible;
    }
    
    public void iniciarViaje(){
        System.out.println("Agarrese, sientese y callese...");
    }
    
    public void finalizarViaje(){
        System.out.println("Llegamossss...");
    }
    
    public void encender(){
        System.out.println("Rummmm...");
    }

    @Override
    public String toString() {
        return "MediosdeTransporte{" + "nombre=" + nombre + ", combustible=" + combustible + '}';
    }
    
    
}
