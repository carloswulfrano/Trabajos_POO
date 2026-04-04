import FesAragon_POO.Tareas.Tarea3_Ejercicios_Clase.*;

void main() {

    //BICICLETA

    Bicicleta b1 = new Bicicleta();
    //También se puede poner b1.toString(); pero con poner el objeto ya llama al toString
    System.out.println("\n"+b1);

    //1=Izquierda    0=Derecha     otro número=No ha girado
    b1.girarIzquierda(1);

    Bicicleta b2=new Bicicleta("Roja", 0.8f, 0.3f, 10, "Carbono");
    //También se puede poner b1.toString(); pero con poner el objeto ya llama al toString
    System.out.println("\n"+b2);
    b2.frenar();



    //Libro

    Libro l1 = new Libro();
    //por defecto
    System.out.println("\n\n"+l1);
    l1.prestarLibro(true);
    l1.regresarLiro(false);

    //con datos almacenados
    Libro l2 = new Libro("Nada", "Janne Teller", 2000, 20000);
    System.out.println("\n"+l2);



    //Coche

    Coche ch1 = new Coche();
    //Por defecto
    System.out.println("\n\n"+ch1);
    ch1.encenderAuto(false);
    ch1.frenar();

    Coche ch2 = new Coche("Toyota", "Corolla", "Azul");
    //Con datos almacenados
    System.out.println("\n"+ch2);
    ch2.encenderAuto(true);
    ch2.acelerar();



    //Arbol1

    Arbol1 a11 = new Arbol1();
    //Por defecto
    System.out.println("\n\n"+a11);
    a11.darFrutos(false);

    Arbol1 a12 = new Arbol1(50.2f, 10, "Café");
    //Con datos almacenados
    System.out.println("\n"+a12);
    a12.crecer();
    a12.desgastar();
    a12.darFrutos(true);



    //Aspiradora

    Aspiradora asp1 = new Aspiradora();
    //Por defecto
    System.out.println("\n\n"+asp1);


    Aspiradora asp2 = new Aspiradora("Dyson", 2500.0f, "Cilindrica", 5.5f, 220.0f);
    //Con datos almacenados
    System.out.println("\n"+asp2);
    asp2.aspirar(false);
    asp2.encender(false);
    asp2.soportarBasura(5.5f);



    //Arbol2

    Arbol2 a21 = new Arbol2();
    //Por defecto
    System.out.println("\n\n"+a21);
    a21.romper();
    a21.crearFrutos(false);

    Arbol2 a22 = new Arbol2("Abedul", "Blanca", 10.5f, 1000, 10000, 1000);
    //Con datos almacenados
    System.out.println("\n"+a22);
    a22.aumentarAltura(5.5f);
    a22.aumentarGrosor();
    a22.crearHojas();
    a22.crearFrutos(true);
    a22.aumentarAnhosVida();



    //Carro

    Carro crr1 = new Carro();
    //Por defecto
    System.out.println("\n\n"+crr1);
    crr1.acelerar(false);
    crr1.prenderOApagar(false);

    Carro crr2 = new Carro("Negro", "Carolla", 250000.99f, 12000);
    //Con datos almacenados
    System.out.println("\n"+crr2);
    crr2.acelerar(true);
    crr2.llevarPasajeros(true, 2);
    crr2.prenderOApagar(true);



    //Mochila

    Mochila m1 = new Mochila();
    //Por defecto
    System.out.println("\n\n"+m1);


    Mochila m2 = new Mochila("Negro", true, 1050.5f, "Mediana", 4);
    //Con datos almacenados
    System.out.println("\n"+m2);
    m2.abrir(true);
    m2.guardar();
    m2.mover();
}