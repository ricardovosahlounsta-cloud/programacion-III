package tp2.singleton;

// Rol: Singleton (unica instancia compartida).
public class Director {

    private static Director instancia;
    private final String nombre;
    private int consultasAtendidas;

    private Director() {
        this.nombre = "Ing. Marcela Torres";
        this.consultasAtendidas = 0;
    }

    public static Director obtenerInstancia() {
        if (instancia == null) {
            instancia = new Director();
        }
        return instancia;
    }

    public void atenderConsulta(String quienConsulta) {
        consultasAtendidas++;
        System.out.println(quienConsulta + " consulta al director " + nombre
                + " (consulta numero " + consultasAtendidas + ")");
    }
}