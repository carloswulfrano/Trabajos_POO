package FesAragon_POO.Tareas.Tarea7_InterfacesIntro.Vehiculo;

public class Motocicleta implements Vehiculo{

    private String marca;
    private String color;
    private double distancia;
    private  int horas;

    public Motocicleta() {
    }

    public Motocicleta(String marca, String color, double distancia, int horas) {
        this.marca = marca;
        this.color = color;
        this.distancia = distancia;
        this.horas = horas;
    }

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public double getDistancia() {
        return distancia;
    }

    public void setDistancia(double distancia) {
        this.distancia = distancia;
    }

    public int getHoras() {
        return horas;
    }

    public void setHoras(int horas) {
        this.horas = horas;
    }

    @Override
    public String toString() {
        return "Motocicleta{" +
                "marca='" + marca + '\'' +
                ", color='" + color + '\'' +
                ", distancia=" + distancia +
                ", horas=" + horas +
                '}';
    }

    public double calcularVelocidadMaxima(){
        if (distancia > 0 && horas > 0){
            return distancia/horas;
        } else{
            System.out.println("La distancia u horas deben de ser diferentes a 0!!!");
        }
        return 0.0;
    }
}
