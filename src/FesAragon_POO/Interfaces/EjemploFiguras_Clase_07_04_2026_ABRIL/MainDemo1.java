import FesAragon_POO.Interfaces.EjemploFiguras_Clase_07_04_2026_ABRIL.Circulo;
import FesAragon_POO.Interfaces.EjemploFiguras_Clase_07_04_2026_ABRIL.Cuadrado;
import FesAragon_POO.Interfaces.EjemploFiguras_Clase_07_04_2026_ABRIL.Figura;

void main() {
    Circulo c1 = new Circulo(2.0f, 10.0f, 10.0f);
    Cuadrado cuad1 = new Cuadrado(3.0f, 2.0f, 20.0f, 20.0f);

    System.out.println("Area del circulo: " + c1.calcularArea());
    System.out.println("Area del cuadrado: " + cuad1.calcularArea());


    //escenario de decidir que figura crear

    int opcion = 0;

    Scanner teclado = new Scanner(System.in);

    System.out.println("Selecciona un valor entre 1 y 4.");
    opcion = teclado.nextInt();

    switch (opcion){
        case Figura.TIPO_CIRCULO:
            Circulo cx = new Circulo();
            System.out.println(cx);
            break;

        case Figura.TIPO_CUADRADO:
            Cuadrado cuad2 = new Cuadrado();
            System.out.println(cuad2);
            break;

        case Figura.TIPO_HEXAGONO:
            System.out.println("Creando hexagono");
            break;

        case Figura.TIPO_TRIANGULO:
            System.out.println("Crear triangulo");
            break;

        default:
            System.out.println("Opcion no valida!!!");
    }
}