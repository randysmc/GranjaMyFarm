/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package animales;

import enums.EstadoAnimal;
import interfaces.Omnivoro;

/**
 *
 * @author randysmc
 */
public class Cerdo extends Animal implements Omnivoro{
    
    public Cerdo(String nombre, int precio, int tiempoVida, String icono, double espacioParcela, EstadoAnimal estado) {
        super(nombre, precio, tiempoVida, icono, espacioParcela, estado);
    }
    
    
}
