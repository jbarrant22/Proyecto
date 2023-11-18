
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
@Table(name="paises")

public class Paises implements Serializable {
        private static final long serialVersionUID = 1L;
    
    @Id
    @GeneratedValue(strategy =GenerationType.IDENTITY)
    @Column(name="id_paises")
     private Long idPaises;//Hibeernate lo convierte en id_paises
    private String descripcion;
    private boolean activo;

    public Paises(String descripcion, boolean activo) {
        this.descripcion = descripcion;
        this.activo = activo;
    }

    public Paises() {
    }
}

    

