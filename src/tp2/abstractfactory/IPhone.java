package tp2.abstractfactory;

// Rol: Producto Concreto (Apple).
public class IPhone implements Telefono {
    @Override
    public void mostrarTelefono() {
        System.out.println("Telefono: iPhone (Apple, sistema operativo iOS).");
    }
}