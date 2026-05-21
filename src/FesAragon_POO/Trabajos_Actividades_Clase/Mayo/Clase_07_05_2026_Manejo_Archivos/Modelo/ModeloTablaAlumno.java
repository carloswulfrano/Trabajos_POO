package FesAragon_POO.Trabajos_Actividades_Clase.Mayo.Clase_07_05_2026_Manejo_Archivos.Modelo;

import javax.swing.event.TableModelListener;
import javax.swing.table.TableModel;
import java.util.ArrayList;

public class ModeloTablaAlumno implements TableModel {
    ArrayList<Alumno> alumnos;

    public ModeloTablaAlumno() {
        alumnos = new ArrayList<>();
    }

    public ModeloTablaAlumno(ArrayList<Alumno> alumnos) {
        this.alumnos = alumnos;
    }

    public ArrayList<Alumno> getAlumnos() {
        return alumnos;
    }

    public void setAlumnos(ArrayList<Alumno> alumnos) {
        this.alumnos = alumnos;
    }

    public void addAlumno(Alumno alumno) {
        this.alumnos.add(alumno);
    }

    public Alumno getAlumno(int index) {
        return alumnos.get(index);
    }


    @Override
    public int getRowCount() {
        return this.alumnos.size();
    }

    @Override
    public int getColumnCount() {
        return Alumno.class.getDeclaredFields().length;
    }

    @Override
    public String getColumnName(int columnIndex) {
        return Alumno.class.getDeclaredFields()[columnIndex].getName();
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
                            return Double.class;
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
        Alumno alumno = alumnos.get(rowIndex);
        switch (columnIndex) {
            case 0:
                return alumno.getNumeroCuenta();
                case 1:
                    return alumno.getNombre();
                    case 2:
                        return alumno.getApellidos();
                        case 3:
                            return alumno.getPromedio();

                            default:
                                return null;
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
}
