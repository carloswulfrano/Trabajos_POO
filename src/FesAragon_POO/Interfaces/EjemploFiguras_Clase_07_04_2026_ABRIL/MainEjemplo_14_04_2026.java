import FesAragon_POO.Interfaces.EjemploFiguras_Clase_07_04_2026_ABRIL.Circulo;
import FesAragon_POO.Interfaces.EjemploFiguras_Clase_07_04_2026_ABRIL.Cuadrado;
import FesAragon_POO.Interfaces.EjemploFiguras_Clase_07_04_2026_ABRIL.Figura;

void main() {

    ArrayList<Circulo> listaCirculo = new ArrayList<>();
    //Meter circulos en la lista.
    ArrayList<Cuadrado> listaCuadrado = new ArrayList<>();
    //Meter cuadradros en la lista

    //Polimorfismo
    ArrayList<Figura> listaFiguras = new ArrayList<>();
    listaFiguras.add(new Circulo());
    listaFiguras.add(new Circulo());
    listaFiguras.add(new Circulo());
    listaFiguras.add(new Cuadrado(2.0f, 3.0f, 0.0f, 0.0f));
    listaFiguras.add(new Cuadrado());
    listaFiguras.add(new Cuadrado());
    listaFiguras.add(new Cuadrado());

    for (Figura fig : listaFiguras){
        System.out.println(fig.calcularArea());
    }

}