package FesAragon_POO.Tareas.Tarea13_AppMVCIntro.Prueba4.Controller4;

import FesAragon_POO.Tareas.Tarea13_AppMVCIntro.Prueba4.View4.VentanaPrincipal4;

import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;

public class ControladorPrincipal4 implements MouseListener {

    private VentanaPrincipal4 ventana4;

    public ControladorPrincipal4(VentanaPrincipal4 ventana) {
        this.ventana4 = ventana;
        this.ventana4.getBtnSaludar().addMouseListener(this);
        this.ventana4.getLblNombre().addMouseListener(this);
    }

    @Override
    public void mouseClicked(MouseEvent e) {
        if (e.getSource() == this.ventana4.getBtnSaludar()){
            System.out.println("Hola desde Ixtapaluca.");
            this.ventana4.getLblSalida().setText("Hola " +  this.ventana4.getTxtNombre().getText());
        }

        if (e.getSource() == this.ventana4.getLblNombre()){
            System.out.println("Hola desde la etiqueta de Nombre!!!");
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
