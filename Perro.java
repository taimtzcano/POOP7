/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package poop71;

/**
 *
 * @author tania
 */
public class Perro extends AnimalTerrestre {
    private String colorCollar;

    public Perro() {
    }

    public String getColorCollar() {
        return colorCollar;
    }

    public void setColorCollar(String colorCollar) {
        this.colorCollar = colorCollar;
    }
    
    public void hacerTrucos(){
        System.out.println("Tarammm...");
    }

    @Override
    public String toString() {
        return "Perro{" + "colorCollar=" + colorCollar + super.toString() +'}';
    }
    
    
}
