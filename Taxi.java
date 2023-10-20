/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package poop71;

/**
 *
 * @author tania
 */
public class Taxi extends Supraterraneo {
    private String tarifaBase, disponible;

    public Taxi() {
    }

    public Taxi(String tarifaBase, String disponible, String vehiculo, String nombre, String combustible) {
        super(vehiculo, nombre, combustible);
        this.tarifaBase = tarifaBase;
        this.disponible = disponible;
    }

    public String getTarifaBase() {
        return tarifaBase;
    }

    public void setTarifaBase(String tarifaBase) {
        this.tarifaBase = tarifaBase;
    }

    public String getDisponible() {
        return disponible;
    }

    public void setDisponible(String disponible) {
        this.disponible = disponible;
    }
    
    public void iniciarViaje(){
        System.out.println("Iniciando...");
    }
    
    public void terminarViaje(){
        System.out.println("Llegamos...");
    }

    @Override
    public String toString() {
        return "Taxi{" + "tarifaBase=" + tarifaBase + ", disponible=" + disponible + '}';
    }
    
    
}
