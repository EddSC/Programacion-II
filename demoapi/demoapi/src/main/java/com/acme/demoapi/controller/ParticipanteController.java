package com.acme.demoapi.controller;


import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.Date;
import java.util.HashMap;
import java.util.Map;
import java.util.UUID;

import com.acme.demoapi.model.Participante;

@RestController
@RequestMapping(value = "api/participante", produces = "application/json")
public class ParticipanteController {
    private Map<String,Participante> participantes;

    public ParticipanteController(){
        participantes = new HashMap<String,Participante>();
        Participante P = new Participante();
        P.setAddress("direccion");
        P.setEmail("email@mail.com");
        P.setName("name");
        P.setPhone("999999999");
        P.setBirthDate(new Date());
        String id = UUID.randomUUID().toString();
        P.setId(id);
        participantes.put(id,P);
    }

    @GetMapping(value = "/", produces = MediaType.APPLICATION_JSON_VALUE)
    public ResponseEntity<Map<String, Participante>> listall(){
        return new ResponseEntity<Map<String, Participante>>(
            participantes, HttpStatus.OK
        );
    }
}
