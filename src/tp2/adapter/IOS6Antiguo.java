package tp2.adapter;

// Rol: Adaptee (la clase vieja que ya existe, con un metodo distinto
// al que espera el codigo nuevo. No la podemos modificar).
public class IOS6Antiguo {
    public void correrAplicacion(String app) {
        System.out.println("iOS 6 (modo antiguo) ejecutando: " + app);
    }
}