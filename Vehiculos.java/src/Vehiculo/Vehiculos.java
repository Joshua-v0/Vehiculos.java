package Vehiculo;

public class Vehiculos {

    String autos,motos,camiones,bus;


    public Vehiculos(String autos, String motos, String camiones, String bus) {
        this.autos = autos;
        this.motos = motos;
        this.camiones = camiones;
        this.bus = bus;
    }

    public Vehiculos(String autos) {
        this.autos = autos;
    }

    public String getautos(){
        return autos;
    }
    public void setautos(String modelo){
        this.autos = autos;
    }

    public String getmotos(){
        return motos;
    }
    public void setmotos(String motos){
        this.motos = motos;
    }

    public String getcamiones(){
        return camiones;
    }
    public void setcamiones(String camiones){
        this.camiones = camiones;
    }

    public String getbus(){
        return bus;
    }
    public void setbus(String placa){
        this.bus = bus;
    }

    @Override
    public String toString(){
        return "\n\nAuto: " + autos + " \nMoto: " + motos + " \nCamiones: " + camiones +  " \nBus: " + bus;
    }

    public void ve(){
        System.out.print("\n¡Estos son los vehiculos disponibles por el momento!");
    }

}

