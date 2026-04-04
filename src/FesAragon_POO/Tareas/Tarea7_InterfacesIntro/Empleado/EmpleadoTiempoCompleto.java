package FesAragon_POO.Tareas.Tarea7_InterfacesIntro.Empleado;

public class EmpleadoTiempoCompleto implements Empleado{

    private String nombre;
    private String numEmpleado;
    private float salarioXhora;
    private boolean dobloTurno;


    public EmpleadoTiempoCompleto() {
    }

    public EmpleadoTiempoCompleto(String nombre, String numEmpleado, float salarioXhora, boolean dobloTurno) {
        this.nombre = nombre;
        this.numEmpleado = numEmpleado;
        this.salarioXhora = salarioXhora;
        this.dobloTurno = dobloTurno;
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

    public boolean isDobloTurno() {
        return dobloTurno;
    }

    public void setDobloTurno(boolean dobloTurno) {
        this.dobloTurno = dobloTurno;
    }

    @Override
    public String toString() {
        return "EmpleadoTiempoCompleto{" +
                "nombre='" + nombre + '\'' +
                ", numEmpleado='" + numEmpleado + '\'' +
                ", salarioXhora=" + salarioXhora +
                ", dobloTurno=" + dobloTurno +
                '}';
    }

    public float calcularSalario(){
      if (dobloTurno){
          return salarioXhora*2*8;
      } else{
          return salarioXhora*8;
      }
    }
}
