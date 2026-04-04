import FesAragon_POO.Trabajos_Actividades_Clase.Febrero.Clase_19_02_2026_ComputadoraCom.Componentes.Procesador;
import FesAragon_POO.Trabajos_Actividades_Clase.Marzo.Clase_17_03_2026_Generics.CajaCarton;

void main() {

    Procesador[] procesadores = new Procesador[CajaCarton.CAPACIDAD];
    CajaCarton<Procesador> cajaTiliches = new CajaCarton<>(procesadores);
    cajaTiliches.add(new Procesador("Intel", 1.4f, "i5", 4), 0);
    cajaTiliches.add(new Procesador("Intel", 1.6f, "i7", 8), 1);
    cajaTiliches.add(new Procesador("Intel", 2.0f, "i9", 16), 2);


    System.out.println(cajaTiliches.get(9));
    System.out.println(cajaTiliches.get(0));

    System.out.println("----------------------------------------------------------------------------");

    for (int i = 0; i < CajaCarton.CAPACIDAD; i++) {
        System.out.println(cajaTiliches.get(i));
        System.out.println();
    }

    System.out.println("-----------------");

}