package FesAragon_POO.Proyecto_Final.Controller;

import FesAragon_POO.Proyecto_Final.Model.Album;
import FesAragon_POO.Proyecto_Final.Model.ModeloTablaAlbum;
import FesAragon_POO.Proyecto_Final.View.VentanaPrincipalProyecto;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.io.*;
import java.util.ArrayList;

public class ControladorPrincipalProyecto implements MouseListener, ActionListener {

    private VentanaPrincipalProyecto view;
    private ModeloTablaAlbum modeloTabla;
    private int indiceModificado = -1; // el -1 es ninguno
    private static final String RUTA_ARCHIVO = "albums.dat";

    public ControladorPrincipalProyecto(VentanaPrincipalProyecto ventana1) {
        this.view = ventana1;

        this.view.getBtnAgregarAlbum().addMouseListener(this);
        this.view.getBtnCancelar().addMouseListener(this);
        this.view.getBtnModificar().addMouseListener(this);
        this.view.getBtnEliminar().addMouseListener(this);
        this.view.getTblAlbum().addMouseListener(this);
        this.view.getBtnSeleccionarImagen().addMouseListener(this);
        this.view.getBtnColorPanel1().addMouseListener(this);
        this.view.getBtnColorPanel2().addMouseListener(this);
        this.view.getBtnColorPanel3().addMouseListener(this);

        ArrayList<Album> listaAlbum = new ArrayList<>();
        modeloTabla = new ModeloTablaAlbum(listaAlbum);
        this.view.getTblAlbum().setModel(modeloTabla);
        this.view.getTblAlbum().updateUI();

        this.view.getMniGuardar().addActionListener(this);
        this.view.getMniCargar().addActionListener(this);
        this.view.getMniSalir().addActionListener(this);

    }

