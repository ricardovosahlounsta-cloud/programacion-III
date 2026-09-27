package tp2.factorymethod;

// Rol: Producto Concreto.
public class Iphone15 implements Iphone {
    @Override
    public void mostrarModelo() {
        System.out.println("iPhone 15: chip A16, camara principal de 48MP.");
    }
}