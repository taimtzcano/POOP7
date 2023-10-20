/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package poop71;

/**
 *
 * @author tania
 */
public class Helicoptero extends Aereo {
    private int numeroDeRegistro;
    private String ubicacion;

    public Helicoptero() {
    }

    public Helicoptero(int numeroDeRegistro, String ubicacion, int velocidad, String capacidad, String nombre, String combustible) {
        super(velocidad, capacidad, nombre, combustible);
        this.numeroDeRegistro = numeroDeRegistro;
        this.ubicacion = ubicacion;
    }

    public int getNumeroDeRegistro() {
        return numeroDeRegistro;
    }

    public void setNumeroDeRegistro(int numeroDeRegistro) {
        this.numeroDeRegistro = numeroDeRegistro;
    }

    public String getUbicacion() {
        return ubicacion;
    }

    public void setUbicacion(String ubicacion) {
        this.ubicacion = ubicacion;
    }
    
    public void despegar(){
        System.out.println("Hora del despegue...");
    }
    
    public void aterrizar(){
        System.out.println("Hemos llegado");
    }

    @Override
    public String toString() {
        return "Helicoptero{" + "numeroDeRegistro=" + numeroDeRegistro + ", ubicacion=" + ubicacion + '}';
    }
    
    
}
