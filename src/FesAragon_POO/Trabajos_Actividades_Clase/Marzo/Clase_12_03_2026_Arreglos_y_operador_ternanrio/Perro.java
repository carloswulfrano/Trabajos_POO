package FesAragon_POO.Trabajos_Actividades_Clase.Marzo.Clase_12_03_2026_Arreglos_y_operador_ternanrio;

public class Perro {
    private int edad;
    private String raza;
    private String color;


    public Perro() {
    }


    public Perro(int edad, String raza, String color) {
        this.edad = edad;
        this.raza = raza;
        this.color = color;
    }


    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    public String getRaza() {
        return raza;
    }

    public void setRaza(String raza) {
        this.raza = raza;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }


    @Override
    public String toString() {
        return "Perro{" +
                "edad=" + edad +
                ", raza='" + raza + '\'' +
                ", color='" + color + '\'' +
                '}';
    }

    public  void ladrar(){
        System.out.println("gua gua gua!");
    }
}
