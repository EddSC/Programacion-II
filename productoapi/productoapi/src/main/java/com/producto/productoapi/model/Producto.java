package com.producto.productoapi.model;

import lombok.*;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class Producto {
    private String id;
    private String name;
    private String category;
    private double price;
    private int stock;

}
