
package animales;

import enums.EstadoAnimal;
import interfaces.Omnivoro;
import productos.*;


public class Gallina extends Animal implements Omnivoro{
    
    private static int instanciasGallina;
    private Huevos[] huevos;
    private Carne[] carneGallina;

    public Gallina(Huevos[] huevos, Carne[] carneGallina ) {
        super("Galllina", 50, 5000,5000,5000,150000, "kiki", 1.5, EstadoAnimal.CRIA);
        this.huevos = huevos;
        this.carneGallina = carneGallina;
        Gallina.instanciasGallina++;
    }

    public Gallina() {
        super("nombre", 15, (5*1000), (10*1000), (15*1000), (30*1000), "kiki",1.5, enums.EstadoAnimal.CRIA);
        Gallina.instanciasGallina++;
    }
    

    public static int getInstanciasGallina() {
        return instanciasGallina;
    }

    public static void setInstanciasGallina(int instanciasGallina) {
        Gallina.instanciasGallina = instanciasGallina;
    }

    public Huevos[] getHuevos() {
        return huevos;
    }

    public void setHuevos(Huevos[] huevos) {
        this.huevos = huevos;
    }

    public Carne[] getCarneGallina() {
        return carneGallina;
    }

    public void setCarneGallina(Carne[] carneGallina) {
        this.carneGallina = carneGallina;
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

    public int getTiempoVidaCria() {
        return tiempoVidaCria;
    }

    public void setTiempoVidaCria(int tiempoVida) {
        this.tiempoVidaCria = tiempoVida;
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
    
    


    
    
    
    
    

public void comer(){
    System.out.println("este metodo  me ayudara a hacer algo");
    System.out.println(this.nombre);
    System.out.println("mi precio es de: " +this.precio);
    System.out.println("al inicio mi estado es: " + EstadoAnimal.CRIA);
    if(estado == EstadoAnimal.CRIA){
    System.out.println("Me acaban de comprar, toy chiquita");
    }else if(estado == EstadoAnimal.MUERTO){
        System.out.println("Estoy bien pinche muertoALV limpia");
    }
}

    @Override
    public void generarProductos() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void comiendoComoOmnivoro() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }




    
}
