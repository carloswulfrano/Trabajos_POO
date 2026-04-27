package FesAragon_POO.Tareas.Tarea10_LayoutsAWT;

import FesAragon_POO.Tareas.Tarea10_LayoutsAWT.EventosT.EventosRatonT;
import FesAragon_POO.Tareas.Tarea10_LayoutsAWT.EventosT.EventosVentanaT;

import java.awt.*;

public class GridLayoutT extends Frame {
    Button btn = new Button("Presioname");
    Button btn2 = new Button("En segundo lugar a este");
    Button btn3 = new Button("Despues a este");
    Button btn4 = new Button("Por ultimo este");

    public GridLayoutT(){
        super("Ventana con eventos");
        setSize(1000, 800);
        setResizable(false);
        setLayout(new GridLayout(3, 2));

        add(btn, 0);
        add(btn2, 1);
        add(btn3, 2);
        add(btn4, 3);

        this.setVisible(true); // que sea visible

        addWindowListener(new EventosVentanaT());
        addMouseListener(new EventosRatonT());
    }
}
