package tp2.decorator;

public class TestDecorator {
    public static void main(String[] args) {
        Iphone iphoneSolo = new IphoneBase();
        System.out.println(iphoneSolo.getDescripcion() + " -> $" + iphoneSolo.getPrecio());

        Iphone iphoneConFunda = new ConFundaProtectora(iphoneSolo);
        System.out.println(iphoneConFunda.getDescripcion() + " -> $" + iphoneConFunda.getPrecio());

        Iphone iphoneCompleto = new ConCargadorInalambrico(iphoneConFunda);
        System.out.println(iphoneCompleto.getDescripcion() + " -> $" + iphoneCompleto.getPrecio());
    }
}