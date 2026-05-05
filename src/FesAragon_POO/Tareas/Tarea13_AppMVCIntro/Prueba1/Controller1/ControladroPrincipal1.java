package FesAragon_POO.Tareas.Tarea13_AppMVCIntro.Prueba1.Controller1;

import FesAragon_POO.Tareas.Tarea13_AppMVCIntro.Prueba1.View1.VentanaPrincipal1;

import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;

public class ControladroPrincipal1 implements MouseListener {
    private VentanaPrincipal1 view1;


    public ControladroPrincipal1(VentanaPrincipal1 view) {
        this.view1 = view;
        this.view1.getBtnSaludar().addMouseListener(this);
        this.view1.getLblNombre().addMouseListener(this);
    }


    @Override
    public void mouseClicked(MouseEvent e) {

        if (e.getSource() == this.view1.getBtnSaludar()) {
            System.out.println("Hola desde Ecateyork!!");
            System.out.println("Hola desde Mi-nezota.");
            this.view1.getLblSalida().setText("Hola " + this.view1.getTxtNombre().getText());
        }

        if (e.getSource() == this.view1.getLblNombre()){
            System.out.println("Hola desde desde lblNombre!!!");
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
