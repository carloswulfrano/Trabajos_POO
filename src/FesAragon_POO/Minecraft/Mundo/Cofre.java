package FesAragon_POO.Minecraft.Mundo;

import java.util.ArrayList;
import java.util.HashMap;

public class Cofre extends Bloque{
    public static final int MAX_CONTENIDO = 27;

    HashMap<Integer, StackBloque> contenido;

    public Cofre() {
        contenido = new HashMap<>();
        this.inicializar();
    }

    private void inicializar(){
        for (int i = 0; i < MAX_CONTENIDO; i++) {
            contenido.put(i, null);
        }
    }

    public void guardarItem(StackBloque item, int posicion){
        contenido.put(posicion, item);
    }

    public StackBloque sacarItem(int index, int botonRaton, boolean shift){
        if (shift == true){
            ArrayList<Bloque> d = contenido.get(index).sacar(StackBloque.SACAR_UNO);
            return new StackBloque(d, 1);
        }
        //0 es click izquierdo
        if (botonRaton == 0){
            ArrayList<Bloque> d = contenido.get(index).sacar(StackBloque.SACAR_TODO);
            return new StackBloque(d, 1);
        }
        if (botonRaton == 1){
            ArrayList<Bloque> d = contenido.get(index).sacar(StackBloque.SACAR_MITAD);
            return new StackBloque(d, 1);
        }

        return null;
    }

}
