public class Jugador {
    private int idJugador;
    private String nombre;
    private String apellido;
    private int numeroJersey;
    private String posicion;
    
    public jugador() {}

    public jugador(int idJugador, String nombre, String apellido, int numeroJersey, String posicion) {
        this.idJugador = idJugador;
        this.nombre = nombre;
        this.apellido = apellido;
        this.numeroJersey = numeroJersey;
        this.posicion = posicion;
    }

    public int getIdJugador() { return idJugador; }
    public void setIdJugador(int idJugador) { this.idJugador = idJugador; }

    public String getNombre() { return nombre; }
    public void setNombre(String nombre) { this.nombre = nombre; }

    public String getApellido() { return apellido; }
    public void setApellido(String apellido) { this.apellido = apellido; }

    public int getNumeroJersey() { return numeroJersey; }
    public void setNumeroJersey(int numeroJersey) { this.numeroJersey = numeroJersey; }

    public String getPosicion() {return posicion;  }
    public void setPosicion(String posicion) {this.posicion = posicion; }
}
