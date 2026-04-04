package FesAragon_POO.Tareas.Tarea6_Herencia.SistemaBiblioteca;

public class Bibliotecario extends Persona {

    private int numeroEmpleado;


    public Bibliotecario() {
    }


    public Bibliotecario(String nombre, int edad, int numeroEmpleado) {
        super(nombre, edad);
        this.numeroEmpleado = numeroEmpleado;
    }


    public int getNumeroEmpleado() {
        return numeroEmpleado;
    }

    public void setNumeroEmpleado(int numeroEmpleado) {
        this.numeroEmpleado = numeroEmpleado;
    }


    @Override
    public String toString() {
        return "Bibliotecario{" +
                "numeroEmpleado=" + numeroEmpleado +
                ", nombre='" + nombre + '\'' +
                ", edad=" + edad +
                '}';
    }

    public void registrarPrestamo(){
        System.out.println("Se esta regitrando el prestamo de un libro!!!");
    }
}
