/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tictactoe;

import java.awt.Color;
import javax.swing.JFrame;
import javax.swing.JOptionPane;

/**
 *
 * @author el_mansy
 */
public class Tic_Tac_Toe extends javax.swing.JFrame {
    
    private String curLetter = "X";
    private int xScore = 0;
    private int oScore = 0;
    
    public Tic_Tac_Toe() {
        initComponents();
        setSize(1200,800);
        setLocationRelativeTo(null);
        
    }
    
    private void alternate(){
        if(curLetter == "X"){
            curLetter = "O";
        }
        else{
            curLetter ="X";
        }
    }    
    
    private void setScores(){
        jLplayerX.setText(String.valueOf(xScore));
        jLplayerO.setText(String.valueOf(oScore));
    }
    
    private void reset(){
        jButton1.setText("");
        jButton2.setText("");
        jButton3.setText("");
        jButton4.setText("");
        jButton5.setText("");
        jButton6.setText("");
        jButton7.setText("");
        jButton8.setText("");
        jButton9.setText("");
        
        curLetter = "X";
        
        jButton1.setBackground(Color.LIGHT_GRAY);
        jButton2.setBackground(Color.LIGHT_GRAY);
        jButton3.setBackground(Color.LIGHT_GRAY);
        jButton4.setBackground(Color.LIGHT_GRAY);
        jButton5.setBackground(Color.LIGHT_GRAY);
        jButton6.setBackground(Color.LIGHT_GRAY);
        jButton7.setBackground(Color.LIGHT_GRAY);
        jButton8.setBackground(Color.LIGHT_GRAY);
        jButton9.setBackground(Color.LIGHT_GRAY);
    }
    private void winner(){
        String b1 = jButton1.getText();
        String b2 = jButton2.getText();
        String b3 = jButton3.getText();
        String b4 = jButton4.getText();
        String b5 = jButton5.getText();
        String b6 = jButton6.getText();
        String b7 = jButton7.getText();
        String b8 = jButton8.getText();
        String b9 = jButton9.getText();
        
        if(b1 == b2 && b2 == b3 && b1 != ""){
            jButton1.setBackground(Color.CYAN);
            jButton2.setBackground(Color.CYAN);
            jButton3.setBackground(Color.CYAN);
            if(b1 == "X"){
                JOptionPane.showMessageDialog(this,"CONGRATULATIONS PLAYER X","TIC TAC TOE",JOptionPane.INFORMATION_MESSAGE);
                xScore++;
            }
            else{
                JOptionPane.showMessageDialog(this,"CONGRATULATIONS PLAYER O","TIC TAC TOE",JOptionPane.INFORMATION_MESSAGE);
                oScore++;
            }
            setScores();
            reset();
        }
        else if(b4 == b5 && b5 == b6 && b4 != ""){
            jButton4.setBackground(Color.CYAN);
            jButton5.setBackground(Color.CYAN);
            jButton6.setBackground(Color.CYAN);
            if(b4 == "X"){
                JOptionPane.showMessageDialog(this,"CONGRATULATIONS PLAYER X","TIC TAC TOE",JOptionPane.INFORMATION_MESSAGE);
                xScore++;
            }
            else{
                JOptionPane.showMessageDialog(this,"CONGRATULATIONS PLAYER O","TIC TAC TOE",JOptionPane.INFORMATION_MESSAGE);
                oScore++;
            }
            setScores();
            reset();
        }
        else if(b7 == b8 && b8 == b9 && b7 != ""){
            jButton7.setBackground(Color.CYAN);
            jButton8.setBackground(Color.CYAN);
            jButton9.setBackground(Color.CYAN);
            if(b7 == "X"){
                JOptionPane.showMessageDialog(this,"CONGRATULATIONS PLAYER X","TIC TAC TOE",JOptionPane.INFORMATION_MESSAGE);
                xScore++;
            }
            else{
                JOptionPane.showMessageDialog(this,"CONGRATULATIONS PLAYER O","TIC TAC TOE",JOptionPane.INFORMATION_MESSAGE);
                oScore++;
            }
            setScores();
            reset();
        }
        else if(b1 == b5 && b5 == b9 && b1 != ""){
            jButton1.setBackground(Color.CYAN);
            jButton5.setBackground(Color.CYAN);
            jButton9.setBackground(Color.CYAN);
            if(b1 == "X"){
                JOptionPane.showMessageDialog(this,"CONGRATULATIONS PLAYER X","TIC TAC TOE",JOptionPane.INFORMATION_MESSAGE);
                xScore++;
            }
            else{
                JOptionPane.showMessageDialog(this,"CONGRATULATIONS PLAYER O","TIC TAC TOE",JOptionPane.INFORMATION_MESSAGE);
                oScore++;
            }
            setScores();
            reset();
        }
        else if(b3 == b5 && b5 == b7 && b3 != ""){
            jButton3.setBackground(Color.CYAN);
            jButton5.setBackground(Color.CYAN);
            jButton7.setBackground(Color.CYAN);
            if(b3 == "X"){
                JOptionPane.showMessageDialog(this,"CONGRATULATIONS PLAYER X","TIC TAC TOE",JOptionPane.INFORMATION_MESSAGE);
                xScore++;
            }
            else{
                JOptionPane.showMessageDialog(this,"CONGRATULATIONS PLAYER O","TIC TAC TOE",JOptionPane.INFORMATION_MESSAGE);
                oScore++;
            }
            setScores();
            reset();
        }
        else if(b1 == b4 && b4 == b7 && b1 != ""){
            jButton1.setBackground(Color.CYAN);
            jButton4.setBackground(Color.CYAN);
            jButton7.setBackground(Color.CYAN);
            if(b1 == "X"){
                JOptionPane.showMessageDialog(this,"CONGRATULATIONS PLAYER X","TIC TAC TOE",JOptionPane.INFORMATION_MESSAGE);
                xScore++;
            }
            else{
                JOptionPane.showMessageDialog(this,"CONGRATULATIONS PLAYER O","TIC TAC TOE",JOptionPane.INFORMATION_MESSAGE);
                oScore++;
            }
            setScores();
            reset();
        }
        else if(b2 == b5 && b5 == b8 && b2 != ""){
            jButton2.setBackground(Color.CYAN);
            jButton5.setBackground(Color.CYAN);
            jButton8.setBackground(Color.CYAN);
            if(b2 == "X"){
                JOptionPane.showMessageDialog(this,"CONGRATULATIONS PLAYER X","TIC TAC TOE",JOptionPane.INFORMATION_MESSAGE);
                xScore++;
            }
            else{
                JOptionPane.showMessageDialog(this,"CONGRATULATIONS PLAYER O","TIC TAC TOE",JOptionPane.INFORMATION_MESSAGE);
                oScore++;
            }
            setScores();
            reset();
        }
        else if(b3 == b6 && b6 == b9 && b3 != ""){
            jButton3.setBackground(Color.CYAN);
            jButton6.setBackground(Color.CYAN);
            jButton9.setBackground(Color.CYAN);
            if(b3 == "X"){
                JOptionPane.showMessageDialog(this,"CONGRATULATIONS PLAYER X","TIC TAC TOE",JOptionPane.INFORMATION_MESSAGE);
                xScore++;
            }
            else{
                JOptionPane.showMessageDialog(this,"CONGRATULATIONS PLAYER O","TIC TAC TOE",JOptionPane.INFORMATION_MESSAGE);
                oScore++;
            }
            setScores();
            reset();
        }
        else if(b1 != "" && b2 != "" && b3 != "" && b4 != "" && b5 != "" && b6 != "" && b7 != "" && b8 != "" && b9 != ""){
            JOptionPane.showMessageDialog(this,"IT IS A TIE ","TIC TAC TOE",JOptionPane.INFORMATION_MESSAGE);
            reset();
        }
    }
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jPanel2 = new javax.swing.JPanel();
        jPanel3 = new javax.swing.JPanel();
        jButton1 = new javax.swing.JButton();
        jPanel4 = new javax.swing.JPanel();
        jButton2 = new javax.swing.JButton();
        jPanel5 = new javax.swing.JPanel();
        jButton3 = new javax.swing.JButton();
        jPanel6 = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        jPanel7 = new javax.swing.JPanel();
        jLplayerX = new javax.swing.JLabel();
        jPanel9 = new javax.swing.JPanel();
        jButton4 = new javax.swing.JButton();
        jPanel10 = new javax.swing.JPanel();
        jButton5 = new javax.swing.JButton();
        jPanel11 = new javax.swing.JPanel();
        jButton6 = new javax.swing.JButton();
        jPanel12 = new javax.swing.JPanel();
        jLabel3 = new javax.swing.JLabel();
        jPanel8 = new javax.swing.JPanel();
        jLplayerO = new javax.swing.JLabel();
        jPanel15 = new javax.swing.JPanel();
        jButton7 = new javax.swing.JButton();
        jPanel16 = new javax.swing.JPanel();
        jButton8 = new javax.swing.JButton();
        jPanel17 = new javax.swing.JPanel();
        jButton9 = new javax.swing.JButton();
        jPanel13 = new javax.swing.JPanel();
        jBtnReset = new javax.swing.JButton();
        jPanel14 = new javax.swing.JPanel();
        jBtnExit = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("TIC TAC TOE");

