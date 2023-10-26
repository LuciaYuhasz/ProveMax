
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
   }
   
   public Producto buscarProductoPorId(int id){  // Productos por id
        String sql= "SELECT nombreProducto, descripcion, precioActual, stock "
                + " FROM producto WHERE idProducto = ? AND estado = 1 ";
        Producto producto = null;
         try {
            PreparedStatement ps= con.prepareStatement(sql);
            ps.setInt(1, id);
            ResultSet rs = ps.executeQuery();
            
            if (rs.next()) {
                producto= new Producto();
                producto.setIdProducto(id);
                producto.setNombreProducto(rs.getString("nombreProducto"));
                producto.setPrecioActual(rs.getDouble("precioActual"));
                producto.setStock(rs.getInt("stock"));
                producto.setEstado(true);
            }else{
                JOptionPane.showMessageDialog(null,"Producto No encontrado");
                ps.close();
            }
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Error al acceder a tabla Producto"+ ex);
        }
        
        return producto;
    }
   public Producto buscarProductosPorNombre(String nombre){  // Productos por nombre
        String sql= "SELECT idProducto,descripcion, precioActual, precioActual,stock "
                + " FROM producto WHERE nombreProducto= ? AND estado = 1";
        Producto producto = null;
         try {
            PreparedStatement ps= con.prepareStatement(sql);
            ps.setString(1, nombre);
            ResultSet rs = ps.executeQuery();
            
            if (rs.next()) {
                producto= new Producto();
                producto.setNombreProducto(nombre);
                producto.setIdProducto(rs.getInt("idProducto"));
                producto.setDescripcion(rs.getString("descripcion"));
                producto.setPrecioActual(rs.getDouble("precioActual"));
                producto.setStock(rs.getInt("stock"));
                producto.setEstado(true);
            }else{
                JOptionPane.showMessageDialog(null,"Producto No encontrado");
                ps.close();
            }
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Error al acceder a tabla alumno");
        }
        
        return producto;
    }
  
   public void modificarProducto(Producto producto){
      
      String sql=" UPDATE producto SET nombreProducto = ?,descripcion = ?, precioActual = ?, stock = ? "
              +" WHERE idProducto =?";
        
        try {
            PreparedStatement ps= con.prepareStatement(sql);
            
            ps.setString(1,producto.getNombreProducto());
            ps.setString(2,producto.getDescripcion());
            ps.setDouble(3, producto.getPrecioActual());
            ps.setInt(4, producto.getStock());
            
            int exito= ps.executeUpdate();
            
            if(exito==1){
                JOptionPane.showMessageDialog(null,"producto modificado");
            }
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Error al acceder a la tabla producto");
        }
  }
   
  public void cambiarEstadoDeProducto(int id){
      String sql = "UPDATE producto SET estado =0 WHERE idProducto = ? ";
      
      
        try {
            PreparedStatement ps= con.prepareStatement(sql);
            
            ps.setInt(1, id);
           int exito= ps.executeUpdate();
           
           if(exito==1){
               JOptionPane.showMessageDialog(null,"Producto INACTIVO ");
           }
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Error al aceder a la tabla PRODUCTO ");
        }
      
      
  }
  


}




