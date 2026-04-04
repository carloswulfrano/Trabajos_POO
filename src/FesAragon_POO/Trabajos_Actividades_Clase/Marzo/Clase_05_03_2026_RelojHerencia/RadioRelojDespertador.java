package FesAragon_POO.Trabajos_Actividades_Clase.Marzo.Clase_05_03_2026_RelojHerencia;

public class RadioRelojDespertador extends RadioReloj{
    private int horaAlarma;
    private int minutoAlarma;
    private  int segundoAlarma;
    private boolean alarmaSonando;

    public RadioRelojDespertador() {
    }

    public RadioRelojDespertador(String marca, int volumen, float frecuencia, boolean amFm, Reloj wacho, int horaAlarma, int minutoAlarma, int segundoAlarma, boolean alarmaSonando) {
        super(marca, volumen, frecuencia, amFm, wacho);
        this.horaAlarma = horaAlarma;
        this.minutoAlarma = minutoAlarma;
        this.segundoAlarma = segundoAlarma;
        this.alarmaSonando = alarmaSonando;
    }

    public int getHoraAlarma() {
        return horaAlarma;
    }

    public void setHoraAlarma(int horaAlarma) {
        this.horaAlarma = horaAlarma;
    }

    public int getMinutoAlarma() {
        return minutoAlarma;
    }

    public void setMinutoAlarma(int minutoAlarma) {
        this.minutoAlarma = minutoAlarma;
    }

    public int getSegundoAlarma() {
        return segundoAlarma;
    }

    public void setSegundoAlarma(int segundoAlarma) {
        this.segundoAlarma = segundoAlarma;
    }

    public boolean isAlarmaSonando() {
        return alarmaSonando;
    }

    public void setAlarmaSonando(boolean alarmaSonando) {
        this.alarmaSonando = alarmaSonando;
    }

    @Override
    public String toString() {
        return "RadioRelojDespertador{" +
                "horaAlarma=" + horaAlarma +
                ", minutoAlarma=" + minutoAlarma +
                ", segundoAlarma=" + segundoAlarma +
                ", alarmaSonando=" + alarmaSonando +
                ", marca='" + marca + '\'' +
                ", volumen=" + volumen +
                ", frecuencia=" + frecuencia +
                ", amFm=" + amFm +
                ", wacho=" + wacho +
                '}';
    }

    public void apagarAlarma(){
        this.alarmaSonando=false;
        System.out.println("Alarma ha sido apagada...");
    }

    public void encenderAlarma(){
        if (this.wacho.getHora() == this.horaAlarma
            && this.wacho.getMinuto() == this.minutoAlarma
            && this.wacho.getSegundo() == this.segundoAlarma
        ){
            System.out.println("La alarma esta sonando");
            this.alarmaSonando = true;
        }
    }
}
