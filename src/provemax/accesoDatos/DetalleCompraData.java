
package provemax.accesoDatos;
import java.sql.Connection;



 
public class DetalleCompraData {
    
    private Connection con = null;
    
    public DetalleCompraData() {
        con = Conexion.getConexion();
        // esto es una prueba 
    }
} 