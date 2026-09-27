package tp2.adapter;

public class TestAdapter {
    public static void main(String[] args) {
        IOS6Antiguo iosViejo = new IOS6Antiguo();
        SistemaOperativo sistema = new AdaptadorIOS(iosViejo);
        sistema.ejecutarApp("Instagram");
    }
}