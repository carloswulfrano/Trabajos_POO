package FesAragon_POO.Tareas.Tarea3_Ejercicios_Clase;

public class Libro {
    private String tituloDelLibro;
    private String autorDelLibro;
    private int anhoDePublicacion;
    private int cantidadDeEjemplares;

    //Constructor por defecto
    public Libro() {
    }

    //Constructor sobrecargado
    public Libro(String tituloDelLibro, String autorDelLibro, int anhoDePublicacion, int cantidadDeEjemplares) {
        this.tituloDelLibro = tituloDelLibro;
        this.autorDelLibro = autorDelLibro;
        this.anhoDePublicacion = anhoDePublicacion;
        this.cantidadDeEjemplares = cantidadDeEjemplares;
    }

    public String getTituloDelLibro() {
        return tituloDelLibro;
    }

    public void setTituloDelLibro(String tituloDelLibro) {
        this.tituloDelLibro = tituloDelLibro;
    }

    public String getAutorDelLibro() {
        return autorDelLibro;
    }

    public void setAutorDelLibro(String autorDelLibro) {
        this.autorDelLibro = autorDelLibro;
    }

    public int getAnhoDePublicacion() {
        return anhoDePublicacion;
    }

    public void setAnhoDePublicacion(int anhoDePublicacion) {
        this.anhoDePublicacion = anhoDePublicacion;
    }

    public int getCantidadDeEjemplares() {
        return cantidadDeEjemplares;
    }

    public void setCantidadDeEjemplares(int cantidadDeEjemplares) {
        this.cantidadDeEjemplares = cantidadDeEjemplares;
    }

    @Override
    public String toString() {
        return "Libro{" +
                "tituloDelLibro='" + tituloDelLibro + '\'' +
                ", autorDelLibro='" + autorDelLibro + '\'' +
                ", anhoDePublicacion=" + anhoDePublicacion +
                ", cantidadDeEjemplares=" + cantidadDeEjemplares +
                '}';
    }

    //Métodos Diagrama UML

    public boolean prestarLibro(boolean p){
        if (p==true){
            System.out.println("El libro esta prestado.");
            return true;
        }if(p==false){
            System.out.println("El libro no esta prestado.");
            return true;
        }
        return false;
    }

    public boolean regresarLiro(boolean r){
        if (r==true){
            System.out.println("El si fue regresado.");
            return true;
        }if(r==false) {
            System.out.println("El libro no ha sido regresado.");
            return true;
        }
        return false;
    }

    public void verSeleccionDeLibro(){
        System.out.println("Buscando selección del libro.");
    }

}
