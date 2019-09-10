package co.com.k4soft.apipersona.entity;

import lombok.Data;

import javax.persistence.*;

@Data
@Entity
@Table(name = "persona")
public class Persona {

    @Id
    @GeneratedValue
    @Column(name="id")
    private Long id;
    @Column(name = "nombre")
    private String nombre;
    @Column(name="apellido")
    private String apellido;
    @Column(name = "telefono")
    private String telefono;
}
