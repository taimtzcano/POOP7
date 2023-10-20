/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package poop71;

/**
 *
 * @author tania
 */
public class Metrobus extends Supraterraneo {
    private String ruta;

    public Metrobus() {
    }

    public Metrobus(String ruta, String vehiculo, String nombre, String combustible) {
        super(vehiculo, nombre, combustible);
        this.ruta = ruta;
    }

    public String getRuta() {
        return ruta;
    }

    public void setRuta(String ruta) {
        this.ruta = ruta;
    }
    
    public void iniciarViaje(){
        System.out.println("Iniciando...");
    }
    
    public void finalizarViaje(){
        System.out.println("Fin del recorrido...");
    }

    @Override
    public String toString() {
        return "Metrobus{" + "ruta=" + ruta + '}';
    }
    
    
}
