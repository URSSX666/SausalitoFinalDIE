/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package BD;

import java.io.File;
import java.io.FileInputStream;
import java.sql.CallableStatement;
import java.sql.ResultSet;
import java.sql.Statement;
import javax.swing.JComboBox;
import javax.swing.JOptionPane;
import javax.swing.JTextField;

/**
 *
 * @author Sofia Useche
 */
public class CMenu {
    int idCategoria;

    public void establecerIdCategoria(int idCategoria) {
        this.idCategoria = idCategoria;
    }
    
    public void mostrarCategorias(JComboBox comboCategoria){
        BD.Database objetoConexion = new BD.Database();
        String sql= "select * from categoria";
        Statement st;
        
        try {
            st = objetoConexion.establecerConexion().createStatement();
            ResultSet rs = st.executeQuery(sql);
            comboCategoria.removeAllItems();
            while (rs.next()) {                
                String nombreCategoria = rs.getString("nombre");
                this.establecerIdCategoria(rs.getInt("id"));
                comboCategoria.addItem(nombreCategoria);
                comboCategoria.putClientProperty(nombreCategoria, idCategoria);
            }
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "Error al mostrar categorias");
        }
        finally{
            objetoConexion.cerrarConexion();
        }
        }
    public void agregarMenu(JTextField nombre, JTextField precio, File imagen, JTextField observaciones, JComboBox combocategoria){
        Database objetoconexion = new Database();
        String consulta = "insert into menú (nombre,precio,imagen,observaciones,Categoria_id) values (?,?,?,?,?)";
        try {
            FileInputStream fis = new FileInputStream(imagen);
            CallableStatement cs = objetoconexion.establecerConexion().prepareCall(consulta);
            cs.setString(1, nombre.getText());
            cs.setFloat(2, Float.parseFloat(precio.getText()));
            cs.setBinaryStream(3, fis,(int)imagen.length());
            cs.setString(4, observaciones.getText());
            int idCategoria = (int) combocategoria.getClientProperty(combocategoria.getSelectedItem());
            cs.setInt(5, idCategoria);
            cs.execute();
            JOptionPane.showMessageDialog(null, "Se guardo correctamente");
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "Error al guardar"+e.toString());
        }
    }
}
