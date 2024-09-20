package Vehiculo;

public class autos extends Vehiculos {

    String modelo,transmision, anio,placa,precio;

    public autos(String autos,String modelo, String transmision, String anio, String placa,String precio) {
        super(autos);
        this.modelo = modelo;
        this.transmision = transmision;
        this.anio = anio;
        this.placa = placa;
        this.precio = precio;
    }

    public autos(String placa) {
        super(placa);
    }

    public String getmodelo(){
        return modelo;
    }
    public void setmodelo(String modelo){
        this.modelo = modelo;
    }

    public String gettransmision(){
        return transmision;
    }
    public void settransmision(String transmision){
        this.transmision = transmision;
    }

    public String getanio(){
        return anio;
    }
    public void setanio(String anio){
        this.anio = anio;
    }

    public String placa(){
        return placa;
    }
    public void setplaca(String placa){
        this.placa = placa;
    }

    public String precio(){
        return precio;
    }
    public void setprecio(String precio){
        this.precio = precio;
    }

    @Override
    public String toString(){
        return "\n\nModelo de kia: " + modelo + " \nTransmision: " + transmision + " \nAño: " + anio +  " \nPlaca: " + placa + "\nPrecio: " + precio;
    }

    public void ki(){
        System.out.print("\n¡Visitanos con los mejores precios! ");
    }
}
