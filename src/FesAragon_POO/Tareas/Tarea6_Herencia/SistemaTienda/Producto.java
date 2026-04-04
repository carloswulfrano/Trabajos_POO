package FesAragon_POO.Tareas.Tarea6_Herencia.SistemaTienda;

public class Producto {
    protected String nombre;
    protected float precio;


    public Producto() {
    }


    public Producto(String nombre, float precio) {
        this.nombre = nombre;
        this.precio = precio;
    }


    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public float getPrecio() {
        return precio;
    }

    public void setPrecio(float precio) {
        this.precio = precio;
    }


    @Override
    public String toString() {
        return "Producto{" +
                "nombre='" + nombre + '\'' +
                ", precio=" + precio +
                '}';
    }

    public void mostrarPrecio(){
        System.out.println("El producto " + nombre + " tiene un precio de: " + precio);
    }
}
