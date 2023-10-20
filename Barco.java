/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package poop71;

/**
 *
 * @author tania
 */
public class Barco extends Acuatico {
    private String tripulacion, puertoOrigen, puertoDestino;

    public Barco() {
    }

    public Barco(String tripulacion, String puertoOrigen, String puertoDestino, int velocidad, String capacidad, String nombre, String combustible) {
        super(velocidad, capacidad, nombre, combustible);
        this.tripulacion = tripulacion;
        this.puertoOrigen = puertoOrigen;
        this.puertoDestino = puertoDestino;
    }

    public String getTripulacion() {
        return tripulacion;
    }

    public void setTripulacion(String tripulacion) {
        this.tripulacion = tripulacion;
    }

    public String getPuertoOrigen() {
        return puertoOrigen;
    }

    public void setPuertoOrigen(String puertoOrigen) {
        this.puertoOrigen = puertoOrigen;
    }

    public String getPuertoDestino() {
        return puertoDestino;
    }

    public void setPuertoDestino(String puertoDestino) {
        this.puertoDestino = puertoDestino;
    }
    
    public void abordarPasajero(){
        System.out.println("Come on...");
    }
    
    public void desembarcarPasajero(){
        System.out.println("Todos bajen...");
    }

    @Override
    public String toString() {
        return "Barco{" + "tripulacion=" + tripulacion + ", puertoOrigen=" + puertoOrigen + ", puertoDestino=" + puertoDestino + '}';
    }
    
    
}
