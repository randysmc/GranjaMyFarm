/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package plantas;

import enums.EstadoCosecha;

/**
 *
 * @author randysmc
 */
public class Maiz extends Planta{
    
    private static int instanciasMaiz;
    
    public Maiz(int precio, int tiempoDeVida, int cantidadSemillas, int tiempoMaduracion, int tiempoDeSecado, EstadoCosecha estado) {
        super(precio, tiempoDeVida, cantidadSemillas, tiempoMaduracion, tiempoDeSecado, estado);
        Maiz.instanciasMaiz++; //cada vez que se ejecute el constructor agregara una instancias de la clase
    }
    
    
}
