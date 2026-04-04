package FesAragon_POO.Minecraft.Mundo;

import java.util.ArrayList;

public class StackBloque<T> {
    public static final int SACAR_TODO = 0;
    public static final int SACAR_MITAD = 1;
    public static final int SACAR_UNO = 2;
    private ArrayList<T> bloques;
    private int max;

    public StackBloque() {
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
                for (int i = 0; i < this.bloques.size(); i++) {
                    salida.add(this.bloques.removeLast());
                }
                this.bloques.clear();
                break;

            case SACAR_MITAD:
                //long arraylist
                int mitad = this.bloques.size()/2;
                for (int i = this.bloques.size()-1;i > mitad  ; i--) {
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

    static void main(String[] args) {
        ArrayList<BloqueTronco> demo = new ArrayList<>();
        demo.add(new BloqueTronco("Rugosa", "Clack", "Madera", 5));
        demo.add(new BloqueTronco("Rugosa", "Clack", "Madera", 5));
        demo.add(new BloqueTronco("Rugosa", "Clack", "Madera", 5));
        demo.add(new BloqueTronco("Rugosa", "Clack", "Madera", 5));
        demo.add(new BloqueTronco("Rugosa", "Clack", "Madera", 5));

        StackBloque<BloqueTronco> pila = new StackBloque<>(demo, 64);
        System.out.println(pila.sacar(StackBloque.SACAR_MITAD));
        System.out.println(pila);
    }
}
