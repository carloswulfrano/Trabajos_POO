package FesAragon_POO.Trabajos_Actividades_Clase.Febrero.Clase_24_02_2026_TelevisorCompo.Componentes;

public class Pantalla {

    private String tamanho;
    private boolean encendida;


    public Pantalla() {
    }


    public Pantalla(boolean encender, String tamanho) {
        this.encendida = encender;
        this.tamanho = tamanho;
    }


    public String getTamanho() {
        return tamanho;
    }

    public void setTamanho(String tamanho) {
        this.tamanho = tamanho;
    }

    public boolean isEncendida() {
        return encendida;
    }

    public void setEncendida(boolean encendida) {
        this.encendida = encendida;
    }


    @Override
    public String toString() {
        return "Pantalla{" +
                "tamanho='" + tamanho + '\'' +
                ", encender=" + encendida +
                '}';
    }


    public boolean encender(){
        this.encendida=true;
        return this.encendida;
    }

    public boolean apagar(){
        this.encendida=false;
        return this.encendida;
    }
}
