/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package poop71;

/**
 *
 * @author tania
 */
public class Supraterraneo extends MediosdeTransporte {
    private String vehiculo;

    public Supraterraneo() {
    }

    public Supraterraneo(String vehiculo, String nombre, String combustible) {
        super(nombre, combustible);
        this.vehiculo = vehiculo;
    }

    public String getVehiculo() {
        return vehiculo;
    }

    public void setVehiculo(String vehiculo) {
        this.vehiculo = vehiculo;
    }
    
    public void calcularTarifa(){
        System.out.println("Calculando...");
    }
    
    public void verificarDisponiobilidad(){
        System.out.println("Verificando");
    }

    @Override
    public String toString() {
        return "Supraterraneo{" + "vehiculo=" + vehiculo + '}';
    }
    
    
}
