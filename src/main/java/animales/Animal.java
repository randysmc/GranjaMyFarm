
package animales;

import enums.EstadoAnimal;

/**
 *
 * @author randysmc
 */
public abstract class Animal {

    //static int instanciasGallina;
    protected String nombre;
    protected int precio;
    protected int tiempoVida;
    protected String icono;
    protected double espacioParcela;
    protected EstadoAnimal estado;
    
    private static int instanciasAnimales;

    public Animal(String nombre, int precio, int tiempoVida, String icono, double espacioParcela, EstadoAnimal estado) {
        this.nombre = nombre;
        this.precio = precio;
        this.tiempoVida = tiempoVida;
        this.icono = icono;
        this.espacioParcela = espacioParcela;
        this.estado = estado;
        instanciasAnimales ++;
    }
    
    
    

    
   
    //public abstract void tiempoDeVida();
    //public abstract void comer();
    //public abstract void vivir();
    //public abstract void existir();

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

    public static int getInstanciasAnimales() {
        return instanciasAnimales;
    }

    public static void setInstanciasAnimales(int instanciasAnimales) {
        Animal.instanciasAnimales = instanciasAnimales;
    }
}
