import FesAragon_POO.Tareas.Tarea1_Lampara.Lampara;

void main() {
    Lampara l1=new Lampara();
    Lampara l2=new Lampara("Philips", "Blanco", 3, 450.69f);

    System.out.println("\n");

    l1.setMarca("Philips");
    l1.cambioIntensidad();
    l1.setIntensidad(2);
    l1.setColor("Beige");
    l1.setPrecio(3500.50f);
    l1.estaEncendida(1);
    l1.estaApagda(1);
    l1.tipoIntensidad(2);

    System.out.println("\n");

    //l2.estaEncendida(0);
    //l2.estaApagda(1);
    //l2.cambioIntensidad();
    //l2.tipoIntensidad(0);

}