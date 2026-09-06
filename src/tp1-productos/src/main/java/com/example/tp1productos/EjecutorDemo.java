package com.example.tp1productos;

import com.example.tp1productos.modelo.Producto;
import com.example.tp1productos.repositorio.AccesoDatosProducto;
import org.springframework.boot.CommandLineRunner;
import org.springframework.data.domain.Sort;
import org.springframework.stereotype.Component;

import java.util.List;

// Esta clase corre sola apenas se levanta la aplicacion
// Aca hago las pruebas con valores fijos, como hacia antes con el main
@Component
public class EjecutorDemo implements CommandLineRunner {

    private AccesoDatosProducto accesoDatosProducto;

    // Spring me pasa el repositorio automaticamente aca
    public EjecutorDemo(AccesoDatosProducto accesoDatosProducto) {
        this.accesoDatosProducto = accesoDatosProducto;
    }

    @Override
    public void run(String... args) throws Exception {

        // 1) Creo productos con valores fijos
        System.out.println("===== 1. Creando productos =====");
        Producto p1 = new Producto("Mouse", "Perifericos", 5500.0, 20);
        Producto p2 = new Producto("Teclado", "Perifericos", 12000.0, 15);
        Producto p3 = new Producto("Monitor", "Pantallas", 85000.0, 8);
        Producto p4 = new Producto("Auriculares", "Audio", 9500.0, 30);

        accesoDatosProducto.save(p1);
        accesoDatosProducto.save(p2);
        accesoDatosProducto.save(p3);
        accesoDatosProducto.save(p4);

        // 2) Muestro el listado ordenado por precio
        System.out.println("\n===== 2. Listado ordenado por precio =====");
        List<Producto> listaOrdenada = accesoDatosProducto.findAll(Sort.by(Sort.Direction.ASC, "precio"));

        for (Producto p : listaOrdenada) {
            System.out.println(p);
        }

        // 3) Modifico un parametro: cambio el precio del Mouse
        System.out.println("\n===== 3. Modificando el precio del Mouse =====");
        List<Producto> perifericos = accesoDatosProducto.findByCategoria("Perifericos");
        Producto mouse = perifericos.get(0);

        System.out.println("Antes: " + mouse);
        mouse.setPrecio(4800.0);
        accesoDatosProducto.save(mouse);
        System.out.println("Despues: " + mouse);

        // 4) Borro un producto (Auriculares)
        System.out.println("\n===== 4. Borrando Auriculares =====");
        List<Producto> todosLosProductos = accesoDatosProducto.findAll();

        for (Producto p : todosLosProductos) {
            if (p.getNombre().equals("Auriculares")) {
                accesoDatosProducto.delete(p);
            }
        }

        // 5) Muestro el listado final
        System.out.println("\n===== 5. Listado final =====");
        List<Producto> listaFinal = accesoDatosProducto.findAll(Sort.by(Sort.Direction.ASC, "precio"));

        for (Producto p : listaFinal) {
            System.out.println(p);
        }
    }
}