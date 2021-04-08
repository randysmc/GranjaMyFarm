/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package fertilizantes;

/**
 *
 * @author randysmc
 */
public class Fertilizante {
    private String nombre;
    private int precioFert;
    private int cantidadMejora;

    public Fertilizante(String nombre, int precioFert, int cantidadMejora) {
        this.nombre = nombre;
        this.precioFert = precioFert;
        this.cantidadMejora = cantidadMejora;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
    
    

    public int getPrecioFert() {
        return precioFert;
    }

    public void setPrecioFert(int precioFert) {
        this.precioFert = precioFert;
    }

    public int getCantidadMejora() {
        return cantidadMejora;
    }

    public void setCantidadMejora(int cantidadMejora) {
        this.cantidadMejora = cantidadMejora;
    }
    
    
    
}
