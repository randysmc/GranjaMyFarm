package ventana;

import javax.swing.*;
import java.awt.event.*;
import java.awt.*;

public class Ventana extends JFrame implements ActionListener {

    //private JLabel labelNombre , labelNickName, label3;
    private JTextField textfieldNombre, textfieldNickName;
    private JLabel labelNombre, labelNickName, label3;
    private JButton boton1, boton2;
    
    
    
    public Ventana(){
        setLayout(null);
        setTitle("My Farm");
        getContentPane().setBackground(new Color(1,2,3));
        setIconImage(new ImageIcon(getClass().getResource("/home/randysmc/N…aMyFarm/Imagenes/Fondo.jpg")).getImage()); //obtiene una imagen de la siguiente ruta
        
        ImageIcon imagenFondo = new ImageIcon("/home/randysmc/N…aMyFarm/Imagenes/Fondo.jpg");
        label3 = new JLabel(imagenFondo);
        label3.setBounds(25,15,300,1500);
        add(label3);
        
        labelNombre = new JLabel("Ingrese su nombre");
        labelNombre.setBounds(35,135,300,30);
        //labelNombre.setFont(new Font()); //para cambiar fuente
        labelNombre.setForeground(new Color(0,0,0)); //para el color
        add(labelNombre);
        
        labelNickName = new JLabel("Ingrese un NickName");
        labelNickName.setBounds(35,135,300,400);
        add(labelNickName);
        
        textfieldNombre = new JTextField();
        textfieldNombre.setBounds(15, 0, 50, 70);
        add(textfieldNombre);
        
        boton1 = new JButton("Ingresar");
        boton1.setBounds(15, 100, 20, 30);
        boton1.addActionListener(this);
        add(boton1);
        
    }
    
    

    @Override
    public void actionPerformed(ActionEvent e){
        if(e.() == boton1){
            
        }
    }

}
