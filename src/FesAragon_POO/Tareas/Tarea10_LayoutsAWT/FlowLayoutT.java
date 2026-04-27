package FesAragon_POO.Tareas.Tarea10_LayoutsAWT;

import FesAragon_POO.Tareas.Tarea10_LayoutsAWT.EventosT.EventosRatonT;
import FesAragon_POO.Tareas.Tarea10_LayoutsAWT.EventosT.EventosVentanaT;
import FesAragon_POO.Vista.Eventos.EventosRaton;
import FesAragon_POO.Vista.Eventos.EventosVentana;

import java.awt.*;

public class FlowLayoutT extends Frame {
    Button btn = new Button("Botón 1");
    Button btn2 = new Button("Botón 2");
    Button btn3 = new Button("Botón 3");
    Button btn4 = new Button("Botón 4");
    Button btn5 = new Button("Botón 5");

    public FlowLayoutT() {
        super("Ventana con FlowLayout");
        setSize(1000, 800);
        setResizable(false);
        setLayout(new FlowLayout());

        // FlowLayout por defecto centra los componentes horizontalmente
        // y los coloca en filas según el ancho de la ventana

        add(btn);
        add(btn2);
        add(btn3);
        add(btn4);
        add(btn5);

        this.setVisible(true);

        addWindowListener(new EventosVentanaT());
        addMouseListener(new EventosRatonT());
    }
}
