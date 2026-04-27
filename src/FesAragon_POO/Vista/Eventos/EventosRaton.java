package FesAragon_POO.Vista.Eventos;

import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.awt.*;


public class EventosRaton implements MouseListener {

    private TextField entrada;
    private Label resultado;

    public EventosRaton(TextField entrada, Label resultado) {
        this.entrada = entrada;
        this.resultado = resultado;



    }

    public EventosRaton() {

    }


    @Override
    public void mouseClicked(MouseEvent e) {
        double celsius = Double.parseDouble(entrada.getText());
        double fahrenheit = (celsius) * 9 / 5 + 32;
        resultado.setText(String.format("" + fahrenheit));
        System.out.println("fahrenheit: " + fahrenheit);


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
