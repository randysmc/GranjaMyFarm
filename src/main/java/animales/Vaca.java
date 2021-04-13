/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package animales;

import enums.*;
import interfaces.*;
import productos.*;

/**
 *
 * @author randysmc
 */
public class Vaca extends Animal implements Herviboro {

    private static int instanciasVaca;
    private Carne[] carneVaca; //no se si tomarlo como un arreglo o como un objeto
    private Leche[] lecheVaca;
    private int cantidadCarne;
    private int cantidadCuero;
    private int cantidadLeche;
    private double carneProducida =0.75;
    private double cueroProducido =0.25;
    private double lecheProducida =1;

    public Vaca() {
        super("Vaca", 75, 5000,5000,5000,15000, "Muu", 4, EstadoAnimal.CRIA);
        Vaca.instanciasVaca++;
    }


    //Metodo para obeter la cantidad de carne de la vaca, dependiendo del estado de vida
    public int getCantidadCarne() {
        if (estado == EstadoAnimal.CRIA) {
            cantidadCarne = 05;
        } else if (estado == EstadoAnimal.JOVEN) {
            cantidadCarne = 20;
        } else if (estado == EstadoAnimal.ADULTO) {
            cantidadCarne = 30;
        } else {
            cantidadCarne = 0;
        }
        return (int) (cantidadCarne * carneProducida);
    }
    
    //metodo para obtener la cantidad de cuero de la vaca dependiendo de su estado de vida

    public int getCantidadCuero() {
        if (estado == EstadoAnimal.CRIA) {
            cantidadCuero = 05;
        } else if (estado == EstadoAnimal.JOVEN) {
            cantidadCuero = 20;
        } else if (estado == EstadoAnimal.ADULTO) {
            cantidadCuero = 30;
        } else {
            cantidadCuero = 0;
        }
        return (int)(cantidadCuero* cueroProducido);
    }

    public int getCantidadLeche() {
        if (estado == EstadoAnimal.CRIA) {
            cantidadLeche = 01;
        } else if (estado == EstadoAnimal.JOVEN) {
            cantidadLeche = 5;
        } else if (estado == EstadoAnimal.ADULTO) {
            cantidadCarne = 10;
        } else {
            cantidadCarne = 0;
        }
        return cantidadLeche;
    }

    public Carne[] getCarneVaca() {
        return carneVaca;
    }

    public void setCarneVaca(Carne[] carneVaca) {
        this.carneVaca = carneVaca;
    }

    public Leche[] getLecheVaca() {
        return lecheVaca;
    }

    public void setLecheVaca(Leche[] lecheVaca) {
        this.lecheVaca = lecheVaca;
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

    public double getCarneProducida() {
        return carneProducida;
    }

    public void setCarneProducida(double carneProducida) {
        this.carneProducida = carneProducida;
    }

    public double getCueroProducido() {
        return cueroProducido;
    }

    public void setCueroProducido(double cueroProducido) {
        this.cueroProducido = cueroProducido;
    }

    public double getLecheProducida() {
        return lecheProducida;
    }

    public void setLecheProducida(double lecheProducida) {
        this.lecheProducida = lecheProducida;
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
    public void comerComoHerviboro() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void generarProductos() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

}
