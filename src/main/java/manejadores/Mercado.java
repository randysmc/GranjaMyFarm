package manejadores;

import animales.*;
import plantas.*;
import alimentosAnimales.*;
import enums.*;
import fertilizantes.*;


/**
 *
 * @author randysmc
 */
public class Mercado {

    private int cAnimalV =2;
    private Animal[] animalesVenta;
    private int cPlantaV =2;
    private Planta[] plantasVenta;
    //private int cantidadAlimentos=10;
    private int posicion = 0;
    private int cAlimentosAnVenta =5;
    private Alimentos[] alimentosAnimalVenta;
    private int cFertilizanteV =3;
    private Fertilizante[] fertilizantesVenta;
    private int cSemillaV =2;
    private Semilla[] semillasVenta;

    public Mercado() {
        animalesVenta = new Animal[cAnimalV];
        plantasVenta = new Planta[cPlantaV];
        alimentosAnimalVenta = new Alimentos[cAlimentosAnVenta];
        fertilizantesVenta = new Fertilizante[cFertilizanteV];
        semillasVenta = new Semilla[cSemillaV];
        

    }
    
    public void iniciarVenta(){
        System.out.println("Estos son los animales que hay en venta");
        mostrarAnimalesVenta();
        System.out.println("Estos son los alimentos ");
        mostrarAlimentos();
        System.out.println("Estos son los fertilizantes");
        mostrarFertilizantesVenta();
        System.out.println("Estas son las semillas");
        mostrarSemillasVenta();
    }

    public void generarVentaAlimentos() {

        alimentosAnimalVenta[0] = new Alimentos("Arroz", 15, 10);
        alimentosAnimalVenta[1] = new Alimentos("cocaina", 15, 100);
        alimentosAnimalVenta[2] = new Alimentos("azitromicina", 15, 100);
        alimentosAnimalVenta[3] = new Alimentos("cocaina2", 15, 100);

    }

    public void verificarArregloAlimentos() {
        generarVentaAlimentos();

        while ((posicion < alimentosAnimalVenta.length) && (alimentosAnimalVenta[posicion] != null)) {
            posicion++;

        }

    }

    public void mostrarAlimentos() {
        generarVentaAlimentos();
        verificarArregloAlimentos();
        alimentosAnimalVenta = new Alimentos[posicion];

        verificarArregloAlimentos();
        for (int i = 0; i < posicion; i++) {
            System.out.println(i + " con nombre:     " + alimentosAnimalVenta[i].getNombre() + "   precio de:  "
                    + alimentosAnimalVenta[i].getPrecio() + " aporta:     "
                    + alimentosAnimalVenta[i].getNutrientes() + " nutrientes");

        }
    }

    public void generarAnimalesVenta() {
        /*int random;
        for (int i = 0; i < animalesVenta.length; i++) {
            random = Dado.tirarDado(0, 1, 1, false);
            switch (random) {
                case 0:
                    animalesVenta[i] = new Gallina();
                    break;
                case 1:
                    animalesVenta[i] = new Vaca();
                    break;

            }

        }*/
        
        animalesVenta[0] = new Gallina();
        animalesVenta[1] = new Vaca();

    }

    public void mostrarAnimalesVenta() {
        generarAnimalesVenta();
        for (int i = 0; i < animalesVenta.length; i++) {
            System.out.println("Animal #:   " + (i + 1) + " Nombre: "
                    + animalesVenta[i].getNombre() + " precio de :  " + animalesVenta[i].getPrecio() + " espacio:    "
                    + animalesVenta[i].getEspacioParcela());

        }
    }
    
    public void generarFertilizantesVenta(){
        fertilizantesVenta[0] = new Fertilizante("El mejor",20,10);
        fertilizantesVenta[1] = new Fertilizante("El segundo mejor",10,7);
        fertilizantesVenta[2] = new Fertilizante("El chafa",5,5);
        
    }
    
    public void mostrarFertilizantesVenta(){
        generarFertilizantesVenta();
        for (int i = 0; i < fertilizantesVenta.length; i++) {
            System.out.println((i+1)+ " Nombre: " +fertilizantesVenta[i].getNombre()+
                    " con capacidad de hacer crecer tu cultivo del: " +fertilizantesVenta[i].getCantidadMejora() + " %"+
                    " y un precio de: Q" +fertilizantesVenta[i].getPrecioFert());
            
        }
    }
    
    public void generarSemillasVenta(){
        semillasVenta[0]= new Semilla("Semilla para Manzano", 10, 5);
        semillasVenta[1]= new Semilla("Semilla para maiz", 15, 10);
   
        
    }
    
    public void mostrarSemillasVenta(){
        generarSemillasVenta();
        for (int i = 0; i < semillasVenta.length; i++) {
            System.out.println("Nombre: " +semillasVenta[i].getNombre()+
                    " con un precio de: Q" + semillasVenta[i].getPrecio()+
                    "con un total de: " +semillasVenta[i].getCantidadNecesaria()+ " semillas");
            
        }
    }

}
