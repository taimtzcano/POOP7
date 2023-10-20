/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package poop71;

/**
 *
 * @author tania
 */
public class Metro extends Subterraneo {
    private String estacion, ciudad;

    public Metro() {
    }

    public Metro(String estacion, String ciudad, int costo, int velocidad, String capacidad, String nombre, String combustible) {
        super(costo, velocidad, capacidad, nombre, combustible);
        this.estacion = estacion;
        this.ciudad = ciudad;
    }

    public String getEstacion() {
        return estacion;
    }

    public void setEstacion(String estacion) {
        this.estacion = estacion;
    }

    public String getCiudad() {
        return ciudad;
    }

    public void setCiudad(String ciudad) {
        this.ciudad = ciudad;
    }
    
    public void abordar(){
        System.out.println("Subale, subaleeeeeee...");
    }
    
    public void descender(){
        System.out.println("Llegamos...");
    }

    @Override
    public String toString() {
        return "Metro{" + "estacion=" + estacion + ", ciudad=" + ciudad + '}';
    }
    
    
}
