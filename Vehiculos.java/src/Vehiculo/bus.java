package Vehiculo;

public class bus extends autos{

    String cant;
    String inaug, transporte;

    public bus(String inaug, String transporte, String cant, String placa){
        super(placa);
        this.transporte = transporte;
        this.inaug = inaug;
        this.cant = cant;
        this.placa = placa;
    }

    public String getinaug(){
        return inaug;
    }
    public void setianug(String motor){
        this.inaug = inaug;
    }

    public String gettransporte(){
        return transporte;
    }
    public void settransporte(String transporte){
        this.transporte = transporte;
    }

    public String getcant(){
        return cant;
    }

    @Override
    public String toString(){
        return "\n\nAño de inauguracion: " + inaug + " \nTipo de transporte: " + transporte + " \nCantidad de metro buses en panama: " + cant +  " \nPlaca: " + placa;
    }
    public void setcant(String cant){
        this.cant = cant;
    }

    public void buss(){
        System.out.print("\nTe mostramos las caracteristicas de un metro bus de panama");
    }
}
