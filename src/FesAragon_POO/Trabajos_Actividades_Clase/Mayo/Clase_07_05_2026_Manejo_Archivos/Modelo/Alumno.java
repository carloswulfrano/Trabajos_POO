package FesAragon_POO.Trabajos_Actividades_Clase.Mayo.Clase_07_05_2026_Manejo_Archivos.Modelo;

import lombok.*;

import java.io.Serializable;

@AllArgsConstructor
@NoArgsConstructor
@Setter
@Getter
@ToString

public class Alumno implements Serializable {

    private String numeroCuenta;
    private String nombre;
    private String apellidos;
    private Double promedio;


}
