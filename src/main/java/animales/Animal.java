
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
    protected int tiempoVidaCria, tiempoVidaJoven, tiempoVidaAdulto;
    protected String icono;
    protected double espacioParcela;
    protected EstadoAnimal estado;
    protected int tiempoVidaT = (tiempoVidaCria+tiempoVidaJoven+tiempoVidaAdulto);
    
    private static int instanciasAnimales;

    public Animal(String nombre, int precio, int tiempoVidaCria, 
            int tiempoVidaJoven, int tiempoVidaAdulto,int tiempVidaT, String icono, double espacioParcela, EstadoAnimal estado) {
        this.nombre = nombre;
        this.precio = precio;
        this.tiempoVidaCria = tiempoVidaCria;
        this.tiempoVidaJoven = tiempoVidaJoven;
        this.tiempoVidaCria = tiempoVidaAdulto;
        this.tiempoVidaT = tiempoVidaT;
        this.icono = icono;
        this.espacioParcela = espacioParcela;
        this.estado = estado;
        instanciasAnimales ++;
    }

    public int getTiempoVidaT() {
        return tiempoVidaT;
    }

    public void setTiempoVidaT(int tiempoVidaT) {
        this.tiempoVidaT = tiempoVidaT;
    }
    
    
    

    public int getTiempoVidaCria() {
        return tiempoVidaCria;
    }

    public void setTiempoVidaCria(int tiempoVidaCria) {
        this.tiempoVidaCria = tiempoVidaCria;
    }

    public int getTiempoVidaJoven() {
        return tiempoVidaJoven;
    }

    public void setTiempoVidaJoven(int tiempoVidaJoven) {
        this.tiempoVidaJoven = tiempoVidaJoven;
    }

    public int getTiempoVidaAdulto() {
        return tiempoVidaAdulto;
    }

    public void setTiempoVidaAdulto(int TiempoVidaAdulto) {
        this.tiempoVidaAdulto = tiempoVidaAdulto;
    }
    
    
    
    public abstract void generarProductos();


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
