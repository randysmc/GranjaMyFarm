/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package manejadores;

import static java.lang.Math.random;
import java.util.Random;
import javax.swing.JOptionPane;
import terreno.*;
import ventana.Boton;

/**
 *
 * @author randysmc
 */
public class CreadorTerreno {
    //Random random = new Random();

    public static Terreno[][] crearTerreno(int sueloX, int sueloY) {

        Terreno cuadroTerreno;

        Terreno[][] terreno = new Terreno[sueloX][sueloY];
        for (int i = 0; i < sueloX; i++) {
            for (int j = 0; j < sueloY; j++) {
                Boton boton = new Boton(i + 1, j + 1, "Esto es un mensaje");
                boton.addMouseListener(new java.awt.event.MouseAdapter() {
                    @Override
                    public void mouseClicked(java.awt.event.MouseEvent evt) {
                        Boton boton = (Boton) evt.getComponent();
                        JOptionPane.showMessageDialog(null, "fila: " + (boton.getNumFila()) + " columna: " + (boton.getNumColumna()));

                    }
                });
                /*cuadroTerreno = new Agua(sueloX, sueloY);
                        terreno[i][j] = cuadroTerreno;
                        //cuadroTerreno = new Terreno(sueloX, sueloY);
                        //terreno[i][j] = cuadroTerreno;*/
                int random;
                random = Dado.tirarDado(0, 10, 1, false);

                if (random >= 0 && random <= 4) {
                    terreno[i][j] = new Grama(sueloX, sueloY);
                } else if (random > 4 && random <= 8) {
                    terreno[i][j] = new Agua(sueloX, sueloY);
                } else {
                    terreno[i][j] = new Desierto(sueloX, sueloY);
                }

            }

        }
        return terreno;

    }

}
