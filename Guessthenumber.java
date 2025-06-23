
package com.codsoft.guessthenumber;

import java.util.Random;
import javax.swing.JOptionPane;

/**
 *
 * @author: Rohit Murmu
 */



public class Guessthenumber extends javax.swing.JFrame {

    public Guessthenumber() {
        initComponents();
    }
    
    
    Random ran = new Random();
    int r1 = ran.nextInt(50);
    
    int count = 1;
    int rounds = 0;
    int score = 0;

    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jComboBox1 = new javax.swing.JComboBox<>();
        guessIcon = new javax.swing.JLabel();
        guessMe = new javax.swing.JLabel();
        mainLabel = new javax.swing.JLabel();
        userInput = new javax.swing.JTextField();
        jButton1 = new javax.swing.JButton();
        outcome = new javax.swing.JLabel();
        lRounds = new javax.swing.JLabel();
        lScore = new javax.swing.JLabel();

        jComboBox1.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("Guess The Number");
        setResizable(false);

        guessIcon.setFont(new java.awt.Font("Jokerman", 0, 46)); // NOI18N
        guessIcon.setHorizontalAlignment(javax.swing.SwingConstants.TRAILING);
        guessIcon.setText("?");

        guessMe.setFont(new java.awt.Font("Footlight MT Light", 1, 24)); // NOI18N
        guessMe.setText("Guess The Number");

        mainLabel.setFont(new java.awt.Font("Georgia", 0, 14)); // NOI18N
        mainLabel.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        mainLabel.setLabelFor(mainLabel);
        mainLabel.setText("Enter a number between 0 to 50");
        mainLabel.setToolTipText("");
        mainLabel.setVerticalTextPosition(javax.swing.SwingConstants.TOP);

        userInput.setFont(new java.awt.Font("Georgia", 0, 14)); // NOI18N
        userInput.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                userInputActionPerformed(evt);
            }
        });

        jButton1.setFont(new java.awt.Font("Georgia", 1, 13)); // NOI18N
        jButton1.setText("Guess!");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        outcome.setFont(new java.awt.Font("Georgia", 0, 14)); // NOI18N
        outcome.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);

        lRounds.setFont(new java.awt.Font("Georgia", 0, 12)); // NOI18N
        lRounds.setText("Rounds: 0");

        lScore.setFont(new java.awt.Font("Georgia", 0, 12)); // NOI18N
        lScore.setText("Score: 0");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(mainLabel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(outcome, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(166, 166, 166)
                        .addComponent(userInput, javax.swing.GroupLayout.PREFERRED_SIZE, 207, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(201, 201, 201)
                        .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 126, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(guessIcon, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(guessMe, javax.swing.GroupLayout.PREFERRED_SIZE, 228, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(89, 89, 89)
                        .addComponent(lRounds, javax.swing.GroupLayout.PREFERRED_SIZE, 118, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(401, 401, 401)
                        .addComponent(lScore, javax.swing.GroupLayout.PREFERRED_SIZE, 118, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(21, 21, 21))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(22, 22, 22)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                        .addComponent(guessMe, javax.swing.GroupLayout.DEFAULT_SIZE, 48, Short.MAX_VALUE)
                        .addComponent(guessIcon, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(lRounds)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(lScore)))
                .addGap(13, 13, 13)
                .addComponent(mainLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(userInput, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(outcome, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(38, Short.MAX_VALUE))
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void userInputActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_userInputActionPerformed

    }//GEN-LAST:event_userInputActionPerformed
    
    
       
    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed

        try{
            int i = Integer.parseInt(userInput.getText());
            int high = 50;
            int low = 0;
            if(i>50){
                JOptionPane.showMessageDialog(Guessthenumber.this,"Out of Range!");
                userInput.grabFocus();
                return;
            }
            if (i==r1){
           outcome.setText("Congrats. You guessed only in "+ count + " attempts." );
                switch (count) {
                    case 1 -> score += 10;
                    case 2 -> score += 8;
                    case 3 -> score += 6;
                    case 4 -> score += 4;
                    default -> score += 2;
                }
           lScore.setText("Score: "+score);
           rounds++;
           lRounds.setText("Rounds: "+rounds);
           JOptionPane.showMessageDialog(Guessthenumber.this,"Play Again");
           count = 1;
           userInput.setText("");
           r1 = ran.nextInt(50);   
        }else if(i > r1){
            outcome.setText("Too high");
            count++;
        }else{
            outcome.setText("Too Low");
            count++;
        }  
        } 
        catch(NumberFormatException e){
            JOptionPane.showMessageDialog(Guessthenumber.this,"Invalid Input");
            userInput.grabFocus();
        }    
    }//GEN-LAST:event_jButton1ActionPerformed


    public static void main(String args[]) {
        
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException | InstantiationException | IllegalAccessException | javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Guessthenumber.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(() -> {
            new Guessthenumber().setVisible(true);
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    public volatile javax.swing.JLabel guessIcon;
    private javax.swing.JLabel guessMe;
    private javax.swing.JButton jButton1;
    private javax.swing.JComboBox<String> jComboBox1;
    private javax.swing.JLabel lRounds;
    private javax.swing.JLabel lScore;
    private javax.swing.JLabel mainLabel;
    private javax.swing.JLabel outcome;
    protected javax.swing.JTextField userInput;
    // End of variables declaration//GEN-END:variables
}
