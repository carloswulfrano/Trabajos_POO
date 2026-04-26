package Extras;

import java.util.ArrayList;

public class DemoArrayList {
    static void main(String[] args) {
        System.out.println("Demo ArrayList");
        ArrayList<String> lista = new ArrayList<>();
        lista.add("Jesus");
        lista.add("Maria");
        lista.add("Jose");
        System.out.println(lista.size());

        //llamar a un elemento, pero sin sacarlo del ArrayList
        System.out.println(lista.get(1));
        System.out.println(lista);

        //Eliminar un elemento del ArrayList
        String quitado = lista.remove(1);
        System.out.println("Tamaño: " + lista.size());
        System.out.println(lista);

        System.out.println(quitado);
        lista.add(0, "Juan");
        System.out.println(lista);

    }
}
