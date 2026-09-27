package tp2.factorymethod;

public class TestFactoryMethod {
    public static void main(String[] args) {
        IphoneFactory factory15 = new FactoryIphone15();
        Iphone modelo1 = factory15.crearIphone();
        modelo1.mostrarModelo();

        IphoneFactory factorySE = new FactoryIphoneSE();
        Iphone modelo2 = factorySE.crearIphone();
        modelo2.mostrarModelo();
    }
}