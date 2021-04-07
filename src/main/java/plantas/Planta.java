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
public abstract class Planta {
    protected int precio;
    protected int tiempoDeVida;
    protected int cantidadSemillas;
    protected int tiempoMaduracion;
    protected int tiempoDeSecado;
    protected EstadoCosecha estado;
    private static int instanciasPlanta;

    public Planta(int precio, int tiempoDeVida, int cantidadSemillas, int tiempoMaduracion, int tiempoDeSecado, EstadoCosecha estado) {
        this.precio = precio;
        this.tiempoDeVida = tiempoDeVida;
        this.cantidadSemillas = cantidadSemillas;
        this.tiempoMaduracion = tiempoMaduracion;
        this.tiempoDeSecado = tiempoDeSecado;
        this.estado = estado;
        instanciasPlanta++;
    }
    
    
    
    
}
