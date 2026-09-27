package tp2.factorymethod;

// Rol: Fabrica Concreta (decide crear un IphoneSE).
public class FactoryIphoneSE implements IphoneFactory {
    @Override
    public Iphone crearIphone() {
        return new IphoneSE();
    }
}