package tp2.abstractfactory;

// Rol: Producto Concreto (Samsung).
public class Samsung implements Notebook {
    @Override
    public void mostrarNotebook() {
        System.out.println("Notebook: Samsung (Samsung, sistema operativo Windows).");
    }
}