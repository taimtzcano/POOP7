/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package poop71;

/**
 *
 * @author tania
 */
public class Pajaro extends AnimalAereo {
    private String tipoPico;

    public Pajaro() {
    }

    public Pajaro(String tipoPico, int numeroAlas, String nombre, String lugarOrigen, String color) {
        super(numeroAlas, nombre, lugarOrigen, color);
        this.tipoPico = tipoPico;
    }

    public String getTipoPico() {
        return tipoPico;
    }

    public void setTipoPico(String tipoPico) {
        this.tipoPico = tipoPico;
    }
    
    public void recolectarRamas(){
        System.out.println("Uno, dos, tres...");
    }

    @Override
    public String toString() {
        return "Pajaro{" + "tipoPico=" + tipoPico + super.toString() + '}';
    }
    
    
}
