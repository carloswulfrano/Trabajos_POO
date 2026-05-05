package FesAragon_POO.Tareas.Tarea13_AppMVCIntro.Prueba5.View5;

import javax.swing.*;
import java.awt.*;

public class VentanaPrincipal5 extends JFrame {
    private JPanel pnlPanel1;
    private JPanel pnlPanel2;
    private JLabel lblNombre;
    private JTextField txtNombre;
    private JButton btnSaludar;
    private JLabel lblSalida;


    public VentanaPrincipal5() {
        super("Ejemplo 5 - MVC - TAREA 13.");
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLayout(new GridLayout(2,1));


        pnlPanel1 = new JPanel();
        pnlPanel2 = new JPanel();

        lblNombre = new JLabel("Ingresa un nombre: ");
        txtNombre = new JTextField(20);
        btnSaludar = new JButton("Saludar!!!");
        lblSalida = new JLabel("Esperando un nombre...");

        pnlPanel1.setBackground(new Color(174, 250, 137));
        pnlPanel2.setBackground(new Color(84, 236, 11));
        txtNombre.setBackground(new Color(84, 236, 11));
        btnSaludar.setBackground(new Color(84, 236, 11));
        lblNombre.setForeground(new Color(27, 76, 2));
        txtNombre.setForeground(new Color(27, 76, 2));
        btnSaludar.setForeground(new Color(27, 76, 2));
        lblSalida.setForeground(new Color(27, 76, 2));

        pnlPanel1.add(lblNombre);
        pnlPanel1.add(txtNombre);
        pnlPanel1.add(btnSaludar);
        pnlPanel1.add(lblSalida);

        this.getContentPane().add(pnlPanel1, 0);
        this.getContentPane().add(pnlPanel2, 1);


        setSize(800, 600);
        setVisible(true);
    }


    public JPanel getPnlPanel1() {
        return pnlPanel1;
    }

    public void setPnlPanel1(JPanel pnlPanel1) {
        this.pnlPanel1 = pnlPanel1;
    }

    public JPanel getPnlPanel2() {
        return pnlPanel2;
    }

    public void setPnlPanel2(JPanel pnlPanel2) {
        this.pnlPanel2 = pnlPanel2;
    }

    public JLabel getLblNombre() {
        return lblNombre;
    }

    public void setLblNombre(JLabel lblNombre) {
        this.lblNombre = lblNombre;
    }

    public JTextField getTxtNombre() {
        return txtNombre;
    }

    public void setTxtNombre(JTextField txtNombre) {
        this.txtNombre = txtNombre;
    }

    public JButton getBtnSaludar() {
        return btnSaludar;
    }

    public void setBtnSaludar(JButton btnSaludar) {
        this.btnSaludar = btnSaludar;
    }

    public JLabel getLblSalida() {
        return lblSalida;
    }

    public void setLblSalida(JLabel lblSalida) {
        this.lblSalida = lblSalida;
    }
}
