package FesAragon_POO.Trabajos_Actividades_Clase.Febrero.Clase_10_02_2026;

public class Coche {

    private String material;
    private String color;
    private float ancho;
    private float altura;
    private int velocidad;


    public Coche(){
    }
    public Coche(String material, String color, float ancho, float altura, int velocidad){
        this.material = material;
        this.color = color;
        this.ancho = ancho;
        this.altura = altura;
        this.velocidad = velocidad;
    }
    public String getMaterial() {

        return material;
    }
    public void setMaterial(String material) {

        this.material = material;
    }
    public String getColor() {

        return color;

    }
    public void setColor(String color) {
        this.color = color;
    }
    public float getAncho() {
        return ancho;
    }
    public void setAncho(float an) {
        if(an > 1.0f && an < 2.0f){
            this.ancho = an;
        }
        else {
            System.out.println("El ancho debe estar entre 1.0 y 2.0 mts");
        }
    }

    public float getAltura() {
        return altura;
    }

    public void setAltura(float al) {
        if(al > 1.8f && al < 2.3f){
            this.altura = al;
        }
        else {
            System.out.println("La altura debe estar entre 1.8f y 2.3 mts");
        }
    }

    public int getVelocidad() {
        return velocidad;
    }
    public void setVelocidad(int vel) {
        if(vel > 0 && vel < 200){
            this.velocidad = vel;
        }
        else {
            System.out.println("La velocidad debe  estar entre 0 y 200 km/h");
        }
    }
    public boolean mueveAdelante(){
        System.out.println("Moviendose hacia adelante");
        return true;
    }
    public boolean mueveAtras(){
        System.out.println("Moviendose hacia atras");
        return true;
    }
    public boolean abrePuerta(){
        System.out.println("Abriendo puerta");
        return true;
    }
    public boolean cierraPuerta(){
        System.out.println("Cerrando puerta");
        return true;
    }


}
