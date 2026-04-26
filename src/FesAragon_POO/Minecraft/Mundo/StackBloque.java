package FesAragon_POO.Minecraft.Mundo;

import java.security.PublicKey;
import java.util.ArrayList;

public class StackBloque<T> {
    public static final int SACAR_TODO = 0;
    public static final int SACAR_MITAD = 1;
    public static final int SACAR_UNO = 2;
    private ArrayList<T> bloques;
    private int max;

    public StackBloque() {
        bloques = new ArrayList<>();
    }

    public StackBloque(ArrayList<T> bloques, int max) {
        this.bloques = bloques;
        this.max = max;
    }

    public ArrayList<T> getBloques() {
        return bloques;
    }

    public void setBloques(ArrayList<T> bloques) {
        this.bloques = bloques;
    }

    public int getMax() {
        return max;
    }

    public void setMax(int max) {
        this.max = max;
    }

    @Override
    public String toString() {
        return "StackBloque{" +
                "bloques=" + bloques +
                ", max=" + max +
                '}';
    }

    public ArrayList<T> sacar(int tipoSalida){
        ArrayList<T> salida = new ArrayList<>();
        switch (tipoSalida){

            case SACAR_TODO:
                int tam = this.bloques.size();

                for (int i = 0; i < tam; i++) {
                    salida.add(this.bloques.removeLast());
                }
                this.bloques.clear();
                break;

            case SACAR_MITAD:
                //long arraylist
                int mitad = this.bloques.size()/2;

                for (int i = this.bloques.size()-1; i > mitad  ; i--) {
                    salida.add(this.bloques.get(i));
                    this.bloques.remove(i);
                }
                break;

            case SACAR_UNO:
                //salida.add(this.bloques.get(this.bloques.size()-1));
                //this.bloques.remove(this.bloques.size()-1);

                salida.add(this.bloques.removeLast());
                break;

            default:
        }

        return salida;
    }

    public void push(T bloque){
        this.bloques.add(bloque);
    }

    public T pop(){
        return this.bloques.removeLast();
    }


    static void main(String[] args) {
        ArrayList<BloqueTronco> demo = new ArrayList<>();
        demo.add(new BloqueTronco("Rugosa", "Tlak", "Madera", 5));
        demo.add(new BloqueTronco("Rugosa", "Tlak", "Madera", 5));
        demo.add(new BloqueTronco("Rugosa", "Tlak", "Madera", 5));
        demo.add(new BloqueTronco("Rugosa", "Tlak", "Madera", 5));
        demo.add(new BloqueTronco("Rugosa", "Tlak", "Madera", 5));

        StackBloque<BloqueTronco> pila = new StackBloque<>(demo, 64);
        ArrayList<BloqueTronco> res = pila.sacar(StackBloque.SACAR_MITAD);

        //System.out.println(pila.sacar(StackBloque.SACAR_MITAD));
        System.out.println(res.size());
        System.out.println(pila.getBloques().size());

        System.out.println("\n\n");

        StackBloque<BloqueTronco> prueba2 = new StackBloque<>();
        prueba2.push(new BloqueTronco("Rugoso", "Tlak", "Madera1", 5));
        prueba2.push(new BloqueTronco("Rugoso", "Tlak", "Madera2", 5));
        prueba2.push(new BloqueTronco("Rugoso", "Tlak", "Madera3", 5));
        prueba2.push(new BloqueTronco("Rugoso", "Tlak", "Madera4", 5));
        prueba2.push(new BloqueTronco("Rugoso", "Tlak", "Madera5", 5));

        ArrayList<BloqueTronco> res2 = prueba2.sacar(StackBloque.SACAR_MITAD);
        System.out.println(res2);
        System.out.println(prueba2.getBloques());
    }
}
