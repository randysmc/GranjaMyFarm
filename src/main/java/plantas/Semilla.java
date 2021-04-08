/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package plantas;

/**
 *
 * @author randysmc
 */
public class Semilla {
    
    private String nombre;
    private int precio;
    private int cantidadNecesaria;

    public Semilla(String nombre, int precio, int cantidadNecesaria) {
        this.nombre = nombre;
        this.precio = precio;
        this.cantidadNecesaria = cantidadNecesaria;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getPrecio() {
        return precio;
    }

    public void setPrecio(int precio) {
        this.precio = precio;
    }

    public int getCantidadNecesaria() {
        return cantidadNecesaria;
    }

    public void setCantidadNecesaria(int cantidadNecesaria) {
        this.cantidadNecesaria = cantidadNecesaria;
    }
    
    
    
    
    
         
    
}
