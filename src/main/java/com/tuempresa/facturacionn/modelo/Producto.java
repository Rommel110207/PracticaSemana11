package com.tuempresa.facturacionn.modelo;
import javax.persistence.*;
import org.openxava.annotations.*;
import lombok.*;

@Entity @Getter @Setter
public class Producto {
    @Id @Column(length=9)
    int numero;

    @Column(length=50) @Required
    String descripcion;

    @ManyToOne( // La referencia se almacena como una relación en la base de datos
            fetch=FetchType.LAZY,
            optional=true)
    @DescriptionsList
    Categoria categoria; // Una referencia Java convencional
}
