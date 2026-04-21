package FesAragon_POO.Tareas.Tarea8_Repositorio_Interfaces;

public class EstudianteSecundaria implements Estudiante{
    private String nombre;
    private float cal1, cal2, cal3;

    public EstudianteSecundaria() {
    }

    public EstudianteSecundaria(String nombre, float cal1, float cal2, float cal3) {
        this.nombre = nombre;
        this.cal1 = cal1;
        this.cal2 = cal2;
        this.cal3 = cal3;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public float getCal1() {
        return cal1;
    }

    public void setCal1(float cal1) {
        this.cal1 = cal1;
    }

    public float getCal2() {
        return cal2;
    }

    public void setCal2(float cal2) {
        this.cal2 = cal2;
    }

    public float getCal3() {
        return cal3;
    }

    public void setCal3(float cal3) {
        this.cal3 = cal3;
    }

    @Override
    public String toString() {
        return "EstudianteSecundaria{" +
                "nombre='" + nombre + '\'' +
                ", cal1=" + cal1 +
                ", cal2=" + cal2 +
                ", cal3=" + cal3 +
                '}';
    }

    public float calcularPromedio() {
        return (cal1 + cal2 + cal3) / 3;
    }
}
