
package ventana;

import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JTextField;
import persona.Jugador;



public class Inicio extends javax.swing.JFrame {
    Inicio inicio;
    Principal principa;
    Jugador jugador;


    
    


    public Inicio() {
        initComponents();

        
        
    }
    
    
    public void guardarDatos(){
        this.nombreTextF.setText(jugador.getNombre());
        this.nickNameTextF.setText(jugador.getNickName());
        
    }
    
    

    public JLabel getImagenLabel() {
        return imagenLabel;
    }

    public void setImagenLabel(JLabel imagenLabel) {
        this.imagenLabel = imagenLabel;
    }

    public JButton getIngresoButton() {
        return ingresoButton;
    }

    public void setIngresoButton(JButton ingresoButton) {
        this.ingresoButton = ingresoButton;
    }

    public JLabel getNickNameLabel() {
        return nickNameLabel;
    }

    public void setNickNameLabel(JLabel nickNameLabel) {
        this.nickNameLabel = nickNameLabel;
    }

    public JTextField getNickNameTextF() {
        return nickNameTextF;
    }

    public void setNickNameTextF(JTextField nickNameTextF) {
        this.nickNameTextF = nickNameTextF;
    }

    public JLabel getNombreLabel() {
        return nombreLabel;
    }

    public void setNombreLabel(JLabel nombreLabel) {
        this.nombreLabel = nombreLabel;
    }

    public JTextField getNombreTextF() {
        return nombreTextF;
    }

    public void setNombreTextF(JTextField nombreTextF) {
        this.nombreTextF = nombreTextF;
    }


    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        imagenLabel = new javax.swing.JLabel();
        nombreLabel = new javax.swing.JLabel();
        nombreTextF = new javax.swing.JTextField();
        nickNameLabel = new javax.swing.JLabel();
        nickNameTextF = new javax.swing.JTextField();
        ingresoButton = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setBackground(new java.awt.Color(0, 102, 102));
        setLocation(new java.awt.Point(0, 0));
        setName("ventanaIncioFrame"); // NOI18N
        setResizable(false);

        imagenLabel.setIcon(new javax.swing.ImageIcon("/home/randysmc/NetBeansProjects/GranjaMyFarm1/GranjaMyFarm/Imagenes/Fondo.jpg")); // NOI18N
        imagenLabel.setText("jLabel1");

        nombreLabel.setFont(new java.awt.Font("Dialog", 1, 12)); // NOI18N
        nombreLabel.setText("Ingrese Nombre");
        nombreLabel.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));

        nombreTextF.setBackground(new java.awt.Color(204, 204, 204));
        nombreTextF.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                nombreTextFActionPerformed(evt);
            }
        });

        nickNameLabel.setFont(new java.awt.Font("Dialog", 1, 12)); // NOI18N
        nickNameLabel.setText("Ingrese nickName");
        nickNameLabel.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));

        nickNameTextF.setBackground(new java.awt.Color(204, 204, 204));
        nickNameTextF.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                nickNameTextFActionPerformed(evt);
            }
        });

        ingresoButton.setBackground(new java.awt.Color(204, 255, 204));
        ingresoButton.setFont(new java.awt.Font("Dialog", 0, 12)); // NOI18N
        ingresoButton.setText("Ir a la Granja");
        ingresoButton.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        ingresoButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ingresoButtonActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(imagenLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(ingresoButton, javax.swing.GroupLayout.PREFERRED_SIZE, 103, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                        .addGap(26, 26, 26)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(nombreLabel, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 131, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(nickNameLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 131, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(54, 54, 54)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(nickNameTextF, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(nombreTextF, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addContainerGap(94, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(imagenLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 89, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(41, 41, 41)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(nombreTextF)
                    .addComponent(nombreLabel, javax.swing.GroupLayout.DEFAULT_SIZE, 30, Short.MAX_VALUE))
                .addGap(51, 51, 51)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(nickNameLabel, javax.swing.GroupLayout.DEFAULT_SIZE, 30, Short.MAX_VALUE)
                    .addComponent(nickNameTextF))
                .addGap(37, 37, 37)
                .addComponent(ingresoButton, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(39, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void nombreTextFActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_nombreTextFActionPerformed
        
    }//GEN-LAST:event_nombreTextFActionPerformed

    private void nickNameTextFActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_nickNameTextFActionPerformed
        
    }//GEN-LAST:event_nickNameTextFActionPerformed

    private void ingresoButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ingresoButtonActionPerformed
        String nombre = nombreTextF.getText();

        String nickName = nickNameTextF.getText();
        
        
        
        
        jugador = new Jugador(nombre, nickName,100,20);
        Principal principal = null;
        try {
            principal = new Principal(jugador);
        } catch (InterruptedException ex) {
            Logger.getLogger(Inicio.class.getName()).log(Level.SEVERE, null, ex);
        }
        this.setVisible(false);
        principal.setVisible(true);
        principal.setLocationRelativeTo(null);
        
        
        
        
 
        
        
    }//GEN-LAST:event_ingresoButtonActionPerformed



    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel imagenLabel;
    private javax.swing.JButton ingresoButton;
    private javax.swing.JLabel nickNameLabel;
    private javax.swing.JTextField nickNameTextF;
    private javax.swing.JLabel nombreLabel;
    private javax.swing.JTextField nombreTextF;
    // End of variables declaration//GEN-END:variables

    JLabel getNombreTextF(String nombre) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
}
