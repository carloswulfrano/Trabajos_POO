package FesAragon_POO.Tareas.Tarea3_Ejercicios_Clase;

public class Aspiradora {
    private String marca;
    private float precio;
    private String forma;
    private float capacidad;
    private float bateria;

    //Constructor por defecto
    public Aspiradora() {
    }

    //Constructor sobrecargado
    public Aspiradora(String marca, float precio, String forma, float capacidad, float bateria) {
        this.marca = marca;
        this.precio = precio;
        this.forma = forma;
        this.capacidad = capacidad;
        this.bateria = bateria;
    }

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public float getPrecio() {
        return precio;
    }

    public void setPrecio(float precio) {
        this.precio = precio;
    }

    public String getForma() {
        return forma;
    }

    public void setForma(String forma) {
        this.forma = forma;
    }

    public float getCapacidad() {
        return capacidad;
    }

    public void setCapacidad(float capacidad) {
        // 0.2 Litros y 5.5 Litros.
        if (capacidad >= 0.2f && capacidad <=5.5f){
            this.capacidad = capacidad;
            System.out.println("La capacidad de la aspiradora es de: " + capacidad + " litros");
        }else {
            System.out.println("Esa capacidad no existe!");
        }
    }

    public float getBateria() {
        return bateria;
    }

    public void setBateria(float bateria) {
        this.bateria = bateria;
    }

    @Override
    public String toString() {
        return "Aspiradora{" +
                "marca='" + marca + '\'' +
                ", precio=" + precio +
                ", forma='" + forma + '\'' +
                ", capacidad=" + capacidad +
                ", bateria=" + bateria +
                '}';
    }

    //Métodos Diagramas UML

    public boolean aspirar(boolean a){
        if (a==true) {
            System.out.println("Aspirando....");
            return true;
        }
        return false;
    }

    public boolean encender(boolean e){
        if (e==true){
            System.out.println("La aspiradora esta encendida!");
            return true;
        } else if (e==false) {
            apagar(e);
            return true;
        }
        return false;
    }

    public boolean apagar(boolean a){
        System.out.println("La aspiradora esta apagada!");
        return true;
    }

    public float soportarBasura(float basura){
        if (basura >= 0.2f && basura <=5.5f){
            System.out.println("La aspiradora esta soportando " + basura + " litros de basura....");
            return basura;
        }else {
            System.out.println("Error de capacidad!");
            return 0.0f;
        }
    }
}
