package FesAragon_POO.Tareas.Tarea5_Herencia1_EjemploClase03_03_2026;

public class Alumno extends Persona {

    private String numCuenta;
    private String carrera;

    public Alumno() {
    }

    public Alumno(String nombre, int edad, String genero, String numCuenta, String carrera) {
        super(nombre, edad, genero);
        this.numCuenta = numCuenta;
        this.carrera = carrera;
    }

    public String getNumCuenta() {
        return numCuenta;
    }

    public void setNumCuenta(String numCuenta) {
        this.numCuenta = numCuenta;
    }

    public String getCarrera() {
        return carrera;
    }

    public void setCarrera(String carrera) {
        this.carrera = carrera;
    }

    @Override
    public String toString() {
        return "Alumno{" +
                "numCuenta='" + numCuenta + '\'' +
                ", carrera='" + carrera + '\'' +
                ", nombre='" + nombre + '\'' +
                ", edad=" + edad +
                ", genero='" + genero + '\'' +
                '}';
    }

    public void estudiar(){
        System.out.println(this.nombre + " esta estudiando...");
        System.out.println("Temas de la carrera: " + this.carrera);
    }

    public void hacerTarea(){
        System.out.println(this.nombre + " esta haciendo tarea de la carrera: " + this.carrera);
    }

    public void comer(){
        System.out.println(this.nombre + " esta comiendo como cerdo!!");
    }
}
