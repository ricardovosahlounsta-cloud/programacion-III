package tp2.factorymethod;

// Rol: Fabrica Concreta (decide crear un Iphone15).
public class FactoryIphone15 implements IphoneFactory {
    @Override
    public Iphone crearIphone() {
        return new Iphone15();
    }
}