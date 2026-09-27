package tp2.abstractfactory;

// Rol: Producto Concreto (Apple).
public class MacBook implements Notebook {
    @Override
    public void mostrarNotebook() {
        System.out.println("Notebook: MacBook (Apple, sistema operativo macOS).");
    }
}