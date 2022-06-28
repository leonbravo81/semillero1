package com.desarrollo.skills.entidades;

import lombok.Getter;
import lombok.Setter;
//Clase tipo entidad para guardar las profesiones de un profesional
@Getter
@Setter
public class Profesiones {
    private Long Id;
    private String Nombre;
    private boolean Estado;
}
