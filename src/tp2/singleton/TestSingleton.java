package tp2.singleton;

public class TestSingleton {
    public static void main(String[] args) {
        Director director1 = Director.obtenerInstancia();
        director1.atenderConsulta("Alumno Juan Perez");

        Director director2 = Director.obtenerInstancia();
        director2.atenderConsulta("Profesora Ana Lopez");

        System.out.println("¿Es la misma instancia? " + (director1 == director2));
    }
}