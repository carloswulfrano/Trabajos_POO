import FesAragon_POO.Trabajos_Actividades_Clase.Marzo.Clase_12_03_2026_Arreglos.Perro;

void main(String[] args) {

    int edad = 10;
    String estado = "No se sabe";

    if (edad >= 18){
        estado = "Mayor de edad";
    }else{
        estado = "Menor de edad";
    }
    System.out.println("El estado: " + estado);

    System.out.println("------------------");

    edad = 20;
    estado = edad >= 18 ? "Mayor de edad" : "Menor de edad";
    System.out.println("EDO: " + estado);

    System.out.println("\n\n");



    System.out.println("Ejemplo arreglos");

    Perro[] manada = new Perro[10];
    System.out.println(manada[0]);
    manada[0] = new Perro();
    System.out.println(manada[0]);

    //Inicializar arreglo

    for (int i = 0; i < 10; i++) {
        manada[i] = new Perro();
    }

    for (int i = 0; i < 10; i++) {
        System.out.println("--->" + manada[i]);
    }

    manada[9].setColor("Blanco");
    for (int i = 0; i < 10; i++) {
        System.out.println("--->" + manada[i]);
    }


    //Arreglo de dos dimensiones
    int [][]A = new int[2][3];
    A[0][0] = 1;

}