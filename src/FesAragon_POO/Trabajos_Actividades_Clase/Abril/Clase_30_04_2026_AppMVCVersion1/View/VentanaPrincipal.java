package FesAragon_POO.Trabajos_Actividades_Clase.Abril.Clase_30_04_2026_AppMVCVersion1.View;

import javax.swing.*;
import java.awt.*;

public class VentanaPrincipal extends JFrame {
    private JPanel pnlPanel1;
    private JPanel pnlPanel2;
    private JLabel lblNombre;
    private JTextField txtNombre;
    private JButton btnSaludar;
    private JLabel lblSalida;

    public VentanaPrincipal() {

        super("DEMO MVC Intro.");
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLayout(new GridLayout(2, 1));


        //Declarar los paneles
        pnlPanel1 = new JPanel();
        pnlPanel1.setBackground(new Color(168, 236, 128));
        pnlPanel2 = new JPanel();
        pnlPanel2.setBackground(new Color(128, 236, 232));


        //Declarar los componentes
        lblNombre = new JLabel("Escribe tu Nombre: ");
        txtNombre = new JTextField(20);
        btnSaludar = new JButton("Saludar.");
        lblSalida = new JLabel("...");


        //Agregar los componnetes al panel 1
        pnlPanel1.add(lblNombre);
        pnlPanel1.add(txtNombre);
        pnlPanel1.add(btnSaludar);
        pnlPanel1.add(lblSalida);


        //Agregar el panel 1 y 2 al frame
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
