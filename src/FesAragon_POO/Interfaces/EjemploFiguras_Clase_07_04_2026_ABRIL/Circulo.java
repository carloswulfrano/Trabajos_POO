package FesAragon_POO.Interfaces.EjemploFiguras_Clase_07_04_2026_ABRIL;

public class Circulo implements Figura{

    private float radio;
    private float x;
    private float y;


    public Circulo() {
    }

    public Circulo(float radio, float x, float y) {
        this.radio = radio;
        this.x = x;
        this.y = y;
    }

    public float getRadio() {
        return radio;
    }

    public void setRadio(float radio) {
        this.radio = radio;
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
        return "Circulo{" +
                "radio=" + radio +
                ", x=" + x +
                ", y=" + y +
                '}';
    }

    public float calcularArea(){
        return (float)Math.PI * (this.radio * this.radio);
    }
}
