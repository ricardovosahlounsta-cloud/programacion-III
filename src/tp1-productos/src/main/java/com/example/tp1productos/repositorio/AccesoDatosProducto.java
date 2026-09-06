package com.example.tp1productos.repositorio;

import com.example.tp1productos.modelo.Producto;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

// Esta interfaz nos da automaticamente los metodos para guardar, buscar, borrar, etc.
// No hace falta escribir el codigo, Spring lo genera solo
public interface AccesoDatosProducto extends JpaRepository<Producto, Long> {

    // Consulta propia: busca todos los productos de una categoria
    List<Producto> findByCategoria(String categoria);
}