package manejadores;

import animales.*;
import enums.EstadoAnimal;
import java.util.Random;
import javax.swing.JButton;
import persona.Jugador;
import terreno.*;
import ventana.*;
import manejadores.*;
//import terreno.Casilla;
import persona.*;

public class Granja {

    Random random = new Random();
    Principal principal;
    Terreno[][] terreno;
    //Jugador jugador;

    public Granja(int cantidadX, int cantidadY) {
        this.terreno = CreadorTerreno.crearTerreno(cantidadX, cantidadY);

    }

    public Granja() {
    }
    
    

    Animal gallina = new Gallina();
    Animal vaca = new Vaca();
    
    
    
    ManejadorAnimales vidaGallina = new ManejadorAnimales(gallina);
    ManejadorAnimales vidaVaca = new ManejadorAnimales(vaca);
    
    Thread vida1 = new Thread(vidaGallina);
    Thread vida2 = new Thread(vidaVaca);
    
    public void iniciarVidaAnimales(){
        vida1.start();
        vida2.start();
    }
    
    
    
    
    
    


    /*Jugador granjero;
    Animal[] animalesGranjero;
    Terreno terreno;
    JButton boton;

    Principal principal;*/

 /* public void crearGranja() {
        Terreno [][] terreno = new Terreno[5][5];
        int random;
        for (int i = 0; i < terreno.length; i++) {
            for (int j = 0; j < terreno.length; j++) {
                random = Dado.tirarDado(0, 10, 1, false);

                if (random >= 0 && random <= 4) {
                    terreno[i][j] = new Grama();
                } else if (random > 4 && random <= 8) {
                    terreno[i][j] = new Agua();
                } else {
                    terreno[i][j] = new Desierto();
                }

            }
        }
    }



    public void mostrarGranja() {
        crearGranja();
        String linea1 = "";
        String linea2 = "";
        String linea3 = "";
        for (int i = 0; i <terreno.length; i++) {
            for (int j = 0; j < terreno.length; j++) {
                linea1 += terreno[i][j].getSimbol();
                linea2 += terreno[i][j].getSimbol();
                linea3 += terreno[i][j].getSimbol();
            }

            //System.out.println(linea1);
            System.out.println(linea2);
            //System.out.println(linea3);
            linea1 = "";
            linea2 = "";
            linea3 = "";

        }

    }*/
    public Terreno[][] getTerreno() {
        return terreno;
    }

    public void setTerreno(Terreno[][] terreno) {
        this.terreno = terreno;
    }

}

/* if (j==7)
                    linea2+="  "+i;
                if (i==7)
                    linea4+="   "+j+"  ";*/
