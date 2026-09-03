package com.example.tp1productos;

import com.example.tp1productos.modelo.Producto;
import com.example.tp1productos.repositorio.ProductoRepositorio;
import org.springframework.boot.CommandLineRunner;
import org.springframework.data.domain.Sort;
import org.springframework.stereotype.Component;

import java.util.List;

@Component
public class EjecutorDemo implements CommandLineRunner {

    private final ProductoRepositorio productoRepositorio;

    public EjecutorDemo(ProductoRepositorio productoRepositorio) {
        this.productoRepositorio = productoRepositorio;
    }

    @Override
    public void run(String... args) throws Exception {

        System.out.println("===== 1. Creando productos =====");
        productoRepositorio.save(new Producto("Mouse", "Perifericos", 5500.0, 20));
        productoRepositorio.save(new Producto("Teclado", "Perifericos", 12000.0, 15));
        productoRepositorio.save(new Producto("Monitor", "Pantallas", 85000.0, 8));
        productoRepositorio.save(new Producto("Auriculares", "Audio", 9500.0, 30));

        System.out.println("\n===== 2. Listado ordenado por precio (ascendente) =====");
        List<Producto> ordenados = productoRepositorio.findAll(Sort.by(Sort.Direction.ASC, "precio"));
        ordenados.forEach(System.out::println);

        System.out.println("\n===== 3. Modificando un parametro (precio del Mouse) =====");
        Producto mouse = productoRepositorio.findByCategoria("Perifericos").get(0);
        System.out.println("Antes: " + mouse);
        mouse.setPrecio(4800.0);
        productoRepositorio.save(mouse);
        System.out.println("Despues: " + productoRepositorio.findById(mouse.getId()).get());

        System.out.println("\n===== 4. Borrando un producto (Auriculares) =====");
        List<Producto> auriculares = productoRepositorio.findAll().stream()
                .filter(p -> p.getNombre().equals("Auriculares"))
                .toList();
        productoRepositorio.deleteAll(auriculares);

        System.out.println("\n===== 5. Listado final =====");
        productoRepositorio.findAll(Sort.by(Sort.Direction.ASC, "precio"))
                .forEach(System.out::println);
    }
}