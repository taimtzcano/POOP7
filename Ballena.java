/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package poop71;

/**
 *
 * @author tania
 */
public class Ballena extends AnimalAcuatico {
    private int largo;

    public Ballena() {
    }

    public int getLargo() {
        return largo;
    }

    public void setLargo(int largo) {
        this.largo = largo;
    }
    
    public void pelearConPinocho(){
        System.out.println("Im fighting...");
    }

    @Override
    public String toString() {
        return "Ballena{" + "largo=" + largo + super.toString() + '}';
    }
    
    

}
