package FesAragon_POO.Trabajos_Actividades_Clase.Febrero.Clase_19_02_2026_ComputadoraCom.Componentes;

public class Teclado {
    private int numeroTeclas;
    private String marca;
    private String modelo;

    public Teclado() {
    }

    public Teclado(int numeroTeclas, String marca, String modelo) {
        this.numeroTeclas = numeroTeclas;
        this.marca = marca;
        this.modelo = modelo;
    }

    public int getNumeroTeclas() {
        return numeroTeclas;
    }

    public void setNumeroTeclas(int numeroTeclas) {
        this.numeroTeclas = numeroTeclas;
    }

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public String getModelo() {
        return modelo;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    @Override
    public String toString() {
        return "Componentes.Teclado{" +
                "numeroTeclas=" + numeroTeclas +
                ", marca='" + marca + '\'' +
                ", modelo='" + modelo + '\'' +
                '}';
    }


}
