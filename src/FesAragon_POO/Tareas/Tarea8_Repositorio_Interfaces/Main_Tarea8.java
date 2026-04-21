import FesAragon_POO.Tareas.Tarea8_Repositorio_Interfaces.Estudiante;
import FesAragon_POO.Tareas.Tarea8_Repositorio_Interfaces.EstudianteSecundaria;
import FesAragon_POO.Tareas.Tarea8_Repositorio_Interfaces.EstudianteUniversidad;

import java.util.Scanner;

    public static void main(String[] args) {

        Scanner leer = new Scanner(System.in);

        int opcion;
        System.out.println("---Menú de estudiantes---");
        System.out.println("1.- Secundaria");
        System.out.println("2.- Universidad");
        System.out.print("Seleccione su opción (1-2): ");
        opcion = leer.nextInt();

        switch (opcion) {

            case Estudiante.SECUNDARIA:
                EstudianteSecundaria es = new EstudianteSecundaria();

                leer.nextLine();
                System.out.print("Nombre: ");
                es.setNombre(leer.nextLine());

                System.out.print("Calificación 1: ");
                es.setCal1(leer.nextFloat());
                System.out.print("Calificación 2: ");
                es.setCal2(leer.nextFloat());
                System.out.print("Calificación 3: ");
                es.setCal3(leer.nextFloat());

                System.out.println("Datos: " + es);
                System.out.println("Promedio: " + es.calcularPromedio());
                break;

            case Estudiante.UNIVERSIDAD:
                EstudianteUniversidad eu = new EstudianteUniversidad();

                leer.nextLine();
                System.out.print("Nombre: ");
                eu.setNombre(leer.nextLine());

                System.out.print("Calificación 1: ");
                eu.setCal1(leer.nextFloat());
                System.out.print("Calificación 2: ");
                eu.setCal2(leer.nextFloat());
                System.out.print("Calificación 3: ");
                eu.setCal3(leer.nextFloat());
                System.out.print("Calificación 4: ");
                eu.setCal4(leer.nextFloat());


                System.out.println("Datos: " + eu);
                System.out.println("Promedio: " + eu.calcularPromedio());
                break;

            default:
                System.out.println("Opción no válida");
        }
    }
