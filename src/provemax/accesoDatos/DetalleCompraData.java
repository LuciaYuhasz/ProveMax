
package provemax.accesoDatos;
import java.awt.List;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import javax.swing.JOptionPane;
import provemax.entidades.Compra;
import provemax.entidades.DetalleCompra;
import provemax.entidades.Producto;
import provemax.entidades.Proveedor;


public class DetalleCompraData {
    
    private Connection con = null;
    ProductoData prodData = new ProductoData();
    public DetalleCompraData() {
        con = Conexion.getConexion();
              
    
    
    
  //desde aca es de normita
    prodData = new ProductoData();
              
    }
    public void guardarDetalleCompra(DetalleCompra detCom){
        String sql = " INSERT INTO detalleCompra (idCompra, idProducto, cantidad, precioCosto)"
                + " VALUES (?,?,?,?) ";
         try {
             PreparedStatement ps= con.prepareStatement(sql,Statement.RETURN_GENERATED_KEYS);
            ps.setInt(1,detCom.getCompra().getIdCompra());
            ps.setInt(2, detCom.getProducto().getIdProducto());
             ps.setInt(3,detCom.getCantidad());
            ps.setDouble(4,detCom.getPrecioCosto());
            ps.executeUpdate();
             ResultSet rs = ps.getGeneratedKeys();
             if (rs.next()) {
                 detCom.setIdDetalle(rs.getInt(1));
                 JOptionPane.showMessageDialog(null, "Detalle de compra Guardado CORRECTAMENTE");
             }
            ps.close();
         } catch (SQLException ex) {
             JOptionPane.showMessageDialog(null,"Error al conectar con tabla de detalleCompra" + ex.getMessage());
         }
    }
    
      public void modificarPrecioCosto(int idCompra, int idProducto, double precioCosto){ 
        String sql= " UPDATE detalleCompra SET precioCosto =? "
               + " WHERE idCompra=? AND idProducto=? ";
         try {
             PreparedStatement ps= con.prepareStatement(sql);
             ps.setDouble(1,precioCosto);
             ps.setInt(2, idCompra);
             ps.setInt(3, idProducto);
              int modificado=ps.executeUpdate();
            if (modificado>0) {
                JOptionPane.showMessageDialog(null,"Precio Costo modificado");
            }
            ps.close();
         } catch (SQLException ex) {
             JOptionPane.showMessageDialog(null,"Error al ingresar a la tabla detalleCompra " + ex.getMessage());
         }
    }
    
   public ArrayList<DetalleCompra> buscarDetallePorCompra(Compra compra){
        String sql=" SELECT idDetalle, cantidad, precioCosto , idProducto, idCompra * FROM detalleCompra WHERE idCompra = 0";
       
        ArrayList<DetalleCompra> detalles= new ArrayList<>();
       try{
          PreparedStatement ps= con.prepareStatement(sql,Statement.RETURN_GENERATED_KEYS);
          ps.setInt(1,compra.getIdCompra());
          
          ResultSet rs=ps.executeQuery();
          DetalleCompra detaCompra;
          Producto prod;
         while(rs.next()){
           prod = prodData.buscarProductoPorId(rs.getInt("idProducto"));     
            detaCompra=new DetalleCompra(rs.getInt("idDetalleCompra"),
                 rs.getInt("cantidad"), rs.getDouble("precioCosto"),
                 compra,prod);
            detalles.add(detaCompra);     
           }
           ps.close();
         
       } catch (SQLException ex) {
                JOptionPane.showMessageDialog(null,"error al aceeder a la tabla");
    }
   
    return detalles;
}}


//public List<DetalleCompra> obtenerCompraRealizadas(int idCompra){ 
//       
//            List<DetalleCompra> listaComRealizada = new ArrayList<>();
//            String sql=" SELECT detallecompra.idProveedor, cuit, razonSocial, domicilio, telefono FROM detallecompra, proveedor, materia "
//                    +" WHERE detallecompra.idProveedor= proveedor.idProveedor AND detallecompra.idCompra =? ";
//          
//             try {
//            
//            PreparedStatement ps= con.prepareStatement(sql);
//            
//            ps.setInt(1, idCompra);
//            ResultSet rs= ps.executeQuery();
//            while(rs.next()){
//                Proveedor prove=new Proveedor();
//                prove.setIdProveedor(rs.getInt("idProveedor"));
//                prove.setCuit(rs.getFloat("cuit"));
//                prove.setRazonSocial(rs.getString("razonSocial"));
//                prove.setDomicilio(rs.getString("domicilio"));
//                prove.setTelefono(rs.getString("telefono"));
//             // listaComRealizada.add(prove);
//                
//            }
//            ps.close();
//        } catch (SQLException ex) {
//            JOptionPane.showMessageDialog(null,"error al aceeder a la tabla");
//        }
//       return listaComRealizada;
//       }
//}
//    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    //esto es lo que ya estaba
    
//   public ArrayList<DetalleCompra> buscarDetallePorCompra(Compra compra){
//        String sql= " SELECT  idDetalle, idCompra,cantidad, precioCosto,  idProducto FROM detallecompra "
////                + "  producto  detallecompra.idProducto=producto.idProducto "
//                + " WHERE idDetalle =? ";
//        ArrayList<DetalleCompra> detalles= new ArrayList<>();
//       try{
//          PreparedStatement ps= con.prepareStatement(sql,Statement.RETURN_GENERATED_KEYS);
//          ps.setInt(1,compra.getIdCompra());
//          
//          ResultSet rs=ps.executeQuery();
//          DetalleCompra detaCompra;
//          Producto produc;
//         while(rs.next()){
//           produc = prodData.buscarProductoPorId(rs.getInt("idProducto")); 
//           detaCompra = new DetalleCompra(rs.getInt("idDetalleCompra"),
//                                         rs.getInt("cantidad"),
//                                         rs.getDouble("precioCosto"),
//                                        compra,produc);
//           detalles.add(detaCompra);
//           }
//           ps.close();
//         
//       }  catch (SQLException ex) {
//                JOptionPane.showMessageDialog(null,"error al acceder a la tabla" + ex.getMessage());
//    }
//   
//    return detalles;
//}
//}
//
// 
