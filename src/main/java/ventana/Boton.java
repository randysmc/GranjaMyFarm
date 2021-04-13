/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ventana;

import java.awt.Color;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.Action;
import javax.swing.Icon;
import javax.swing.JButton;

/**
 *
 * @author randysmc
 */
public class Boton extends JButton implements ActionListener {
    
    private int numFila;
    private int numColumna;
    //private String mensaje;

    public Boton(int numFila, int numColumna, String text) {
        super(text);
        this.numFila = numFila;
        this.numColumna = numColumna;
    }
    
    

    public Boton(int numFila, int numColumna, Icon icon) {
        super(icon);
        this.numFila = numFila;
        this.numColumna = numColumna;
    }

    public Boton(int numFila, int numColumna, Action a) {
        super(a);
        this.numFila = numFila;
        this.numColumna = numColumna;
    }
    
    



    public int getNumFila() {
        return numFila;
    }

    public void setNumFila(int numFila) {
        this.numFila = numFila;
    }

    public int getNumColumna() {
        return numColumna;
    }

    public void setNumColumna(int numColumna) {
        this.numColumna = numColumna;
    }
    
    
    
    public void setNombre(int x, int y){
        setText((x+1)+" "+(y+1));
    }


    @Override
    public void actionPerformed(ActionEvent ae) {
        setBackground(Color.red);
    }
    
}
