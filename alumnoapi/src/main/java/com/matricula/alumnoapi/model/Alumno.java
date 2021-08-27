package com.matricula.alumnoapi.model;

import java.util.Date;
import lombok.*;
import javax.persistence.*;
import org.springframework.format.annotation.DateTimeFormat;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Builder

@Entity
@Table(name = "t_alumnos")

public class Alumno {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;
    private String nombre;
    @DateTimeFormat(pattern = "dd/MM/yyyy")
    private Date fechaNacimiento;
    private String genero;
    private String carrera;
}
