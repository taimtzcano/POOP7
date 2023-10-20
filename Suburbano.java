/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package poop71;

/**
 *
 * @author tania
 */
public class Suburbano extends Subterraneo {
    private String horario, ciudad;

    public Suburbano() {
    }

    public String getHorario() {
        return horario;
    }

    public void setHorario(String horario) {
        this.horario = horario;
    }

    public String getCiudad() {
        return ciudad;
    }

    public void setCiudad(String ciudad) {
        this.ciudad = ciudad;
    }
    
    public void iniciarViaje(){
        System.out.println("Agarrese...");
    }
    
    public void finalizarViaje(){
        System.out.println("Hasta aqui llegamos...");
    }
    
    public void consultarHorario(){
        System.out.println("Horas...");
    }

    @Override
    public String toString() {
        return "Suburbano{" + "horario=" + horario + ", ciudad=" + ciudad + '}';
    }
    
    
    
}
