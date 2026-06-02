package FesAragon_POO.Proyecto_Final.View;

import FesAragon_POO.Proyecto_Final.Model.Album;
import FesAragon_POO.Proyecto_Final.Model.ModeloComboBoxGeneros;
import FesAragon_POO.Proyecto_Final.Model.RelojSwing;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

import javax.swing.*;
import javax.swing.filechooser.FileNameExtensionFilter;
import java.awt.*;
import java.util.ArrayList;

@AllArgsConstructor
@Getter
@Setter
@ToString

public class VentanaPrincipalProyecto extends JFrame {

    //JPanel
    private JPanel pnlPanel1;
    private JPanel pnlPanel2;
    private JPanel pnlPanel3;

    //JLabel
    private JLabel lblNombreAlbum;
    private JLabel lblNombreBandaCantante;
    private JLabel lblNumeroCanciones;
    private JLabel lblGenero;
    private JLabel lblRutaImagen;
    private JLabel lblDescripcion;
    private JLabel lblFormato;

    //JTexteFile
    private JTextField txtNombreAlbum;
    private JTextField txtNombreBandaCantante;
    private JTextField txtNumeroCanciones;

    //JButton
    private JButton btnAgregarAlbum;
    private JButton btnCancelar;
    private JButton btnModificar;
    private JButton btnEliminar;
    private JButton btnSeleccionarImagen;
    private JButton btnColorPanel1;
    private JButton btnColorPanel2;
    private JButton btnColorPanel3;

    //JTextArea
    private JTextArea txtDescripcion;
    private JScrollPane scrollDes;


    //JComboBox
    private JComboBox<String> genero;

    //JTable
    JScrollPane scrollPane;
    JTable tblAlbum;

    //JMenuBar
    private JMenuBar mnBar;

    //JMenu
    private JMenu menuArchivo;

    //JMenuItem
    private JMenuItem mniGuardar;
    private JMenuItem mniCargar;
    private JMenuItem mniSalir;

    //JRadioButton
    private ButtonGroup grupoFormato;
    private JRadioButton rbFisico;
    private JRadioButton rbDigital;
    private JRadioButton rbAmbos;


    //JCheckBox
    private JCheckBox chkExplicit;
    private JCheckBox chkEdicionLimitada;


    //JFileChooser
    private JFileChooser fileChooser;

    //Componentes del panel 3, mostrar información
    private JLabel lblDetNombreAlbum;
    private JLabel lblDetNombreBandaCantante;
    private JLabel lblDetGenero;
    private JLabel lblDetNumeroCanciones;
    private JLabel lblDetFormato;
    private JLabel lblDetExplicit;
    private JLabel lblDetEdicionLimitada;
    private JLabel lblDetImagen;
    private JTextArea txtDetDescripcion;
    private JScrollPane scrollDet;

    //Reloj
    private JLabel lblReloj;


