import FesAragon_POO.Tareas.Tarea6_Herencia.SistemaTransporte.Automovil;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
void main() {

    Automovil au1 = new Automovil("Ford", "Mustang EcoBoost", 2);
    System.out.println(au1);
    au1.encenderMotor(true);

    System.out.println("\n");

    Automovil au2 = new Automovil();
    au2.setMarca("BMW");
    au2.setModelo("M440i xDrive Coupé");
    au2.mostrarInformacion();
    au2.encenderMotor(false);
}
