import Controlador.JugadorControlador;
import modelo.jugador;

public class Principal {
    public static void main(String[] args) {
        JugadorControlador controlador = new JugadorControlador();

        // 1. Probamos registrar un jugador (como si lo escribieras en una app)
        String respuesta = controlador.agregarJugador("Patrick", "Mahomes", 15, "QB");
        System.out.println(respuesta);

        // 2. Probamos listar los jugadores que hay en la base de datos
        System.out.println("\n--- ROSTER DE JUGADORES ---");
        for (jugador j : controlador.obtenerRoster()) {
            System.out.println("#" + j.getNumeroJersey() + " " + j.getNombre() + " " + j.getApellido() + " - Posición: " + j.getPosicion());
        }
    }
}