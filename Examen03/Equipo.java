package Examen03;

public class Equipo {

    private int idEquipo;
    private String nombre;
    private String ciudad;
    private String estadio;
    private int anioFundacion;

    public Equipo() {
        this.idEquipo = 0;
        this.nombre = "";
        this.ciudad = "";
        this.estadio = "";
        this.anioFundacion = 0;
    }

    public Equipo(int idEquipo, String nombre, String ciudad, String estadio, int anioFundacion) {
        this.idEquipo = idEquipo;
        this.nombre = nombre;
        this.ciudad = ciudad;
        this.estadio = estadio;
        this.anioFundacion = anioFundacion;
    }

    public int getIdEquipo() { return idEquipo; }
    public void setIdEquipo(int idEquipo) { this.idEquipo = idEquipo; }

    public String getNombre() { return nombre; }
    public void setNombre(String nombre) { this.nombre = nombre; }

    public String getCiudad() { return ciudad; }
    public void setCiudad(String ciudad) { this.ciudad = ciudad; }

    public String getEstadio() { return estadio; }
    public void setEstadio(String estadio) { this.estadio = estadio; }

    public int getAnioFundacion() { return anioFundacion; }
    public void setAnioFundacion(int anioFundacion) { this.anioFundacion = anioFundacion; }

    public String mostrarDetalle() {
        return String.format("ID: %d | Nombre: %s | Ciudad: %s | Estadio: %s | Año Fundacion: %d",
                idEquipo, nombre, ciudad, estadio, anioFundacion);
    }

    @Override
    public String toString() { return mostrarDetalle(); }
}