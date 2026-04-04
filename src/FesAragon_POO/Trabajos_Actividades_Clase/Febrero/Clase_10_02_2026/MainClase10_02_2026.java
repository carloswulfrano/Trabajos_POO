import FesAragon_POO.Trabajos_Actividades_Clase.Febrero.Clase_10_02_2026.Coche;

void main() {
   // Closet c1=new Closet();
   // Closet c2=new Closet("Café", 1.8f);
    //c2.setAltura(2.9f);
    //System.out.println("La altura es de "+c2.getAltura()+" metros");

    Coche c =  new Coche("metal", "Rojo",2.0f, 1.5f, 50);
    Coche c2 = new Coche();

    c.setAltura(1.9f);
    System.out.println(c.getAltura());

    c.setAncho(1.5f);
    System.out.println(c.getAncho());

    c.setVelocidad(50);
    System.out.println(c.getVelocidad());

    System.out.println(c.getMaterial());
    System.out.println(c.getColor());

    c2.mueveAtras();
    c2.mueveAtras();
    c2.abrePuerta();
    c2.cierraPuerta();

}
