
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
    ProductoData prodData;
    public DetalleCompraData() {
        con = Conexion.getConexion();
        prodData = new ProductoData();
              
    }
   public ArrayList<DetalleCompra> buscarDetallePorCompra(Compra compra){
        String sql=" SELECT idDetalle, cantidad, precioCosto , idProducto, idCompra * FROM detalleCompra WHERE idCompra  = 0";
       
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
         
       }  catch (SQLException ex) {
                JOptionPane.showMessageDialog(null,"error al aceeder a la tabla");
    }
   
    return detalles;
}
}
