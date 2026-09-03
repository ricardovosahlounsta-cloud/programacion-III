package com.example.tp1productos.repositorio;

import com.example.tp1productos.modelo.Producto;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface ProductoRepositorio extends JpaRepository<Producto, Long> {

    // Consulta: buscar productos por categoría
    List<Producto> findByCategoria(String categoria);
}