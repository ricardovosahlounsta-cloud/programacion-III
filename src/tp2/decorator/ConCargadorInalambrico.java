package tp2.decorator;

// Rol: Decorador Concreto (agrega cargador y su costo).
public class ConCargadorInalambrico extends AccesorioDecorator {

    public ConCargadorInalambrico(Iphone iphoneDecorado) {
        super(iphoneDecorado);
    }

    @Override
    public String getDescripcion() {
        return iphoneDecorado.getDescripcion() + " + Cargador inalambrico";
    }

    @Override
    public double getPrecio() {
        return iphoneDecorado.getPrecio() + 45.0;
    }
}