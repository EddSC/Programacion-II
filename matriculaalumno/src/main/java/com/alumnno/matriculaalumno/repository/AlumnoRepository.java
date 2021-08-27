package com.alumnno.matriculaalumno.repository;

import org.springframework.stereotype.Repository;
import org.springframework.data.jpa.repository.*;
import com.alumnno.matriculaalumno.model.Alumno;

@Repository
public interface AlumnoRepository extends JpaRepository<Alumno, Integer>{

}
