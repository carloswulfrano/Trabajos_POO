package FesAragon_POO.Trabajos_Actividades_Clase.Marzo.Clase_05_03_2026_RelojHerencia;

public class RadioReloj{
    protected String marca;
    protected int volumen;
    protected float frecuencia;
    protected boolean amFm; //true am
    protected Reloj wacho; // Composición

    public RadioReloj() {
    }

    public RadioReloj(String marca, int volumen, float frecuencia, boolean amFm, Reloj wacho) {
        this.marca = marca;
        this.volumen = volumen;
        this.frecuencia = frecuencia;
        this.amFm = amFm;
        this.wacho = wacho;
    }

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public int getVolumen() {
        return volumen;
    }

    public void setVolumen(int volumen) {
        this.volumen = volumen;
    }

    public float getFrecuencia() {
        return frecuencia;
    }

    public void setFrecuencia(float frecuencia) {
        this.frecuencia = frecuencia;
    }

    public boolean isAmFm() {
        return amFm;
    }

    public void setAmFm(boolean amFm) {
        this.amFm = amFm;
    }

    public Reloj getWacho() {
        return wacho;
    }

    public void setWacho(Reloj wacho) {
        this.wacho = wacho;
    }

    @Override
    public String toString() {
        return "RadioReloj{" +
                "marca='" + marca + '\'' +
                ", volumen=" + volumen +
                ", frecuencia=" + frecuencia +
                ", amFm=" + amFm +
                ", wacho=" + wacho +
                '}';
    }

    public void encender(){
        System.out.println("Encendiendo el radio reloj.");
    }

    public void apagar(){
        System.out.println("Apgando el radio reloj.");
    }

    public void cambiarEstacion(float f){
        this.frecuencia = f;
    }

    static void main(String[] args) {
        RadioReloj rr= new RadioReloj();
        System.out.println(rr);
    }


}
