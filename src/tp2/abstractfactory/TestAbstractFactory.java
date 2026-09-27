package tp2.abstractfactory;

public class TestAbstractFactory {
    public static void main(String[] args) {
        System.out.println("--- Set Apple ---");
        TecnologiaFactory factoryApple = new FactoryApple();
        factoryApple.crearTelefono().mostrarTelefono();
        factoryApple.crearNotebook().mostrarNotebook();

        System.out.println("--- Set Samsung ---");
        TecnologiaFactory factorySamsung = new FactorySamsung();
        factorySamsung.crearTelefono().mostrarTelefono();
        factorySamsung.crearNotebook().mostrarNotebook();
    }
}