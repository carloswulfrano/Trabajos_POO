import FesAragon_POO.Tareas.Tarea5_Herencia1_EjemploClase03_03_2026.Alumno;
import FesAragon_POO.Tareas.Tarea5_Herencia1_EjemploClase03_03_2026.Persona;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
void main() {

    System.out.println("\n");

    Persona per1 = new Persona("Jose", 19, "Masculino");
    System.out.println(per1);
    per1.hablar();
    per1.comer();

    System.out.println("\n");

    System.out.println("----------------------");

    System.out.println("\n");

    Alumno al = new Alumno("Diego", 20, "Masculino", "2222222222", "ICO");
    System.out.println(al);
    al.dormir();
    al.comer();
    al.estudiar();



}
