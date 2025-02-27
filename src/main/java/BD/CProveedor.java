/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package BD;

import com.toedter.calendar.JDateChooser;
import java.sql.CallableStatement;
import java.util.Date;
import javax.swing.JOptionPane;
import javax.swing.JTextField;

/**
 *
 * @author Sofia Useche
 */
public class CProveedor {
    public void agregarProveedor(JTextField nombre, JTextField telefono, JTextField correo, JTextField direccion, JTextField tipoProveedor){
        Database objetoconexion = new Database();
        String consulta = "insert into proveedor (nombre,telefono,correo,direccion,tipo_proveedor) values (?,?,?,?,?);";
        try {
            CallableStatement cs = objetoconexion.establecerConexion().prepareCall(consulta);
            cs.setString(1, nombre.getText());
            cs.setLong(2, Long.parseLong(telefono.getText()));
            cs.setString(3, correo.getText());
            cs.setString(4, direccion.getText());
            cs.setString(5, tipoProveedor.getText());
            cs.execute();
            JOptionPane.showMessageDialog(null, "Se guardo correctamente");
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "Error al guardar"+e.toString());
        }
    }
}
