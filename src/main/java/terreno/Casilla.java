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
public abstract class Casilla {
    
    protected int probabilidadAparicion;
    protected int precio;
    protected EstadoSueloGranja estadoSuelo;

    public Casilla(int probabilidadAparicion, int precio, EstadoSueloGranja estadoSuelo) {
        this.probabilidadAparicion = probabilidadAparicion;
        this.precio = precio;
        this.estadoSuelo = estadoSuelo;
    }
    
    
    
    
    
    
    
}
