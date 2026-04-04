package FesAragon_POO.Tareas.Tarea7_InterfacesIntro.Empleado;

public class EmpleadoPorHoras implements Empleado{

    private String nombre;
    private String numEmpleado;
    private float salarioXhora;
    private int horasTrabajadas;

    public EmpleadoPorHoras() {
    }

    public EmpleadoPorHoras(String nombre, String numEmpleado, float salarioXhora, int horasTrabajadas) {
        this.nombre = nombre;
        this.numEmpleado = numEmpleado;
        this.salarioXhora = salarioXhora;
        this.horasTrabajadas = horasTrabajadas;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getNumEmpleado() {
        return numEmpleado;
    }

    public void setNumEmpleado(String numEmpleado) {
        this.numEmpleado = numEmpleado;
    }

    public float getSalarioXhora() {
        return salarioXhora;
    }

    public void setSalarioXhora(float salarioXhora) {
        this.salarioXhora = salarioXhora;
    }

    public int getHorasTrabajadas() {
        return horasTrabajadas;
    }

    public void setHorasTrabajadas(int horasTrabajadas) {
        this.horasTrabajadas = horasTrabajadas;
    }

    @Override
    public String toString() {
        return "EmpleadoPorHoras{" +
                "nombre='" + nombre + '\'' +
                ", numEmpleado='" + numEmpleado + '\'' +
                ", salarioXhora=" + salarioXhora +
                ", horasTrabajadas=" + horasTrabajadas +
                '}';
    }

    public float calcularSalario(){
        return salarioXhora * horasTrabajadas;
    }
}
