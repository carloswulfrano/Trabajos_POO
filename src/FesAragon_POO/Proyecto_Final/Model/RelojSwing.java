package FesAragon_POO.Proyecto_Final.Model;

import javax.swing.*;
import java.awt.*;

public class RelojSwing extends Reloj implements Runnable {
    private JLabel lblReloj;

    public RelojSwing(JLabel lblReloj) {
        super(); // usa el constructor de Reloj que toma la hora actual
        this.lblReloj = lblReloj;
    }

    @Override
    public void run() {
        while (isEnEjecucion()) {
            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                JOptionPane.showMessageDialog(null, "Error en ejecucion");
                break;
            }

            int minutoAntes = getMinuto();
            int horaAntes   = getHora();

            incrementaSegundo();

            lblReloj.setText(String.format("%02d:%02d:%02d", getHora(), getMinuto(), getSegundo()));

            if (getHora() != horaAntes) {
                lblReloj.setForeground(new Color(255, 1, 1));
            } else if (getMinuto() != minutoAntes) {
                lblReloj.setForeground(new Color(0, 255, 100));
            } else {
                lblReloj.setForeground(new Color(255, 242, 1));
            }
        }
    }
}
