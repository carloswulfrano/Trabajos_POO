package FesAragon_POO.Trabajos_Actividades_Clase.Abril.Clase_30_04_2026_AppMVCVersion1.Controller;

import FesAragon_POO.Trabajos_Actividades_Clase.Abril.Clase_30_04_2026_AppMVCVersion1.Model.ModeloTablaPhone;
import FesAragon_POO.Trabajos_Actividades_Clase.Abril.Clase_30_04_2026_AppMVCVersion1.Model.SmartPhone;
import FesAragon_POO.Trabajos_Actividades_Clase.Abril.Clase_30_04_2026_AppMVCVersion1.View.VentanaPrincipal;

import javax.swing.*;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.util.ArrayList;

public class ControladorPrincipal implements MouseListener {

    private VentanaPrincipal view;
    private ModeloTablaPhone model;

    public ControladorPrincipal(VentanaPrincipal vista) {
        this.view = vista;
        this.view.getBtnSaludar().addMouseListener(this);
        this.view.getLblNombre().addMouseListener(this);
        this.view.getBtnAgregarPhone().addMouseListener(this);
        this.view.getTblPhone().addMouseListener(this);

        ArrayList<SmartPhone> tels =  new ArrayList<>();
        tels.add(new SmartPhone("Apple", "Iphone 15", 17000.3f));
        tels.add(new SmartPhone("Samsung", "Galaxy 5", 7000.3f));
        model = new ModeloTablaPhone(tels);
        this.view.getTblPhone().setModel(model);
        this.view.getTblPhone().updateUI();
    }


    @Override
    public void mouseClicked(MouseEvent e) {

        //this.view.getLblSalida().setText("Hola " + this.view.getTxtNombre().getText());
        if (e.getSource() == this.view.getBtnSaludar()) {
            System.out.println("Hola desde Nezayork.");
            System.out.println("Hola desde Mi-nezota.");
            this.view.getLblSalida().setText("Hola " + this.view.getTxtNombre().getText());
        }

        if (e.getSource() == this.view.getLblNombre()) {
            System.out.println("Desde etiquetaa 1.");
        }

        if (e.getSource() == this.view.getBtnAgregarPhone()) {
                System.out.println("Agregando un nuveo telfono.");
                SmartPhone phone = new  SmartPhone();


                try {

                    phone = new  SmartPhone(
                            this.view.getTxtMarca().getText(),
                            this.view.getTxtModelo().getText(),
                            Float.parseFloat(this.view.getTxtPrecio().getText()));

                }catch (NumberFormatException ex) {

                    //System.out.println("El precio no es un numero!!!");
                    JOptionPane.showMessageDialog(this.view,"El precio no es un numero!!!");
                    this.view.getTxtPrecio().setText("0");

                    phone = new  SmartPhone(
                            this.view.getTxtMarca().getText(),
                            this.view.getTxtModelo().getText(),
                            0.0f);

                }

                if (this.view.validaer()){
                    model.agregarTelefono(phone);
                    this.view.getTblPhone().updateUI();
                    this.view.limpiar();
                }else{
                    JOptionPane.showMessageDialog(this.view, "Faltan datos por completar.");
                    //System.out.println("No se agrego el telefono porque faltan campos...");
                }

            }



        if (e.getSource() == this.view.getTblPhone()) {
            System.out.println("Click en la tabla");

            System.out.println(this.view.getTblPhone().getSelectedRow());
            SmartPhone phone = model.getTelefono(this.view.getTblPhone().getSelectedRow());
            System.out.println(phone.toString());

            view.getTxtMarca().setText(phone.getMarca());
            view.getTxtModelo().setText(phone.getModelo());
            view.getTxtPrecio().setText(String.valueOf(phone.getPrecio()));
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
}
