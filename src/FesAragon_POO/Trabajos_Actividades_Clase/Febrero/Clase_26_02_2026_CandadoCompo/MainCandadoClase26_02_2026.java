import FesAragon_POO.Trabajos_Actividades_Clase.Febrero.Clase_26_02_2026_CandadoCompo.Candado;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
void main() {

    Candado can = new Candado();
    System.out.println(can);

    can.girarEngrane(0, 2);
    System.out.println(can);

    can.setCombinacion("123");
    System.out.println(can);

    can.abrir();

    can.girarEngrane(0, 9);
    can.girarEngrane(1, 2);
    can.girarEngrane(2, 3);
    can.abrir();

}
