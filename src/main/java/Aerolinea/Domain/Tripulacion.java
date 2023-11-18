
package Aerolinea.Domain;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;
import lombok.Data;

@Data
@Entity
@Table(name = "tripulacion")

public class Tripulacion {
    
    private static final long serialVersionUID = 1L;

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long idTripulacion;//Hibeernate lo convierte en id_tripulacion
    private String nombre;
    private String apellidos;
    private String correo;
    private String puesto;
    private String telefono;
    private String nacionalidad;
    private String fechadenacimiento;
    private String pasaporte;
    private String contraseña;
    
}
