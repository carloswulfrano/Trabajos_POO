package FesAragon_POO.Tareas.Tarea13_AppMVCIntro.Prueba1.View1;

import javax.swing.*;
import java.awt.*;

public class VentanaPrincipal1 extends JFrame {
    private JPanel pnlpanel1;
    private JPanel pnlPanel2;
    private JLabel lblNombre;
    private JTextField txtNombre;
    private JButton btnSaludar;
    private JLabel lblSalida;

    public VentanaPrincipal1() {

        super("Ejemplo 1 - MVC - TAREA 13,");
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLayout(new GridLayout(2,1));


        //Declarar los paneles
        pnlpanel1 = new JPanel();
        pnlPanel2 = new JPanel();


        //Declarar los componentes
        lblNombre = new JLabel("Escribe un Nombre: ");
        txtNombre = new JTextField(20);
        btnSaludar = new JButton("Saludar!!!");
        lblSalida = new JLabel("Esperando nombre...");

        //Decorar xd
        pnlpanel1.setBackground(new Color(232, 205, 137));
        pnlPanel2.setBackground(new Color(246, 141, 108));

        lblNombre.setForeground(new Color(246, 96, 69));

        txtNombre.setBackground(new Color(234, 164, 107));
        txtNombre.setForeground(new Color(236, 79, 59));

        btnSaludar.setBackground(new Color(244, 176, 125));
        btnSaludar.setForeground(new Color(236, 79, 59));

        lblSalida.setForeground(new Color(246, 90, 64));


        //Agregar los componentes al panel 1
        pnlpanel1.add(lblNombre);
        pnlpanel1.add(txtNombre);
        pnlpanel1.add(btnSaludar);
        pnlpanel1.add(lblSalida);


        //Agregar los paneles 1 y 2 al frame
        this.getContentPane().add(pnlpanel1 ,0);
        this.getContentPane().add(pnlPanel2 ,1);


        setSize(800, 600);
        setVisible(true);
    }

    public JPanel getPnlpanel1() {
        return pnlpanel1;
    }

    public void setPnlpanel1(JPanel pnlpanel1) {
        this.pnlpanel1 = pnlpanel1;
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
