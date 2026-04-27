package FesAragon_POO.Tareas.Tarea10_LayoutsAWT.EventosT;

import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;

public class EventosRatonT implements MouseListener {

    @Override
    public void mouseClicked(MouseEvent e) {
        System.out.println("CoordenadaS: " + e.getX() + " " + e.getY() + " ");
        System.out.println("Apachurrado.");

    }

    @Override
    public void mousePressed(MouseEvent e) {

    }

    @Override
    public void mouseReleased(MouseEvent e) {

    }

    @Override
    public void mouseEntered(MouseEvent e) {

    }

    @Override
    public void mouseExited(MouseEvent e) {

    }
}
