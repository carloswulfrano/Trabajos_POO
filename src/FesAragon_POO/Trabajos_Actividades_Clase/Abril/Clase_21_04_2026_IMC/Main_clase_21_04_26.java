import FesAragon_POO.Trabajos_Actividades_Clase.Abril.Clase_21_04_2026_IMC.CalculadoraIMC;

void main() {

    CalculadoraIMC calculadoraIMC = new CalculadoraIMC();
    Scanner teclado = new Scanner(System.in);

    try {
        System.out.println("Ingrese su peso: ");
        calculadoraIMC.setPeso(teclado.nextDouble());

        System.out.println("Ingrese su altura: ");
        calculadoraIMC.setAltura(teclado.nextDouble());

        Integer numero = new Integer(10);
        numero = null;
        System.out.println(numero.byteValue());

    } catch (InputMismatchException e) {
        System.out.println("Error, revisa tu entrada.");
        System.out.println(e.getMessage());
    } catch (NullPointerException e){
        System.out.println("Objeto nulo revisa tu entrada.");
        System.out.println(e.getMessage());
    } catch (Exception e){
        System.out.println("Error desconcido");
        System.out.println(e.getMessage());
    }

    calculadoraIMC.calcularIMC();
    System.out.println("Su IMC es: " + calculadoraIMC.getImc());

}