    public VentanaPrincipalProyecto(){
        super("Proyecto Final - Registro de Albums.");
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLayout(new GridLayout(3, 1));


        //Declaracion de los paneles
        pnlPanel1 = new JPanel();
        pnlPanel2 = new JPanel();
        pnlPanel3 = new JPanel();


        //Declarar los componentes
        lblNombreAlbum = new JLabel("Nombre Album: ");
        txtNombreAlbum = new JTextField(40);
        lblNombreBandaCantante = new JLabel("Nombre de la Banda o Canante: ");
        txtNombreBandaCantante = new JTextField(40);
        lblNumeroCanciones = new JLabel("Numero de Canciones: ");
        txtNumeroCanciones = new JTextField(4);
        btnAgregarAlbum = new JButton("Agregar Album.");
        btnCancelar = new JButton("Cancelar.");
        btnModificar = new JButton("Modificar Album.");
        btnEliminar = new JButton("Eliminar Album.");
        genero = new JComboBox<>();
        lblGenero = new JLabel("Elige el género del album: ");
        lblDescripcion = new JLabel("Descripcion: ");
        lblFormato = new JLabel("Formato: ");

        scrollPane = new JScrollPane();
        tblAlbum = new JTable();
        scrollPane.setPreferredSize(new Dimension(600, 240));
        scrollPane.setViewportView(tblAlbum);

        txtDescripcion = new JTextArea(3, 30);
        scrollDes = new JScrollPane(txtDescripcion);
        txtDescripcion.setLineWrap(true);

        rbFisico = new JRadioButton("Fisico", true);
        rbDigital = new JRadioButton("Digital");
        rbAmbos = new JRadioButton("Ambos");
        grupoFormato = new ButtonGroup();
        grupoFormato.add(rbFisico);
        grupoFormato.add(rbDigital);
        grupoFormato.add(rbAmbos);

        chkExplicit = new JCheckBox("Es Explicito.");
        chkEdicionLimitada = new JCheckBox("Edicion Limitada.");

        fileChooser = new JFileChooser();
        fileChooser.setFileFilter(new FileNameExtensionFilter("Imágenes (JPG o PNG)", "jpg", "png", "jpeg"));
        fileChooser.setAcceptAllFileFilterUsed(false);
        btnSeleccionarImagen = new JButton("Seleccionar imagen.");
        lblRutaImagen = new JLabel("Sin imagen.");

        btnColorPanel1 = new JButton("Color panel 1.");
        btnColorPanel2 = new JButton("Color panel 2.");
        btnColorPanel3 = new JButton("Color panel 3.");

        mnBar = new JMenuBar();
        menuArchivo = new JMenu("Archivo");
        mniGuardar = new JMenuItem("Guardar Registro.");
        mniCargar = new JMenuItem("Cargar Registro.");
        mniSalir = new JMenuItem("Salir.");
        menuArchivo.add(mniGuardar);
        menuArchivo.add(mniCargar);
        menuArchivo.add(mniSalir);
        mnBar.add(menuArchivo);
        setJMenuBar(mnBar);

        lblDetNombreAlbum = new JLabel("Album: ");
        lblDetNombreBandaCantante = new JLabel("Banda/Canante: ");
        lblDetGenero = new JLabel("Genero: ");
        lblDetNumeroCanciones = new JLabel("Numero de Canciones: ");
        lblDetFormato = new JLabel("Formato: ");
        lblDetExplicit = new JLabel("Es explicito: ");
        lblDetEdicionLimitada = new JLabel("Ed. Limitada: ");
        lblDetImagen = new JLabel("Sin imagen.");
        txtDetDescripcion = new JTextArea(3, 30);
        txtDetDescripcion.setEditable(false);
        txtDetDescripcion.setLineWrap(true);
        scrollDet = new JScrollPane(txtDetDescripcion);

        lblReloj = new JLabel("00:00:00", JLabel.CENTER);
        lblReloj.setFont(new Font("Monospaced", Font.BOLD, 28));
        lblReloj.setOpaque(true);
        lblReloj.setBackground(new Color(40, 40, 40));
        lblReloj.setForeground(new Color(0, 255, 100));
        lblReloj.setPreferredSize(new Dimension(200, 50));

        RelojSwing relojSwing = new RelojSwing(lblReloj);
        Thread hiloReloj = new Thread(relojSwing);
        hiloReloj.setDaemon(true);
        hiloReloj.start();


        //Datos ComboBox
        ArrayList<String> listaGenero = new ArrayList<>();
        listaGenero.add("Pop (General).");
        listaGenero.add("Pop Latino.");
        listaGenero.add("K-Pop.");
        listaGenero.add("Synth-pop.");
        listaGenero.add("Indie pop.");
        listaGenero.add("Rock (General).");
        listaGenero.add("Rock Alternativo.");
        listaGenero.add("Metal.");
        listaGenero.add("Punk.");
        listaGenero.add("Hard Rock.");
        listaGenero.add("Indie Rock.");
        listaGenero.add("Reggaetón.");
        listaGenero.add("Trap.");
        listaGenero.add("Dembow.");
        listaGenero.add("Hip-Hop.");
        listaGenero.add("Rap.");
        listaGenero.add("Boom bap.");
        listaGenero.add("Electronica (General).");
        listaGenero.add("House.");
        listaGenero.add("Techno.");
        listaGenero.add("Trance.");
        listaGenero.add("Dubstep.");
        listaGenero.add("Synthwave.");
        listaGenero.add("Hyperpop.");
        listaGenero.add("Regional Mexicano (General).");
        listaGenero.add("Mariachis.");
        listaGenero.add("Banda.");
        listaGenero.add("Norteño.");
        listaGenero.add("Corridos tumbado.");
        listaGenero.add("Salsa.");
        listaGenero.add("Bachata.");
        listaGenero.add("Cumbia.");
        listaGenero.add("Merengue.");
        listaGenero.add("Reggae.");
        listaGenero.add("Afrobeats.");
        listaGenero.add("Flamenco.");
        listaGenero.add("Fado.");
        listaGenero.add("Jazz.");
        listaGenero.add("Soul.");
        listaGenero.add("Blues.");
        ModeloComboBoxGeneros modelo =  new ModeloComboBoxGeneros(listaGenero);
        genero.setModel(modelo);


        //Colores de los componentes y paneles
        pnlPanel1.setBackground(new Color(240, 246, 160));
        pnlPanel2.setBackground(new Color(140, 243, 185));
        pnlPanel3.setBackground(new Color(239, 207, 255));

        txtNombreAlbum.setBorder(BorderFactory.createLineBorder(new Color(255, 169, 0)));
        txtNombreBandaCantante.setBorder(BorderFactory.createLineBorder(new Color(255, 169, 0)));
        txtNumeroCanciones.setBorder(BorderFactory.createLineBorder(new Color(255, 169, 0)));
        txtDescripcion.setBorder(BorderFactory.createLineBorder(new Color(255, 169, 0)));


        //Agregar componentes al panel 1
        pnlPanel1.add(lblNombreAlbum);
        pnlPanel1.add(txtNombreAlbum);
        pnlPanel1.add(lblNombreBandaCantante);
        pnlPanel1.add(txtNombreBandaCantante);
        pnlPanel1.add(lblNumeroCanciones);
        pnlPanel1.add(txtNumeroCanciones);
        pnlPanel1.add(lblGenero);
        pnlPanel1.add(genero);
        pnlPanel1.add(btnSeleccionarImagen);
        pnlPanel1.add(lblRutaImagen);
        pnlPanel1.add(lblDescripcion);
        pnlPanel1.add(scrollDes);
        pnlPanel1.add(lblFormato);
        pnlPanel1.add(rbFisico);
        pnlPanel1.add(rbDigital);
        pnlPanel1.add(rbAmbos);
        pnlPanel1.add(chkExplicit);
        pnlPanel1.add(chkEdicionLimitada);
        pnlPanel1.add(btnAgregarAlbum);
        pnlPanel1.add(btnCancelar);


        //Agregar componentes al panel 2
        pnlPanel2.add(scrollPane);
        pnlPanel2.add(btnModificar);
        pnlPanel2.add(btnEliminar);


        //Agregar componetes al panel 3
        pnlPanel3.add(lblDetNombreAlbum);
        pnlPanel3.add(lblDetNombreBandaCantante);
        pnlPanel3.add(lblDetGenero);
        pnlPanel3.add(lblDetNumeroCanciones);
        pnlPanel3.add(lblDetFormato);
        pnlPanel3.add(lblDetExplicit);
        pnlPanel3.add(lblDetEdicionLimitada);
        pnlPanel3.add(scrollDet);
        pnlPanel3.add(lblDetImagen);
        pnlPanel3.add(btnColorPanel1);
        pnlPanel3.add(btnColorPanel2);
        pnlPanel3.add(btnColorPanel3);
        pnlPanel3.add(lblReloj);


        //Agregar paneles al Frame
        this.getContentPane().add(pnlPanel1, 0);
        this.getContentPane().add(pnlPanel2, 1);
        this.getContentPane().add(pnlPanel3, 2);


        setSize(1200, 900);
        setVisible(true);
    }

