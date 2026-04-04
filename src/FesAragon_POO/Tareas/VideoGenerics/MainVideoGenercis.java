import FesAragon_POO.Tareas.VideoGenerics.Caja;
import FesAragon_POO.Tareas.VideoGenerics.Product;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
void main() {

    Caja<String> cajaString = new Caja<>();
    cajaString.ponerAlgo("Hola");
    String contenido = cajaString.obtenerAlgo();

    System.out.println("El contenido es: " +  contenido);

    Caja<Integer> cajaEnteros = new Caja<>();
    cajaEnteros.ponerAlgo(18);
    Integer numero = cajaEnteros.obtenerAlgo();

    System.out.println("El contenido es: " +  numero);



    Product<String, Double> product1 = new Product<>("apple", 0.50);
    Product<String, Integer> product2 = new Product<>("Ticket", 15);

    System.out.println(product1.getItem() + "\n" + product1.getPrice());
    System.out.println(product2.getItem() + "\n" + product2.getPrice());

}
