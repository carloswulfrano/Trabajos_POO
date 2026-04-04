package FesAragon_POO.Tareas.Tarea3_Ejercicios_Clase;

public class Mochila {
    private String color;
    private boolean abierto;
    private double costo;
    private String tamanio;
    private int nuCierres;

    //Consstructor por defecto
    public Mochila() {
    }

    //constructor sobrecargado


    public Mochila(String color, boolean abierto, double costo, String tamanio, int nuCierres) {
        this.color = color;
        this.abierto = abierto;
        this.costo = costo;
        this.tamanio = tamanio;
        this.nuCierres = nuCierres;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public boolean isAbierto() {
        return abierto;
    }

    public void setAbierto(boolean abierto) {
        this.abierto = abierto;
    }

    public double getCosto() {
        return costo;
    }

    public void setCosto(double costo) {
        this.costo = costo;
    }

    public String getTamanio() {
        return tamanio;
    }

    public void setTamanio(String tamanio) {
        this.tamanio = tamanio;
    }

    public int getNuCierres() {
        return nuCierres;
    }

    public void setNuCierres(int nuCierres) {
        this.nuCierres = nuCierres;
    }

    @Override
    public String toString() {
        return "Mochila{" +
                "color='" + color + '\'' +
                ", abierto=" + abierto +
                ", costo=" + costo +
                ", tamanio='" + tamanio + '\'' +
                ", nuCierres=" + nuCierres +
                '}';
    }

    //Métodos Diagrama UML

    public boolean abrir(boolean a){
        if (a==true){
            System.out.println("La mochila esta abierta!");
            return true;
        } else if (a==false) {
            cerrar();
            return true;
        }
        return false;
    }

    public boolean cerrar(){
        System.out.println("La mochila esta cerrada!");
        return true;
    }

    public void guardar(){
        System.out.println("En la mochila hay cosas guardadas...");
    }

    public void mover(){
        System.out.println("La mochila ha sido movida...");
    }
}
