package FesAragon_POO.Trabajos_Actividades_Clase.Marzo.Clase_05_03_2026_RelojHerencia;

import java.time.LocalDateTime;

public class Reloj {
    private int hora;
    private int minuto;
    private int segundo;
    private boolean enEjecucion;

    public Reloj() {
        LocalDateTime actual = LocalDateTime.now();
        hora = actual.getHour();
        minuto = actual.getMinute();
        segundo = actual.getSecond();
        enEjecucion = true;
    }

    public Reloj(int hora, int minuto, int segundo) {
        this.hora = hora;
        this.minuto = minuto;
        this.segundo = segundo;
        enEjecucion = true;
    }

    public int getHora() {
        return hora;
    }

    public void setHora(int hora) {
        this.hora = hora;
    }

    public int getMinuto() {
        return minuto;
    }

    public void setMinuto(int minuto) {
        this.minuto = minuto;
    }

    public int getSegundo() {
        return segundo;
    }

    public void setSegundo(int segundo) {
        this.segundo = segundo;
    }

    @Override
    public String toString() {
        return "RelojDigital{" +
                "hora=" + hora +
                ", minuto=" + minuto +
                ", segundo=" + segundo +
                '}';
    }

    public void incrementaSegundo(){
        this.segundo++;
        if( this.segundo >= 60  ){
            this.segundo = 0;
            this.incrementaMinuto();
        }
    }

    public void incrementaMinuto() {
        this.minuto++;
        if( this.minuto >= 60 ){
            this.minuto = 0;
            this.incrementaHora();
        }
    }

    public   void incrementaHora() {
        this.hora++;
        if (this.hora >= 24){
            this.hora = 0;
        }
    }

    public boolean isEnEjecucion() {
        return enEjecucion;
    }

    public void setEnEjecucion(boolean enEjecucion) {
        this.enEjecucion = enEjecucion;
    }

    static void main(String[] args) throws InterruptedException {
        //Reloj wacho = new Reloj();
        Reloj wacho = new Reloj();


        /*
        System.out.println(wacho);
        wacho.incrementaSegundo();
        System.out.println(wacho);

        System.out.println("-----Usando sleep de 1 segundo------");
        */


        while (true){
            Thread.sleep(1000);
            wacho.incrementaSegundo();
            System.out.println(wacho);
        }
    }

}