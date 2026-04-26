package FesAragon_POO.Vista;

import FesAragon_POO.Vista.Eventos.EventosRaton;
import FesAragon_POO.Vista.Eventos.EventosVentana;

import java.awt.*;

public class MiVentana extends Frame {
    private Button boton1;
    private Button boton2;
    private Label label;
    private TextField entrada;
    private Label resultado;


    public MiVentana(){
        super("Mi ventana.");
        setSize(800, 600); //tamaño
        setLayout(new FlowLayout());

        label = new Label("Grados Celcius: ");

        boton1=new Button("Convierte a Far!");
        boton2=new Button("Hola!!");
        resultado = new Label("0, 0");
        add(boton1);
        add(boton2);
        add(label);
        add(entrada);
        add(resultado);

        addWindowListener(new EventosVentana());
        boton1.addMouseListener(new EventosRaton());

        addMouseListener(new EventosRaton());

        setVisible(true); // que sea visible

    }
}
