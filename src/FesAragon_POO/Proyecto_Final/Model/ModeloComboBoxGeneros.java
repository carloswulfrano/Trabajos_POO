package FesAragon_POO.Proyecto_Final.Model;

import javax.swing.*;
import javax.swing.event.ListDataListener;
import java.util.ArrayList;

public class ModeloComboBoxGeneros implements ComboBoxModel {
    private ArrayList<String> gen;
    private String selectedItem;

    public ModeloComboBoxGeneros(ArrayList<String> genes) {
        this.gen = genes;
    }

    public ArrayList<String> getGen() {
        return gen;
    }

    public void setGen(ArrayList<String> gen) {
        this.gen = gen;
    }

    @Override
    public void setSelectedItem(Object anItem) {
        selectedItem = (String) anItem;
    }

    @Override
    public Object getSelectedItem() {
        return selectedItem;
    }

    @Override
    public int getSize() {
        return gen.size();
    }

    @Override
    public Object getElementAt(int index) {
        return gen.get(index);
    }

    @Override
    public void addListDataListener(ListDataListener l) {

    }

    @Override
    public void removeListDataListener(ListDataListener l) {

    }
}