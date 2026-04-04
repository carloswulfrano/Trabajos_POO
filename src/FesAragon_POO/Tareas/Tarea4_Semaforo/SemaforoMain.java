import FesAragon_POO.Tareas.Tarea4_Semaforo.Semaforo;
import FesAragon_POO.Tareas.Tarea4_Semaforo.Luces;

void main() {
    Luces lR = new Luces("Rojo");
    Luces lA = new Luces("Amarillo");
    Luces lV = new Luces("Verde");

    Semaforo s1 = new Semaforo(lR, lA, lV);
    System.out.println("\n");
    System.out.println(s1);

    System.out.println("\n");

    lR.encender(true);
    lA.encender(false);
    lV.encender(false);

    System.out.println("\n");
    s1.encender(true);

    System.out.println(s1);
    s1.getLuzR().encender(false);
    s1.getLuzA().encender(true);
    s1.getLuzV().encender(false);
}