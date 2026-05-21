package FesAragon_POO.Trabajos_Actividades_Clase.Mayo.Clase_07_05_2026_Manejo_Archivos.Vista;

import javax.swing.*;
import java.awt.*;

public class VentanaAlumnos extends JFrame {
    private JPanel panel1;
    private JPanel panel2;
    private JLabel  lblNumeroCuenta;
    private JTextField txtNumeroCuenta;
    private JLabel  lblNombre;
    private JTextField txtNombre;
    private JLabel  lblApellido;
    private JTextField txtApellido;
    private JLabel lblPromedio;
    private JTextField txtPromedio;
    private JButton btnAgregar;

    private JScrollPane scrollPane;
    private JTable tablaAlumnos;
    private JButton btnGuardar;
    private JButton btnLeerArchivo;


    public VentanaAlumnos() {
        //Configuracion ventana
        super("Demo Swing MVC con alumnos");
        this.getContentPane().setLayout(new GridLayout(2 ,1));

        //creacion de componentes
        panel1 = new JPanel();
        panel2 = new JPanel();
        panel1.setLayout(new FlowLayout(FlowLayout.LEFT));
        panel2.setLayout(new FlowLayout(FlowLayout.CENTER));
        panel1.setBackground(new Color(142, 233, 241));
        panel2.setBackground(new Color(235, 138, 246));


        lblNumeroCuenta = new JLabel("Numero de cuenta:");
        txtNumeroCuenta = new JTextField(10);
        lblNombre = new JLabel("Nombre:");
        txtNombre = new JTextField(10);
        lblApellido = new JLabel("Apellido:");
        txtApellido = new JTextField(10);
        lblPromedio = new JLabel("Promedio:");
        txtPromedio = new JTextField(10);
        btnAgregar = new JButton("Agregar");
        tablaAlumnos = new JTable();
        scrollPane = new JScrollPane(tablaAlumnos);

        btnGuardar = new JButton("Guardar");
        btnLeerArchivo = new JButton("leer Archivo");

        //agregar los componentes a los paneles
        panel1.add(lblNumeroCuenta);
        panel1.add(txtNumeroCuenta);
        panel1.add(lblNombre);
        panel1.add(txtNombre);
        panel1.add(lblApellido);
        panel1.add(txtApellido);
        panel1.add(lblPromedio);
        panel1.add(txtPromedio);
        panel1.add(btnAgregar);

        panel2.add(scrollPane);
        panel2.add(btnGuardar);
        panel2.add(btnLeerArchivo);

        //agregar componentes a la ventana
        this.getContentPane().add(panel1);
        this.getContentPane().add(panel2);




        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setSize(600, 800);
        setVisible(true);
    }


    public JPanel getPanel1() {
        return panel1;
    }

    public void setPanel1(JPanel panel1) {
        this.panel1 = panel1;
    }

    public JPanel getPanel2() {
        return panel2;
    }

    public void setPanel2(JPanel panel2) {
        this.panel2 = panel2;
    }

    public JLabel getLblNumeroCuenta() {
        return lblNumeroCuenta;
    }

    public void setLblNumeroCuenta(JLabel lblNumeroCuenta) {
        this.lblNumeroCuenta = lblNumeroCuenta;
    }

    public JTextField getTxtNumeroCuenta() {
        return txtNumeroCuenta;
    }

    public void setTxtNumeroCuenta(JTextField txtNumeroCuenta) {
        this.txtNumeroCuenta = txtNumeroCuenta;
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

    public JLabel getLblApellido() {
        return lblApellido;
    }

    public void setLblApellido(JLabel lblApellido) {
        this.lblApellido = lblApellido;
    }

    public JTextField getTxtApellido() {
        return txtApellido;
    }

    public void setTxtApellido(JTextField txtApellido) {
        this.txtApellido = txtApellido;
    }

    public JLabel getLblPromedio() {
        return lblPromedio;
    }

    public void setLblPromedio(JLabel lblPromedio) {
        this.lblPromedio = lblPromedio;
    }

    public JTextField getTxtPromedio() {
        return txtPromedio;
    }

    public void setTxtPromedio(JTextField txtPromedio) {
        this.txtPromedio = txtPromedio;
    }

    public JButton getBtnAgregar() {
        return btnAgregar;
    }

    public void setBtnAgregar(JButton btnAgregar) {
        this.btnAgregar = btnAgregar;
    }

    public JScrollPane getScrollPane() {
        return scrollPane;
    }

    public void setScrollPane(JScrollPane scrollPane) {
        this.scrollPane = scrollPane;
    }

    public JTable getTablaAlumnos() {
        return tablaAlumnos;
    }

    public void setTablaAlumnos(JTable tablaAlumnos) {
        this.tablaAlumnos = tablaAlumnos;
    }

    public JButton getBtnGuardar() {
        return btnGuardar;
    }

    public void setBtnGuardar(JButton btnGuardar) {
        this.btnGuardar = btnGuardar;
    }

    public JButton getBtnLeerArchivo() {
        return btnLeerArchivo;
    }

    public void setBtnLeerArchivo(JButton btnLeerArchivo) {
        this.btnLeerArchivo = btnLeerArchivo;
    }
}
