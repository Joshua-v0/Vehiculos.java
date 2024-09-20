package Vehiculo;

public class camiones extends autos{

    String motor, capc;
    public camiones(String motor, String capc, String modelo, String transmision, String anio, String placa, String precio) {
        super(modelo);
        this.modelo = modelo;
        this.motor = motor;
        this.capc = capc;
        this.transmision = transmision;
        this.anio = anio;
        this.placa = placa;
        this.precio = precio;
    }

        public String getmotor(){
            return motor;
        }
        public void setmotor(String motor){
            this.motor = motor;
        }

    public String getcapc(){
        return motor;
    }
    public void setcapc(String capc){
        this.capc = capc;
    }

    @Override
    public String toString(){
        return "\n\nModelo del camion: " + modelo + " \nTransmision: " + transmision + " \nAño: " + anio +  " \nPlaca: " + placa + "\nPrecio: " + precio + "\nCapacidad de carga: " + capc + "\nMotor: " + motor;
    }

    public void ho(){
        System.out.print("\nEste camion esta disponible de 7:00 am - 12:00 pm | Contactanos al +507 6478-2740!");
    }
}
