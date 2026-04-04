package FesAragon_POO.Tareas.Tarea3_Ejercicios_Clase;

public class Bicicleta {
    private String color;
    private float altura;
    private float ancho;
    private int velocidad;
    private String material;


    //Constructor por defecto
    public Bicicleta() {
    }


    //Constructor Sobrecargado con todas las variables
    public Bicicleta(String color, float altura, float ancho, int velocidad, String material) {
        this.color = color;
        this.altura = altura;
        this.ancho = ancho;
        this.velocidad = velocidad;
        this.material = material;
    }


    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        //Verificar catalogo de color
        this.color = color;
    }

    public float getAltura() {
        return altura;
    }

    public void setAltura(float altura) {
        // 0.4 m y 1.0 m.
        if (altura >= 0.4f && altura <=1.0f){
            this.altura = altura;
        }else {
            System.out.println("Esa altura esta fuera del plano.");
        }
    }

    public float getAncho() {
        return ancho;
    }

    public void setAncho(float ancho) {
        this.ancho = ancho;
    }

    public int getVelocidad() {
        return velocidad;
    }

    public void setVelocidad(int velocidad) {
        // 0 km/h y 30 km/h
        this.velocidad = velocidad;
    }

    public String getMaterial() {
        return material;
    }

    public void setMaterial(String material) {
        this.material = material;
    }

    @Override
    public String toString() {
        return "Bicicleta{" +
                "color='" + color + '\'' +
                ", altura=" + altura +
                ", ancho=" + ancho +
                ", velocidad=" + velocidad +
                ", material='" + material + '\'' +
                '}';
    }

    public boolean moverAdelante(float d){
        System.out.println("Moviendo hacia adelante "+ d + " metros");
        return Boolean.TRUE;
    }

    public boolean girarIzquierda(int l){
        if (l==1){
            System.out.println("La bicicleta giro a la izquierda.");
            return true;
        }if (l==0 || l>=2){
            girarDerecha(l);
        }
        return false;
    }

    public boolean girarDerecha(int r){
        if (r==0){
            System.out.println("La bicicleta giro a la derecha.");
            return true;
        } if (r>=2){
            System.out.println("La bicicleta no ha girado!!!");
            return true;
        }
        return false;
    }

    public void frenar(){
        System.out.println("La bicicleta esta frenando...");
    }


}
