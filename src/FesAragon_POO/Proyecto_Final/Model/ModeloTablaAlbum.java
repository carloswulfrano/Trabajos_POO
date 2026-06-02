package FesAragon_POO.Proyecto_Final.Model;

import javax.swing.event.TableModelListener;
import javax.swing.table.TableModel;
import java.util.ArrayList;

public class ModeloTablaAlbum implements TableModel {
    private ArrayList<Album> albums;

    public ModeloTablaAlbum(ArrayList<Album> al) {
        this.albums = al;
    }

    @Override
    public int getRowCount() {
        return albums.size();
    }

    @Override
    public int getColumnCount() {
        return 4;
    }

    @Override
    public String getColumnName(int columnIndex) {
        String columnName = "";

        switch (columnIndex) {
            case 0:
                columnName = "Nombre Album.";
                break;
            case 1:
                columnName = "Nombre Artista o Banda.";
                break;
            case 2:
                columnName = "Género.";
                break;
            case 3:
                columnName = "Numero de Canciones.";
                break;
            default:
                columnName = "Error.";
                break;
        }
        return columnName;
    }

    @Override
    public Class<?> getColumnClass(int columnIndex) {
        switch (columnIndex) {
            case 0:
                return String.class;
            case 1:
                return String.class;
            case 2:
                return String.class;
            case 3:
                return Integer.class;
            default:
                return String.class;
        }
    }

    @Override
    public boolean isCellEditable(int rowIndex, int columnIndex) {
        return false;
    }

    @Override
    public Object getValueAt(int rowIndex, int columnIndex) {
        Album album = albums.get(rowIndex);

        switch (columnIndex) {
            case 0:
                return album.getNombreAlbum();
            case 1:
                return album.getNombreBandaCantante();
            case 2:
                return album.getGeneroAlbum();
            case 3:
                return album.getNumeroCanciones();
            default:
                return "NA";
        }
    }

    @Override
    public void setValueAt(Object aValue, int rowIndex, int columnIndex) {

    }

    @Override
    public void addTableModelListener(TableModelListener l) {

    }

    @Override
    public void removeTableModelListener(TableModelListener l) {

    }

    public ArrayList<Album> getAlbums() {
        return albums;
    }

    public void setAlbums(ArrayList<Album> albums) {
        this.albums = albums;
    }

    public void agregarAlbum(Album album) {
        this.albums.add(album);

    }

    public Album getAlbum(int index) {
        return this.albums.get(index);
    }

    public void modificarAlbum(int index, Album album) {
        this.albums.set(index, album);
    }

    public void eliminarAlbum(int index) {
        this.albums.remove(index);
    }

}
