/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package BD;

import com.toedter.calendar.JDateChooser;
import java.io.File;
import java.io.FileInputStream;
import java.sql.CallableStatement;
import java.sql.ResultSet;
import java.sql.Statement;
import java.text.SimpleDateFormat;
import java.util.Date;
import javax.swing.JComboBox;
import javax.swing.JOptionPane;
import javax.swing.JTable;
import javax.swing.JTextField;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author Sofia Useche
 */
public class CGasto {
    int idProveedor;

    public void establecerIdProveedor(int idProveedor) {
        this.idProveedor = idProveedor;
    }
    
    public void mostrarProveedores(JComboBox comboProveedor){
        BD.Database objetoConexion = new BD.Database();
        String sql= "select * from Proveedor";
        Statement st;
        
        try {
            st = objetoConexion.establecerConexion().createStatement();
            ResultSet rs = st.executeQuery(sql);
            comboProveedor.removeAllItems();
            while (rs.next()) {                
                String nombreProveedor = rs.getString("nombre");
                this.establecerIdProveedor(rs.getInt("codigo"));
                comboProveedor.addItem(nombreProveedor);
                comboProveedor.putClientProperty(nombreProveedor, idProveedor);
            }
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "Error al mostrar proveedor");
        }
        finally{
            objetoConexion.cerrarConexion();
        }
        }
    public void agregarGasto(JTextField producto, JTextField cantidad, JDateChooser fecha, JTextField precio, JTextField descripcion, JComboBox comboproveedor){
        Database objetoconexion = new Database();
        String consulta = "insert into gasto (producto,cantidad,fecha,precio,descripcion,provedor_codigo) values (?,?,?,?,?,?);";
        try {
            CallableStatement cs = objetoconexion.establecerConexion().prepareCall(consulta);
            cs.setString(1, producto.getText());
            cs.setString(2, cantidad.getText());
            Date fechaSeleccionada = fecha.getDate();
            java.sql.Date fechaSQL = new java.sql.Date(fechaSeleccionada.getTime());
            cs.setDate(3, fechaSQL);
            cs.setFloat(4, Float.parseFloat(precio.getText()));
            cs.setString(5, descripcion.getText());
            int idProveedor = (int) comboproveedor.getClientProperty(comboproveedor.getSelectedItem());
            cs.setInt(6, idProveedor);
            cs.execute();
            JOptionPane.showMessageDialog(null, "Se guardo correctamente");
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "Error al guardar"+e.toString());
        }
    }
    public void mostrarGasto(JTable tablaTotalGasto){
        BD.Database objetoConexion = new BD.Database();
        DefaultTableModel modelo = new DefaultTableModel();
        String sql ="";
        modelo.addColumn("Codigo");
        modelo.addColumn("Producto");
        modelo.addColumn("Cantidad");
        modelo.addColumn("Fecha");
        modelo.addColumn("Precio");
        modelo.addColumn("Descripcion");
        modelo.addColumn("Proveedor");
        tablaTotalGasto.setModel(modelo);
        sql = "select gasto.codigo,gasto.producto,gasto.cantidad,gasto.fecha,gasto.precio,gasto.descripcion,proveedor.nombre from gasto INNER JOIN proveedor ON gasto.provedor_codigo = proveedor.codigo;";
        try {
            Statement st = objetoConexion.establecerConexion().createStatement();
            ResultSet rs = st.executeQuery(sql);
            while (rs.next()) {          
                String codigo = rs.getString("codigo");
                String producto = rs.getString("producto");
                String cantidad = rs.getString("cantidad");
                SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");
                java.sql.Date fechaSQL = rs.getDate("fecha");
                String nuevaFecha = sdf.format(fechaSQL);
                String precio = rs.getString("precio");
                String descripcion = rs.getString("descripcion");
                String proveedor = rs.getString("nombre");
                modelo.addRow(new Object[]{codigo,producto,cantidad,nuevaFecha,precio,descripcion,proveedor});
                tablaTotalGasto.setModel(modelo);
            }
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null,"Error al mostrar gastos"+e.toString());
        }
        finally{
            objetoConexion.cerrarConexion();
        }
    }
    public void Seleccionar(JTable totalGastos,JTextField codigo,JTextField producto,JTextField cantidad,JDateChooser fecha,JTextField precio,JTextField descripcion, JComboBox proveedores){
        int fila = totalGastos.getSelectedRow();
        if (fila>=0) {
            codigo.setText(totalGastos.getValueAt(fila, 0).toString());
            producto.setText(totalGastos.getValueAt(fila, 1).toString());
            cantidad.setText(totalGastos.getValueAt(fila, 2).toString());
            String fechaString = totalGastos.getValueAt(fila, 3).toString();
            precio.setText(totalGastos.getValueAt(fila, 4).toString());
            descripcion.setText(totalGastos.getValueAt(fila, 5).toString());
            proveedores.setSelectedItem(totalGastos.getValueAt(fila, 6).toString());
            try {
                SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");
                Date fechDate = sdf.parse(fechaString);
                fecha.setDate(fechDate);
            } catch (Exception e) {
                JOptionPane.showMessageDialog(null, "Error al seleccionar"+e.toString());
            }
        }
    }
    public void modificarGasto(JTextField codigo,JTextField producto, JTextField cantidad, JDateChooser fecha, JTextField precio, JTextField descripcion, JComboBox comboproveedor){
        Database objetoConexion = new Database();
        String consulta = "UPDATE gasto SET gasto.producto=?,gasto.cantidad=?,gasto.fecha=?,gasto.precio=?,gasto.descripcion=?,gasto.provedor_codigo=? WHERE gasto.codigo=?";
        try {
            CallableStatement cs = objetoConexion.establecerConexion().prepareCall(consulta);
            cs.setString(1, producto.getText());
            cs.setString(2, cantidad.getText());
            Date fechaSeleccionada = fecha.getDate();
            java.sql.Date fechaSQL = new java.sql.Date(fechaSeleccionada.getTime());
            cs.setDate(3, fechaSQL);
            cs.setFloat(4, Float.parseFloat(precio.getText()));
            cs.setString(5, descripcion.getText());
            int idProveedor = (int) comboproveedor.getClientProperty(comboproveedor.getSelectedItem());
            cs.setInt(6, idProveedor);
            cs.setInt(7, Integer.parseInt(codigo.getText()));
            cs.execute();
            JOptionPane.showMessageDialog(null, "Se modifico correctamente");
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "No se modifico correctamente"+e.toString());
        }
        finally{
            objetoConexion.cerrarConexion();
        }
    }
    public void elminarGasto(JTable tablaGastos){
        Database objetoConexion = new Database();
        int filaSeleccionada = tablaGastos.getSelectedRow();
        String codigo = tablaGastos.getValueAt(filaSeleccionada, 0).toString();
        Object[] opciones = {"Sí", "No"};
        int confirmacion = JOptionPane.showOptionDialog(
            null, 
            "¿Está seguro de eliminar este registro?", 
            "Confirmar eliminación",
            JOptionPane.YES_NO_OPTION, 
            JOptionPane.QUESTION_MESSAGE, 
            null, 
            opciones, 
            opciones[1]
        );
        if (confirmacion != JOptionPane.YES_OPTION) {
            return; // Si el usuario elige "No", no se ejecuta la eliminación
        }
        String consulta = "DELETE FROM gasto WHERE gasto.codigo=?;";
        try {
            CallableStatement cs = objetoConexion.establecerConexion().prepareCall(consulta);
            cs.setInt(1, Integer.parseInt(codigo));
            cs.execute();
            JOptionPane.showMessageDialog(null, "Se elimino corretamente");
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "No se elimino el registro"+e.toString());
        }
        finally{
            objetoConexion.cerrarConexion();
        }
    }
}
