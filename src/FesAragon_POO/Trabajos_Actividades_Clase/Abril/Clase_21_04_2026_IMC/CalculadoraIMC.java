package FesAragon_POO.Trabajos_Actividades_Clase.Abril.Clase_21_04_2026_IMC;
import lombok.*;

@NoArgsConstructor
@AllArgsConstructor
@Getter
@Setter
@ToString
@EqualsAndHashCode

public class CalculadoraIMC {

    private double peso;
    private double altura;
    private double imc;


    public void calcularIMC(){
        this.imc = this.peso / (this.altura * this.altura);
    }


}
