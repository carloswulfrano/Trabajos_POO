package FesAragon_POO.Tareas.Tarea6_Herencia.SistemaAnimales;

public class Animal {

    protected String nombre;
    protected int edad;


    public Animal() {
    }


    public Animal(String nombre, int edad) {
        this.nombre = nombre;
        this.edad = edad;
    }


    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }


    @Override
    public String toString() {
        return "Animal{" +
                "nombre='" + nombre + '\'' +
                ", edad=" + edad  +
                '}';
    }

    public void comer(boolean comiendo){

        if (comiendo){
            System.out.println("Esta comiendo!");
        }else {
            System.out.println("NO esta comiendo...");
        }
    }
}
