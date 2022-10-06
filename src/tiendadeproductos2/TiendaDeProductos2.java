/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tiendadeproductos2;

/**
 *
 * @author Temporal
 */
public class TiendaDeProductos2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        Tienda mitienda = new  Tienda ();
        Producto p1 = new Producto(" Libreta ", Producto.PAPELERIA, 23, 15, 5500, 87 );
        mitienda.setProducto(p1, 0);
        Producto p2 = new Producto(" Leche ", Producto.SUPERMERCADO, 150, 30, 2100,30 );
        mitienda.setProducto(p2, 1);
        Producto p3 = new Producto(" Jabon ", Producto.SUPERMERCADO, 15, 50,4200,80);
        mitienda.setProducto(p3, 2);
        Producto p4 = new Producto(" Aspirina ", Producto.DROGUERIA, 60, 100,2400,200 );
        mitienda.setProducto(p4, 3);
        
        mitienda.ProductosToString();
        
        /*System.out.println("en la posicion 1: " + mitienda.getProductosCualquiera(1).getNombre());
        System.out.println("en la posicion 0: " + mitienda.getProductosCualquiera(0).getNombre());
        System.out.println("en la posicion 2: " + mitienda.getProductosCualquiera(2).getNombre());*/
  
    }  
}
