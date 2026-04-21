package FesAragon_POO.Tareas.Tarea8_Repositorio_Interfaces;

public class EstudianteUniversidad implements Estudiante{
    private String nombre;
    private float cal1, cal2, cal3, cal4;

    public EstudianteUniversidad() {
    }

    public EstudianteUniversidad(String nombre, float cal1, float cal2, float cal3, float cal4) {
        this.nombre = nombre;
        this.cal1 = cal1;
        this.cal2 = cal2;
        this.cal3 = cal3;
        this.cal4 = cal4;
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

    public float getCal4() {
        return cal4;
    }

    public void setCal4(float cal4) {
        this.cal4 = cal4;
    }

    @Override
    public String toString() {
        return "EstudianteUniversidad{" +
                "nombre='" + nombre + '\'' +
                ", cal1=" + cal1 +
                ", cal2=" + cal2 +
                ", cal3=" + cal3 +
                ", cal4=" + cal4 +
                '}';
    }

    public float calcularPromedio() {
        float promedio = (cal1 + cal2 + cal3 + cal4) / 4;
        return promedio;
    }
}
