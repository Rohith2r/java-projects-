/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package com.codsoft.grades;

import javax.swing.JOptionPane;

/**
 *
 * @author Rohit Murmu
 */
public class Grades extends javax.swing.JFrame {

    /**
     * Creates new form Grades
     */
    public Grades() {
        initComponents();
    }
    
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        filler1 = new javax.swing.Box.Filler(new java.awt.Dimension(0, 0), new java.awt.Dimension(0, 0), new java.awt.Dimension(32767, 0));
        jRadioButton1 = new javax.swing.JRadioButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();
        jScrollPane2 = new javax.swing.JScrollPane();
        jTable2 = new javax.swing.JTable();
        lHeading1 = new javax.swing.JLabel();
        lHeading2 = new javax.swing.JLabel();
        jButton1 = new javax.swing.JButton();
        lSub1 = new javax.swing.JLabel();
        lSub2 = new javax.swing.JLabel();
        lSub3 = new javax.swing.JLabel();
        lSub4 = new javax.swing.JLabel();
        lSub5 = new javax.swing.JLabel();
        tEng = new javax.swing.JTextField();
        tHin = new javax.swing.JTextField();
        tSci = new javax.swing.JTextField();
        tMath = new javax.swing.JTextField();
        tSSc = new javax.swing.JTextField();
        lResult1 = new javax.swing.JLabel();
        lResult2 = new javax.swing.JLabel();
        lResult3 = new javax.swing.JLabel();

        jRadioButton1.setText("jRadioButton1");

