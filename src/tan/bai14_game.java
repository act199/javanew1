/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package tan;

import javax.swing.JOptionPane;

/**
 *
 * @author SPC
 */
public class bai14_game extends javax.swing.JFrame {

    /**
     * Creates new form bai14_game
     */
    
    int turn =2;
    int buttonused[]={0,0,0,0,0,0,0,0,0};
    int pXwon[]= {0,0,0,0,0,0,0,0,0};
    int p0won[]= {0,0,0,0,0,0,0,0,0};
    
    int pXwon()
    {
        if(pXwon[0]==1 && pXwon[1]==1 && pXwon[2]==1)
        {
            return 1;
        }
        if(pXwon[3]==1 && pXwon[4]==1 && pXwon[5]==1)
        {
            return 1;
        }
        if(pXwon[6]==1 && pXwon[7]==1 && pXwon[8]==1)
        {
            return 1;
        }
        if(pXwon[0]==1 && pXwon[3]==1 && pXwon[6]==1)
        {
            return 1;
        }
        if(pXwon[1]==1 && pXwon[4]==1 && pXwon[7]==1)
        {
            return 1;
        }
        if(pXwon[2]==1 && pXwon[5]==1 && pXwon[8]==1)
        {
            return 1;
        }
        if(pXwon[2]==1 && pXwon[4]==1 && pXwon[6]==1)
        {
            return 1;
        }
        if(pXwon[0]==1 && pXwon[4]==1 && pXwon[8]==1)
        {
            return 1;
        }
        return 0;
       
    }
    
