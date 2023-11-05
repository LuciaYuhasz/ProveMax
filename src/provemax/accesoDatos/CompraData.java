
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
import provemax.entidades.Proveedor;


public class CompraData {

    private Connection con = null;

    public CompraData() {
        con = Conexion.getConexion();
    }
    
    
    public void agregarCompra(Compra compra){

         
        
            String sql= " INSERT INTO compra (proveedor, fecha, estado) " 
        
         

               + " VALUES(?, ?, ?)";
        try {

            PreparedStatement ps= con.prepareStatement(sql,Statement.RETURN_GENERATED_KEYS);
            ps.setInt(1,compra.getProveedor().getIdProveedor());
            ps.setDate(2, java.sql.Date.valueOf(compra.getFecha()));
            ps.setBoolean(3, true);
            ps.executeUpdate();
            ResultSet rs = ps.getGeneratedKeys();
            int idCompra;
            if (rs.next()) {
                idCompra= rs.getInt(1);
                compra.setIdCompra(idCompra);
                JOptionPane.showMessageDialog(null, "Compra  agregada exitosamente");
                 }
            ps.close();
            
        }catch (SQLException ex){
            JOptionPane.showMessageDialog(null, "Error al acceder a tabla Compra" + ex.getMessage());

            
        }
        
        }
   
        
        
   
        
    
    public Compra obtenerCompraPorId(int id) {
        Compra compra = null;

        try {
            String sql = " SELECT * FROM compra WHERE idCompra = ? ";
            PreparedStatement ps = con.prepareStatement(sql);
            ps.setInt(1, id);
            ResultSet rs = ps.executeQuery();
         
            if (rs.next()) {
                compra = new Compra();
                compra.setIdCompra(id);
                Proveedor prov = new Proveedor();
                prov.setIdProveedor(rs.getInt("idProveedor"));
                compra.setProveedor(prov);
                compra.setFecha(rs.getDate("fecha").toLocalDate());
            }
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Error al acceder a la tabla" + ex.getMessage());
        }
        return compra;
       
    }
}
