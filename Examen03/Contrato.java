package Examen03;

public class Contrato {

    private int idContrato;
    private int idJugador;
    private int idEquipo;
    private String fechaFirma;

    public Contrato() {
        this.idContrato = 0;
        this.idJugador = 0;
        this.idEquipo = 0;
        this.fechaFirma = "";
    }

    public Contrato(int idContrato, int idJugador, int idEquipo, String fechaFirma) {
        this.idContrato = idContrato;
        this.idJugador = idJugador;
        this.idEquipo = idEquipo;
        this.fechaFirma = fechaFirma;
    }

    public int getIdContrato() { return idContrato; }
    public void setIdContrato(int idContrato) { this.idContrato = idContrato; }

    public int getIdJugador() { return idJugador; }
    public void setIdJugador(int idJugador) { this.idJugador = idJugador; }

    public int getIdEquipo() { return idEquipo; }
    public void setIdEquipo(int idEquipo) { this.idEquipo = idEquipo; }

    public String getFechaFirma() { return fechaFirma; }
    public void setFechaFirma(String fechaFirma) { this.fechaFirma = fechaFirma; }

    public String mostrarDetalle() {
        return String.format("ID Contrato: %d | ID Jugador: %d | ID Equipo: %d | Fecha Firma: %s",
                idContrato, idJugador, idEquipo, fechaFirma);
    }

    @Override
    public String toString() { return mostrarDetalle(); }
}