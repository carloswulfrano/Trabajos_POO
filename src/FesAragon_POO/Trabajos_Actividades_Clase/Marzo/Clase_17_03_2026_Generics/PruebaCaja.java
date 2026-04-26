import FesAragon_POO.Trabajos_Actividades_Clase.Febrero.Clase_19_02_2026_ComputadoraCom.Componentes.Procesador;
import FesAragon_POO.Trabajos_Actividades_Clase.Marzo.Clase_03_03_2026_Herencia1.Persona;
import FesAragon_POO.Trabajos_Actividades_Clase.Marzo.Clase_05_03_2026_RelojHerencia.RadioReloj;
import FesAragon_POO.Trabajos_Actividades_Clase.Marzo.Clase_05_03_2026_RelojHerencia.RadioRelojDespertador;
import FesAragon_POO.Trabajos_Actividades_Clase.Marzo.Clase_05_03_2026_RelojHerencia.Reloj;
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

    System.out.println("--------Otro ejemplo---------");

    CajaCarton<RadioReloj> tiliches = new CajaCarton<>(new RadioReloj[CajaCarton.CAPACIDAD]);
    tiliches.add(new RadioReloj("Casio", 10, 101.7f, true, new Reloj()), 0);
    tiliches.add(new RadioReloj("Rolex", 10, 101.7f, true, new Reloj()), 1);
    tiliches.add(new RadioReloj("Samsung", 10, 101.7f, true, new Reloj()), 2);
    tiliches.add(new RadioReloj("Motorola", 10, 101.7f, true, new Reloj()), 3);
    System.out.println(tiliches.get(3));
    tiliches.add(new RadioRelojDespertador("Casio", 10, 1.0f, true, new Reloj(), 11, 11, 11, false), 4);

    System.out.println("\n\n--------Otro ejemplo-----");

    CajaCarton<String> ejemplo2 =new CajaCarton<>(new String[CajaCarton.CAPACIDAD]);
    ejemplo2.add("Hola", 0);
    ejemplo2.add("Adios", 1);
    ejemplo2.add("ke", 2);
    ejemplo2.add("aze", 3);
    System.out.println(ejemplo2.get(1));

    System.out.println("\n\n--------Otro ejemplo--------");

    CajaCarton<Persona> ejemplo3 = new CajaCarton<>(new Persona[CajaCarton.CAPACIDAD]);
    ejemplo3.add(new Persona("Jesus", 23, "masculino"), 0);
    System.out.println(ejemplo3.get(0));
    System.out.println(ejemplo3.get(0).getGenero());


    System.out.println("\n\n--------API collections----------");
    ArrayList<Persona> listaPersonas = new ArrayList<>();
    listaPersonas.add(new Persona("Jose", 22, "Masculino"));
    listaPersonas.add(new Persona("Diego", 18, "Masculino"));
    listaPersonas.add(new Persona("Diana", 21, "Femenino"));
    listaPersonas.add(new Persona("Andrea", 20, "Femenino"));
    listaPersonas.add(new Persona("David", 22, "Masculino"));
    listaPersonas.add(new Persona("Panchi", 23, "Masculino"));

    for (Persona p: listaPersonas){
        System.out.println(p);
    }

    System.out.println("\n\n---------Ejemplo de HashMap---------");

    HashMap<String, String> datos = new HashMap<>();
    datos.put("0", "papas");
    datos.put("1", "pepsi");
    datos.put("2", "hamburguesa");
    datos.put("algo", "tacos");

    System.out.println(datos.get("algo"));

    System.out.println("\nHashMap de relojes");
    HashMap<String, Reloj> cosas2 = new HashMap<>();
    cosas2.put("smarttI03", new Reloj(0,0,0));
    cosas2.put("depared", new Reloj(11,11,11));
    cosas2.put("smarttI03", new Reloj(0,0,0));
    System.out.println(cosas2.get("depared"));

    cosas2.get("depared").incrementaSegundo();
    System.out.println(cosas2.get("depared"));

}