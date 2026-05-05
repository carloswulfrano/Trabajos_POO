package FesAragon_POO.Tareas.Tarea13_AppMVCIntro.Prueba3.Controller3;

import FesAragon_POO.Tareas.Tarea13_AppMVCIntro.Prueba3.View3.VentanaPrincipal3;

import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;

public class ControladorPrincipal3 implements MouseListener {
    VentanaPrincipal3 ventana3;

    public ControladorPrincipal3(VentanaPrincipal3 ventana) {
        this.ventana3 = ventana;
        this.ventana3.getBtnSaludar().addMouseListener(this);
        this.ventana3.getLblNombre().addMouseListener(this);
    }

    @Override
    public void mouseClicked(MouseEvent e) {

        if (e.getSource() == this.ventana3.getBtnSaludar()) {
            System.out.println("Hola desde Coacalco");
            this.ventana3.getLblSalida().setText("Hola " + this.ventana3.getTxtNombre().getText());
        }

        if (e.getSource() == this.ventana3.getLblNombre()){
            System.out.println("Hola desde la etiqueta de nombre.");
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
