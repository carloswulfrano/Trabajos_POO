import FesAragon_POO.Trabajos_Actividades_Clase.Marzo.Clase_05_03_2026_RelojHerencia.CajaCarton;
import FesAragon_POO.Trabajos_Actividades_Clase.Marzo.Clase_05_03_2026_RelojHerencia.RadioReloj;
import FesAragon_POO.Trabajos_Actividades_Clase.Marzo.Clase_05_03_2026_RelojHerencia.RadioRelojDespertador;
import FesAragon_POO.Trabajos_Actividades_Clase.Marzo.Clase_05_03_2026_RelojHerencia.Reloj;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
void main() {

    CajaCarton<RadioReloj> tiliches = new CajaCarton<>(new RadioReloj[CajaCarton.CAPACIDAD]);
    tiliches.add(new RadioReloj("Casio", 10, 101.7f, true, new Reloj()), 0);
    tiliches.add(new RadioReloj("Rolex", 10, 101.7f, true, new Reloj()), 1);
    tiliches.add(new RadioReloj("Samsumg", 10, 101.7f, true, new Reloj()), 2);
    tiliches.add(new RadioReloj("Motorola", 10, 101.7f, true, new Reloj()), 3);


    System.out.println(tiliches.get(3));

    tiliches.add(new RadioRelojDespertador("Casio", 11, 1.0f, true, new Reloj(),11, 11,11,  false), 6);


    System.out.println("\n\nHashMap de relojes------------");
    HashMap<String, Reloj> cosas2 = new HashMap<>();
    cosas2.put("smarttI03", new Reloj(0,0,0));
    cosas2.put("depared", new Reloj(11,11,11));
    cosas2.put("smarttI03", new Reloj(0,0,0));
    System.out.println(cosas2.get("depared"));

    System.out.println();

}
