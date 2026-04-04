package FesAragon_POO.Tareas.Tarea6_Herencia.SistemaTransporte;

public class Automovil extends Vehiculo{

    private int numeroPuertas;


    public Automovil() {
    }


    public Automovil(String marca, String modelo, int numeroPuertas) {
        super(marca, modelo);
        this.numeroPuertas = numeroPuertas;
    }


    public int getNumeroPuertas() {
        return numeroPuertas;
    }

    public void setNumeroPuertas(int numeroPuertas) {
        this.numeroPuertas = numeroPuertas;
    }


    @Override
    public String toString() {
        return "Automovil{" +
                "numeroPuertas=" + numeroPuertas +
                ", marca='" + marca + '\'' +
                ", modelo='" + modelo + '\'' +
                '}';
    }

    public void encenderMotor(boolean encender){
        if (encender){
            System.out.println("El automovil ha sido encendido!!!");
        } else {
            System.out.println("El automvil esta apagado....");
        }
    }
}
