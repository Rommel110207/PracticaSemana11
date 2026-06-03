package com.tuempresa.facturacionn.modelo;

import javax.persistence.*;
import org.openxava.annotations.*;
import lombok.*;

@View(name="Simple", // Esta vista solo se usará cuando se especifique ?Simple?
        members="numero, nombre" // Muestra únicamente numero y nombre en la misma línea
)



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
