package FesAragon_POO.Trabajos_Actividades_Clase.Abril.Clase_28_04_2026_SWING.Ejemplo2_ventana2;

import javax.swing.*;
import java.util.ArrayList;

public class ModeloDefaultComboNombre extends DefaultComboBoxModel {

    public ModeloDefaultComboNombre(ArrayList nombres) {
        super(nombres.toArray());
    }

    public ModeloDefaultComboNombre() {
        super();
    }



}
