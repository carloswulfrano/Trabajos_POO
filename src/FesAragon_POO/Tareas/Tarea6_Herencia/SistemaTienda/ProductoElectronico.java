package FesAragon_POO.Tareas.Tarea6_Herencia.SistemaTienda;

public class ProductoElectronico extends Producto{
    private int garantiaMeses;


    public ProductoElectronico() {
    }


    public ProductoElectronico(String nombre, float precio, int garantiaMeses) {
        super(nombre, precio);
        this.garantiaMeses = garantiaMeses;
    }


    public int getGarantiaMeses() {
        return garantiaMeses;
    }

    public void setGarantiaMeses(int garantiaMeses) {
        this.garantiaMeses = garantiaMeses;
    }


    @Override
    public String toString() {
        return "ProductoElectronico{" +
                "garantiaMeses=" + garantiaMeses +
                ", nombre='" + nombre + '\'' +
                ", precio=" + precio +
                '}';
    }

    public void mostrarGarantia(){
        System.out.println("El producto " + nombre + " tiene una garantia de: "+ garantiaMeses + " mes(es)!");
    }
}
