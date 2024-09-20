package Vehiculo;

public class motos extends autos{

    public motos(String modelo, String transmision, String anio, String placa, String precio){
        super(modelo);
        this.modelo = modelo;
        this.transmision = transmision;
        this.anio = anio;
        this.placa = placa;
        this.precio = precio;
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

    public String getplaca(){
        return placa;
    }
    public void setplaca(String placa){
        this.placa = placa;
    }

    public String getprecio(){
        return precio;
    }
    public void setprecio(String precio){
        this.precio = precio;
    }

    @Override
    public String toString(){
        return "\n\nModelo de la moto: " + modelo + " \nTransmision: " + transmision + " \nAño: " + anio +  " \nPlaca: " + placa + "\nPrecio: " + precio;
    }

    public void toy(){
        System.out.print("\n--- Caracteristicas de la moto --- ");
    }
}
