import FesAragon_POO.Trabajos_Actividades_Clase.Febrero.Clase_24_02_2026_TelevisorCompo.Componentes.Canal;
import FesAragon_POO.Trabajos_Actividades_Clase.Febrero.Clase_24_02_2026_TelevisorCompo.Componentes.Pantalla;//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
import FesAragon_POO.Trabajos_Actividades_Clase.Febrero.Clase_24_02_2026_TelevisorCompo.Componentes.Volumen;
import FesAragon_POO.Trabajos_Actividades_Clase.Febrero.Clase_24_02_2026_TelevisorCompo.TV;

// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
void main() {

    Pantalla p1= new Pantalla();
    System.out.println(p1);
    p1.encender();
    System.out.println(p1);


    Volumen vol =  new Volumen(80);
    System.out.println("\n\n"+vol);
    vol.subir(30);
    System.out.println(vol);


    Canal channel = new Canal(97);
    System.out.println(channel);
    channel.canalSiguiente();
    channel.canalSiguiente();
    channel.canalSiguiente();
    System.out.println(channel);

    System.out.println("\n\nProbando la composicion de la Tv.\n");
    TV tele = new TV("Samsung", 6500.5f, 52, new Pantalla(false, "52 pulgadas"), new Volumen(10),  new Canal(2));
    System.out.println(tele);
    tele.getChannel().canalSiguiente();
    System.out.println(tele);

    tele.subirVolumen(10);
    System.out.println("Encendiendo tele..");
    tele.getPantalla().encender();
    tele.subirVolumen(2);
    tele.estado();
}
