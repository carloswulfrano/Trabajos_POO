import FesAragon_POO.Minecraft.Mundo.Bloque;
import FesAragon_POO.Minecraft.Mundo.BloqueTronco;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
void main() {
    System.out.println("Spawwneando....");
    Bloque b1 = new Bloque("Bloque", 3, 3, 3, 100.0f, "Rugoza", "Pocc", "Roca", true, 64, false, 0, 0, 0, 0, 10);
    Bloque b2 = new Bloque("Lisa", "Crack", "Metal", 100);
    System.out.println(b1);
    System.out.println("\n");

    System.out.println(b2);
    System.out.println("\n");

    b1.colocar(20,3,20);

    b1.golpear();
    b1.golpear();
    b1.golpear();
    b1.golpear();
    b1.golpear();
    b1.golpear();
    b1.golpear();
    b1.golpear();
    b1.golpear();
    b1.golpear();
    //bloque quitado del mundo
    b1.golpear();

    System.out.println("\n");

    BloqueTronco bc1 = new BloqueTronco("Poroso", "Tlack", "Madera", 5);
    System.out.println(bc1);
    bc1.colocar(20, 4, 20);
    bc1.golpear();
    bc1.golpear();
    bc1.golpear();
    bc1.golpear();
    bc1.golpear();

    System.out.println("\n");

    bc1.tallar();
    bc1.colocar(203, 43, 22);
    bc1.tallar();
    System.out.println(bc1);
    bc1.golpear();
    bc1.golpear();
    bc1.golpear();
    bc1.golpear();
    bc1.golpear();
    bc1.golpear();
    System.out.println(bc1);

}
