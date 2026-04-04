package FesAragon_POO.Trabajos_Actividades_Clase.Febrero.Clase_17_02_2026;

public class Bicicleta {
    private String color;
    private float altura;
    private float ancho;
    private int velocidad;
    private String material;

    public Bicicleta() {
    }

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

}
