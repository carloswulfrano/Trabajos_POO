import FesAragon_POO.Trabajos_Actividades_Clase.Marzo.Clase_03_03_2026_Herencia1.Alumno;
import FesAragon_POO.Trabajos_Actividades_Clase.Marzo.Clase_03_03_2026_Herencia1.Persona;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
void main() {

    System.out.println("\n");

    Persona per1 = new Persona("Jose", 19, "Masculino");
    System.out.println(per1);
    per1.hablar();
    per1.comer();

    System.out.println("\n");

    System.out.println("----------------------");

    System.out.println("\n");

    Alumno al = new Alumno("Diego", 20, "Masculino", "2222222222", "ICO");
    System.out.println(al);
    al.dormir();
    al.comer();
    al.estudiar();


    System.out.println("\n\n\n");


    ArrayList<Persona> listaPesonas = new ArrayList<>();
    listaPesonas.add(new Persona("Jose", 22, "Maculino"));
    listaPesonas.add(new Persona("Diego", 22, "Maculino"));
    listaPesonas.add(new Persona("Diana", 22, "Femeniino"));
    listaPesonas.add(new Persona("Andrea", 22, "Femenino"));
    listaPesonas.add(new Persona("David", 22, "Maculino"));
    listaPesonas.add(new Persona("Pancho", 22, "Maculino"));

    for (Persona p: listaPesonas){
        System.out.println(p);
    }



    //ejemplo HashMap

    HashMap<String, String> datos = new HashMap<>();
    datos.put("0", "Papas");
    datos.put("1", "Pepsi");
    datos.put("2", "Burguers");
    datos.put("algo", "Tacos");
    System.out.println(datos.get("algo"));


}
