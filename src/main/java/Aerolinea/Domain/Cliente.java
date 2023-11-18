package Aerolinea.Domain;

import javax.persistence.*;
import lombok.Data;

@Data
@Entity
@Table(name = "cliente")

public class Cliente {

    private static final long serialVersionUID = 1L;

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long idCliente;//Hibeernate lo convierte en id_cliente 
    private String nombre;
    private String apellidos;
    private String correo;
    private String telefono;
    private String nacionalidad;
    private String fechadenacimiento;
    private String pasaporte;
    private String contraseña;

    public Cliente() {
    }

    public Cliente(String nombre, String apellidos, String correo, String telefono, String nacionalidad, String fechadenacimiento, String pasaporte, String contraseña) {
        this.nombre = nombre;
        this.apellidos = apellidos;
        this.correo = correo;
        this.telefono = telefono;
        this.nacionalidad = nacionalidad;
        this.fechadenacimiento = fechadenacimiento;
        this.pasaporte = pasaporte;
        this.contraseña = contraseña;
    }
}



    

