import FesAragon_POO.Tareas.Tarea7_InterfacesIntro.Vehiculo.Automovil;
import FesAragon_POO.Tareas.Tarea7_InterfacesIntro.Vehiculo.Bicicleta;
import FesAragon_POO.Tareas.Tarea7_InterfacesIntro.Vehiculo.Motocicleta;
import FesAragon_POO.Tareas.Tarea7_InterfacesIntro.Vehiculo.Vehiculo;

void main() {
    int opcion;
    Scanner teclado = new Scanner(System.in);

    System.out.println("---Menú para calcular la velocidad de un Vehiculo---: ");
    System.out.println("1.- Velocidad del Automvil.");
    System.out.println("2.- Velocidad de la Bicicleta.");
    System.out.println("3.- Velocidad de la Motocicleta.");
    System.out.print("Ingrese su opción (1-3): ");
    opcion = teclado.nextInt();

    switch (opcion){
        case Vehiculo.AUTOMOVIL:
            Automovil au1 = new Automovil();

            System.out.print("Ingrese la marca del automovil: ");
            au1.setMarca(teclado.nextLine());
            au1.setMarca(teclado.nextLine());
            System.out.print("Ingrese el color del automovil: ");
            au1.setColor(teclado.nextLine());
            System.out.print("Ingresa la distancia en km: ");
            au1.setDistancia(teclado.nextDouble());
            System.out.print("Ingresa las horas: ");
            au1.setHoras(teclado.nextInt());

            System.out.println("La velociadad del automovil es: " + au1.calcularVelocidadMaxima() + " km/h.");
            System.out.println(au1);
            break;

        case Vehiculo.BICICLETA:
            Bicicleta bic = new Bicicleta();

            System.out.print("Ingrese la marca de la bicicleta: ");
            bic.setMarca(teclado.nextLine());
            bic.setMarca(teclado.nextLine());
            System.out.print("Ingrese el color de la bicicleta: ");
            bic.setColor(teclado.nextLine());
            System.out.print("Ingresa la distancia en metros: ");
            bic.setDistancia(teclado.nextDouble());
            System.out.print("Ingresa los segundos: ");
            bic.setHoras(teclado.nextInt());

            System.out.println("La velocidad de la bicicleta es: " + bic.calcularVelocidadMaxima() + " m/s.");
            System.out.println(bic);
            break;

        case Vehiculo.MOTOCICLETA:
            Motocicleta mot = new Motocicleta();

            System.out.print("Ingrese la marca de la Motocicleta: ");
            mot.setMarca(teclado.nextLine());
            mot.setMarca(teclado.nextLine());
            System.out.print("Ingrese el color de la motocicleta: ");
            mot.setColor(teclado.nextLine());
            System.out.print("Ingresa la distancia en km: ");
            mot.setDistancia(teclado.nextDouble());
            System.out.print("Ingresa las horas: ");
            mot.setHoras(teclado.nextInt());

            System.out.println("La velocidad de la motocicleta es: " + mot.calcularVelocidadMaxima() + " km/h.");
            System.out.println(mot);
            break;

        default:
            System.out.println("Opcion no valida!!!");
    }
}