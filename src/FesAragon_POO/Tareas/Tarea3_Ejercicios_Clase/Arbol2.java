package FesAragon_POO.Tareas.Tarea3_Ejercicios_Clase;

public class Arbol2 {
    private String tipoArbol;
    private String corteza;
    private float altura;
    private int ramas;
    private int hojas;
    private int raices;

    //Constructor por defecto
    public Arbol2() {
    }


    //Constructor sobrecargado
    public Arbol2(String tipoArbol, String corteza, float altura, int ramas, int hojas, int raices) {
        this.tipoArbol = tipoArbol;
        this.corteza = corteza;
        this.altura = altura;
        this.ramas = ramas;
        this.hojas = hojas;
        this.raices = raices;
    }

    public String getTipoArbol() {
        return tipoArbol;
    }

    public void setTipoArbol(String tipoArbol) {
        this.tipoArbol = tipoArbol;
    }

    public String getCorteza() {
        return corteza;
    }

    public void setCorteza(String corteza) {
        this.corteza = corteza;
    }

    public float getAltura() {
        return altura;
    }

    public void setAltura(float altura) {
        //0.05 m y 115.0 m
        if (altura>=0.05f && altura <=155.0f){
            this.altura = altura;
            System.out.println("El tamaño del arbol es: " + altura + " metros!");
        } else {
            System.out.println("No se ha registrado un arbol con ese tamaño!");
        }
    }

    public int getRamas() {
        return ramas;
    }

    public void setRamas(int ramas) {
        this.ramas = ramas;
    }

    public int getHojas() {
        return hojas;
    }

    public void setHojas(int hojas) {
        this.hojas = hojas;
    }

    public int getRaices() {
        return raices;
    }

    public void setRaices(int raices) {
        this.raices = raices;
    }

    @Override
    public String toString() {
        return "Arbol2{" +
                "tipoArbol='" + tipoArbol + '\'' +
                ", corteza='" + corteza + '\'' +
                ", altura=" + altura +
                ", ramas=" + ramas +
                ", hojas=" + hojas +
                ", raices=" + raices +
                '}';
    }

    //Métodos Diagrama UML

    public float aumentarAltura(float aumento){
        float suma = aumento+getAltura();
        System.out.println("Altura actualizada del arobol: " + suma + " metros.");
        return suma;
    }

    public float aumentarGrosor(){
        System.out.println("El arbolo aumento de grosor....");
        return 1.1f;
    }

    public boolean crearHojas(){
        System.out.println("El arbol tiene más hojas");
        return true;
    }

    public boolean romper(){
        System.out.println("Han talado el arbol...");
        return true;
    }

    public boolean crearFrutos(boolean d){
        if (d==true){
            System.out.println("El arbol si da frutos!");
            return true;
        } else if (d==false) {
            System.out.println("El arbol no da frutos!");
            return true;
        }
        return false;
    }

    public float aumentarAnhosVida(){
        System.out.println("El arbol ha crecido..");
        return 1.1f;
    }
}
