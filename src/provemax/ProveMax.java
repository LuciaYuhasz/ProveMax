
package provemax;

import provemax.accesoDatos.ProductoData;
import provemax.entidades.Producto;


public class ProveMax {

   
    public static void main(String[] args) {
        
       // AGREGO PRODUCTOS "PRODUCT"
//       
//       Producto Televisor= new Producto("televisor Sony", "32LDC", 210000.00,4,true);
//       ProductoData product=new ProductoData();
//       product.guardarProducto(Televisor);
//       Producto Lavarropas= new Producto("lavarropas Whirpool","5kg",230000,5,true);
//       product.guardarProducto(Lavarropas);
//      Producto Plancha= new Producto("plancha Philips", "seco", 60000,7,true);
//       ProductoData product=new ProductoData();
//       product.guardarProducto(Plancha);
//       Producto Ventilador= new Producto("ventilador de techo", "philips, 5 velocid.", 10000,6,true);
//     //  ProductoData product=new ProductoData();
//       product.guardarProducto(Ventilador);
//
//       Producto AASplit= new Producto("Aire Acondicionado", "Split BGH", 200000,2,true);
      ProductoData product=new ProductoData();
//       product.guardarProducto(AASplit);
//       
//      Producto productoEnco= product.buscarProductoPorId(7);
//        System.out.p3rintln("nombre "+ productoEnco.toString()); 
        
//        Producto productoEnco= product.buscarProductosPorNombre("plancha Philips");
//        System.out.println("nombre "+ productoEnco.toString()); 


         Producto productoEnco= product.buscarProductoPorId(3);
        System.out.println("nombre "+ productoEnco.toString());
        
      //   product.modificarProducto(productoEnco.setPrecioActual(24000));//----no esta funcionando-----
         
        product.cambiarEstadoDeProducto(3);
    }
    
}
