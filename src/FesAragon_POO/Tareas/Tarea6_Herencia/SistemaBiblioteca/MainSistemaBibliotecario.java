import FesAragon_POO.Tareas.Tarea6_Herencia.SistemaBiblioteca.Bibliotecario;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
void main() {

    Bibliotecario bi1 = new Bibliotecario("Ricardo", 31, 32323232);
    System.out.println(bi1);
    bi1.mostrarDatos();
    bi1.registrarPrestamo();

    System.out.println("\n");

    Bibliotecario bi2 = new Bibliotecario();
    bi2.setNombre("Ana");
    bi2.setEdad(40);
    bi2.setNumeroEmpleado(32323234);
    System.out.println(bi2);
    bi2.registrarPrestamo();
}
