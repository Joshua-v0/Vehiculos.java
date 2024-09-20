import Vehiculo.Vehiculos;
import Vehiculo.motos;
import Vehiculo.autos;
import Vehiculo.camiones;
import Vehiculo.bus;

import java.util.ArrayList;
public class Main {

    public static ArrayList<Vehiculos> autos = new ArrayList<>();
    public static void main(String[] args){

        Vehiculos ve1 = new Vehiculos("Kia","Suzuki","Izuzu","Metro bus");
        motos motos1 = new motos("Zuzuki","Manual","2015","nn333","1.200");
        autos autos1 = new autos("Sportage","Automatica","2020","jh2222","fefe234","13.000");
        camiones camiones1 = new camiones("Diesel","3.80 Toneladas","Cisterna","Automatica","2020","jdwn3232","30.000");
        bus bus1 = new bus("2010","Publico","5,000","jnjdj232");

        //Vehiculos
        ve1.ve();
        System.out.println(ve1);
        System.out.println("\nMuchas gracias");

        System.out.print("\n-----------------------------");

        //autos
        autos1.ki();
        System.out.println(autos1);
        System.out.println("\n¡Full recomendable!");

        System.out.print("\n----------------------------");

        //motos
        motos1.toy();
        System.out.println(motos1);
        System.out.println("\n¡Increible!");

        System.out.print("\n-----------------------------");

        //camiones
        camiones1.ho();
        System.out.println(camiones1);
        System.out.println("\nEstoy interesado");

        System.out.print("\n------------------------------");

        //bus
        bus1.buss();
        System.out.println(bus1);
        System.out.println("\nPerfecto jeje :)");
    }
}