package FesAragon_POO.Tareas.Tarea13_AppMVCIntro.Prueba5.Controller5;

import FesAragon_POO.Tareas.Tarea13_AppMVCIntro.Prueba5.View5.VentanaPrincipal5;

import java.awt.event.ActionListener;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;

public class ControladorPrincipal5 implements MouseListener{

    private VentanaPrincipal5 ventana5;

    public ControladorPrincipal5(VentanaPrincipal5 ventana){
        this.ventana5 = ventana;
        this.ventana5.getBtnSaludar().addMouseListener(this);
        this.ventana5.getLblNombre().addMouseListener(this);
    }

    @Override
    public void mouseClicked(MouseEvent e) {

        if(e.getSource() == this.ventana5.getBtnSaludar()){
            System.out.println("Hola desde Atizayork!!!");
            this.ventana5.getLblSalida().setText("Hola " + this.ventana5.getTxtNombre().getText());
        }

        if (e.getSource() == this.ventana5.getLblNombre()){
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
