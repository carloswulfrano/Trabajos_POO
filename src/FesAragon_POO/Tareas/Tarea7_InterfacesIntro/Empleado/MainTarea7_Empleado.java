import FesAragon_POO.Tareas.Tarea7_InterfacesIntro.Empleado.Empleado;
import FesAragon_POO.Tareas.Tarea7_InterfacesIntro.Empleado.EmpleadoPorHoras;
import FesAragon_POO.Tareas.Tarea7_InterfacesIntro.Empleado.EmpleadoTiempoCompleto;

void main() {
    Scanner leer = new Scanner(System.in);

    int opcion;
    System.out.println("---Menú para calcular el salario de los Empleados--- ");
    System.out.println("1.- Empleado por turno.");
    System.out.println("2.- Empleado por horas.");
    System.out.print("Seleccione su opción (1-2): ");
    opcion = leer.nextInt();

    switch (opcion){

        case Empleado.EMPLEADO_COMPLETO:
            EmpleadoTiempoCompleto etc1 = new EmpleadoTiempoCompleto();

            System.out.print("Ingrese el nombre del Empleado: ");
            etc1.setNombre(leer.nextLine());
            etc1.setNombre(leer.nextLine());
            System.out.print("Ingrese el número del Empleado: ");
            etc1.setNumEmpleado(leer.nextLine());
            System.out.print("Ingrese el salario por hora del Empleado: ");
            etc1.setSalarioXhora(leer.nextFloat());
            System.out.print("Ingrese si doblo turno o no (true or false): ");
            etc1.setDobloTurno(leer.nextBoolean());

            System.out.println("Datos del empleado: " + etc1);
            System.out.println("Su salario diario es: $" + etc1.calcularSalario());
            break;

        case Empleado.EMPLEADO_HORAS:
            EmpleadoPorHoras eph1 = new EmpleadoPorHoras();

            System.out.print("Ingrese el nombre del Empleado: ");
            eph1.setNombre(leer.nextLine());
            eph1.setNombre(leer.nextLine());
            System.out.print("Ingrese el número del Empleado: ");
            eph1.setNumEmpleado(leer.nextLine());
            System.out.print("Ingrese el salario por hora del Empleado: ");
            eph1.setSalarioXhora(leer.nextFloat());
            System.out.print("Ingrese la cantidad de horas que trabajo: ");
            eph1.setHorasTrabajadas(leer.nextInt());

            System.out.println("Datos del empleado: " + eph1);
            System.out.println("Su salario diario es: $" + eph1.calcularSalario());
            break;

        default:
            System.out.println("Opción no validaa!!!");
    }
}