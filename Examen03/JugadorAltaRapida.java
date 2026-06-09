package Examen03;

import javax.swing.*;
import java.awt.*;
import java.sql.Connection;
import java.sql.PreparedStatement;

public class JugadorAltaRapida extends JFrame {

    JTextField txtNombre, txtEdad, txtPosicion;
    JButton btnGuardar;

    public JugadorAltaRapida() {
        setTitle("Alta Rápida de Jugadores");
        setSize(400, 250);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLocationRelativeTo(null);

        JPanel panel = new JPanel();
        panel.setLayout(new GridLayout(4, 2, 10, 10));

        panel.add(new JLabel("Nombre Completo"));
        txtNombre = new JTextField();
        panel.add(txtNombre);

        panel.add(new JLabel("Edad"));
        txtEdad = new JTextField();
        panel.add(txtEdad);

        panel.add(new JLabel("Posición"));
        txtPosicion = new JTextField();
        panel.add(txtPosicion);

        btnGuardar = new JButton("Guardar Jugador");
        panel.add(btnGuardar);

        add(panel);

        btnGuardar.addActionListener(e -> guardarJugador());
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

            JOptionPane.showMessageDialog(null, "Jugador guardado correctamente");

            txtNombre.setText("");
            txtEdad.setText("");
            txtPosicion.setText("");

        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "Error: " + e.getMessage());
        }
    }

    public static void main(String[] args) {
        new JugadorAltaRapida().setVisible(true);
    }
}