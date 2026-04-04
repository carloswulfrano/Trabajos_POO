import FesAragon_POO.Tareas.Tarea6_Herencia.SistemaEscolar.Profesor;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
void main() {

    Profesor prof1 = new Profesor("Juan", 32, "Algebra");
    System.out.println(prof1);
    prof1.presentarse();
    prof1.impartirClase();

    System.out.println("\n");

    Profesor prof2 = new Profesor();
    prof2.setNombre("Jorge");
    prof2.setMateria("Emprendimiento.");
    prof2.setEdad(28);
    System.out.println(prof2);
    prof2.presentarse();
    prof2.impartirClase();
}
