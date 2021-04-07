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
public class Agua extends Casilla {

    public Agua(int precio) {
        super(35, precio, EstadoSueloGranja.PESCAR);
        
    }

    public Agua() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    
    
    
    
    
    
}
