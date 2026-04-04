package FesAragon_POO.Tareas.Tarea4_Semaforo;

public class Semaforo {

    private Luces luzR, luzA, luzV;

    public Semaforo() {
    }

    public Semaforo(Luces luzR, Luces luzA, Luces luzV) {
        this.luzR = luzR;
        this.luzA = luzA;
        this.luzV = luzV;
    }

    public Luces getLuzR() {
        return luzR;
    }

    public void setLuzR(Luces luzR) {
        this.luzR = luzR;
    }

    public Luces getLuzA() {
        return luzA;
    }

    public void setLuzA(Luces luzA) {
        this.luzA = luzA;
    }

    public Luces getLuzV() {
        return luzV;
    }

    public void setLuzV(Luces luzV) {
        this.luzV = luzV;
    }

    @Override
    public String toString() {
        return "Semaforo{" +
                "luzR=" + luzR +
                ", luzA=" + luzA +
                ", luzV=" + luzV +
                '}';
    }

    public void encender(boolean e) {
        if (e) {
            System.out.println(luzR);
            System.out.println(luzA);
            System.out.println(luzV);
        } else {
            apagar();
        }
    }

    public void apagar() {
        System.out.println("El semaforo no funciona...");
    }
}