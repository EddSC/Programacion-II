package com.matricula.alumnoapi.repository;

import org.springframework.data.jpa.repository.*;
import org.springframework.stereotype.Repository;

import com.matricula.alumnoapi.model.*;

@Repository
public interface AlumnoRepository extends JpaRepository<Alumno, Integer> {
    
}
