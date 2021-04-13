 /*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package manejadores;

import javax.swing.JButton;
import javax.swing.JPanel;
import terreno.*;
import ventana.*;


public class ManejadorSuelo {
    JPanel terrenoPanel;
    Principal principal;
    //private JButton boton;
    private Terreno[][] distribucionTerreno;
    private int cantX=5;
    private int cantY=6;

    public ManejadorSuelo(JPanel terrenoPanel, Terreno[][] distribucionTerreno, int cantX, int cantY) {
        //this.principal = principal;
        this.terrenoPanel = terrenoPanel;
        this.distribucionTerreno = distribucionTerreno;
        this.cantX = cantX;
        this.cantY = cantY;
        pintaSuelo();
    }


    
    public void pintaSuelo(){
        for (int  i = 0;  i < cantX;  i++) {
            for (int j = 0; j < cantY; j++) {
                Terreno terreno = this.distribucionTerreno[i][j];
                //terrenoPanel.add(terreno.getBoton());
                //principal.getTerrenoPanel().add(terreno.getBoton());
                //terrenoPanel.add(terreno.getBoton());
                //principal.setTerrenoPanel((JPanel) principal.getTerrenoPanel().add(terreno.getBoton()));
                //principal.setTerrenoPanel();
                this.terrenoPanel.add(terreno.getBoton());

                
            }
            
        }
    }



    public Terreno[][] getDistribucionTerreno() {
        return distribucionTerreno;
    }

    public void setDistribucionTerreno(Terreno[][] distribucionTerreno) {
        this.distribucionTerreno = distribucionTerreno;
    }

    public int getCantX() {
        return cantX;
    }

    public void setCantX(int cantX) {
        this.cantX = cantX;
    }

    public int getCantY() {
        return cantY;
    }

    public void setCantY(int cantY) {
        this.cantY = cantY;
    }
    
    
    
    
    
}
