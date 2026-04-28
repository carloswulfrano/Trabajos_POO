package FesAragon_POO.Trabajos_Actividades_Clase.Abril.Clase_28_04_2026_Ejemplo2GUI;

import java.awt.*;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;

public class VentanaDemo extends Frame {
    private Label etiqueta;
    private TextField entrada;
    private Button boton;
    private Label salida;

    public VentanaDemo(){
        super ("Mi ventana");
        etiqueta = new Label("Ingrese un nombre");
        entrada = new TextField(20);
        boton = new Button("Saludar");
        salida = new Label(" ");

        this.add(etiqueta);
        this.add(entrada);
        this.add(boton);
        this.add(salida);

        setSize(800,600);
        setLayout(new FlowLayout());
        this.addWindowListener(new WindowAdapter() {
            @Override
            public void windowClosing(WindowEvent e) {
                System.exit(0);
            }
        });

        boton.addMouseListener(new MouseAdapter() {
            @Override
            public void mouseClicked(MouseEvent e) {
                salida.setText("Hola " + entrada.getText());
                pack();
            }
        });

        setVisible(true);

    }
}
