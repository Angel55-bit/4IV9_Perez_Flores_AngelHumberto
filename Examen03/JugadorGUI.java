package Examen03;

import javax.swing.*;
import java.awt.*;
import java.sql.*;

public class JugadorGUI extends JFrame {

    JTextField txtId, txtNombre, txtEdad, txtPosicion;
    JButton btnGuardar, btnBuscar, btnActualizar, btnEliminar;

    public JugadorGUI() {
        setTitle("CRUD Jugadores");
        setSize(500, 300);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLocationRelativeTo(null);

        JPanel panel = new JPanel();
        panel.setLayout(new GridLayout(6, 2, 10, 10));

        panel.add(new JLabel("ID Jugador"));
        txtId = new JTextField();
        panel.add(txtId);

        panel.add(new JLabel("Nombre Completo"));
        txtNombre = new JTextField();
        panel.add(txtNombre);

        panel.add(new JLabel("Edad"));
        txtEdad = new JTextField();
        panel.add(txtEdad);

        panel.add(new JLabel("Posición"));
        txtPosicion = new JTextField();
        panel.add(txtPosicion);

        btnGuardar = new JButton("Guardar");
        btnBuscar = new JButton("Buscar");
        btnActualizar = new JButton("Actualizar");
        btnEliminar = new JButton("Eliminar");

        panel.add(btnGuardar);
        panel.add(btnBuscar);
        panel.add(btnActualizar);
        panel.add(btnEliminar);

        add(panel);

        btnGuardar.addActionListener(e -> guardarJugador());
        btnBuscar.addActionListener(e -> buscarJugador());
        btnActualizar.addActionListener(e -> actualizarJugador());
        btnEliminar.addActionListener(e -> eliminarJugador());
    }

    public void guardarJugador() {
        try {
            Connection con = ConexionBD.getConexion();
            String sql = "INSERT INTO jugadores(nombre, edad, posicion) VALUES(?,?,?)";
            PreparedStatement ps = con.prepareStatement(sql);
            ps.setString(1, txtNombre.getText());
            ps.setInt(2, Integer.parseInt(txtEdad.getText()));
            ps.setString(3, txtPosicion.getText());

            ps.executeUpdate();
            JOptionPane.showMessageDialog(null, "Jugador guardado");
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "Error: " + e.getMessage());
        }
    }

    public void buscarJugador() {
        try {
            Connection con = ConexionBD.getConexion();
            String sql = "SELECT * FROM jugadores WHERE id_jugador=?";
            PreparedStatement ps = con.prepareStatement(sql);
            ps.setInt(1, Integer.parseInt(txtId.getText()));
            ResultSet rs = ps.executeQuery();

            if (rs.next()) {
                txtNombre.setText(rs.getString("nombre"));
                txtEdad.setText(rs.getString("edad"));
                txtPosicion.setText(rs.getString("posicion"));
            } else {
                JOptionPane.showMessageDialog(null, "Jugador no encontrado");
            }
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "Error: " + e.getMessage());
        }
    }

    public void actualizarJugador() {
        try {
            Connection con = ConexionBD.getConexion();
            String sql = "UPDATE jugadores SET nombre=?, edad=?, posicion=? WHERE id_jugador=?";
            PreparedStatement ps = con.prepareStatement(sql);
            ps.setString(1, txtNombre.getText());
            ps.setInt(2, Integer.parseInt(txtEdad.getText()));
            ps.setString(3, txtPosicion.getText());
            ps.setInt(4, Integer.parseInt(txtId.getText()));

            ps.executeUpdate();
            JOptionPane.showMessageDialog(null, "Jugador actualizado");
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "Error: " + e.getMessage());
        }
    }

    public void eliminarJugador() {
        try {
            Connection con = ConexionBD.getConexion();
            String sql = "DELETE FROM jugadores WHERE id_jugador=?";
            PreparedStatement ps = con.prepareStatement(sql);
            ps.setInt(1, Integer.parseInt(txtId.getText()));

            ps.executeUpdate();
            JOptionPane.showMessageDialog(null, "Jugador eliminado");
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "Error: " + e.getMessage());
        }
    }

    public static void main(String[] args) {
        new JugadorGUI().setVisible(true);
    }
}