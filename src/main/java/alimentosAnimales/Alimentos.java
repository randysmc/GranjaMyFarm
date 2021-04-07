/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package alimentosAnimales;

/**
 *
 * @author randysmc
 */
public class Alimentos {
    private String nombre;
    private int precio;
    private int nutrientes;

    public Alimentos(String nombre, int precio, int nutrientes) {
        this.nombre = nombre;
        this.precio = precio;
        this.nutrientes = nutrientes;
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

    public int getNutrientes() {
        return nutrientes;
    }

    public void setNutrientes(int nutrientes) {
        this.nutrientes = nutrientes;
    }
    
    
    
    
}