        jTable1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Title 1", "Title 2", "Title 3", "Title 4"
            }
        ));
        jScrollPane1.setViewportView(jTable1);

        jTable2.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Title 1", "Title 2", "Title 3", "Title 4"
            }
        ));
        jScrollPane2.setViewportView(jTable2);

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Grade Calculator");
        setBackground(new java.awt.Color(51, 0, 51));
        setResizable(false);

        lHeading1.setFont(new java.awt.Font("Lucida Handwriting", 0, 32)); // NOI18N
        lHeading1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lHeading1.setText("Student Grade");

        lHeading2.setFont(new java.awt.Font("Lucida Handwriting", 0, 30)); // NOI18N
        lHeading2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lHeading2.setText("Calculator");
        lHeading2.setVerticalAlignment(javax.swing.SwingConstants.TOP);
        lHeading2.setOpaque(true);

        jButton1.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jButton1.setText("Calculate");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        lSub1.setFont(new java.awt.Font("Segoe UI Emoji", 0, 16)); // NOI18N
        lSub1.setText("English");

        lSub2.setFont(new java.awt.Font("Segoe UI Emoji", 0, 16)); // NOI18N
        lSub2.setText("Hindi");

        lSub3.setFont(new java.awt.Font("Segoe UI Emoji", 0, 16)); // NOI18N
        lSub3.setText("Science");

        lSub4.setFont(new java.awt.Font("Segoe UI Emoji", 0, 16)); // NOI18N
        lSub4.setText("Mathematics");

        lSub5.setFont(new java.awt.Font("Segoe UI Emoji", 0, 16)); // NOI18N
        lSub5.setText("S. Science");

        tEng.setFont(new java.awt.Font("Segoe UI Emoji", 0, 14)); // NOI18N

        tHin.setFont(new java.awt.Font("Segoe UI Emoji", 0, 14)); // NOI18N

        tSci.setFont(new java.awt.Font("Segoe UI Emoji", 0, 14)); // NOI18N

        tMath.setFont(new java.awt.Font("Segoe UI Emoji", 0, 14)); // NOI18N

        tSSc.setFont(new java.awt.Font("Segoe UI Emoji", 0, 14)); // NOI18N

        lResult1.setFont(new java.awt.Font("Segoe UI Emoji", 0, 16)); // NOI18N
        lResult1.setText("Total : ");

        lResult2.setFont(new java.awt.Font("Segoe UI Emoji", 0, 16)); // NOI18N
        lResult2.setText("Average : ");

        lResult3.setFont(new java.awt.Font("Segoe UI Emoji", 0, 16)); // NOI18N
        lResult3.setText("Grades :");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(lHeading1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(lHeading2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(197, 197, 197)
                        .addComponent(jButton1))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(49, 49, 49)
                        .addComponent(lResult1, javax.swing.GroupLayout.PREFERRED_SIZE, 120, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(lResult2, javax.swing.GroupLayout.PREFERRED_SIZE, 115, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(31, 31, 31)
                        .addComponent(lResult3, javax.swing.GroupLayout.PREFERRED_SIZE, 113, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(72, 72, 72)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(lSub2, javax.swing.GroupLayout.PREFERRED_SIZE, 101, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(lSub1, javax.swing.GroupLayout.PREFERRED_SIZE, 101, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(lSub3, javax.swing.GroupLayout.PREFERRED_SIZE, 101, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(lSub4, javax.swing.GroupLayout.PREFERRED_SIZE, 101, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(lSub5, javax.swing.GroupLayout.PREFERRED_SIZE, 101, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(43, 43, 43)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(tEng)
                            .addComponent(tHin)
                            .addComponent(tSci)
                            .addComponent(tMath)
                            .addComponent(tSSc, javax.swing.GroupLayout.DEFAULT_SIZE, 168, Short.MAX_VALUE))))
                .addContainerGap(46, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(lHeading1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(lHeading2, javax.swing.GroupLayout.PREFERRED_SIZE, 54, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lSub1, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(tEng, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lSub2, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(tHin, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lSub3, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(tSci, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lSub4, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(tMath, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lSub5, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(tSSc, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(27, 27, 27)
                .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 28, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lResult2, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lResult1, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lResult3, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(39, 39, 39))
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        // TODO add your handling code here:
        try{
            int eng = Integer.parseInt(tEng.getText());
            int hin = Integer.parseInt(tHin.getText());
            int sci = Integer.parseInt(tSci.getText());
            int math = Integer.parseInt(tMath.getText());
            int ssc = Integer.parseInt(tSSc.getText());
            
            if(eng > 100 || hin > 100 || sci > 100 || math > 100 || ssc > 100){
                JOptionPane.showMessageDialog(Grades.this, "Max marks can be 100!");
            }else if(eng < 0 || hin < 0 || sci < 0 || math < 0 || ssc < 0){
                JOptionPane.showMessageDialog(Grades.this, "Negative not allowed!!");
            }else{
                int sum = eng + hin + sci + math + ssc ;
                double avg = sum/5.0;
                
                lResult1.setText("Total :  "+sum);
                lResult2.setText("Average :  "+ avg);
                
                String grade =" ";
                if(avg < 35){
                    grade = "F";
                }else if(avg < 50){
                    grade = "D";
                }else if(avg < 65){
                    grade = "C";
                }else if(avg < 80){
                    grade = "B";
                }else if(avg < 90){
                    grade = "A";
                }else{
                    grade = "A+";
                }
                
                lResult3.setText("Grade:  "+grade);
            }
        }
        catch(NumberFormatException e){
             JOptionPane.showMessageDialog(Grades.this, "Invalid Type!!");
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
            java.util.logging.Logger.getLogger(Grades.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Grades.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Grades.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Grades.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Grades().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.Box.Filler filler1;
    private javax.swing.JButton jButton1;
    private javax.swing.JRadioButton jRadioButton1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JTable jTable1;
    private javax.swing.JTable jTable2;
    private javax.swing.JLabel lHeading1;
    private javax.swing.JLabel lHeading2;
    private javax.swing.JLabel lResult1;
    private javax.swing.JLabel lResult2;
    private javax.swing.JLabel lResult3;
    private javax.swing.JLabel lSub1;
    private javax.swing.JLabel lSub2;
    private javax.swing.JLabel lSub3;
    private javax.swing.JLabel lSub4;
    private javax.swing.JLabel lSub5;
    private javax.swing.JTextField tEng;
    private javax.swing.JTextField tHin;
    private javax.swing.JTextField tMath;
    private javax.swing.JTextField tSSc;
    private javax.swing.JTextField tSci;
    // End of variables declaration//GEN-END:variables
}
