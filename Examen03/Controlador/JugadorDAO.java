import modelo.conexionbd;
import modelo.jugador;
import java.sql.*;
import java.util.ArrayList;
import java.util.List;

public class JugadorDAO {
    public boolean registrarJugador(jugador jug) {
        String sql = "INSERT INTO jugadores (nombre, apellido, numero_jersey, posicion) VALUES (?, ?, ?, ?)";
        try (Connection con = ConexionBD.getConexion(); 
            PreparedStatement ps = con.prepareStatement(sql)) {

            ps.setString(1, jug.getNombre());
            ps.setString(2, jug.getApellido());
            ps.setInt(3, jug.getNumeroJersey());
            ps.setString(4, jug.getPosicion());

            return ps.executeUpdate() > 0;
        }catch (SQLException e) {
            System.out.println("Error al registrar: " + e.getMessage());
            return false;
        }
    }
    public List<jugador> listarJugadores() {
        List<jugador> lista = new ArrayList<>();
        String sql = "SELECT * FROM jugadores";
        try (Connection con = ConexionBD.getConexion()
            PreparedStatement ps = con.prepareStatement(sql);
            ResultSet rs = ps.executeQuery()){

            while (rs.next()) {
                jugador jug = new jugador();
                jug.setIdJugador(rs.getInt("id_jugador"));
                jug.setNombre(rs.getString("nombre"));
                jug.setApellido(rs.getString("apellido"));
                jug.setNumeroJersey(rs.getInt("numero_jersey"));
                jug.setPosicion(rs.getString("posicion"));
                lista.add(jug);    
            }
        } catch (SQLException e){
            System.out.println("Error al listar: " + e.getMessage());
        }
        return lista;
    }
}
