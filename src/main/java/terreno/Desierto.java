/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package terreno;

import enums.EstadoSueloGranja;

/**
 *
 * @author randysmc
 */
public class Desierto extends Terreno {
    
    public Desierto() {
        super(25, 20, EstadoSueloGranja.INHABILITABLE, 'd');
    }

    public Desierto(int ladoX, int ladoY) {
        super(ladoX, ladoY);
    }
    
    

    public char getSimbol() {
        return simbol;
    }

    public void setSimbol(char simbol) {
        this.simbol = simbol;
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
    
    
    
}
