package co.com.k4soft.apipersona.entity;


import lombok.Data;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Data
@Entity
@Table(name = "tipo_documento")
public class TipoDocumento {

    @Id
    @Column(name = "id")
    private Integer id;

    @Column(name ="nombre")
    private String nombre;

    @Column(name ="sigla")
    private String sigla;
}
