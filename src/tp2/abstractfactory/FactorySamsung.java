package tp2.abstractfactory;

// Rol: Fabrica Concreta (arma el "set" de productos Samsung).
public class FactorySamsung implements TecnologiaFactory {
    @Override
    public Telefono crearTelefono() {
        return new GalaxyPhone();
    }

    @Override
    public Notebook crearNotebook() {
        return new Samsung();
    }
}