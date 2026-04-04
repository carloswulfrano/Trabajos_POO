package FesAragon_POO.Tareas.Tarea3_Ejercicios_Clase;

public class Carro {
    private String color;
    private String modelo;
    private float precio;
    private int kilometraje;

    //Constructor por defecto
    public Carro() {
    }

    //Constructor sobrecargado
    public Carro(String color, String modelo, float precio, int kilometraje) {
        this.color = color;
        this.modelo = modelo;
        this.precio = precio;
        this.kilometraje = kilometraje;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public String getModelo() {
        return modelo;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    public float getPrecio() {
        return precio;
    }

    public void setPrecio(float precio) {
        this.precio = precio;
    }

    public int getKilometraje() {
        return kilometraje;
    }

    public void setKilometraje(int kilometraje) {
        this.kilometraje = kilometraje;
    }

    @Override
    public String toString() {
        return "Carro{" +
                "color='" + color + '\'' +
                ", modelo='" + modelo + '\'' +
                ", precio=" + precio +
                ", kilometraje=" + kilometraje +
                '}';
    }

    //Métodos Diagrama UML

    public void acelerar(boolean a){
        if (a==true) {
            System.out.println("El auto esta acelerando!!!");
            mover();
        } else if (a==false){
            System.out.println("El auto no esta acelerando...");
        }
    }

    public void mover(){
        System.out.println("El auto esta acelerando, por tanto se esta moviendo...");
    }

    public void llevarPasajeros(boolean ll, int pasajeros){
        if (ll=true){
            System.out.println("El Carro lleva " + pasajeros + " pasajero(s)!!");
        } else if( ll=false){
            System.out.println("El Carro no lleva pasajeros");
        }
    }

    public boolean prenderOApagar(boolean estado){
        if (estado == true) {
            System.out.println("El auto esta encendido!");
            return true;
        }else if (estado== false){
            System.out.println("El auto esta apagado!");
            return true;
        }
        return false;
    }

}
