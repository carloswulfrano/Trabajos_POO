package FesAragon_POO.Tareas.Tarea11_calculadoraIMC;

import FesAragon_POO.Tareas.Tarea10_LayoutsAWT.EventosT.EventosVentanaT;
import FesAragon_POO.Tareas.Tarea11_calculadoraIMC.EventosT.EventosRatonIMC;
import FesAragon_POO.Tareas.Tarea11_calculadoraIMC.EventosT.EventosVentanaIMC;

import java.awt.*;
import java.awt.event.*;

public class CalculadoraIMC extends Frame {

    private Button botonCalcular;
    private Label labelPeso;
    private Label labelAltura;
    private TextField campoPeso;
    private TextField campoAltura;
    private Label resultado;

    public CalculadoraIMC(String title) throws HeadlessException {
        super(title);
        this.setSize(1000, 800);
        this.setLayout(new FlowLayout());

        // Crear componentes
        labelPeso = new Label("Peso (kg): ");
        labelAltura = new Label("Altura (m): ");
        campoPeso = new TextField(10);
        campoAltura = new TextField(10);
        botonCalcular = new Button("Calcular IMC");
        resultado = new Label("Resultado: ");

        // Agregar componentes a la ventana
        this.add(labelPeso);
        this.add(campoPeso);
        this.add(labelAltura);
        this.add(campoAltura);
        this.add(botonCalcular);
        this.add(resultado);

        // Agregar eventos
        botonCalcular.addMouseListener(new EventosRatonIMC(campoPeso, campoAltura, resultado));
        addWindowListener(new EventosVentanaIMC());

        this.setVisible(true);
    }
}
