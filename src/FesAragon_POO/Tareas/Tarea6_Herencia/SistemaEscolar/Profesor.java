package FesAragon_POO.Tareas.Tarea6_Herencia.SistemaEscolar;

public class Profesor extends Persona{

    private String materia;


    public Profesor() {
    }


    public Profesor(String nombre, int edad, String materia) {
        super(nombre, edad);
        this.materia = materia;
    }


    public String getMateria() {
        return materia;
    }

    public void setMateria(String materia) {
        this.materia = materia;
    }


    @Override
    public String toString() {
        return "Profesor{" +
                "materia='" + materia + '\'' +
                ", nombre='" + nombre + '\'' +
                ", edad=" + edad +
                '}';
    }

    public void impartirClase(){
        System.out.println("Soy su profesor de la materia " + materia);
    }
}
