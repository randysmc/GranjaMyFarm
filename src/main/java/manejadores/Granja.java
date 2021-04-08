package manejadores;

import animales.*;
import java.util.Random;
import persona.Persona;
import terreno.*;
//import terreno.Casilla;

public class Granja {

    Random random = new Random();

    Persona granjero;
    Animal[] animalesGranjero;
    int x = 5;
    int y = 5;
    Casilla[][] terreno = new Casilla[x][y];
    //Casilla casilla;
    Agua agua;
    Grama grama;
    Desierto desierto;

    public void crearGranja() {
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

                /* switch (random) {
                    case 0:
                        terreno[i][j] = new Grama();
                        break;
                    case 1:
                        terreno[i][j] = new Agua();
                        break;
                    case 2:
                        terreno[i][j] = new Desierto();
                        break;
                    default:
                        terreno[i][j] = new Grama();
                        break;*/
            }
        }
    }



    public void mostrarGranja() {
        crearGranja();
        String linea1 = "";
        String linea2 = "";
        String linea3 = "";
        for (int i = 0; i < x; i++) {
            for (int j = 0; j < y; j++) {
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

    }
}

    /* if (j==7)
                    linea2+="  "+i;
                if (i==7)
                    linea4+="   "+j+"  ";*/

