package tp2.decorator;

// Rol: Decorador Concreto (agrega funda y su costo).
public class ConFundaProtectora extends AccesorioDecorator {

    public ConFundaProtectora(Iphone iphoneDecorado) {
        super(iphoneDecorado);
    }

    @Override
    public String getDescripcion() {
        return iphoneDecorado.getDescripcion() + " + Funda protectora";
    }

    @Override
    public double getPrecio() {
        return iphoneDecorado.getPrecio() + 25.0;
    }
}