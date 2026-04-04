package FesAragon_POO.Minecraft.Mundo;


public class Bloque {

    private static final int MAX_PILA = 64;
    protected String nombre = "Bloque";
    protected int alto;
    protected int largo;
    protected int ancho;
    protected float dureza;
    protected String textura;
    protected String sonidoGolpeo;
    protected String material;
    protected boolean apilable;
    protected int tamanioPila;


    // Extra para el juego XD
    protected boolean colocado;
    protected int posicionX;
    protected int posicionY;
    protected int posicionZ;

    protected int golpesRecibidos;
    protected int golpesParaQuitar;


    public Bloque() {
    }

    public Bloque(String nombre, int alto, int largo, int ancho, float dureza, String textura, String sonidoGolpeo, String material, boolean apilable, int tamanioPila, boolean colocado, int posicionX, int posicionY, int posicionZ, int golpesRecibidos, int golpesParaQuitar) {
        this.nombre = nombre;
        this.alto = alto;
        this.largo = largo;
        this.ancho = ancho;
        this.dureza = dureza;
        this.textura = textura;
        this.sonidoGolpeo = sonidoGolpeo;
        this.material = material;
        this.apilable = apilable;
        this.tamanioPila = tamanioPila;
        this.colocado = colocado;
        this.posicionX = posicionX;
        this.posicionY = posicionY;
        this.posicionZ = posicionZ;
        this.golpesRecibidos = golpesRecibidos;
        this.golpesParaQuitar = golpesParaQuitar;
    }

    public Bloque(String textura, String sonidoGolpeo, String material, int golpesParaQuitar) {
        this.nombre = "Bloque";
        this.alto = 3;
        this.largo = 3;
        this.ancho = 3;
        this.dureza = 111.0f;
        this.textura = textura;
        this.sonidoGolpeo = sonidoGolpeo;
        this.material = material;
        this.apilable = true;
        this.tamanioPila = MAX_PILA;
        this.golpesParaQuitar = golpesParaQuitar;
    }

    public int getAlto() {
        return alto;
    }

    public void setAlto(int alto) {
        this.alto = alto;
    }

    public int getAncho() {
        return ancho;
    }

    public void setAncho(int ancho) {
        this.ancho = ancho;
    }

    public boolean isColocado() {
        return colocado;
    }

    public void setColocado(boolean colocado) {
        this.colocado = colocado;
    }

    public float getDureza() {
        return dureza;
    }

    public void setDureza(float dureza) {
        this.dureza = dureza;
    }

    public int getGolpesParaQuitar() {
        return golpesParaQuitar;
    }

    public void setGolpesParaQuitar(int golpesParaQuitar) {
        this.golpesParaQuitar = golpesParaQuitar;
    }

    public int getGolpesRecibidos() {
        return golpesRecibidos;
    }

    public void setGolpesRecibidos(int golpesRecibidos) {
        this.golpesRecibidos = golpesRecibidos;
    }

    public int getLargo() {
        return largo;
    }

    public void setLargo(int largo) {
        this.largo = largo;
    }

    public String getMaterial() {
        return material;
    }

    public void setMaterial(String material) {
        this.material = material;
    }

    public int getPosicionX() {
        return posicionX;
    }

    public void setPosicionX(int posicionX) {
        this.posicionX = posicionX;
    }

    public int getPosicionY() {
        return posicionY;
    }

    public void setPosicionY(int posicionY) {
        this.posicionY = posicionY;
    }

    public int getPosicionZ() {
        return posicionZ;
    }

    public void setPosicionZ(int posicionZ) {
        this.posicionZ = posicionZ;
    }

    public String getSonidoGolpeo() {
        return sonidoGolpeo;
    }

    public void setSonidoGolpeo(String sonidoGolpeo) {
        this.sonidoGolpeo = sonidoGolpeo;
    }

    public String getTextura() {
        return textura;
    }

    public void setTextura(String textura) {
        this.textura = textura;
    }

    public int getTamanioPila() {
        return tamanioPila;
    }

    public void setTamanioPila(int tamanioPila) {
        this.tamanioPila = tamanioPila;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public boolean isApilable() {
        return apilable;
    }

    public void setApilable(boolean apilable) {
        this.apilable = apilable;
    }

    @Override
    public String toString() {
        return "Bloque{" +
                "nombre='" + nombre + '\'' +
                ", alto=" + alto +
                ", largo=" + largo +
                ", ancho=" + ancho +
                ", dureza=" + dureza +
                ", textura='" + textura + '\'' +
                ", sonidoGolpeo='" + sonidoGolpeo + '\'' +
                ", material='" + material + '\'' +
                ", apilable=" + apilable +
                ", colocado=" + colocado +
                ", posicionX=" + posicionX +
                ", posicionY=" + posicionY +
                ", posicionZ=" + posicionZ +
                ", golpesRecibidos=" + golpesRecibidos +
                ", golpesParaQuitar=" + golpesParaQuitar +
                '}';
    }

    public void colocar(int x, int y, int z) {
        this.posicionX = x;
        this.posicionY = y;
        this.posicionZ = z;
        this.colocado = true;
        this.golpesRecibidos = 0;

        System.out.println("El bloque \"" + nombre + "\" fue colocado en ("
                + x + ", " + y + ", " + z + ").");
    }

    public void golpear() {
        if (!colocado) {
            System.out.println("no  colocado ");
            return;
        }

        golpesRecibidos++;

        System.out.println("Golpeando el bloque \"" + nombre + "\"... Sonido: " + sonidoGolpeo);
        System.out.println("Golpes: " + golpesRecibidos + "/" + golpesParaQuitar);

        if (golpesRecibidos >= golpesParaQuitar) {
            colocado = false;
            golpesRecibidos = 0;
            System.out.println("El bloque \"" + nombre + "\" fue quitado del mundo.");
        }
    }



}