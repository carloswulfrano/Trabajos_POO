package FesAragon_POO.Trabajos_Actividades_Clase.Mayo.Clase_07_05_2026_Manejo_Archivos.Controlador;

import FesAragon_POO.Trabajos_Actividades_Clase.Mayo.Clase_07_05_2026_Manejo_Archivos.Utileria.AlumnosArchivos;
import FesAragon_POO.Trabajos_Actividades_Clase.Mayo.Clase_07_05_2026_Manejo_Archivos.Modelo.Alumno;
import FesAragon_POO.Trabajos_Actividades_Clase.Mayo.Clase_07_05_2026_Manejo_Archivos.Modelo.ModeloTablaAlumno;
import FesAragon_POO.Trabajos_Actividades_Clase.Mayo.Clase_07_05_2026_Manejo_Archivos.Vista.VentanaAlumnos;

import java.awt.event.*;

public class AlumnosController extends MouseAdapter {
    private VentanaAlumnos vista;
    private ModeloTablaAlumno  modelo;
    private AlumnosArchivos alumnosArchivos;

    public AlumnosController(VentanaAlumnos vista) {
        this.vista = vista;
        this.modelo = new ModeloTablaAlumno();


        this.vista.getTablaAlumnos().setModel(this.modelo);
        this.vista.getBtnAgregar().addMouseListener(this);
        this.vista.getBtnGuardar().addMouseListener(this);
        this.vista.getBtnLeerArchivo().addMouseListener(this);

    }

    @Override
    public void mouseClicked(MouseEvent e){
        if (e.getSource() == this.vista.getBtnAgregar()){
            System.out.println("Agregando alumno");
            Alumno alumno = new Alumno();
            alumno.setNumeroCuenta(this.vista.getTxtNumeroCuenta().getText());
            alumno.setNombre(this.vista.getTxtNombre().getText());
            alumno.setApellidos(this.vista.getTxtApellido().getText());
            alumno.setPromedio(Double.parseDouble(vista.getTxtPromedio().getText()));
            //Agregar validaciones, manejo de excepciones y limpiar formulario
            modelo.addAlumno(alumno);
            this.vista.getTablaAlumnos().updateUI();
        }

        if (e.getSource() == this.vista.getBtnGuardar()){
            System.out.println("Guardarando archivo.");
            alumnosArchivos.escribir(modelo.getAlumno(5));
        }

        if (e.getSource() == this.vista.getBtnLeerArchivo()){
            System.out.println("Leer archivo.");
            modelo.setAlumnos(alumnosArchivos.leerAlumnos());
            this.vista.getTablaAlumnos().updateUI();
        }
    }



}
