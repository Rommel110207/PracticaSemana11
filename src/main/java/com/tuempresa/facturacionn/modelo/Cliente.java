package com.tuempresa.facturacionn.modelo;

import javax.persistence.*;
import org.openxava.annotations.*;
import lombok.*;
@Entity
@Getter @Setter
public class Cliente {
    @Id
    @Column (length = 6)

    int numero;

    @Column (length = 50)
    String nombre;

    @Embedded @NoFrame
    Direccion direccion; // Una referencia Java convencional
}
