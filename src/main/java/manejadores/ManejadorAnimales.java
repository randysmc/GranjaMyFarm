/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package manejadores;

import animales.*;
import enums.EstadoAnimal;
import persona.*;
import plantas.*;

/**
 *
 * @author randysmc
 */
public class ManejadorAnimales extends Thread {
    
    Animal animal;
    Planta planta;
    Jugador jugador;

    public ManejadorAnimales(Animal animal) {
        this.animal = animal;
    }
    
    
    

    public ManejadorAnimales(Animal animal, Planta planta, Jugador jugador) {
        this.animal = animal;
        this.planta = planta;
        this.jugador = jugador;
    }

    public Animal getAnimal() {
        return animal;
    }

    public void setAnimal(Animal animal) {
        this.animal = animal;
    }

    public Planta getPlanta() {
        return planta;
    }

    public void setPlanta(Planta planta) {
        this.planta = planta;
    }

    public Jugador getJugador() {
        return jugador;
    }

    public void setJugador(Jugador jugador) {
        this.jugador = jugador;
    }
    
    public void vidaAnimal() throws InterruptedException{
        this.animal.setEstado(EstadoAnimal.CRIA);
        System.out.println("soy un: " +animal.getNombre() + " en este momento mi estado: " +animal.getEstado());
        System.out.println("Por ahora no puedo productir ningun producto");
        this.sleep(animal.getTiempoVidaCria());
        this.animal.setEstado(EstadoAnimal.JOVEN);
        System.out.println("Ya creci, ahora soy: " +animal.getEstado());
        System.out.println("Ahora ya puedo producir productos en mas proporcion");
        this.sleep(animal.getTiempoVidaJoven());
        this.animal.setEstado(EstadoAnimal.ADULTO);
        System.out.println("Ahora ya soy: " +animal.getEstado());
        System.out.println("PUedo producir productos en mayor o igual proporcion, estoy cerca de morir");
        this.sleep(animal.getTiempoVidaAdulto());
        this.animal.setEstado(EstadoAnimal.MUERTO);
        System.out.println("Ya estoy bien pinche muerto Alv");

        
    }
    
    public void vivir() throws InterruptedException{
        while(this.animal.getEstado() != EstadoAnimal.MUERTO){
            this.sleep(animal.getTiempoVidaT());
            vidaAnimal();
        }
    }
    
    @Override
    public void run(){
        try {
            vivir();
        } catch (Exception e) {
        }
    }
    
    

    
}
