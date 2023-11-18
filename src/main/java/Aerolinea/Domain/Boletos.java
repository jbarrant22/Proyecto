
package Aerolinea.Domain;

import java.io.Serializable;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;
import lombok.Data;

@Data
@Entity
@Table(name="articulo")
public class Boletos implements Serializable {
            private static final long serialVersionUID = 1L;
    
    @Id
    @GeneratedValue(strategy =GenerationType.IDENTITY)
    @Column(name="id_boletos")
     private Long idBoletos;//Hibeernate lo convierte en id_boletos
    private Long idPaises;
    private String descripcion;
    private String detalle;
    private String precio;
    private String destino;
    private boolean activo;

    public Boletos(Long idPaises, String descripcion, String detalle, String precio, String destino, boolean activo) {
        this.idPaises = idPaises;
        this.descripcion = descripcion;
        this.detalle = detalle;
        this.precio = precio;
        this.destino = destino;
        this.activo = activo;
    }
    
    
}

    

