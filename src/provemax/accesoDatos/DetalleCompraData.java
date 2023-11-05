
package provemax.accesoDatos;
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
              
    }
   public ArrayList<DetalleCompra> buscarDetallePorCompra(Compra compra){
        String sql= " SELECT  idDetalle, idCompra,cantidad, precioCosto,  idProducto FROM detallecompra "
//                + "  producto  detallecompra.idProducto=producto.idProducto "
                + " WHERE idDetalle =? ";
        ArrayList<DetalleCompra> detalles= new ArrayList<>();
       try{
          PreparedStatement ps= con.prepareStatement(sql,Statement.RETURN_GENERATED_KEYS);
          ps.setInt(1,compra.getIdCompra());
          
          ResultSet rs=ps.executeQuery();
          DetalleCompra detaCompra;
          Producto produc;
         while(rs.next()){
           produc = prodData.buscarProductoPorId(rs.getInt("idProducto")); 
           detaCompra = new DetalleCompra(rs.getInt("idDetalleCompra"),
                                         rs.getInt("cantidad"),
                                         rs.getDouble("precioCosto"),
                                        compra,produc);
           detalles.add(detaCompra);
           }
           ps.close();
         
       }  catch (SQLException ex) {
                JOptionPane.showMessageDialog(null,"error al acceder a la tabla" + ex.getMessage());
    }
   
    return detalles;
}
}

 
