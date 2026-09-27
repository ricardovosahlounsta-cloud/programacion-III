package tp2.facade;

// Rol: Fachada (un solo metodo simple que ordena a todos los subsistemas).
public class ModoAvionFacade {

    private final WiFi wifi;
    private final Bluetooth bluetooth;
    private final RedCelular redCelular;
    private final GPS gps;

    public ModoAvionFacade() {
        this.wifi = new WiFi();
        this.bluetooth = new Bluetooth();
        this.redCelular = new RedCelular();
        this.gps = new GPS();
    }

    public void activar() {
        wifi.desactivar();
        bluetooth.desactivar();
        redCelular.desactivar();
        gps.mantenerActivo();
        System.out.println("Modo avion activado.");
    }
}