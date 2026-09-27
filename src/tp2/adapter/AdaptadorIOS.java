package tp2.adapter;

// Rol: Adapter (traduce el metodo viejo al metodo nuevo).
public class AdaptadorIOS implements SistemaOperativo {

    private final IOS6Antiguo sistemaViejo;

    public AdaptadorIOS(IOS6Antiguo sistemaViejo) {
        this.sistemaViejo = sistemaViejo;
    }

    @Override
    public void ejecutarApp(String nombreApp) {
        sistemaViejo.correrAplicacion(nombreApp);
    }
}