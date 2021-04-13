/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package manejadores;

import persona.*;

/**
 *
 * @author randysmc
 */
public class ManejadorGranjero extends Thread {
    Jugador jugador;
    
    
    public ManejadorGranjero(Jugador jugador){
        this.jugador = jugador;
        
    }
    
    
    public void vidaJugador() throws InterruptedException{
        
        this.jugador.setVida(jugador.getVida());
        this.sleep(1000);
        System.out.println("mi vida es:" +jugador.getVida());
        
        

        
    }
    
    public void vivirJugador() throws InterruptedException{
        int vidaJugador = jugador.getVida();
        while(jugador.getVida() !=0){
            this.sleep(1000);
            vidaJugador--;  
        }
        
    }
    
    @Override
    public void run(){
        try {
            vivirJugador();
        } catch (Exception e) {
        }
    }
    
    
    
    
}
