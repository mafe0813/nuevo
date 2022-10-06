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
public class Producto {
    
//Constantes en public
    public final static int PAPELERIA = 1;
    public final static int SUPERMERCADO = 2;
    public final static int DROGUERIA = 3;
    
    //Atributos
    private String nombre;
    private int tipo;
    private int cantitadbodega;
    private int cantidadMinimo;
    private double valorunitario;
    private int totalunidadesVendidas;

    //construstor
    public Producto() {

    }

    public Producto(String nombre, int tipo, int cantitadbodega, int cantidadMinimo, double valorunitario, int totalunidadesVendidas) {
        this.nombre = nombre;
        this.tipo = tipo;
        this.cantitadbodega = cantitadbodega;
        this.cantidadMinimo = cantidadMinimo;
        this.valorunitario = valorunitario;
        this.totalunidadesVendidas = totalunidadesVendidas;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getTipo() {
        return tipo;
    }

    public void setTipo(int tipo) {
        this.tipo = tipo;
    }

    public int getCantitadbodega() {
        return cantitadbodega;
    }

    public void setCantitadbodega(int cantitadbodega) {
        this.cantitadbodega = cantitadbodega;
    }

    public int getCantidadMinimo() {
        return cantidadMinimo;
    }

    public void setCantidadMinimo(int cantidadMinimo) {
        this.cantidadMinimo = cantidadMinimo;
    }

    public double getValorunitario() {
        return valorunitario;
    }

    public void setValorunitario(double valorunitario) {
        this.valorunitario = valorunitario;
    }

    public int getTotalunidadesVendidas() {
        return totalunidadesVendidas;
    }

    public void setTotalunidadesVendidas(int totalunidadesVendidas) {
        this.totalunidadesVendidas = totalunidadesVendidas;
    }
    
    
}