package FesAragon_POO.Trabajos_Actividades_Clase.Mayo.Clase_14_05_2026_OtrosComponentesVista.Vista;

import javax.swing.*;
import javax.swing.filechooser.FileNameExtensionFilter;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

import static javax.swing.JColorChooser.showDialog;

public class VentanaDemos extends JFrame {
    private JPanel panelPrincipal;


    //radio buton
    private JRadioButton rdbBtnHombre;
    private JRadioButton rdbBtnMujer;
    private JRadioButton rdbBtnOtro;
    private ButtonGroup grupoSexo;
    private JButton btnRevisarRadio;


    // check box
    private JCheckBox chkTieneBeca;
    private JCheckBox chkAlumnoRegular;
    private JCheckBox chkAlumnoExtranjero;


    //Panel con titulo y componentes internos
    private JPanel panelTitulo;
    private JLabel lblNumeroCuenta;
    private JTextField txtNumeroCuenta;
    private JLabel lblNombre;
    private JTextField txtNombre;


    //JFleChooser
    private JButton btnAbrir;
    private JFileChooser jfc;
    private FileNameExtensionFilter filtroExtensiones;


    //JColorChooser
    private JButton btncolor;
    private JColorChooser jcc;


    //menus
    private JMenuBar menubar;
    private JMenu menuArchivo;
    private JMenu menuAcercaDe;

    private JMenuItem menuAbrirArchivo;
    private JMenuItem menuSalir;

    private JMenuItem menuAcercade;
    private JMenuItem menuAbrir;


    //JLable e imagenes
    private JLabel lblImagen;
    private ImageIcon imagen;
    private JButton btnImagen;


    public VentanaDemos() {
        super("Ventana Demos");
        setSize(800, 600);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        //setLayout(new FlowLayout());


        //crear componentes
        panelPrincipal = new JPanel();
        panelPrincipal.setLayout(new FlowLayout());
        panelPrincipal.setBackground(new Color(139, 232, 241));
        grupoSexo = new ButtonGroup();
        rdbBtnHombre = new JRadioButton("Hombre");
        rdbBtnMujer = new JRadioButton("Mujer");
        rdbBtnOtro = new JRadioButton("Otro");
        grupoSexo.add(rdbBtnHombre);
        grupoSexo.add(rdbBtnMujer);
        grupoSexo.add(rdbBtnOtro);
        btnRevisarRadio = new JButton("Revisar radio button");
        chkTieneBeca = new JCheckBox("Tiene beca");
        chkAlumnoRegular = new JCheckBox("Alumno regular");
        chkAlumnoExtranjero = new JCheckBox("Alumno extranjero");

        panelTitulo = new JPanel();
        panelTitulo.setLayout(new FlowLayout());
        panelTitulo.setBorder(
                BorderFactory.createTitledBorder("Formulario Demo del Alumno.")
        );
        panelTitulo.setBackground(new Color(139, 241, 147));
        panelTitulo.setPreferredSize(new Dimension(400, 100));

        lblNombre = new JLabel("Nombre:");
        txtNombre = new JTextField(20);
        lblNumeroCuenta = new JLabel("Numero de Cuenta:");
        txtNumeroCuenta = new JTextField(20);

        btnAbrir = new JButton("Abrir archivo");
        jfc = new JFileChooser();
        filtroExtensiones = new FileNameExtensionFilter("Archivos de Programasssss", "java", "py", "c");
        jfc.setFileFilter(filtroExtensiones);

        btncolor = new JButton("Color");
        jcc = new JColorChooser();
        btncolor = new JButton("Color");
        jcc = new JColorChooser();

        createMenu();

        lblImagen = new JLabel("...");
        imagen = new ImageIcon();



        //Agregar al panel
        panelPrincipal.add(rdbBtnHombre);
        panelPrincipal.add(rdbBtnMujer);
        panelPrincipal.add(rdbBtnOtro);
        panelPrincipal.add(chkTieneBeca);
        panelPrincipal.add(chkAlumnoRegular);
        panelPrincipal.add(chkAlumnoExtranjero);

        panelPrincipal.add(btnRevisarRadio);
        panelPrincipal.add(panelTitulo);

        panelTitulo.add(lblNombre);
        panelTitulo.add(txtNombre);
        panelTitulo.add(lblNumeroCuenta);
        panelTitulo.add(txtNumeroCuenta);
        panelPrincipal.add(btnAbrir);
        panelPrincipal.add(btncolor);
        panelPrincipal.add(jcc);

        //this.setMenuBar(menubar);


        //Agregar el panel al frame
        getContentPane().add(panelPrincipal);
        setVisible(true);


        btnRevisarRadio.addMouseListener(new MouseAdapter() {
            @Override
            public void mouseClicked(MouseEvent e){
                System.out.println("es hombre? " + rdbBtnHombre.isSelected());
                System.out.println("es mujer? " + rdbBtnMujer.isSelected());
                System.out.println("es otro? " + rdbBtnOtro.isSelected());

                System.out.println("---------------------------");

                System.out.println("Tiene beca? " + chkTieneBeca.isSelected());
                System.out.println("Alumno regular? " + chkAlumnoRegular.isSelected());
                System.out.println("Alumno extranjero? " + chkAlumnoExtranjero.isSelected());
            }
        });

        btnAbrir.addMouseListener(new MouseAdapter() {
            @Override
            public void mouseClicked(MouseEvent e){
                System.out.println("Abriendo archivo");

                int res = jfc.showOpenDialog(null);

                if (res == JFileChooser.APPROVE_OPTION) {
                    System.out.println("Archivo seleccionado: "+ jfc.getSelectedFile().getAbsolutePath());
                }else {
                    System.out.println("No seleccionado");
                }

            }
        });

        btncolor.addMouseListener(new MouseAdapter() {
            @Override
            public void mouseClicked(MouseEvent e){
                Color colorSeleccionado = showDialog(null, "Elige un color", Color.green);
                panelTitulo.setBackground(colorSeleccionado);
            }
        });

        menuSalir.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                System.out.println("Salir.");
                JOptionPane.showConfirmDialog(null,"Quieres cerrar?");
            }
        });

    }

    private void createMenu(){
        menubar = new JMenuBar();

        menuArchivo = new JMenu("Archivo");
        menuAbrirArchivo = new JMenuItem("Abrir");
        menuSalir = new JMenuItem("Salir");

        menuArchivo.add(menuAbrirArchivo);
        menuArchivo.add(menuSalir);
        menubar.add(menuArchivo);
    }
}