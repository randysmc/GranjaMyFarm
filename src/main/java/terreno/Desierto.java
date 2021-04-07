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
public class Desierto extends Casilla {
    
    public Desierto(int precio) {
        super(25, precio, EstadoSueloGranja.INHABILITABLE);
    }
    
}
