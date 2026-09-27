package tp2.abstractfactory;

// Rol: Producto Concreto (Samsung).
public class GalaxyPhone implements Telefono {
    @Override
    public void mostrarTelefono() {
        System.out.println("Telefono: Galaxy Phone (Samsung, sistema operativo Android).");
    }
}