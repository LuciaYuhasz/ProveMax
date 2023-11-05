package provemax;

import java.time.LocalDate;
import java.time.Month;
import java.util.ArrayList;
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
     
// Producto Televisor = new Producto("Televisor Sony ", "Ultra HD 50 pulgadas ", 280000.00, 18, true, 3);
// ProductoData product = new ProductoData();
// product.modificarProducto(Televisor);
// product.guardarProducto(Televisor);

// Producto productoEnco= product.buscarProductoPorId(2); 
// System.out.println("nombre "+ productoEnco.toString()); 

// Producto productoEnco = product.buscarProductosPorNombre("lavarropas Whirpool");
// if (productoEnco != null) {
// System.out.println("nombre " + productoEnco.toString());
// } }else{
// System.out.println("No se encontro proveedor con ese codigo");
// }

// product.cambiarEstadoDeProducto(2);
// System.out.println( " nombre " + productoEnco.toString() + " Se da de baja al producto por falta de stock ");


// ProductoData product = new ProductoData();
// for (Producto producto :product.listarProductos()) {
// System.out.println(" Id del producto : " + producto.getIdProducto());
// System.out.println(" Nombre el producto: " + producto.getNombreProducto());
// System.out.println(" Descripcion del producto: " + producto.getDescripcion());
// System.out.println(" Precio actual del producto : " + producto.getPrecioActual());
// System.out.println(" Stock del producto : " + producto.getStock());
// System.out.println(" Stock minimo del producto : " + producto.getStockMinimo());
// System.out.println("-------------------------------------------------------------------");
// }


//       

// -----trabajamos con PROVEEDOR-----


// Proveedor prove = new Proveedor("Get-Shop", "San Martin 1500 ","266465478", true,823678f);
// ProveedorData proData = new ProveedorData(); //agrego proveedor
// proData.guardarProveedor(prove); ProductoData product = new ProductoData();
// for (Producto producto :product.listarProductosDeBaja()) {
// System.out.println(" Id del producto : " + producto.getIdProducto());
// System.out.println(" Nombre el producto: " + producto.getNombreProducto());
// System.out.println(" Descripcion del producto: " + producto.getDescripcion());
// System.out.println(" Precio actual del producto : " + producto.getPrecioActual());
// System.out.println(" Stock del producto : " + producto.getStock());
// System.out.println(" Stock minimo del producto : " + producto.getStockMinimo());
// System.out.println("-------------------------------------------------------------------");
// }
// System.out.println("Se agrego el siguiente proveedor : " + prove.toString());
        

// ProveedorData prove = new ProveedorData(); // busco prov por id
// Proveedor proveEnco= prove.buscarProveedorPorId(7);
// if (proveEnco != null) {
// System.out.println("nombre "+ proveEnco.toString());    
// }else{
// System.out.println("No se encontro proveedor con ese codigo");
// }
        
// ProveedorData prove = new ProveedorData(); // busco prov por nombre
// Proveedor proveEnco= prove.buscarProveedorPorNombre("Ribeiro");
// if (proveEnco != null) {
// System.out.println("nombre "+ proveEnco.toString());    
// }else{
// System.out.println("No se encontro proveedor con ese Nombre");
// }


// Proveedor prove = new Proveedor(8 , "Niki-Niki", "San Martin 800 ","266548943", true,74556f);
// ProveedorData proData = new ProveedorData();
// proData.modificarProveedor(prove); // modifico proveedor
//
// if (prove!=null) {
//
// System.out.println("Proveedor modificado correctamente");
// }
// }
 

// ProveedorData prove = new ProveedorData();
// prove.eliminarProveedorId(8);
// if (prove != null) {
// System.out.println("El provedor ha sido dado de baja correctamente");
// }
           

// ProveedorData prove = new ProveedorData(); // ver esta funcion
// Proveedor prov = new Proveedor(2, "Easy", "España 234" , "2345678", true, 345678);
// prove.eliminarProveedor(prov);
// if (prov != null) {
// System.out.println("Proveedor dado de baja correctamente"); 
// }

// ProveedorData proveedor = new ProveedorData();
// for (Proveedor prove : proveedor.listarProveedores()) {
// System.out.println(" Id del proveedor : " + prove.getIdProveedor());
// System.out.println(" Razon Social : " + prove.getRazonSocial());
// System.out.println(" Domicilio : " + prove.getDomicilio());
// System.out.println(" Telefono : " + prove.getTelefono());
//  
// System.out.println("-------------------------------------------------------------------");
// }

// ProveedorData proveedor = new ProveedorData();
// for (Proveedor prove : proveedor.listarProveedoresInactivos()) {
// System.out.println(" Id del proveedor : " + prove.getIdProveedor());
// System.out.println(" Razon Social : " + prove.getRazonSocial());
// System.out.println(" Domicilio : " + prove.getDomicilio());
// System.out.println(" Telefono : " + prove.getTelefono());
//
// System.out.println("-------------------------------------------------------------------");
// }
//------------------------ Trabajamos con la tabla compra-------------

//
// CompraData comData = new CompraData();
// Compra comp = comData.obtenerCompraPorId(1);
// DetalleCompraData detaCompraData = new DetalleCompraData();
// detaCompraData.buscarDetallePorCompra(comp).forEach(item->{
// System.out.println(item.getIdDetalle());
// System.out.println(item.getCantidad());
// System.out.println(item.getPrecioCosto());
// System.out.println(item.getProducto().getNombreProducto());
//                
// });


//
////------------------------ Trabajamos con la tabla compra-------------
//            CompraData com = new CompraData();
//            ProveedorData proData = new ProveedorData();
//          // Proveedor prov =new Proveedor("Easy", "España 234", "2345678" , true, 345678);
//           // proData.guardarProveedor(prov);
//           // Proveedor prov =new Proveedor(13,"Easy", "España 234", "2345678" , true, 345678);
//             Proveedor provEnco = proData.buscarProveedorPorId(1);
//            Compra nueva = new Compra(provEnco,LocalDate.now(),true);

//// nueva.setProveedor (prov);
//// nueva.setFecha(LocalDate.now());
//// nueva.isEstado();
//
//        // Llamar al método para agregar la compra
//        com.agregarCompra(nueva);
  // }}
   
   
   
    
////            nueva.setProveedor (prov);
////            nueva.setFecha(LocalDate.now());
////            nueva.isEstado();
//            com.agregarCompra(nueva);

//----------------------TRABAJAMOS CON LA CLASE DETALLECOMPRADATA---------------
            
        DetalleCompra detalle = new DetalleCompra();
        DetalleCompraData detaData = new DetalleCompraData();
        detaData.modificarPrecioCosto(2, 5, 250000);
        if (detalle!=null) {
            System.out.println("Se modifico correctamente el precio costo ");
            
        }
}}
   
