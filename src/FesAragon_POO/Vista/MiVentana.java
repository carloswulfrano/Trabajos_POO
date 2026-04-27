package FesAragon_POO.Vista;

import FesAragon_POO.Vista.Eventos.EventosRaton;
import FesAragon_POO.Vista.Eventos.EventosVentana;


import java.awt.*;

public class MiVentana extends Frame {
    private Button boton1;
    private Button boton2;
    private Label label;
    protected TextField entrada;
    protected Label resultado;


    public MiVentana(String title) throws HeadlessException {
        super(title);
        this.setSize(800, 600);//tamaño
        this.setLayout(new FlowLayout());

        label = new Label("Grados Celcius: ");
        boton1=new Button("Convierte a Far!");
        entrada = new TextField( 5);
        resultado = new Label("El resultado es:  ");
        this.add(boton1);
        this.add(label);
        this.add(entrada);
        this.add(resultado);
        boton1.addMouseListener(new EventosRaton(entrada, resultado) );

        addWindowListener(new EventosVentana());
        addMouseListener(new EventosRaton());

        this.setVisible(true); // que sea visible
    }
}