    int p0won()
    {
        if(p0won[0]==1 && p0won[1]==1 && p0won[2]==1)
        {
            return 1;
        }
        if(p0won[3]==1 && p0won[4]==1 && p0won[5]==1)
        {
            return 1;
        }
        if(p0won[6]==1 && p0won[7]==1 && p0won[8]==1)
        {
            return 1;
        }
        if(p0won[0]==1 && p0won[3]==1 && p0won[6]==1)
        {
            return 1;
        }
        if(p0won[1]==1 && p0won[4]==1 && p0won[7]==1)
        {
            return 1;
        }
        if(p0won[2]==1 && p0won[5]==1 && p0won[8]==1)
        {
            return 1;
        }
        if(p0won[2]==1 && p0won[4]==1 && p0won[6]==1)
        {
            return 1;
        }
        if(p0won[0]==1 && p0won[4]==1 && p0won[8]==1)
        {
            return 1;
        }
        return 0;
       
    }

    
    public bai14_game() {
        initComponents();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        b0 = new javax.swing.JButton();
        b3 = new javax.swing.JButton();
        b6 = new javax.swing.JButton();
        b1 = new javax.swing.JButton();
        b4 = new javax.swing.JButton();
        b7 = new javax.swing.JButton();
        b2 = new javax.swing.JButton();
        b5 = new javax.swing.JButton();
        b8 = new javax.swing.JButton();
        jButton1 = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        b0.setFont(new java.awt.Font("Segoe UI Historic", 1, 24)); // NOI18N
        b0.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                b0ActionPerformed(evt);
            }
        });

        b3.setFont(new java.awt.Font("Segoe UI Historic", 1, 24)); // NOI18N
        b3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                b3ActionPerformed(evt);
            }
        });

        b6.setFont(new java.awt.Font("Segoe UI Historic", 1, 24)); // NOI18N
        b6.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                b6ActionPerformed(evt);
            }
        });

        b1.setFont(new java.awt.Font("Segoe UI Historic", 1, 24)); // NOI18N
        b1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                b1ActionPerformed(evt);
            }
        });

        b4.setFont(new java.awt.Font("Segoe UI Historic", 1, 24)); // NOI18N
        b4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                b4ActionPerformed(evt);
            }
        });

        b7.setFont(new java.awt.Font("Segoe UI Historic", 1, 24)); // NOI18N
        b7.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                b7ActionPerformed(evt);
            }
        });

        b2.setFont(new java.awt.Font("Segoe UI Historic", 1, 24)); // NOI18N
        b2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                b2ActionPerformed(evt);
            }
        });

        b5.setFont(new java.awt.Font("Segoe UI Historic", 1, 24)); // NOI18N
        b5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                b5ActionPerformed(evt);
            }
        });

        b8.setFont(new java.awt.Font("Segoe UI Historic", 1, 24)); // NOI18N
        b8.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                b8ActionPerformed(evt);
            }
        });

        jButton1.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        jButton1.setForeground(new java.awt.Color(255, 0, 0));
        jButton1.setText("PLAY AGAIN");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        jLabel1.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 51, 51));
        jLabel1.setText("PLAY !!!");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(58, 58, 58)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(b0, javax.swing.GroupLayout.PREFERRED_SIZE, 83, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(b3, javax.swing.GroupLayout.PREFERRED_SIZE, 83, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(b6, javax.swing.GroupLayout.PREFERRED_SIZE, 83, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel1)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(b1, javax.swing.GroupLayout.PREFERRED_SIZE, 83, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(b4, javax.swing.GroupLayout.PREFERRED_SIZE, 83, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(b7, javax.swing.GroupLayout.PREFERRED_SIZE, 83, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(b2, javax.swing.GroupLayout.PREFERRED_SIZE, 83, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(b5, javax.swing.GroupLayout.PREFERRED_SIZE, 83, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(b8, javax.swing.GroupLayout.PREFERRED_SIZE, 83, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addContainerGap(57, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 186, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(99, 99, 99))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap(19, Short.MAX_VALUE)
                .addComponent(jLabel1)
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(b2, javax.swing.GroupLayout.PREFERRED_SIZE, 67, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(b5, javax.swing.GroupLayout.PREFERRED_SIZE, 67, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(b8, javax.swing.GroupLayout.PREFERRED_SIZE, 67, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(layout.createSequentialGroup()
                            .addComponent(b1, javax.swing.GroupLayout.PREFERRED_SIZE, 67, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGap(18, 18, 18)
                            .addComponent(b4, javax.swing.GroupLayout.PREFERRED_SIZE, 67, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGap(18, 18, 18)
                            .addComponent(b7, javax.swing.GroupLayout.PREFERRED_SIZE, 67, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGroup(layout.createSequentialGroup()
                            .addComponent(b0, javax.swing.GroupLayout.PREFERRED_SIZE, 67, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGap(18, 18, 18)
                            .addComponent(b3, javax.swing.GroupLayout.PREFERRED_SIZE, 67, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGap(18, 18, 18)
                            .addComponent(b6, javax.swing.GroupLayout.PREFERRED_SIZE, 67, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addGap(18, 18, 18)
                .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(21, 21, 21))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void b0ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_b0ActionPerformed
        if(buttonused[0]==0)
        if(turn%2==0)
      {
        turn++;
        b0.setText("x");
        buttonused[0]=1;
        pXwon[0]=1;
        
        int result1=pXwon();
        int result2=p0won();
         
        if(result1==1)
        {
            JOptionPane.showMessageDialog(rootPane,"player x won !!!!");
        }
        else if(result2==1)
        {
           JOptionPane.showMessageDialog(rootPane,"player 0 won !!!!"); 
        }
      }
        else
        {
        turn++;
        b0.setText("0");
        buttonused[0]=1;
        p0won[0]=1;
        int result1=pXwon();
        int result2=p0won();
         
        if(result1==1)
        {
            JOptionPane.showMessageDialog(rootPane,"player x won !!!!");
        }
        else if(result2==1)
        {
           JOptionPane.showMessageDialog(rootPane,"player 0 won !!!!"); 
        }
        }
        else{
        JOptionPane.showMessageDialog(rootPane, "THIS BUTTON IS ALRREADY USED !!");
        }
    }//GEN-LAST:event_b0ActionPerformed

    private void b1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_b1ActionPerformed
        if(buttonused[1]==0)
        if(turn%2==0)
      {
        turn++;
        b1.setText("x");
        buttonused[1]=1;
        pXwon[1]=1;
        
        int result1=pXwon();
        int result2=p0won();
         
        if(result1==1)
        {
            JOptionPane.showMessageDialog(rootPane,"player x won !!!!");
        }
        else if(result2==1)
        {
           JOptionPane.showMessageDialog(rootPane,"player 0 won !!!!"); 
        }
      }
        else
        {
        turn++;
        b1.setText("0");
        buttonused[1]=1;
        p0won[1]=1;
        int result1=pXwon();
        int result2=p0won();
         
        if(result1==1)
        {
            JOptionPane.showMessageDialog(rootPane,"player x won !!!!");
        }
        else if(result2==1)
        {
           JOptionPane.showMessageDialog(rootPane,"player 0 won !!!!"); 
        }
        }
        else{
        JOptionPane.showMessageDialog(rootPane, "THIS BUTTON IS ALRREADY USED !!");
        }
    }//GEN-LAST:event_b1ActionPerformed

    private void b2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_b2ActionPerformed
       if(buttonused[2]==0)
        if(turn%2==0)
      {
        turn++;
        b2.setText("x");
        buttonused[2]=1;
        pXwon[2]=1;
        
        int result1=pXwon();
        int result2=p0won();
         
        if(result1==1)
        {
            JOptionPane.showMessageDialog(rootPane,"player x won !!!!");
        }
        else if(result2==1)
        {
           JOptionPane.showMessageDialog(rootPane,"player 0 won !!!!"); 
        }
      }
        else
        {
        turn++;
        b2.setText("0");
        buttonused[2]=1;
        p0won[2]=1;
        int result1=pXwon();
        int result2=p0won();
         
        if(result1==1)
        {
            JOptionPane.showMessageDialog(rootPane,"player x won !!!!");
        }
        else if(result2==1)
        {
           JOptionPane.showMessageDialog(rootPane,"player 0 won !!!!"); 
        }
        }
        else{
        JOptionPane.showMessageDialog(rootPane, "THIS BUTTON IS ALRREADY USED !!");
        }
    }//GEN-LAST:event_b2ActionPerformed

    private void b3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_b3ActionPerformed
        if(buttonused[3]==0)
        if(turn%2==0)
      {
        turn++;
        b3.setText("x");
        buttonused[3]=1;
        pXwon[3]=1;
        
        int result1=pXwon();
        int result2=p0won();
         
        if(result1==1)
        {
            JOptionPane.showMessageDialog(rootPane,"player x won !!!!");
        }
        else if(result2==1)
        {
           JOptionPane.showMessageDialog(rootPane,"player 0 won !!!!"); 
        }
      }
        else
        {
        turn++;
        b3.setText("0");
        buttonused[3]=1;
        pXwon[3]=1;
        int result1=pXwon();
        int result2=p0won();
         
        if(result1==1)
        {
            JOptionPane.showMessageDialog(rootPane,"player x won !!!!");
        }
        else if(result2==1)
        {
           JOptionPane.showMessageDialog(rootPane,"player 0 won !!!!"); 
        }
        }
        else{
        JOptionPane.showMessageDialog(rootPane, "THIS BUTTON IS ALRREADY USED !!");
        }
    }//GEN-LAST:event_b3ActionPerformed

    private void b4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_b4ActionPerformed
      if(buttonused[4]==0)
        if(turn%2==0)
      {
        turn++;
        b4.setText("x");
        buttonused[4]=1;
        pXwon[4]=1;
        
        int result1=pXwon();
        int result2=p0won();
         
        if(result1==1)
        {
            JOptionPane.showMessageDialog(rootPane,"player x won !!!!");
        }
        else if(result2==1)
        {
           JOptionPane.showMessageDialog(rootPane,"player 0 won !!!!"); 
        }
      }
        else
        {
        turn++;
        b4.setText("0");
        buttonused[4]=1;
        p0won[4]=1;
        int result1=pXwon();
        int result2=p0won();
         
        if(result1==1)
        {
            JOptionPane.showMessageDialog(rootPane,"player x won !!!!");
        }
        else if(result2==1)
        {
           JOptionPane.showMessageDialog(rootPane,"player 0 won !!!!"); 
        }
        }
        else{
        JOptionPane.showMessageDialog(rootPane, "THIS BUTTON IS ALRREADY USED !!");
        }
    }//GEN-LAST:event_b4ActionPerformed

    private void b5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_b5ActionPerformed
        if(buttonused[5]==0)
        if(turn%2==0)
      {
        turn++;
        b5.setText("x");
        buttonused[5]=1;
        pXwon[5]=1;
        
        int result1=pXwon();
        int result2=p0won();
         
        if(result1==1)
        {
            JOptionPane.showMessageDialog(rootPane,"player x won !!!!");
        }
        else if(result2==1)
        {
           JOptionPane.showMessageDialog(rootPane,"player 0 won !!!!"); 
        }
      }
        else
        {
        turn++;
        b5.setText("0");
        buttonused[5]=1;
        p0won[5]=1;
        int result1=pXwon();
        int result2=p0won();
         
        if(result1==1)
        {
            JOptionPane.showMessageDialog(rootPane,"player x won !!!!");
        }
        else if(result2==1)
        {
           JOptionPane.showMessageDialog(rootPane,"player 0 won !!!!"); 
        }
        }
        else{
        JOptionPane.showMessageDialog(rootPane, "THIS BUTTON IS ALRREADY USED !!");
        }
    }//GEN-LAST:event_b5ActionPerformed

    private void b6ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_b6ActionPerformed
       if(buttonused[6]==0)
        if(turn%2==0)
      {
        turn++;
        b6.setText("x");
        buttonused[6]=1;
        pXwon[6]=1;
        
        int result1=pXwon();
        int result2=p0won();
         
        if(result1==1)
        {
            JOptionPane.showMessageDialog(rootPane,"player x won !!!!");
        }
        else if(result2==1)
        {
           JOptionPane.showMessageDialog(rootPane,"player 0 won !!!!"); 
        }
      }
        else
        {
        turn++;
        b6.setText("0");
        buttonused[6]=1;
        p0won[6]=1;
        int result1=pXwon();
        int result2=p0won();
         
        if(result1==1)
        {
            JOptionPane.showMessageDialog(rootPane,"player x won !!!!");
        }
        else if(result2==1)
        {
           JOptionPane.showMessageDialog(rootPane,"player 0 won !!!!"); 
        }
        }
        else{
        JOptionPane.showMessageDialog(rootPane, "THIS BUTTON IS ALRREADY USED !!");
        }
    }//GEN-LAST:event_b6ActionPerformed

    private void b7ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_b7ActionPerformed
       if(buttonused[7]==0)
        if(turn%2==0)
      {
        turn++;
        b7.setText("x");
        buttonused[7]=1;
        pXwon[7]=1;
        
        int result1=pXwon();
        int result2=p0won();
         
        if(result1==1)
        {
            JOptionPane.showMessageDialog(rootPane,"player x won !!!!");
        }
        else if(result2==1)
        {
           JOptionPane.showMessageDialog(rootPane,"player 0 won !!!!"); 
        }
      }
        else
        {
        turn++;
        b7.setText("0");
        buttonused[7]=1;
        p0won[7]=1;
        int result1=pXwon();
        int result2=p0won();
         
        if(result1==1)
        {
            JOptionPane.showMessageDialog(rootPane,"player x won !!!!");
        }
        else if(result2==1)
        {
           JOptionPane.showMessageDialog(rootPane,"player 0 won !!!!"); 
        }
        }
        else{
        JOptionPane.showMessageDialog(rootPane, "THIS BUTTON IS ALRREADY USED !!");
        }
    }//GEN-LAST:event_b7ActionPerformed

    private void b8ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_b8ActionPerformed
        if(buttonused[8]==0)
        if(turn%2==0)
      {
        turn++;
        b8.setText("x");
        buttonused[8]=1;
        pXwon[8]=1;
        
        int result1=pXwon();
        int result2=p0won();
         
        if(result1==1)
        {
            JOptionPane.showMessageDialog(rootPane,"player x won !!!!");
        }
        else if(result2==1)
        {
           JOptionPane.showMessageDialog(rootPane,"player 0 won !!!!"); 
        }
      }
        else
        {
        turn++;
        b8.setText("0");
        buttonused[8]=1;
        p0won[8]=1;
        int result1=pXwon();
        int result2=p0won();
         
        if(result1==1)
        {
            JOptionPane.showMessageDialog(rootPane,"player x won !!!!");
        }
        else if(result2==1)
        {
           JOptionPane.showMessageDialog(rootPane,"player 0 won !!!!"); 
        }
        }
        else{
        JOptionPane.showMessageDialog(rootPane, "THIS BUTTON IS ALRREADY USED !!");
        }
    }//GEN-LAST:event_b8ActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        b0.setText("");
        b1.setText("");
        b2.setText("");
        b3.setText("");
        b4.setText("");
        b5.setText("");
        b6.setText("");
        b7.setText("");
        b8.setText("");
        
        turn=2;
        for(int i=0;i<9;i++)
        {
            buttonused[i]=0;
        }
        for(int i=0;i<9;i++)
        {
            pXwon[i]=0;
        }
        for(int i=0;i<9;i++)
        {
            p0won[i]=0;
        }
    }//GEN-LAST:event_jButton1ActionPerformed

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(bai14_game.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(bai14_game.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(bai14_game.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(bai14_game.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new bai14_game().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton b0;
    private javax.swing.JButton b1;
    private javax.swing.JButton b2;
    private javax.swing.JButton b3;
    private javax.swing.JButton b4;
    private javax.swing.JButton b5;
    private javax.swing.JButton b6;
    private javax.swing.JButton b7;
    private javax.swing.JButton b8;
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel jLabel1;
    // End of variables declaration//GEN-END:variables
}