    @Override
    public void mouseClicked(MouseEvent e) {

        //Agregar y guardardar cambios.
        if (e.getSource() == this.view.getBtnAgregarAlbum()) {
            if (indiceModificado >=0) {
                guardarModificacion();
            }else {
                agregarAlbum();
            }
        }


        //cancelar el registro
        if (e.getSource() == this.view.getBtnCancelar()) {
            indiceModificado = -1;
            view.getBtnAgregarAlbum().setText("Agregar Album.");
            view.limpiar();
        }


        //Modificar (cargar datos en el panel 1)
        if (e.getSource() == this.view.getBtnModificar()) {
            int fila = view.getTblAlbum().getSelectedRow();
            if (fila < 0) {
                JOptionPane.showMessageDialog(view, "Seleccione un album de la tabla, para modificar!!!.");
                return;
            }
            indiceModificado = fila;
            view.cargarAlbumEnFormulario(modeloTabla.getAlbum(fila));
            view.getBtnAgregarAlbum().setText("Guardar Cambios.");
        }


        //Eliminar
        if (e.getSource() == this.view.getBtnEliminar()) {
            int fila = view.getTblAlbum().getSelectedRow();
            if (fila < 0) {
                JOptionPane.showMessageDialog(view, "Selecciona un album de la tabla para eliminar!!!");
                return;
            }
            int confirmar = JOptionPane.showConfirmDialog(view, "Seguro que deseas eliminar el album selecionado?", "Confirmar",
                    JOptionPane.YES_NO_OPTION);
            if (confirmar == JOptionPane.YES_OPTION) {
                modeloTabla.eliminarAlbum(fila);
                view.getBtnAgregarAlbum().setText("Agregar Album.");
                view.limpiar();
            }
        }


        //Seleccionar una imagen
        if (e.getSource() == this.view.getBtnSeleccionarImagen()) {
            int resultado = view.getFileChooser().showOpenDialog(view);
            if (resultado == JFileChooser.APPROVE_OPTION) {
                String ruta = view.getFileChooser().getSelectedFile().getAbsolutePath();
                view.getLblRutaImagen().setText(ruta);
            }
        }


        //Seleccionar un color
        if (e.getSource() == this.view.getBtnColorPanel1()) {
            Color color = JColorChooser.showDialog(view, "Color panel 1.", view.getPnlPanel1().getBackground());
            if (color != null) {
                view.getPnlPanel1().setBackground(color);
            }
        }
        if (e.getSource() == this.view.getBtnColorPanel2()) {
            Color color = JColorChooser.showDialog(view, "Color panel 2.", view.getPnlPanel2().getBackground());
            if (color != null) {
                view.getPnlPanel2().setBackground(color);
            }
        }
        if (e.getSource() == this.view.getBtnColorPanel3()) {
            Color color = JColorChooser.showDialog(view, "Color panel 3.", view.getPnlPanel3().getBackground());
            if (color != null) {
                view.getPnlPanel3().setBackground(color);
            }
        }


        //Mostrar los datos de un album en el panel 3
        if (e.getSource() == this.view.getTblAlbum()) {
            int fila = view.getTblAlbum().getSelectedRow();
            if(fila >= 0 && fila < modeloTabla.getRowCount()) {
                view.mostrarDetallesAlbum(modeloTabla.getAlbum(fila));
            }
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

    @Override
    public void actionPerformed(ActionEvent e) {

        Object src = e.getSource();
        if (src == this.view.getMniGuardar()) {
            guardarArchivo();
        } else if (src == this.view.getMniCargar()) {
            try {
                cargarArchivo();
            } catch (FileNotFoundException ex) {
                throw new RuntimeException(ex);
            }
        } else if (src == this.view.getMniSalir()) {
            int resp = JOptionPane.showConfirmDialog(view, "Deseas guaradr ante de salir?",
                    "Salir", JOptionPane.YES_NO_CANCEL_OPTION);
            if (resp == JOptionPane.YES_OPTION) {
                guardarArchivo();
            } if (resp != JOptionPane.CANCEL_OPTION) {
                System.exit(0);
            }
        }
    }


    //Metodo para agregar un album
    private void agregarAlbum() {
        boolean valido = true;
        Album album = null;

        if (!view.validar()) {
            JOptionPane.showMessageDialog(view, "No se puede agregar album, porque faltan campos!!!");
            valido = false;
        }

        if (valido && view.getGenero().getSelectedItem()  == null) {
            JOptionPane.showMessageDialog(view, "Falta seleccionar un tipo de genero!!!");
            valido = false;
        }

        if (valido) {
            try {

                album = new Album(view.getTxtNombreAlbum().getText(),
                        view.getTxtNombreBandaCantante().getText(),
                        view.getGenero().getSelectedItem().toString(),
                        Integer.parseInt(view.getTxtNumeroCanciones().getText()),
                        view.getTxtDescripcion().getText(),
                        view.getFormatoSeleccionado(),
                        view.getChkExplicit().isSelected(),
                        view.getChkEdicionLimitada().isSelected(),
                        view.getLblRutaImagen().getText().equals("Sin imagen") ? "" : view.getLblRutaImagen().getText());

            }catch (NumberFormatException e){
                JOptionPane.showMessageDialog(view, "El número de canciones debe ser entero o un número!!!");
                valido = false;
            }
        }

        if (valido && album != null) {
            modeloTabla.agregarAlbum(album);
            view.getTblAlbum().updateUI();
            view.limpiar();
        }
    }

    //Metodo para modifcar un album
    private void guardarModificacion() {
        boolean valido = true;
        Album album = null;

        if (!view.validar()) {
            JOptionPane.showMessageDialog(view ,"Faltan campos!!!");
            valido = false;
        }

        if (valido && view.getGenero().getSelectedItem()  == null) {
            JOptionPane.showMessageDialog(view, "Falta seleccionar un tipo de genero!!!");
            valido = false;
        }

        if (valido) {
            try {

                album = new Album(view.getTxtNombreAlbum().getText(),
                        view.getTxtNombreBandaCantante().getText(),
                        view.getGenero().getSelectedItem().toString(),
                        Integer.parseInt(view.getTxtNumeroCanciones().getText()),
                        view.getTxtDescripcion().getText(),
                        view.getFormatoSeleccionado(),
                        view.getChkExplicit().isSelected(),
                        view.getChkEdicionLimitada().isSelected(),
                        view.getLblRutaImagen().getText().equals("Sin imagen") ? "" : view.getLblRutaImagen().getText());

            }catch (NumberFormatException ex){
                JOptionPane.showMessageDialog(view, "El número de canciones debe ser entero o un numero!!!");
                valido = false;
            }
        }

        if (valido && album != null) {
            modeloTabla.modificarAlbum(indiceModificado, album);
            view.getTblAlbum().updateUI();
            view.mostrarDetallesAlbum(album);
            view.limpiar();
            indiceModificado = -1;
            view.getBtnAgregarAlbum().setText("Agregar Album.");
        }
    }

    //El metodo para guardar Archivos
    private void guardarArchivo(){
        try(
                ObjectOutputStream oos = new ObjectOutputStream(
                        new FileOutputStream(RUTA_ARCHIVO))) {

            oos.writeObject(modeloTabla.getAlbums());
            JOptionPane.showMessageDialog(view, "Archivo guardado exitosamente!!!");

        }catch (IOException ex){

            JOptionPane.showMessageDialog(view, "Error al guardar: " + ex.getMessage(),
                    "Error", JOptionPane.ERROR_MESSAGE);

        }
    }

    //Metodo para cargar un archivo (Aquí me ayudo la IA)
    @SuppressWarnings("unchecked") //Anotación para ignorar una advertecia especifica
    private void cargarArchivo() throws FileNotFoundException {
        File archivo = new File(RUTA_ARCHIVO);

        if  (!archivo.exists()) {
            JOptionPane.showMessageDialog(view, "El archivo no existe!!!");
            return;
        }

        try(
                ObjectInputStream ois = new ObjectInputStream(
                        new FileInputStream(RUTA_ARCHIVO))){

            ArrayList<Album> lista = (ArrayList<Album>) ois.readObject();
            modeloTabla.setAlbums(lista);
            view.getTblAlbum().updateUI();
            JOptionPane.showMessageDialog(view, "Resgistro caragado: " +
                    lista.size() + " albums exitosamente!!!");

        }catch (IOException | ClassNotFoundException ex){
            JOptionPane.showMessageDialog(view, "Error al cargar: " + ex.getMessage(),
                    "Error", JOptionPane.ERROR_MESSAGE);
        }

    }
}

