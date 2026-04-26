package FesAragon_POO.Trabajos_Actividades_Clase.Marzo.Clase_05_03_2026_RelojHerencia;

public class CajaCarton <T>{

    public static final int CAPACIDAD = 10;
    private T[] content;


    public CajaCarton() {
    }

    public CajaCarton(T[] content) {
        this.content = content;
    }

    public T[] getContent() {
        return content;
    }

    public void setContent(T[] content) {
        this.content = content;
    }

    public void add(T elemento, int posicion){

        if (posicion >= 0 && posicion <=9){
            content[posicion] = elemento;
        }

    }

    public T get(int posicion){

        if (posicion >= 0 && posicion <=9){
            return content[posicion];
        } else {
            return null;
        }

    }

}