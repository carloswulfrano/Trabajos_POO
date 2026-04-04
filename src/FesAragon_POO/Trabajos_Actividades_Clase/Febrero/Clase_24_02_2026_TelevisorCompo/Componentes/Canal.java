package FesAragon_POO.Trabajos_Actividades_Clase.Febrero.Clase_24_02_2026_TelevisorCompo.Componentes;

public class Canal {

    private int canal;


    public Canal() {
    }


    public Canal(int canal) {
        this.canal = canal;
    }


    public int getCanal() {
        return canal;
    }

    public void setCanal(int canal) {
        this.canal = canal;
    }


    @Override
    public String toString() {
        return "Canal{" +
                "canal=" + canal +
                '}';
    }


    public int canalSiguiente(){
        int actual = this.canal;
        if ((actual + 1) > 99){
            this.canal = 2;
        }else {
            this.canal ++;
        }
        return this.canal;
    }
}
