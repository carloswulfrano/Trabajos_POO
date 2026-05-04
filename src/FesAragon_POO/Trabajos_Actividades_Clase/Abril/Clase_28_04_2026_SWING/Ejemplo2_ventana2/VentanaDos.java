package FesAragon_POO.Trabajos_Actividades_Clase.Abril.Clase_28_04_2026_SWING.Ejemplo2_ventana2;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ItemEvent;
import java.awt.event.ItemListener;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.util.ArrayList;

public class VentanaDos extends JFrame {
    private GridLayout layout;
    private JPanel panel1;
    private JPanel panel2;
    private JPanel panel3;
    private JPanel panel4;
    private JLabel etiqueta;
    private JButton boton;
    private JComboBox<String> combo;
    private JTextField txtEntrada;

    public VentanaDos(){
        super("Mi segunda ventana Swing.");
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        layout = new GridLayout(2,2);
        getContentPane().setLayout(layout);

        panel1 = new JPanel();
        panel2 = new JPanel();
        panel3 = new JPanel();
        panel4 = new JPanel();
        etiqueta = new JLabel("Soy un Label: ");
        boton = new JButton("Soy un boton.");
        combo = new JComboBox<>();
        txtEntrada = new JTextField(20);

        ArrayList<String> nombres = new ArrayList<>();
        nombres.add("Juan");
        nombres.add("Maria");
        nombres.add("Pedro");
        nombres.add("Jesus");
        nombres.add("Ana");

        //ModeloComboNombres modelo = new ModeloComboNombres(nombres);
        ModeloDefaultComboNombre modelo = new ModeloDefaultComboNombre(nombres);
        combo.setModel(modelo);

        panel1.setBackground(new Color(108, 220, 207));
        panel2.setBackground(new Color(251, 159, 183));
        panel3.setBackground(new Color(190, 173, 239));
        panel4.setBackground(new Color(191, 244, 146));

        panel1.add(etiqueta);
        panel2.add(txtEntrada);
        panel2.add(boton);
        panel3.add(combo);

        boton.addMouseListener(new MouseAdapter() {
            @Override
            public void mouseClicked(MouseEvent e) {
                modelo.addElement(txtEntrada.getText());
            }
        });

        combo.addItemListener(new ItemListener() {
            @Override
            public void itemStateChanged(ItemEvent e) {
                System.out.println("Se cambio combo: " + e.getItem());
                System.out.println("Solo el final: " + combo.getSelectedItem());
            }
        });

        getContentPane().add(panel1, 0);
        getContentPane().add(panel2, 1);
        getContentPane().add(panel3, 2);
        getContentPane().add(panel4, 3);

        setSize(800, 600);
        setVisible(true);

    }

}
