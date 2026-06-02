package FesAragon_POO.Proyecto_Final.Model;

import lombok.*;
import java.io.Serializable;

@NoArgsConstructor
@AllArgsConstructor
@Setter
@Getter
@ToString


public class Album implements Serializable {

    private String nombreAlbum;
    private String nombreBandaCantante;
    private String generoAlbum;
    private int numeroCanciones;

    private String descripcion;
    private String formato;
    private boolean esExplicit;
    private boolean esEdicionLimitada;
    private String rutaImagen;

}
