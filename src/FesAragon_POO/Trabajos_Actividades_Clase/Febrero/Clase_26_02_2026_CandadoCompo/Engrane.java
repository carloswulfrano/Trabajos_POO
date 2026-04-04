package FesAragon_POO.Trabajos_Actividades_Clase.Febrero.Clase_26_02_2026_CandadoCompo;

public class Engrane {

    private int posicion;


    public Engrane() {
    }


    public Engrane(int posicion) {
        this.posicion = posicion;
    }


    public int getPosicion() {
        return posicion;
    }

    public void setPosicion(int posicion) {
        this.posicion = posicion;
    }


    @Override
    public String toString() {
        return "Engrane{" +
                "posicion=" + posicion +
                '}';
    }


    public void girar(int pos){
        this.posicion = (this.posicion + pos) %10;
    }

}
