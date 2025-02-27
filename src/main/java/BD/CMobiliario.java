/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package BD;

import com.toedter.calendar.JDateChooser;
import java.io.FileInputStream;
import java.sql.CallableStatement;
import java.util.Date;
import javax.swing.JOptionPane;
import javax.swing.JTable;
import javax.swing.JTextField;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author Sofia Useche
 */
public class CMobiliario {
    public void agregarMobiliario(JTextField nombre, JTextField cantidad, JDateChooser fecha, JTextField descripcion){
        Database objetoconexion = new Database();
        String consulta = "insert into mobiliario (nombre,cantidad,fecha,descripcion) values (?,?,?,?);";
        try {
            CallableStatement cs = objetoconexion.establecerConexion().prepareCall(consulta);
            cs.setString(1, nombre.getText());
            cs.setInt(2, Integer.parseInt(cantidad.getText()));
            Date fechaSeleccionada = fecha.getDate();
            java.sql.Date fechaSQL = new java.sql.Date(fechaSeleccionada.getTime());
            cs.setDate(3, fechaSQL);
            cs.setString(4, descripcion.getText());
            cs.execute();
            JOptionPane.showMessageDialog(null, "Se guardo correctamente");
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "Error al guardar"+e.toString());
        }
    }
    public void mostrarMobiliario(JTable tablaTotalMobiliario){
        BD.Database objetoConexion = new BD.Database();
        DefaultTableModel modelo = new DefaultTableModel();
        String sql ="";
        modelo.addColumn("Nombre");
        modelo.addColumn("Cantidad");
        modelo.addColumn("Fecha");
        modelo.addColumn("Descripcion");
        tablaTotalMobiliario.setModel(modelo);
    }
}
