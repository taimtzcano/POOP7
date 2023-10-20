/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package poop71;

/**
 *
 * @author tania
 */
public class POOP71 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Animal animal=new Animal();
        animal.setNombre("Perro");
        animal.setLugarOrigen("CDMX");
        animal.setColor("Negro");
        animal.setColor("Cafe");
        
        System.out.println(animal.toString());
        
        AnimalAcuatico animalAcuatico=new AnimalAcuatico();
        animalAcuatico.setNombre("Dolphin");
        animalAcuatico.setLugarOrigen("Canada");
        animalAcuatico.setColor("Gris");
        animalAcuatico.setNumeroAletas(2);
        
        System.out.println(animalAcuatico.toString());
        
        Ballena ballena = new Ballena();
        ballena.setNombre("Wilson");
        ballena.setLugarOrigen("Suiza");
        ballena.setColor("Blanca");
        ballena.setNumeroAletas(2);
        ballena.setLargo(10);
        
        System.out.println(ballena.toString());
        
        Perro perro = new Perro();
        perro.setNombre("Elisa");
        perro.setLugarOrigen("Polanco");
        perro.setNumeroPatas(4);
        perro.setColorCollar("Morado");
        
        System.out.println(perro.toString());
        
        Pajaro pajaro = new Pajaro();
        pajaro.setNombre("Pajaro Loco");
        pajaro.setLugarOrigen("Iztapalapa");
        pajaro.setColor("Negro");
        pajaro.setNumeroAlas(2);
        pajaro.setTipoPico("Largo");
        
        System.out.println(pajaro.toString());
        
        MediosdeTransporte mediosdeTransporte = new MediosdeTransporte ();
        mediosdeTransporte.setNombre("Pumabus");
        mediosdeTransporte.setCombustible("De la verde");
        
        System.out.println(mediosdeTransporte.toString());
        
        Subterraneo subterraneo = new Subterraneo();
        subterraneo.setCosto(20);
        subterraneo.setCombustible("De la verde");
        
        System.out.println(subterraneo.toString());
        
        Supraterraneo supraterraneo = new Supraterraneo();
        supraterraneo.setVehiculo("Porsche");
        supraterraneo.setCombustible("De la verde");
        
        System.out.println(supraterraneo.toString());
        
        Metro metro = new Metro();
        metro.setCiudad("CDMX");
        metro.setEstacion("Centro Medico");
        metro.setCombustible("De la verde");
        
        System.out.println(metro.toString());
        
        Suburbano suburbano = new Suburbano();
        suburbano.setHorario("Disponible");
        suburbano.setCiudad("CDMX");
        suburbano.setCombustible("De la verde");
        
        System.out.println(suburbano.toString());
        
        Taxi taxi = new Taxi();
        taxi.setTarifaBase("30.00");
        taxi.setDisponible("Horario Libre");
        
        System.out.println(taxi.toString());
        
        
        Metrobus metrobus = new Metrobus();
        metrobus.setRuta("Linea 3");
        
        System.out.println(metrobus.toString());
        
        Acuatico acuatico = new Acuatico();
        acuatico.setCapacidad("1000");
        acuatico.setVelocidad(1000);
        acuatico.setCombustible("De la verde");
        
        System.out.println(acuatico.toString());
        
        Trajinera trajinera = new Trajinera();
        trajinera.setName("Tania");
        trajinera.setCombustible("De la verde");
        
        System.out.println(trajinera.toString());
        
        Barco barco = new Barco();
        barco.setTripulacion("Catorce");
        barco.setPuertoDestino("Puerto Vallarta");
        barco.setPuertoOrigen("Mazatlan");
        barco.setCombustible("De la verde");
        
        System.out.println(barco.toString());
        
        Aereo aereo = new Aereo();
        aereo.setVelocidad(100);
        aereo.setCapacidad("Lleno");
        aereo.setCombustible("De la verde");
        
        System.out.println(aereo.toString());
        
        Avion avion = new Avion();
        avion.setAeropuerto("CDMX");
        avion.setPiloto("Tania");
        avion.setCombustible("De la verde");
        
        System.out.println(avion.toString());
        
        Helicoptero helicoptero = new Helicoptero();
        helicoptero.setNumeroDeRegistro(18);
        helicoptero.setUbicacion("CDMX");
        helicoptero.setCombustible("De la verde");
        
        System.out.println(helicoptero.toString());
    }
    
}
