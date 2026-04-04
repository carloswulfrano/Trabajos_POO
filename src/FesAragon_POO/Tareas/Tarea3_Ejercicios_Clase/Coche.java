package FesAragon_POO.Tareas.Tarea3_Ejercicios_Clase;

public class Coche {
    private String marca;
    private String modelo;
    private String color;

    //Constructor por defecto
    public Coche() {
    }

    //Constructor sobrecargado
    public Coche(String marca, String modelo, String color) {
        this.marca = marca;
        this.modelo = modelo;
        this.color = color;
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

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    @Override
    public String toString() {
        return "Coche1{" +
                "marca='" + marca + '\'' +
                ", modelo='" + modelo + '\'' +
                ", color='" + color + '\'' +
                '}';
    }

    //Métodos Diagrama UML

    public boolean encenderAuto(boolean e){
        if (e==true){
            System.out.println("El auto esta encendido!!!");
            return true;
        }else if(e==false){
            apagarAuto();
            return true;
        }
        return false;
    }

    public boolean apagarAuto(){
        System.out.println("El auto esta apagado!!!");
        return true;
    }

    public void acelerar(){
        System.out.println("El auto esta acelerando!!!");
    }

    public void frenar(){
        System.out.println("El auto esta frenando!!!");
    }

}
