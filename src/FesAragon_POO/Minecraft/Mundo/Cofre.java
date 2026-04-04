package FesAragon_POO.Minecraft.Mundo;

import java.util.HashMap;

public class Cofre <T extends Bloque> extends Bloque{
    public static final int MAX_CONTENIDO = 27;

    HashMap<Integer, T> contenido;

    public Cofre() {
        contenido = new HashMap<>();
    }

    private void inicializar(){
        for (int i = 0; i < MAX_CONTENIDO; i++) {
            contenido.put(i, null);
        }
    }

    public void guardarItem(T item, int posicion){

    }


}
