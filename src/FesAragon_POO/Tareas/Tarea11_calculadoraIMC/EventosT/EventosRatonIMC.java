package FesAragon_POO.Tareas.Tarea11_calculadoraIMC.EventosT;

import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.awt.*;


public class EventosRatonIMC implements MouseListener {
    private TextField campoPeso;
    private TextField campoAltura;
    private Label resultado;

    public EventosRatonIMC(TextField campoPeso, TextField campoAltura, Label resultado) {
        this.campoPeso = campoPeso;
        this.campoAltura = campoAltura;
        this.resultado = resultado;
    }

    @Override
    public void mouseClicked(MouseEvent e) {
        try {
            double peso = Double.parseDouble(campoPeso.getText());
            double altura = Double.parseDouble(campoAltura.getText());

            double imc = peso / (altura * altura);

            String categoria;
            if (imc < 18.5) {
                categoria = "Bajo peso";
            } else if (imc < 25) {
                categoria = "Peso normal";
            } else if (imc < 30) {
                categoria = "Sobrepeso";
            } else if (imc < 35) {
                categoria = "Obesidad grado I";
            } else if (imc < 40) {
                categoria = "Obesidad grado II";
            } else {
                categoria = "Obesidad grado III";
            }

            resultado.setText("IMC: " + imc + " " + categoria);
            System.out.println("IMC calculado: " + imc + " - " + categoria);

        } catch (NumberFormatException ex) {
            resultado.setText("Error: Ingrese números válidos");
            System.out.println("Error: Datos inválidos");
        }
    }

    @Override
    public void mousePressed(MouseEvent e) {}

    @Override
    public void mouseReleased(MouseEvent e) {}

    @Override
    public void mouseEntered(MouseEvent e) {}

    @Override
    public void mouseExited(MouseEvent e) {}
}