        jPanel1.setBackground(new java.awt.Color(51, 0, 153));
        jPanel1.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0), 3));
        jPanel1.setLayout(new java.awt.BorderLayout());

        jLabel1.setFont(new java.awt.Font("Tahoma", 0, 80)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(102, 255, 255));
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("TIC TAC TOE");
        jLabel1.setToolTipText("TIC TAC TOE");
        jPanel1.add(jLabel1, java.awt.BorderLayout.PAGE_START);

        jPanel2.setBackground(new java.awt.Color(51, 0, 153));
        jPanel2.setLayout(new java.awt.GridLayout(3, 5, 2, 2));

        jPanel3.setLayout(new java.awt.BorderLayout());

        jButton1.setFont(new java.awt.Font("Tahoma", 0, 100)); // NOI18N
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        jPanel3.add(jButton1, java.awt.BorderLayout.CENTER);

        jPanel2.add(jPanel3);

        jPanel4.setLayout(new java.awt.BorderLayout());

        jButton2.setFont(new java.awt.Font("Tahoma", 0, 100)); // NOI18N
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });
        jPanel4.add(jButton2, java.awt.BorderLayout.CENTER);

        jPanel2.add(jPanel4);

        jPanel5.setLayout(new java.awt.BorderLayout());

        jButton3.setFont(new java.awt.Font("Tahoma", 0, 100)); // NOI18N
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3ActionPerformed(evt);
            }
        });
        jPanel5.add(jButton3, java.awt.BorderLayout.CENTER);

        jPanel2.add(jPanel5);

        jPanel6.setLayout(new java.awt.BorderLayout());

        jLabel2.setFont(new java.awt.Font("Tahoma", 0, 65)); // NOI18N
        jLabel2.setText("playerX");
        jPanel6.add(jLabel2, java.awt.BorderLayout.CENTER);

        jPanel2.add(jPanel6);

        jPanel7.setLayout(new java.awt.BorderLayout());

        jLplayerX.setFont(new java.awt.Font("Tahoma", 0, 60)); // NOI18N
        jLplayerX.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLplayerX.setText("0");
        jLplayerX.setAlignmentX(0.5F);
        jLplayerX.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        jPanel7.add(jLplayerX, java.awt.BorderLayout.CENTER);

        jPanel2.add(jPanel7);

        jPanel9.setLayout(new java.awt.BorderLayout());

        jButton4.setFont(new java.awt.Font("Tahoma", 0, 100)); // NOI18N
        jButton4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton4ActionPerformed(evt);
            }
        });
        jPanel9.add(jButton4, java.awt.BorderLayout.CENTER);

        jPanel2.add(jPanel9);

        jPanel10.setLayout(new java.awt.BorderLayout());

        jButton5.setFont(new java.awt.Font("Tahoma", 0, 100)); // NOI18N
        jButton5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton5ActionPerformed(evt);
            }
        });
        jPanel10.add(jButton5, java.awt.BorderLayout.CENTER);

        jPanel2.add(jPanel10);

        jPanel11.setLayout(new java.awt.BorderLayout());

        jButton6.setFont(new java.awt.Font("Tahoma", 0, 100)); // NOI18N
        jButton6.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton6ActionPerformed(evt);
            }
        });
        jPanel11.add(jButton6, java.awt.BorderLayout.CENTER);

        jPanel2.add(jPanel11);

        jPanel12.setLayout(new java.awt.BorderLayout());

        jLabel3.setFont(new java.awt.Font("Tahoma", 0, 65)); // NOI18N
        jLabel3.setText("playerO");
        jPanel12.add(jLabel3, java.awt.BorderLayout.LINE_START);

        jPanel2.add(jPanel12);

        jPanel8.setLayout(new java.awt.BorderLayout());

        jLplayerO.setFont(new java.awt.Font("Tahoma", 0, 60)); // NOI18N
        jLplayerO.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLplayerO.setText("0");
        jPanel8.add(jLplayerO, java.awt.BorderLayout.CENTER);

        jPanel2.add(jPanel8);

        jPanel15.setLayout(new java.awt.BorderLayout());

        jButton7.setFont(new java.awt.Font("Tahoma", 0, 100)); // NOI18N
        jButton7.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton7ActionPerformed(evt);
            }
        });
        jPanel15.add(jButton7, java.awt.BorderLayout.CENTER);

        jPanel2.add(jPanel15);

        jPanel16.setLayout(new java.awt.BorderLayout());

        jButton8.setFont(new java.awt.Font("Tahoma", 0, 100)); // NOI18N
        jButton8.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton8ActionPerformed(evt);
            }
        });
        jPanel16.add(jButton8, java.awt.BorderLayout.CENTER);

        jPanel2.add(jPanel16);

        jPanel17.setLayout(new java.awt.BorderLayout());

        jButton9.setFont(new java.awt.Font("Tahoma", 0, 100)); // NOI18N
        jButton9.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton9ActionPerformed(evt);
            }
        });
        jPanel17.add(jButton9, java.awt.BorderLayout.CENTER);

        jPanel2.add(jPanel17);

        jPanel13.setLayout(new java.awt.BorderLayout());

        jBtnReset.setFont(new java.awt.Font("Tahoma", 0, 80)); // NOI18N
        jBtnReset.setText("reset");
        jBtnReset.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBtnResetActionPerformed(evt);
            }
        });
        jPanel13.add(jBtnReset, java.awt.BorderLayout.CENTER);

        jPanel2.add(jPanel13);

        jPanel14.setLayout(new java.awt.BorderLayout());

        jBtnExit.setFont(new java.awt.Font("Tahoma", 0, 80)); // NOI18N
        jBtnExit.setText("exit");
        jBtnExit.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBtnExitActionPerformed(evt);
            }
        });
        jPanel14.add(jBtnExit, java.awt.BorderLayout.CENTER);

        jPanel2.add(jPanel14);

        jPanel1.add(jPanel2, java.awt.BorderLayout.CENTER);

        getContentPane().add(jPanel1, java.awt.BorderLayout.CENTER);

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents
private JFrame frame;
    private void jBtnExitActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBtnExitActionPerformed
        frame = new JFrame("EXIT");
        if(JOptionPane.showConfirmDialog(frame, "Are you sure, you want to exit",
                "TIC TAC TOE",JOptionPane.YES_NO_OPTION) == JOptionPane.YES_NO_OPTION){
            System.exit(0);
        }
    }//GEN-LAST:event_jBtnExitActionPerformed

    private void jBtnResetActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBtnResetActionPerformed
        reset();
        xScore = 0;
        oScore = 0;
        setScores();
    }//GEN-LAST:event_jBtnResetActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        String curValue = jButton1.getText();
        if(curValue == "X" || curValue == "O"){
            return;
        }
        jButton1.setText(curLetter);
        if(curLetter == "X"){
            jButton1.setForeground(Color.GREEN);
        }
        else{
            jButton1.setForeground(Color.BLUE);
        }
        alternate();
        winner();
    }//GEN-LAST:event_jButton1ActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        String curValue = jButton2.getText();
        if(curValue == "X" || curValue == "O"){
            return;
        }
        jButton2.setText(curLetter);
        if(curLetter == "X"){
            jButton2.setForeground(Color.GREEN);
        }
        else{
            jButton2.setForeground(Color.BLUE);
        }
        alternate();
        winner();
    }//GEN-LAST:event_jButton2ActionPerformed

    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3ActionPerformed
        String curValue = jButton3.getText();
        if(curValue == "X" || curValue == "O"){
            return;
        }
        jButton3.setText(curLetter);
        if(curLetter == "X"){
            jButton3.setForeground(Color.GREEN);
        }
        else{
            jButton3.setForeground(Color.BLUE);
        }
        alternate();
        winner();
    }//GEN-LAST:event_jButton3ActionPerformed

    private void jButton4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton4ActionPerformed
        String curValue = jButton4.getText();
        if(curValue == "X" || curValue == "O"){
            return;
        }
        jButton4.setText(curLetter);
        if(curLetter == "X"){
            jButton4.setForeground(Color.GREEN);
        }
        else{
            jButton4.setForeground(Color.BLUE);
        }
        alternate();
        winner();
    }//GEN-LAST:event_jButton4ActionPerformed

    private void jButton5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton5ActionPerformed
        String curValue = jButton5.getText();
        if(curValue == "X" || curValue == "O"){
            return;
        }
        jButton5.setText(curLetter);
        if(curLetter == "X"){
            jButton5.setForeground(Color.GREEN);
        }
        else{
            jButton5.setForeground(Color.BLUE);
        }
        alternate();
        winner();
    }//GEN-LAST:event_jButton5ActionPerformed

    private void jButton6ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton6ActionPerformed
        String curValue = jButton6.getText();
        if(curValue == "X" || curValue == "O"){
            return;
        }
        jButton6.setText(curLetter);
        if(curLetter == "X"){
            jButton6.setForeground(Color.GREEN);
        }
        else{
            jButton6.setForeground(Color.BLUE);
        }
        alternate();
        winner();
    }//GEN-LAST:event_jButton6ActionPerformed

    private void jButton7ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton7ActionPerformed
        String curValue = jButton7.getText();
        if(curValue == "X" || curValue == "O"){
            return;
        }
        jButton7.setText(curLetter);
        if(curLetter == "X"){
            jButton7.setForeground(Color.GREEN);
        }
        else{
            jButton7.setForeground(Color.BLUE);
        }
        alternate();
        winner();
    }//GEN-LAST:event_jButton7ActionPerformed

    private void jButton8ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton8ActionPerformed
        String curValue = jButton8.getText();
        if(curValue == "X" || curValue == "O"){
            return;
        }
        jButton8.setText(curLetter);
        if(curLetter == "X"){
            jButton8.setForeground(Color.GREEN);
        }
        else{
            jButton8.setForeground(Color.BLUE);
        }
        alternate();
        winner();
    }//GEN-LAST:event_jButton8ActionPerformed

    private void jButton9ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton9ActionPerformed
        String curValue = jButton9.getText();
        if(curValue == "X" || curValue == "O"){
            return;
        }
        jButton9.setText(curLetter);
        if(curLetter == "X"){
            jButton9.setForeground(Color.GREEN);
        }
        else{
            jButton9.setForeground(Color.BLUE);
        }
        alternate();
        winner();
    }//GEN-LAST:event_jButton9ActionPerformed

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
            java.util.logging.Logger.getLogger(Tic_Tac_Toe.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Tic_Tac_Toe.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Tic_Tac_Toe.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Tic_Tac_Toe.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Tic_Tac_Toe().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jBtnExit;
    private javax.swing.JButton jBtnReset;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton3;
    private javax.swing.JButton jButton4;
    private javax.swing.JButton jButton5;
    private javax.swing.JButton jButton6;
    private javax.swing.JButton jButton7;
    private javax.swing.JButton jButton8;
    private javax.swing.JButton jButton9;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLplayerO;
    private javax.swing.JLabel jLplayerX;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel10;
    private javax.swing.JPanel jPanel11;
    private javax.swing.JPanel jPanel12;
    private javax.swing.JPanel jPanel13;
    private javax.swing.JPanel jPanel14;
    private javax.swing.JPanel jPanel15;
    private javax.swing.JPanel jPanel16;
    private javax.swing.JPanel jPanel17;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JPanel jPanel5;
    private javax.swing.JPanel jPanel6;
    private javax.swing.JPanel jPanel7;
    private javax.swing.JPanel jPanel8;
    private javax.swing.JPanel jPanel9;
    // End of variables declaration//GEN-END:variables
}
