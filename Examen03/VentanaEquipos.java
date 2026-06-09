package Examen03;

import javax.swing.*;
import java.awt.*;
import java.sql.*;

public class VentanaEquipos extends JFrame {

    JTextField txtId, txtNombre, txtCiudad, txtEstadio, txtAnio;
    JButton btnGuardar, btnBuscar, btnActualizar, btnEliminar;

    public VentanaEquipos() {
        setTitle("CRUD Equipos");
        setSize(500, 350);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLocationRelativeTo(null);

        JPanel panel = new JPanel();
        panel.setLayout(new GridLayout(7, 2, 10, 10));

        panel.add(new JLabel("ID Equipo"));
        txtId = new JTextField();
        panel.add(txtId);

        panel.add(new JLabel("Nombre"));
        txtNombre = new JTextField();
        panel.add(txtNombre);

        panel.add(new JLabel("Ciudad"));
        txtCiudad = new JTextField();
        panel.add(txtCiudad);

        panel.add(new JLabel("Estadio"));
        txtEstadio = new JTextField();
        panel.add(txtEstadio);

        panel.add(new JLabel("Año Fundación"));
        txtAnio = new JTextField();
        panel.add(txtAnio);

        btnGuardar = new JButton("Guardar");
        btnBuscar = new JButton("Buscar");
        btnActualizar = new JButton("Actualizar");
        btnEliminar = new JButton("Eliminar");

        panel.add(btnGuardar);
        panel.add(btnBuscar);
        panel.add(btnActualizar);
        panel.add(btnEliminar);

        add(panel);

        btnGuardar.addActionListener(e -> guardarEquipo());
        btnBuscar.addActionListener(e -> buscarEquipo());
        btnActualizar.addActionListener(e -> actualizarEquipo());
        btnEliminar.addActionListener(e -> eliminarEquipo());
    }

    public void guardarEquipo() {
        try {
            Connection con = ConexionBD.getConexion();
            String sql = "INSERT INTO equipos(nombre, ciudad, estadio, anio_fundacion) VALUES(?,?,?,?)";
            PreparedStatement ps = con.prepareStatement(sql);
            ps.setString(1, txtNombre.getText());
            ps.setString(2, txtCiudad.getText());
            ps.setString(3, txtEstadio.getText());
            ps.setInt(4, Integer.parseInt(txtAnio.getText()));

            ps.executeUpdate();
            JOptionPane.showMessageDialog(null, "Equipo guardado");
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "Error: " + e.getMessage());
        }
    }

    public void buscarEquipo() {
        try {
            Connection con = ConexionBD.getConexion();
            String sql = "SELECT * FROM equipos WHERE id_equipo=?";
            PreparedStatement ps = con.prepareStatement(sql);
            ps.setInt(1, Integer.parseInt(txtId.getText()));
            ResultSet rs = ps.executeQuery();

            if (rs.next()) {
                txtNombre.setText(rs.getString("nombre"));
                txtCiudad.setText(rs.getString("ciudad"));
                txtEstadio.setText(rs.getString("estadio"));
                txtAnio.setText(rs.getString("anio_fundacion"));
            } else {
                JOptionPane.showMessageDialog(null, "Equipo no encontrado");
            }
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "Error: " + e.getMessage());
        }
    }

    public void actualizarEquipo() {
        try {
            Connection con = ConexionBD.getConexion();
            String sql = "UPDATE equipos SET nombre=?, ciudad=?, estadio=?, anio_fundacion=? WHERE id_equipo=?";
            PreparedStatement ps = con.prepareStatement(sql);
            ps.setString(1, txtNombre.getText());
            ps.setString(2, txtCiudad.getText());
            ps.setString(3, txtEstadio.getText());
            ps.setInt(4, Integer.parseInt(txtAnio.getText()));
            ps.setInt(5, Integer.parseInt(txtId.getText()));

            ps.executeUpdate();
            JOptionPane.showMessageDialog(null, "Equipo actualizado");
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "Error: " + e.getMessage());
        }
    }

    public void eliminarEquipo() {
        try {
            Connection con = ConexionBD.getConexion();
            String sql = "DELETE FROM equipos WHERE id_equipo=?";
            PreparedStatement ps = con.prepareStatement(sql);
            ps.setInt(1, Integer.parseInt(txtId.getText()));

            ps.executeUpdate();
            JOptionPane.showMessageDialog(null, "Equipo eliminado");
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "Error: " + e.getMessage());
        }
    }

    public static void main(String[] args) {
        new VentanaEquipos().setVisible(true);
    }
}