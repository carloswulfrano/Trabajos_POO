package FesAragon_POO.Trabajos_Actividades_Clase.Febrero.Clase_10_02_2026;

public class Closet {
    private String material;
    private String color;
    private float altura;
    private int numeroGanchos;

    public Closet() {
    }

    public Closet(String color, float altura) {
        this.altura = altura;
        this.color = color;
    }

    public float getAltura() {
        return altura;
    }

    public void setAltura(float al) {
        if(al > 1.0f && al < 3.0f){
            this.altura = al;
        }else{
            System.out.println( "La altura debe estar entre 1 y 3 metros");
        }

    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public String getMaterial() {
        return material;
    }

    public void setMaterial(String material) {
        this.material = material;
    }

    public int getNumeroGanchos() {
        return numeroGanchos;
    }

    public void setNumeroGanchos(int numeroGanchos) {
        this.numeroGanchos = numeroGanchos;
    }

    public void ponerGancho(){
        System.out.println("Poniendo ganchos...");
    }
    public boolean abrirPuerta(){
        System.out.println("abriendo puerta...");
        return true;
    }
}
