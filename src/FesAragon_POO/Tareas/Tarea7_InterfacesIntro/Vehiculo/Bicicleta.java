package FesAragon_POO.Tareas.Tarea7_InterfacesIntro.Vehiculo;

public class Bicicleta implements Vehiculo{
    private String color;
    private String marca;
    private double distanciaMetros;
    private int segundos;

    public Bicicleta() {
    }

    public Bicicleta(String color, String marca, double distanciaMetros, int segundos) {
        this.color = color;
        this.marca = marca;
        this.distanciaMetros = distanciaMetros;
        this.segundos = segundos;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public double getDistancia() {
        return distanciaMetros;
    }

    public void setDistancia(double distancia) {
        this.distanciaMetros = distancia;
    }

    public int getHoras() {
        return segundos;
    }

    public void setHoras(int horas) {
        this.segundos = horas;
    }

    @Override
    public String toString() {
        return "Bicicleta{" +
                "color='" + color + '\'' +
                ", marca='" + marca + '\'' +
                ", distancia=" + distanciaMetros +
                ", horas=" + segundos +
                '}';
    }

    public double calcularVelocidadMaxima(){
        if (distanciaMetros > 0 && segundos > 0){
            return distanciaMetros/segundos;
        } else{
            System.out.println("La distancia u horas deben de ser diferentes a 0!!!");
        }
        return 0.0;
    }
}
