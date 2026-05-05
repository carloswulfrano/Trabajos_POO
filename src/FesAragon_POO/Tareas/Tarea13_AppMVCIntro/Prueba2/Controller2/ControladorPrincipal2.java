package FesAragon_POO.Tareas.Tarea13_AppMVCIntro.Prueba2.Controller2;

import FesAragon_POO.Tareas.Tarea13_AppMVCIntro.Prueba2.View2.VentanaPrincipal2;

import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;

public class ControladorPrincipal2 implements MouseListener {

    private VentanaPrincipal2 view2;

    public ControladorPrincipal2(VentanaPrincipal2 view) {
        this.view2 = view;
        this.view2.getBtnSaludar().addMouseListener(this);
        this.view2.getLblNombre().addMouseListener(this);
    }

    @Override
    public void mouseClicked(MouseEvent e) {

        if (e.getSource() == this.view2.getBtnSaludar()) {
            System.out.println("Hola desde Tecamacyork!!");
            this.view2.getLblSalida().setText("Hola " + this.view2.getTxtNombre().getText());
        }

        if (e.getSource() == this.view2.getLblNombre()) {
            System.out.println("Hola desde la etiqueta de nombre!!");
        }
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
