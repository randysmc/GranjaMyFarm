
package manejadores;

import animales.*;
import plantas.*;
import alimentosAnimales.*;
import enums.EstadoAnimal;

/**
 *
 * @author randysmc
 */
public class Mercado {
    
    private Animal[] animalesVenta;
    private Planta[] plantasVenta;
    //private int cantidadAlimentos=10;
    private int posicion=0;
    private Alimentos[] alimentosAnimalVenta = new Alimentos[15];
    
    
    public Mercado(){
        animalesVenta = new Animal[5];
        
        
    }

    
    public void generarVentaAlimentos(){
       
        alimentosAnimalVenta[0] = new Alimentos("Arroz", 15, 10);
        alimentosAnimalVenta[1] = new Alimentos("cocaina",15,100);
        alimentosAnimalVenta[2] = new Alimentos("azitromicina",15,100);
        alimentosAnimalVenta[3] = new Alimentos("cocaina2",15,100);
        
    }
    
    public void verificarArregloAlimentos(){
        generarVentaAlimentos();
        
        while((posicion < alimentosAnimalVenta.length) && (alimentosAnimalVenta[posicion] != null)){
            posicion++;
           
        }
        
    }

    public void mostrarAlimentos(){
        generarVentaAlimentos();
        verificarArregloAlimentos();
        alimentosAnimalVenta = new Alimentos[posicion];
        
        verificarArregloAlimentos();
        for (int i = 0; i < posicion; i++) {
            System.out.println(i+ " con nombre: " + alimentosAnimalVenta[i].getNombre()+ " precio de: "
                    +alimentosAnimalVenta[i].getPrecio()+ " aporta: " 
                    +alimentosAnimalVenta[i].getNutrientes()+ " nutrientes");
             
        }
    }
    
    
        public void generarAnimalesVenta(){
            int random ;
            for (int i = 0; i < animalesVenta.length; i++) {
                random = Dado.tirarDado(0,1,1,false);
                switch(random){
                    case 0: 
                        animalesVenta[i] = new Gallina();
                        break;
                    case 1:
                        animalesVenta[i] = new Vaca();
                        break;
                        
                }
                
            }
            
    }
        
        public void mostrarAnimalesVenta(){
            generarAnimalesVenta();
            for (int i = 0; i < animalesVenta.length; i++) {
                System.out.println("Animal #: " +(i+1) + " Nombre: " + animalesVenta[i].getNombre()+ " y: " +animalesVenta[i].getPrecio());
                
            }
        }
    
    
    
    
}
