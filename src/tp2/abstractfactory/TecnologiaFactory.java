package tp2.abstractfactory;

// Rol: Fabrica Abstracta (define una familia de productos relacionados).
public interface TecnologiaFactory {
    Telefono crearTelefono();
    Notebook crearNotebook();
}