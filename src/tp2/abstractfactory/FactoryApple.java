package tp2.abstractfactory;

// Rol: Fabrica Concreta (arma el "set" de productos Apple).
public class FactoryApple implements TecnologiaFactory {
    @Override
    public Telefono crearTelefono() {
        return new IPhone();
    }

    @Override
    public Notebook crearNotebook() {
        return new MacBook();
    }
}