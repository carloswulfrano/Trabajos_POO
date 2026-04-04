package FesAragon_POO.Tareas.Tarea3_Ejercicios_Clase;

public class Arbol1 {
    private float tamanio;
    private int edad;
    private String color;

    //Constructor por defecto
    public Arbol1() {
    }

    //Constructor sobrecargado
    public Arbol1(float tamanio, int edad, String color) {
        this.tamanio = tamanio;
        this.edad = edad;
        this.color = color;
    }

    public float getTamanio() {
        return tamanio;
    }

    public void setTamanio(float tamanio) {
        //0.05 m y 115.0 m
        if (tamanio>=0.05f && tamanio <=155.0f){
            this.tamanio = tamanio;
            System.out.println("El tamaño del arbol es: " + tamanio + " metros!");
        } else {
            System.out.println("No se ha registrado un arbol con ese tamaño!");
        }
    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        // 1 año a 4500 años
        if (edad >= 1 && edad <=4500){
            this.edad = edad;
            System.out.println("La edad del arbol es: " + edad + "  años!");
        } else {
            System.out.println("No se ha registrado un arbol con esa edad!");
        }
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    @Override
    public String toString() {
        return "Arbol1{" +
                "tamanio=" + tamanio +
                ", edad=" + edad +
                ", color='" + color + '\'' +
                '}';
    }

    //Métodos Diagrama UML

    public void crecer(){
        System.out.println("El arbol esta creciendo...");
    }

    public void desgastar(){
        System.out.println("El arbol se esta desgastando...");
    }

    public boolean darFrutos(boolean d){
        if (d==true){
            System.out.println("El arbol si da frutos!");
            return true;
        } else if (d==false) {
            System.out.println("El arbol no da frutos!");
            return true;
        }
        return false;
    }

}
