/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package terreno;

import enums.EstadoSueloGranja;
import ventana.Boton;
import ventana.Principal;

/**
 *
 * @author randysmc
 */
public class Terreno {
    
    protected int probabilidadAparicion;
    protected int precio;
    protected EstadoSueloGranja estadoSuelo;
    protected char simbol;
    protected int ladoX;
    protected int ladoY;
    private Principal principal;
    private Boton boton;
    private boolean estadoCompra;

    public Terreno(int probabilidadAparicion,  int precio, EstadoSueloGranja estadoSuelo, char simbol) {
        this.probabilidadAparicion = probabilidadAparicion;
        this.precio = precio;
        this.estadoSuelo = estadoSuelo;
        this.simbol = simbol;
    }
    
    
    
    

    public Terreno(int probabilidadAparicion, int precio, EstadoSueloGranja estadoSuelo, char simbol, int ladoX, int ladoY, Principal principal, Boton boton, boolean estadoCompra) {
        this.probabilidadAparicion = probabilidadAparicion;
        this.precio = precio;
        this.estadoSuelo = estadoSuelo;
        this.simbol = simbol;
        this.ladoX = ladoX;
        this.ladoY = ladoY;
        this.principal = principal;
        this.boton = boton;
        this.estadoCompra = estadoCompra;
    }

    public Terreno(int ladoX, int ladoY) {
        this.ladoX = ladoX;
        this.ladoY = ladoY;
    }
    
    

    public int getProbabilidadAparicion() {
        return probabilidadAparicion;
    }

    public void setProbabilidadAparicion(int probabilidadAparicion) {
        this.probabilidadAparicion = probabilidadAparicion;
    }

    public int getPrecio() {
        return precio;
    }

    public void setPrecio(int precio) {
        this.precio = precio;
    }

    public EstadoSueloGranja getEstadoSuelo() {
        return estadoSuelo;
    }

    public void setEstadoSuelo(EstadoSueloGranja estadoSuelo) {
        this.estadoSuelo = estadoSuelo;
    }

    public char getSimbol() {
        return simbol;
    }

    public void setSimbol(char simbol) {
        this.simbol = simbol;
    }

    public int getLadoX() {
        return ladoX;
    }

    public void setLadoX(int ladoX) {
        this.ladoX = ladoX;
    }

    public int getLadoY() {
        return ladoY;
    }

    public void setLadoY(int ladoY) {
        this.ladoY = ladoY;
    }

    public Principal getPrincipal() {
        return principal;
    }

    public void setPrincipal(Principal principal) {
        this.principal = principal;
    }

    public Boton getBoton() {
        return boton;
    }

    public void setBoton(Boton boton) {
        this.boton = boton;
    }

    public boolean isEstadoCompra() {
        return estadoCompra;
    }

    public void setEstadoCompra(boolean estadoCompra) {
        this.estadoCompra = estadoCompra;
    }



    
    
    
    
    
    
    
}
