package FesAragon_POO.Tareas.Tarea4_Semaforo;

public class Luces {
    private String color;

    public Luces() {
    }

    public Luces(String color) {
        this.color = color;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    @Override
    public String toString() {
        return "Luz{" +
                "color='" + color + '\'' +
                '}';
    }

    public void encender(boolean e) {

        if (e) {
            System.out.println("La luz de color " + color + " esta encendida!!!");
        } else {
            apagar();
        }
    }

    public void apagar() {

        System.out.println("La luz de color " + color + " esta apagada...");
    }
}