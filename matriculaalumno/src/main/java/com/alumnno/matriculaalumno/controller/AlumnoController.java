package com.alumnno.matriculaalumno.controller;

import org.springframework.web.bind.annotation.*;
// import org.springframework.http.ResponseEntity;
// import org.springframework.http.HttpStatus;
// import org.springframework.http.MediaType;
// import org.springframework.web.bind.annotation.RequestBody;
// import org.springframework.web.bind.annotation.PathVariable;
// import java.util.*;

// import com.alumnno.matriculaalumno.model.Alumno;
// import com.alumnno.matriculaalumno.repository.AlumnoRepository;

@RestController
@RequestMapping(value = "api/alumno", produces = "application/json")
public class AlumnoController {

    // private AlumnoRepository alumnoRepository;

    // public AlumnoController(AlumnoRepository employeeRepository){
    //     this.alumnoRepository = employeeRepository;
    // }

    // @PostMapping(value = "/", produces = MediaType.APPLICATION_JSON_VALUE)
    // public ResponseEntity<Integer> create(@RequestBody Alumno a){
    //     alumnoRepository.save(a);
    //     alumnoRepository.flush();
    //     return new ResponseEntity<Integer>(a.getId(),HttpStatus.CREATED);
    // }

    // @GetMapping(value = "/{id}", produces = MediaType.APPLICATION_JSON_VALUE)
    // public ResponseEntity<Alumno> alumnos(@PathVariable int id){
    //     Optional<Alumno> optinalEntity = alumnoRepository.findById(id);
    //     if(optinalEntity.isPresent())
    //         return new ResponseEntity<Alumno>(
    //             optinalEntity.get(), HttpStatus.OK);
    //     else
    //         return new ResponseEntity<Alumno>(HttpStatus.NOT_FOUND);
    // }
    
}
