package FesAragon_POO.Trabajos_Actividades_Clase.Abril.Clase_28_04_2026_SWING.DemoSwing;

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class VentanaSwing extends JFrame {
    private JLabel etiqueta;
    private JTextField entrada;
    private JButton boton;

    public VentanaSwing(){
        super("Mi primera ventana Swing.");

        getContentPane().setLayout(new GridLayout(3, 3));

        etiqueta = new JLabel("Dame un numero: ");
        entrada = new JTextField(10);
        boton = new JButton("Enviar");


        boton.setForeground(new Color(54, 135, 13));
        boton.setBackground(new Color(149, 211, 49));

        etiqueta.setForeground(new Color(95, 216, 104));
        etiqueta.setBackground(new Color(120, 210, 199));

        entrada.setForeground(new Color(22, 96, 7));
        entrada.setBackground(new Color(163, 223, 69));


        getContentPane().add(etiqueta, 0);
        getContentPane().add(entrada, 1);
        getContentPane().add(boton, 2);

        getContentPane().repaint();
        this.pack();

        setSize(600, 400);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setVisible(true);

        boton.addMouseListener(new MouseAdapter() {
            @Override
            public void mouseClicked(MouseEvent e) {
                double entradaCelcius = Double.parseDouble(entrada.getText());
                double gradosFarenheint = (entradaCelcius * 9 / 5) +32;
                JOptionPane.showMessageDialog(null, "En Farenheint es: " + gradosFarenheint);
            }
        });

        entrada.addMouseListener(new MouseAdapter() {
            @Override
            public void mouseClicked(MouseEvent e) {
                System.out.println("Hola desde el click al cuadro de diagolo");
            }
        });

        entrada.addKeyListener(new KeyAdapter() {
            @Override
            public void keyTyped(KeyEvent e) {
                System.out.println("Holaa desde el KeyTyped al caudro de entrada.");
                System.out.println(e.getKeyChar());
                System.out.println("Código de tecla: " + e.getKeyCode());
            }
        });

    }
}
