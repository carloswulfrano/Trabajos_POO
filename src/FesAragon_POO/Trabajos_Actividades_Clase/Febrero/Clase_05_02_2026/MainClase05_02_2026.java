import FesAragon_POO.Trabajos_Actividades_Clase.Febrero.Clase_05_02_2026.Cama;
import FesAragon_POO.Trabajos_Actividades_Clase.Febrero.Clase_05_02_2026.Lampara;
import FesAragon_POO.Trabajos_Actividades_Clase.Febrero.Clase_05_02_2026.Ropero;

void main(String[] args) {
    Cama c1=new Cama();
    Lampara l1=new Lampara();
    Ropero r1=new Ropero();

    c1.UsadaParaDormir();
    c1.SoportandoPersona();
    c1.MoviendoLugar();

    l1.CambioDeIntensidad();
    l1.EstaApagada();
    l1.EstaEncendida();

    r1.EstaAbierto();
    r1.EstaCerrada();
    r1.GuardaRopa();

}