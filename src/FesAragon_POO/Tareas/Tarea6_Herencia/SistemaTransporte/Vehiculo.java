package FesAragon_POO.Tareas.Tarea6_Herencia.SistemaTransporte;

public class Vehiculo {

    protected String marca;
    protected String modelo;


    public Vehiculo() {
    }


    public Vehiculo(String marca, String modelo) {
        this.marca = marca;
        this.modelo = modelo;
    }


    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public String getModelo() {
        return modelo;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }


    @Override
    public String toString() {
        return "Vehiculo{" +
                "marca='" + marca + '\'' +
                ", modelo='" + modelo + '\'' +
                '}';
    }

    public void mostrarInformacion(){
        System.out.println("La marca del vehiculo es: " + marca);
        System.out.println("El modelo del vehiculo es: " + modelo);
    }
}
