package FesAragon_POO.Trabajos_Actividades_Clase.Febrero.Clase_19_02_2026_ComputadoraCom.Componentes;

public class Procesador {
    private  String marca;
    private float velocidad;
    private String modelo;
    private int nuclos;

    public Procesador() {
    }

    public Procesador(String marca, float velocidad, String modelo, int nuclos) {
        this.marca = marca;
        this.velocidad = velocidad;
        this.modelo = modelo;
        this.nuclos = nuclos;
    }

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public float getVelocidad() {
        return velocidad;
    }

    public void setVelocidad(float velocidad) {
        this.velocidad = velocidad;
    }

    public String getModelo() {
        return modelo;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    public int getNuclos() {
        return nuclos;
    }

    public void setNuclos(int nuclos) {
        this.nuclos = nuclos;
    }

    @Override
    public String toString() {
        return "Componentes.Procesador{" +
                "marca='" + marca + '\'' +
                ", velocidad=" + velocidad +
                ", modelo='" + modelo + '\'' +
                ", nuclos=" + nuclos +
                '}';
    }

}
