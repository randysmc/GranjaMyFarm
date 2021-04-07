/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package plantas;

import enums.EstadoCosecha;
import interfaces.Fruta;

/**
 *
 * @author randysmc
 */
public class Manzano extends Planta implements Fruta{
    
    private static int instanciaManzano;

    public Manzano(int precio, int tiempoDeVida, int cantidadSemillas, int tiempoMaduracion, int tiempoDeSecado, EstadoCosecha estado) {
        super(precio, tiempoDeVida, cantidadSemillas, tiempoMaduracion, tiempoDeSecado, estado);
        Manzano.instanciaManzano++;
    }


    
}
