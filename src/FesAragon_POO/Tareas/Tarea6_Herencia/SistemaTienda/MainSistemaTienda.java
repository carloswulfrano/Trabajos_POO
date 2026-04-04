import FesAragon_POO.Tareas.Tarea6_Herencia.SistemaTienda.ProductoElectronico;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
void main() {

    ProductoElectronico pe1 = new ProductoElectronico("Palomitas de Microondas", 12.5f, 1);
    System.out.println(pe1);
    pe1.mostrarPrecio();
    pe1.mostrarGarantia();

    System.out.println("\n");

    ProductoElectronico pe2 = new ProductoElectronico();
    pe2.setNombre("Laptop");
    pe2.setPrecio(20000.0f);
    pe2.setGarantiaMeses(12);
    System.out.println(pe2);
    pe2.mostrarPrecio();
    pe2.mostrarGarantia();
}
