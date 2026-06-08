import modelo.jugador;
import java.util.List;

public class Jugador{
    private JugadorDAO dao;

    public Jugador() {
        this.dao = new JugadorDAO();
    }

    // Método que el sistema llamará cuando el usuario llene un formulario y presione "Guardar"
    public String agregarJugador(String nombre, String apellido, int jersey, String posicion) {
        // Validaciones básicas de negocio
        if (nombre.isEmpty() || apellido.isEmpty() || jersey <= 0) {
            return "Error: Datos inválidos.";
        }
        
        // Creamos el objeto con los datos recibidos
        jugador nuevoJugador = new jugador(0, nombre, apellido, jersey, posicion);
        
        // Le pedimos al DAO que lo guarde en la BD
        boolean exito = dao.registrarJugador(nuevoJugador);
        
        if (exito) {
            return "¡Jugador de fútbol americano registrado con éxito!";
        } else {
            return "No se pudo guardar el jugador.";
        }
    }

    // Método para obtener los datos y mandarlos a pintar en pantalla
    public List<jugador> obtenerRoster() {
        return dao.listarJugadores();
    }
}