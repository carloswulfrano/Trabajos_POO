import FesAragon_POO.Tareas.Tarea6_Herencia.SistemaAnimales.Perro;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
void main() {
    Perro p1 = new Perro("Firulais", 5, "Pastor Belga");
    System.out.println(p1);
    p1.comer(false);
    p1.ladrar(true);

    System.out.println("\n");

    Perro p2 = new Perro();
    p2.setNombre("Burbuja");
    p2.setRaza("Pastor Belga");
    p2.setEdad(4);
    System.out.println(p2);
    p2.comer(true);
    p2.ladrar(false);
}
