
package provemax.accesoDatos;

import java.sql.Connection;
import java.sql.*;
import javax.swing.JOptionPane;
import provemax.entidades.Producto;
public class ProductoData {
    

    private Connection con = null;

    public ProductoData() {
        con = Conexion.getConexion();
    }
   public void guardarProducto(Producto producto){  
       String sql= " INSERT INTO producto(nombreProducto,descripcion,precioActual,stock,estado) " 
               + " VALUES(?,?,?,?,?)";
        try {
            PreparedStatement ps= con.prepareStatement(sql,Statement.RETURN_GENERATED_KEYS);
            ps.setString(1, producto.getNombreProducto());
            ps.setString(2, producto.getDescripcion());
            ps.setDouble(3,producto.getPrecioActual());
            ps.setInt(4, producto.getStock());
            ps.setBoolean(5,producto.isEstado());
            ps.executeUpdate();
            ResultSet rs= ps.getGeneratedKeys();
            if (rs.next()) {
                producto.setIdProducto(rs.getInt(1));
                if (producto.getStock() < 3) {
                JOptionPane.showMessageDialog(null, "El producto tiene un stock menor a 3", "Alerta de Stock", JOptionPane.WARNING_MESSAGE);
            } else {
                JOptionPane.showMessageDialog(null, "Producto agregado exitosamente");
            }
                
             JOptionPane.showMessageDialog(null,"Producto agregado exitosamente");
                
            }
            ps.close();
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Error al acceder a tabla Producto" + ex.getMessage());
        }
   }}




