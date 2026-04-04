package FesAragon_POO.Tareas.Tarea1_Lampara;

public class Lampara {
    private String marca;
    private String color;
    private int intensidad;
    private float precio;

    public Lampara(){

    }

    public Lampara(String marca, String color, int intensidad, float precio){
        this.marca=marca;
        this.color=color;
        this.intensidad=intensidad;
        this.precio=precio;
    }

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
        System.out.println("La lampara es de la marca "+getMarca());
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
        System.out.println("La lampara es de color "+getColor());
    }

    public int getIntensidad() {
        return intensidad;
    }

    public void setIntensidad(int inten) {
        if (inten == 1){
            this.intensidad=inten;
            System.out.println("La intensidad "+getIntensidad()+" es baja.");
        }else if (inten == 2){
            this.intensidad=inten;
            System.out.println("La intensidad "+getIntensidad()+" es media.");
        } else if (inten == 3) {
            this.intensidad=inten;
            System.out.println("La intensidad "+getIntensidad()+" es alta.");
        }else{
            System.out.println("La Intensidad debe de ser entre 1 y 3!");
        }

    }
    public float getPrecio() {
        return precio;
    }

    public void setPrecio(float precio) {
        this.precio = precio;
        System.out.println("El precio es de $"+getPrecio()+" pesos.");
    }

    public boolean estaEncendida(int e){
        if (e==0){
            System.out.println("La lampara NO esta encendida!");
        } else if (e==1) {
            System.out.println("La lampara SI esta encendida!");
            return true;
        }else {
            return false;
        }
        return false;
    }

    public boolean estaApagda(int e){
        if (e==0){
            System.out.println("La lampara SI esta Apagada!");
            return true;
        } else if (e==1) {
            System.out.println("La lampara NO esta Apagada!");
        }else {
            return false;
        }
        return false;
    }

    public void cambioIntensidad(){
        System.out.println("La intensidad de la lampara esta cambiando...");
    }

    public void tipoIntensidad(int t){
        if (t==1){
            System.out.println("El tipo de intensidad es calida!");
        } else if (t==2) {
            System.out.println("El tipo de intensidad es fria!");
        }else {
            System.out.println("El tipo de intensidad debe de ser 1 0 2!!!!");
        }
    }
}
