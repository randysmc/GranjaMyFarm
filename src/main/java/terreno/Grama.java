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
public class Grama extends Casilla{
    
    public Grama(int precio) {
        super(40, precio, EstadoSueloGranja.SEMBRAR);
    }
    
    
    
}
