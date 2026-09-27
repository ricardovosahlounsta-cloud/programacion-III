package tp2.decorator;

// Rol: Componente Concreto (el objeto "sin decorar").
public class IphoneBase implements Iphone {
    @Override
    public String getDescripcion() {
        return "iPhone 15";
    }

    @Override
    public double getPrecio() {
        return 999.0;
    }
}