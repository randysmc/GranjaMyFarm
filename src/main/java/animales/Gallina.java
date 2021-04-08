
package animales;

import enums.EstadoAnimal;
import interfaces.Omnivoro;
import productos.*;


public class Gallina extends Animal implements Omnivoro{
    
    private static int instanciasGallina;
    private Huevos[] huevos;
    private Carne[] carneGallina;

    public Gallina() {
        super("Gallina", 15, 5000, "kiki",1.5, EstadoAnimal.CRIA);
        Gallina.instanciasGallina++;
    }

 

    public static int getInstanciasGallina() {
        return instanciasGallina;
    }

    public static void setInstanciasGallina(int instanciasGallina) {
        Gallina.instanciasGallina = instanciasGallina;
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




    
}
