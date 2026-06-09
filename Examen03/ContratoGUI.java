package Examen03;

import javax.swing.*;
import java.awt.*;
import java.sql.*;

public class ContratoGUI extends JFrame {

    JTextField txtIdContrato, txtIdJugador, txtIdEquipo, txtFecha;
    JButton btnGuardar, btnBuscar, btnActualizar, btnEliminar;

    public ContratoGUI() {
        setTitle("CRUD Contratos");
        setSize(500, 300);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLocationRelativeTo(null);

        JPanel panel = new JPanel();
        panel.setLayout(new GridLayout(6, 2, 10, 10));

        panel.add(new JLabel("ID Contrato"));
        txtIdContrato = new JTextField();
        panel.add(txtIdContrato);

        panel.add(new JLabel("ID Jugador"));
        txtIdJugador = new JTextField();
        panel.add(txtIdJugador);

        panel.add(new JLabel("ID Equipo"));
        txtIdEquipo = new JTextField();
        panel.add(txtIdEquipo);

        panel.add(new JLabel("Fecha Firma (AAAA-MM-DD)"));
        txtFecha = new JTextField();
        panel.add(txtFecha);

        btnGuardar = new JButton("Guardar");
        btnBuscar = new JButton("Buscar");
        btnActualizar = new JButton("Actualizar");
        btnEliminar = new JButton("Eliminar");

        panel.add(btnGuardar);
        panel.add(btnBuscar);
        panel.add(btnActualizar);
        panel.add(btnEliminar);

        add(panel);

        btnGuardar.addActionListener(e -> guardarContrato());
        btnBuscar.addActionListener(e -> buscarContrato());
        btnActualizar.addActionListener(e -> actualizarContrato());
        btnEliminar.addActionListener(e -> eliminarContrato());
    }

    public void guardarContrato() {
        try {
            Connection con = ConexionBD.getConexion();
            String sql = "INSERT INTO contratos(id_jugador, id_equipo, fecha_firma) VALUES(?,?,?)";
            PreparedStatement ps = con.prepareStatement(sql);
            ps.setInt(1, Integer.parseInt(txtIdJugador.getText()));
            ps.setInt(2, Integer.parseInt(txtIdEquipo.getText()));
            ps.setString(3, txtFecha.getText());

            ps.executeUpdate();
            JOptionPane.showMessageDialog(null, "Contrato guardado");
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "Error: " + e.getMessage());
        }
    }

    public void buscarContrato() {
        try {
            Connection con = ConexionBD.getConexion();
            String sql = "SELECT * FROM contratos WHERE id_contrato=?";
            PreparedStatement ps = con.prepareStatement(sql);
            ps.setInt(1, Integer.parseInt(txtIdContrato.getText()));
            ResultSet rs = ps.executeQuery();

            if (rs.next()) {
                txtIdJugador.setText(rs.getString("id_jugador"));
                txtIdEquipo.setText(rs.getString("id_equipo"));
                txtFecha.setText(rs.getString("fecha_firma"));
            } else {
                JOptionPane.showMessageDialog(null, "Contrato no encontrado");
            }
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "Error: " + e.getMessage());
        }
    }

    public void actualizarContrato() {
        try {
            Connection con = ConexionBD.getConexion();
            String sql = "UPDATE contratos SET id_jugador=?, id_equipo=?, fecha_firma=? WHERE id_contrato=?";
            PreparedStatement ps = con.prepareStatement(sql);
            ps.setInt(1, Integer.parseInt(txtIdJugador.getText()));
            ps.setInt(2, Integer.parseInt(txtIdEquipo.getText()));
            ps.setString(3, txtFecha.getText());
            ps.setInt(4, Integer.parseInt(txtIdContrato.getText()));

            ps.executeUpdate();
            JOptionPane.showMessageDialog(null, "Contrato actualizado");
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "Error: " + e.getMessage());
        }
    }

    public void eliminarContrato() {
        try {
            Connection con = ConexionBD.getConexion();
            String sql = "DELETE FROM contratos WHERE id_contrato=?";
            PreparedStatement ps = con.prepareStatement(sql);
            ps.setInt(1, Integer.parseInt(txtIdContrato.getText()));

            ps.executeUpdate();
            JOptionPane.showMessageDialog(null, "Contrato eliminado");
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "Error: " + e.getMessage());
        }
    }

    public static void main(String[] args) {
        new ContratoGUI().setVisible(true);
    }
}