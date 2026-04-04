package FesAragon_POO.Tareas.Tarea6_Herencia.SistemaAnimales;

public class Perro extends Animal {
    private String raza;


    public Perro() {
    }


    public Perro(String nombre, int edad, String raza) {
        super(nombre, edad);
        this.raza = raza;
    }


    public String getRaza() {
        return raza;
    }

    public void setRaza(String raza) {
        this.raza = raza;
    }


    @Override
    public String toString() {
        return "Perro{" +
                "raza='" + raza + '\'' +
                ", nombre='" + nombre + '\'' +
                ", edad=" + edad  + " años" +
                '}';
    }

    public void ladrar(boolean ladrando){
        if (ladrando) {
            System.out.println(nombre + " esta ladrando!!!");
        } else {
            System.out.println(nombre+ " no esta ladrando...");
        }
    }
}
