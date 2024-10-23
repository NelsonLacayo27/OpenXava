package com.tuempresa.facturacion.modelo;

import javax.persistence.*;
import javax.persistence.Entity;

import org.apache.logging.log4j.core.config.plugins.validation.constraints.Required;
import org.hibernate.annotations.*;
import org.openxava.annotations.*;

import lombok.*;

@Entity
@Getter @Setter
public class Categoria {
@Id 
@Hidden
@GeneratedValue(generator="system-uuid")
@GenericGenerator(name="system-uuid", strategy="uuid")
@Column(length=32)
@Required

String oid;
@Column(length=50)
String descripcion;


}
