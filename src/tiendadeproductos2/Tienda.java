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
public class Tienda {
     // declarar un arreglo de datos 
    private Producto[] productos;
    private int tamaño;
    //private int[] numeros;
    //atributos 
    private Producto p1;
    private Producto p2;
    private Producto p3;
    private Producto p4;
    
    
    public Tienda (){
        
        //numeros= new  int [20] ; //tamaño de posiciones
        productos= new  Producto [20] ;
        tamaño = 15 ;
        
        for (int i=0;i<tamaño;i++)
            productos[i] =new Producto();
        
        //ATRIBUTOS
        p1=new Producto();
        p2=new Producto();
        p3=new Producto();
        p4=new Producto();
    
    }
    
   /* public int getNumeroCualquiera(int posicion) {
return numeros [posicion] ;}
public void setNumero(int contenido, int posicion) {
this.numeros [posicion] = contenido; }*/

    public Producto getProductosCualquiera(int posicion) {
        return productos [posicion];
    }

    public void setProducto(Producto contenido, int posicion) {
        this.productos [posicion] = contenido;
    }   
    
    public void ProductosToString (){
        for(int i=0;i<20;i ++)
            System.out.println(" Producto en posicion " + i + " es: " + productos [i]);
    }
}
