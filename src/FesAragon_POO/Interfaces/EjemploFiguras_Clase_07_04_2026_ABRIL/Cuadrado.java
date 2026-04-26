package FesAragon_POO.Interfaces.EjemploFiguras_Clase_07_04_2026_ABRIL;

public class Cuadrado implements Figura{

    private float largo;
    private float ancho;
    private float x;
    private float y;

    public Cuadrado() {
    }

    public Cuadrado(float largo, float ancho, float x, float y) {
        this.largo = largo;
        this.ancho = ancho;
        this.x = x;
        this.y = y;
    }

    public float getLargo() {
        return largo;
    }

    public void setLargo(float largo) {
        this.largo = largo;
    }

    public float getAncho() {
        return ancho;
    }

    public void setAncho(float ancho) {
        this.ancho = ancho;
    }

    public float getX() {
        return x;
    }

    public void setX(float x) {
        this.x = x;
    }

    public float getY() {
        return y;
    }

    public void setY(float y) {
        this.y = y;
    }

    @Override
    public String toString() {
        return "Cuadrado{" +
                "largo=" + largo +
                ", ancho=" + ancho +
                ", x=" + x +
                ", y=" + y +
                '}';
    }


    @Override
    public float calcularArea() {
        return this.ancho * this.largo;
    }
}
