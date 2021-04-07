/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package animales;

import enums.EstadoAnimal;
import interfaces.Herviboro;

/**
 *
 * @author randysmc
 */
public class Vaca extends Animal implements Herviboro{
    
    private static int instanciasVaca;
    

    public Vaca() {
        super("Vaca", 15, 50000, "Muuu", 4, EstadoAnimal.CRIA);
        Vaca.instanciasVaca ++;
    }

    public static int getInstanciasVaca() {
        return instanciasVaca;
    }

    public static void setInstanciasVaca(int instanciasVaca) {
        Vaca.instanciasVaca = instanciasVaca;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getPrecio() {
        return precio;
    }

    public void setPrecio(int precio) {
        this.precio = precio;
    }

    public int getTiempoVida() {
        return tiempoVida;
    }

    public void setTiempoVida(int tiempoVida) {
        this.tiempoVida = tiempoVida;
    }

    public String getIcono() {
        return icono;
    }

    public void setIcono(String icono) {
        this.icono = icono;
    }

    public double getEspacioParcela() {
        return espacioParcela;
    }

    public void setEspacioParcela(double espacioParcela) {
        this.espacioParcela = espacioParcela;
    }

    public EstadoAnimal getEstado() {
        return estado;
    }

    public void setEstado(EstadoAnimal estado) {
        this.estado = estado;
    }
    
    
    


    

    @Override
    public void comer() {
        System.out.println("soy una: " + this.nombre);
        System.out.println("ocupo: " +this.espacioParcela + " espacios en parcela");
        
    }

  
    
    


    
    
    
}
