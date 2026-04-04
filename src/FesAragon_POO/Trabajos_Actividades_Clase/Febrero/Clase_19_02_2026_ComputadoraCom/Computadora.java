package FesAragon_POO.Trabajos_Actividades_Clase.Febrero.Clase_19_02_2026_ComputadoraCom;


import FesAragon_POO.Trabajos_Actividades_Clase.Febrero.Clase_19_02_2026_ComputadoraCom.Componentes.Procesador;
import FesAragon_POO.Trabajos_Actividades_Clase.Febrero.Clase_19_02_2026_ComputadoraCom.Componentes.Teclado;

public class Computadora {
    private String marca;
    private String modelo;

    //Composicion
    private Teclado keyBoard;
    private Procesador processor;

    public Computadora() {
    }

    public Computadora(String marca, String modelo, Teclado keyBoard, Procesador processor) {
        this.marca = marca;
        this.modelo = modelo;
        this.keyBoard = keyBoard;
        this.processor = processor;
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

    public Teclado getKeyBoard() {
        return keyBoard;
    }

    public void setKeyBoard(Teclado keyBoard) {
        this.keyBoard = keyBoard;
    }

    public Procesador getProcessor() {
        return processor;
    }

    public void setProcessor(Procesador processor) {
        this.processor = processor;
    }

    @Override
    public String toString() {
        return "Computadora{" +
                "marca='" + marca + '\'' +
                ", modelo='" + modelo + '\'' +
                ", keyBoard=" + keyBoard +
                ", processor=" + processor +
                '}';
    }


}
