package com.producto.productoapi.controller;

import java.util.*;

import com.fasterxml.jackson.annotation.ObjectIdGenerator.IdKey;
import com.producto.productoapi.model.Producto;

import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import lombok.ToString;

@RestController
@RequestMapping(value = "api/producto", produces = "application/json")
public class ProductoController {
    private Map<String,Producto> productos;

    public ProductoController(){
        productos = new HashMap<String,Producto>();
        Producto P = new Producto();
        String id = UUID.randomUUID().toString();
        P.setId(id);
        P.setName("name");
        P.setCategory("category");
        P.setPrice(12.5);
        P.setStock(15);
        productos.put(id,P);
    }
    @GetMapping(value = "/", produces = MediaType.APPLICATION_JSON_VALUE)
    public ResponseEntity<Map<String, Producto>> listall(){
        return new ResponseEntity<Map<String, Producto>>(
            productos, HttpStatus.OK
        );
    }

    @PostMapping(value = "/", produces = MediaType.APPLICATION_JSON_VALUE)
    public ResponseEntity<String> add(@RequestBody Producto p){
        String id =UUID.randomUUID().toString();
        p.setId(id);
        productos.put(id, p);
        return  new ResponseEntity<String>(id,
            HttpStatus.CREATED);
    }

    @GetMapping(value = "/{id}", produces = MediaType.APPLICATION_JSON_VALUE)
    public ResponseEntity<Producto> find(@PathVariable String id){
        if(productos.containsKey(id)){
            Producto p = productos.get(id);
            return new ResponseEntity<Producto>(p, HttpStatus.OK);
        }else{
            return new ResponseEntity<Producto>(HttpStatus.NOT_FOUND);
        }
    }
}
