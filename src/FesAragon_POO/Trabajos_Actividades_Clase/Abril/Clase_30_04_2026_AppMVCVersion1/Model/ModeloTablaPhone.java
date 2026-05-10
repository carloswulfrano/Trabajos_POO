package FesAragon_POO.Trabajos_Actividades_Clase.Abril.Clase_30_04_2026_AppMVCVersion1.Model;

import javax.swing.event.TableModelListener;
import javax.swing.table.TableModel;
import java.util.ArrayList;

public class ModeloTablaPhone implements TableModel {
    private ArrayList<SmartPhone> data;

    public ModeloTablaPhone(ArrayList<SmartPhone> info) {
        this.data = info;
    }

    @Override
    public int getRowCount() {
        return data.size();
    }

    @Override
    public int getColumnCount() {
        return 3;
    }

    @Override
    public String getColumnName(int columnIndex) {

        String columnName = "";
        switch (columnIndex) {
            case 0:
                columnName = "Marca";
                break;
            case 1:
                columnName = "Modelo";
                break;
            case 2:
                columnName = "Precio";
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
                 return Float.class;
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
        SmartPhone Phone = data.get(rowIndex);
        switch (columnIndex) {
            case 0:
                return Phone.getMarca();
            case 1:
                return Phone.getModelo();
            case 2:
                return Phone.getPrecio();
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

    public void agregarTelefono(SmartPhone tel) {
        this.data.add(tel);
    }

    public SmartPhone getTelefono(int index) {
        return this.data.get(index);
    }
}
