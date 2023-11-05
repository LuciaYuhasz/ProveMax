
package provemax;

import java.time.LocalDate;
import javax.swing.JOptionPane;
import provemax.accesoDatos.CompraData;
import provemax.accesoDatos.DetalleCompraData;
import provemax.accesoDatos.ProductoData;
import provemax.accesoDatos.ProveedorData;
import provemax.entidades.Compra;
import provemax.entidades.DetalleCompra;
import provemax.entidades.Producto;
import provemax.entidades.Proveedor;


public class ProveMax {

   
    public static void main(String[] args) {

        // Trabajamos con la tabla productos
     
//        Producto Televisor = new Producto("Televisor Sony ", "Ultra HD 50 pulgadas ", 280000.00, 18, true, 3);
//        ProductoData product = new ProductoData();
//        product.modificarProducto(Televisor);
//       product.guardarProducto(Televisor);

//      Producto productoEnco= product.buscarProductoPorId(2); 
//        System.out.println("nombre "+ productoEnco.toString()); 

//        Producto productoEnco = product.buscarProductosPorNombre("lavarropas Whirpool");
//        if (productoEnco != null) {
//            System.out.println("nombre " + productoEnco.toString());
//        }    }else{
//            System.out.println("No se encontro proveedor con ese codigo");
//        }

//        product.cambiarEstadoDeProducto(2);
//        System.out.println( " nombre " + productoEnco.toString() + "  Se da de baja al producto por falta de stock ");


//        ProductoData product = new ProductoData();
//        for (Producto producto :product.listarProductos()) {
//            System.out.println(" Id del producto : " + producto.getIdProducto());
//            System.out.println(" Nombre el producto: " + producto.getNombreProducto());
//            System.out.println(" Descripcion del producto: " + producto.getDescripcion());
//            System.out.println(" Precio actual del producto  : " + producto.getPrecioActual());
//            System.out.println(" Stock del producto : " + producto.getStock());
//              System.out.println(" Stock minimo del producto : " + producto.getStockMinimo());
//            System.out.println("-------------------------------------------------------------------");
//        }


//       

//                 -----trabajamos con PROVEEDOR-----
//      Proveedor prove = new Proveedor("Naldo", "Rivadavia 400 ","266448943", true,98456f);
//      ProveedorData proData = new ProveedorData();  //agrego proveedor
//      proData.guardarProveedor(prove); ProductoData product = new ProductoData();
//        for (Producto producto :product.listarProductosDeBaja()) {
//            System.out.println(" Id del producto : " + producto.getIdProducto());
//            System.out.println(" Nombre el producto: " + producto.getNombreProducto());
//            System.out.println(" Descripcion del producto: " + producto.getDescripcion());
//            System.out.println(" Precio actual del producto  : " + producto.getPrecioActual());
//            System.out.println(" Stock del producto : " + producto.getStock());
//              System.out.println(" Stock minimo del producto : " + producto.getStockMinimo());
//            System.out.println("-------------------------------------------------------------------");
//        }
//      System.out.println("Se agrego el siguiente proveedor  : " + prove.toString());
        

//        ProveedorData prove = new ProveedorData();  // busco prov por id
//        Proveedor proveEnco= prove.buscarProveedorPorId(7);
//        if (proveEnco != null) {
//        System.out.println("nombre "+ proveEnco.toString());    
//        }else{
//            System.out.println("No se encontro proveedor con ese codigo");
//        }
        
//           ProveedorData prove = new ProveedorData(); // busco prov por nombre
//        Proveedor proveEnco= prove.buscarProveedorPorNombre("Ribeiro");
//        if (proveEnco != null) {
//        System.out.println("nombre "+ proveEnco.toString());    
//        }else{
//            System.out.println("No se encontro proveedor con ese Nombre");
//        }


//        Proveedor prove = new Proveedor(7,"Naldo", "Rivadavia 800 ","266548943", true,98456f);
//        ProveedorData proData = new ProveedorData();
//        proData.modificarProveedor(prove); // modifico proveedor
//
//        if (prove!=null) {
//
//            System.out.println("Proveedor modificado correctamente");

//        }
//        }
//        

//           ProveedorData prove = new ProveedorData();
//           prove.eliminarProveedorId(8);
//           if (prove != null) {
//               System.out.println("El provedor ha sido dado de baja correctamente");
//           }
           
//           
//           ProveedorData prove = new ProveedorData();  // ver esta funcion
//           Proveedor prov = new Proveedor(2, "Easy", "España 234" , "2345678", true, 345678);
//           prove.eliminarProveedor(prov);
//           if (prov != null) {
//               System.out.println("Proveedor dado de baja correctamente"); 
//        }

//        ProveedorData proveedor = new ProveedorData();
//        for (Proveedor prove : proveedor.listarProveedores()) {
//            System.out.println(" Id del proveedor : " + prove.getIdProveedor());
//            System.out.println(" Razon Social : " + prove.getRazonSocial());
//            System.out.println(" Domicilio : " + prove.getDomicilio());
//            System.out.println(" Telefono  : " + prove.getTelefono());
//  
//            System.out.println("-------------------------------------------------------------------");
//        }

//        ProveedorData proveedor = new ProveedorData();
//        for (Proveedor prove : proveedor.listarProveedoresInactivos()) {
//            System.out.println(" Id del proveedor : " + prove.getIdProveedor());
//            System.out.println(" Razon Social : " + prove.getRazonSocial());
//            System.out.println(" Domicilio : " + prove.getDomicilio());
//            System.out.println(" Telefono  : " + prove.getTelefono());
//
//            System.out.println("-------------------------------------------------------------------");
//        }
//------------------------ Trabajamos con la tabla compra-------------
            CompraData com = new CompraData();
            Compra nueva = new Compra();
            nueva.setProveedor(new Proveedor("Easy", "España 234", "2345678" , true, 345678));
            nueva.setFecha(LocalDate.now());

        // Llamar al método para agregar la compra
        com.agregarCompra(nueva);
       
                    
//            Proveedor prov = new Proveedor();
//            Compra compra = new Compra(prov, LocalDate.MIN, true);
//            com.agregarCompra(compra);
//            System.out.println("id de compra " + compra.getIdCompra());
            
//       CompraData comData = new CompraData();
//       Compra comp = comData.obtenerCompraPorId(1);
//        DetalleCompraData detaData = new DetalleCompraData();
//        detaData.buscarDetallePorCompra(comp).forEach(item -> {
//            System.out.println(item.getIdDetalle());
//            System.out.println(item.getProducto());
//            System.out.println(item.getPrecioCosto());
//            System.out.println(item.getCantidad());
//            
//        });
            



//           CompraData comp = new CompraData();
//           ProductoData prod = new ProductoData();
//           ProveedorData prov = new ProveedorData();
//           
//          int idCompraDeseada = 1;
//        Compra compra = comp.obtenerCompraPorId(idCompraDeseada);
//
//        if (compra != null) {
//            System.out.println("Compra encontrada: " + compra);
//            // Puedes acceder a los datos de la compra y realizar acciones con ellos aquí
//        } else {
//            System.out.println("No se encontró ninguna compra con el ID especificado.");
//        }
           
           
        




//
//    proData.modificarProveedor (prove);
//    Proveedor provEncon = proData.buscarProveedorPorNombre("Ribeiro");
//
//    System.out.println (provEncon.toString
//    ());
//         Proveedor prove = new Proveedor(9, 7234f, "Rey", "Lujan 594", "273211", true);
//
//    proData.eliminarProveedorId (
//
//    9);
//    proData.buscarProveedor (
//
//7);
    }
}
