package tp2.factorymethod;

// Rol: Producto Concreto.
public class IphoneSE implements Iphone {
    @Override
    public void mostrarModelo() {
        System.out.println("iPhone SE: chip A15, diseño compacto y economico.");
    }
}