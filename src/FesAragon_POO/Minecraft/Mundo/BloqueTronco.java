package FesAragon_POO.Minecraft.Mundo;

public class BloqueTronco extends Bloque{

    private boolean flamable;
    private int segundosParaConsumirse;
    private boolean corteza;

    public BloqueTronco() {
    }

    public BloqueTronco(String textura, String sonidoGolpeo, String material, int golpesParaQuitar) {
        super(textura, sonidoGolpeo, material, golpesParaQuitar);
        this.nombre = "Bloque de Tronco";
        this.corteza = true;
    }

    public boolean isFlamable() {
        return flamable;
    }

    public void setFlamable(boolean flamable) {
        this.flamable = flamable;
    }

    public int getSegundosParaConsumirse() {
        return segundosParaConsumirse;
    }

    public void setSegundosParaConsumirse(int segundosParaConsumirse) {
        this.segundosParaConsumirse = segundosParaConsumirse;
    }

    public boolean isCorteza() {
        return corteza;
    }

    public void setCorteza(boolean corteza) {
        this.corteza = corteza;
    }

    @Override
    public String toString() {
        return "BloqueTronco{" +
                "flamable=" + flamable +
                ", segundosParaConsumirse=" + segundosParaConsumirse +
                ", corteza=" + corteza +
                ", nombre='" + nombre + '\'' +
                ", alto=" + alto +
                ", largo=" + largo +
                ", ancho=" + ancho +
                ", dureza=" + dureza +
                ", textura='" + textura + '\'' +
                ", sonidoGolpeo='" + sonidoGolpeo + '\'' +
                ", material='" + material + '\'' +
                ", apilable=" + apilable +
                ", tamanioPila=" + tamanioPila +
                ", colocado=" + colocado +
                ", posicionX=" + posicionX +
                ", posicionY=" + posicionY +
                ", posicionZ=" + posicionZ +
                ", golpesRecibidos=" + golpesRecibidos +
                ", golpesParaQuitar=" + golpesParaQuitar +
                '}';
    }

    public void tallar(){
        if (!this.colocado){
            System.out.println("El bloque de tronco no esta colocado.");
            return;
        } if (this.corteza){
            System.out.println("Tallando el bloque de tronco "+ this.nombre);
            this.corteza = false;
        }else {
            System.out.println("No tiene corteza para tallar.");
        }
    }

    @Override
    public void golpear(){
        super.golpear();
        System.out.println("Expulsa aserrin.");
    }
}
