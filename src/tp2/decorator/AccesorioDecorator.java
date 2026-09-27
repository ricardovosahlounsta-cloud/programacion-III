package tp2.decorator;

// Rol: Decorador base (guarda una referencia al Iphone que envuelve).
public abstract class AccesorioDecorator implements Iphone {

    protected final Iphone iphoneDecorado;

    public AccesorioDecorator(Iphone iphoneDecorado) {
        this.iphoneDecorado = iphoneDecorado;
    }
}