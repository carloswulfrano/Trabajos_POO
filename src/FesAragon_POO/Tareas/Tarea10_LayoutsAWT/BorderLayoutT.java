package FesAragon_POO.Tareas.Tarea10_LayoutsAWT;

import FesAragon_POO.Tareas.Tarea10_LayoutsAWT.EventosT.EventosRatonT;
import FesAragon_POO.Tareas.Tarea10_LayoutsAWT.EventosT.EventosVentanaT;

import java.awt.*;

public class BorderLayoutT extends Frame {
    Button btn = new Button("NORTE");
    Button btn2 = new Button("SUR");
    Button btn3 = new Button("ESTE");
    Button btn4 = new Button("OESTE");

    public BorderLayoutT(){
        super("Ventana con eventos.");
        setSize(1000, 800);
        setResizable(false);
        setLayout(new BorderLayout());

        add("North", btn);
        add("South", btn2);
        add("West", btn3);
        add("East", btn4);

        this.setVisible(true); // que sea visible

        addWindowListener(new EventosVentanaT());
        addMouseListener(new EventosRatonT());
    }
}