    public void limpiar(){
        txtNombreAlbum.setText("");
        txtNombreBandaCantante.setText("");
        txtNumeroCanciones.setText("");
        txtDescripcion.setText("");
        genero.setSelectedIndex(-1);
        grupoFormato.clearSelection();
        rbFisico.setSelected(true);
        chkExplicit.setSelected(false);
        chkEdicionLimitada.setSelected(false);
        lblRutaImagen.setText("Sin imagen.");
    }

    public boolean validar(){
        return !txtNombreAlbum.getText().isEmpty() && !txtNombreBandaCantante.getText().isEmpty() && !txtNumeroCanciones.getText().isEmpty();
    }

    public void cargarAlbumEnFormulario(Album album){
        txtNombreAlbum.setText(album.getNombreAlbum());
        txtNombreBandaCantante.setText(album.getNombreBandaCantante());
        txtNumeroCanciones.setText(String.valueOf(album.getNumeroCanciones()));
        txtDescripcion.setText(album.getDescripcion() != null ? album.getDescripcion() : "");
        genero.setSelectedItem(album.getGeneroAlbum());
        chkExplicit.setSelected(album.isEsExplicit());
        chkEdicionLimitada.setSelected(album.isEsEdicionLimitada());

        switch (album.getFormato() != null ? album.getFormato() : "Físico") {
            case "Digital":
                rbDigital.setSelected(true);
                break;
            case "Ambos":
                rbAmbos.setSelected(true);
            default:
                rbFisico.setSelected(true);
        }

        String ruta = album.getRutaImagen();
        if (ruta != null && !ruta.isEmpty()) {
            lblRutaImagen.setText(ruta);
        } else {
            lblRutaImagen.setText("Sin imagen.");
        }
    }


    public String getFormatoSeleccionado(){
        if (rbDigital.isSelected()){
            return "Digital";
        }
        if (rbAmbos.isSelected()){
            return "Ambos";
        }
        return "Físico.";
    }

    public void mostrarDetallesAlbum(Album album){
        lblDetNombreAlbum.setText("Album: " + album.getNombreAlbum());
        lblDetNombreBandaCantante.setText("Banda/Cantante: " + album.getNombreBandaCantante());
        lblDetGenero.setText("Género: " + album.getGeneroAlbum());
        lblDetNumeroCanciones.setText("Canciones: " + album.getNumeroCanciones());
        lblDetFormato.setText("Formato: " + album.getFormato());
        lblDetExplicit.setText("Explícito: " + (album.isEsExplicit() ? "Sí" : "No"));
        lblDetEdicionLimitada.setText("Ed. Limitada: " + (album.isEsEdicionLimitada() ? "Sí" : "No"));
        txtDetDescripcion.setText(album.getDescripcion() != null ? album.getDescripcion() : "");

        String ruta = album.getRutaImagen();
        if (ruta != null && !ruta.isEmpty()){
            ImageIcon icon = new ImageIcon(ruta);
            Image scaled = icon.getImage().getScaledInstance(100, 100, Image.SCALE_SMOOTH);
            lblDetImagen.setIcon(new ImageIcon(scaled));
            lblDetImagen.setText("");
        }else {
            lblDetImagen.setIcon(null);
            lblDetImagen.setText("Sin imagen.");
        }

    }
}

