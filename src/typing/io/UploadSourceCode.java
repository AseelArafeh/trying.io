package typing.io;

import java.io.File;
import javax.swing.JOptionPane;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author ghaid
 */
public class UploadSourceCode extends javax.swing.JFrame {

    /**
     * Creates new form UploadSourceCode
     */
    public UploadSourceCode() {
        initComponents();
    }

    @SuppressWarnings("unchecked")
        // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
        private void initComponents() {

                jLabel1 = new javax.swing.JLabel();
                jLabel2 = new javax.swing.JLabel();
                jScrollPane1 = new javax.swing.JScrollPane();
                langContent = new javax.swing.JTextArea();
                jLabel3 = new javax.swing.JLabel();
                langName = new javax.swing.JTextField();
                jButton1 = new javax.swing.JButton();

                jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
                jLabel1.setText("Upload Source Code");

                jLabel2.setText("Language:");

                langContent.setColumns(20);
                langContent.setRows(5);
                jScrollPane1.setViewportView(langContent);

                jLabel3.setText("Code:");

                jButton1.setText("Save");
                jButton1.addActionListener(new java.awt.event.ActionListener() {
                        public void actionPerformed(java.awt.event.ActionEvent evt) {
                                jButton1ActionPerformed(evt);
                        }
                });

                javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
                getContentPane().setLayout(layout);
                layout.setHorizontalGroup(
                        layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                .addContainerGap(302, Short.MAX_VALUE)
                                .addComponent(jButton1)
                                .addGap(39, 39, 39))
                        .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addGroup(layout.createSequentialGroup()
                                                .addGap(32, 32, 32)
                                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                        .addGroup(layout.createSequentialGroup()
                                                                .addComponent(jLabel2)
                                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                                                .addComponent(langName, javax.swing.GroupLayout.PREFERRED_SIZE, 127, javax.swing.GroupLayout.PREFERRED_SIZE))
                                                        .addComponent(jLabel3)
                                                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 315, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                        .addGroup(layout.createSequentialGroup()
                                                .addGap(126, 126, 126)
                                                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 130, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                );
                layout.setVerticalGroup(
                        layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(layout.createSequentialGroup()
                                .addContainerGap()
                                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                        .addComponent(jLabel2)
                                        .addComponent(langName, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(18, 18, 18)
                                .addComponent(jLabel3)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 221, Short.MAX_VALUE)
                                .addGap(16, 16, 16)
                                .addComponent(jButton1)
                                .addContainerGap())
                );

                pack();
                setLocationRelativeTo(null);
        }// </editor-fold>//GEN-END:initComponents

        private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
                
                String languageName = langName.getText();
                String languageContent = langContent.getText();
                
                if( languageName.equals("") ) 
                        JOptionPane.showMessageDialog(this, "You need to enter the language name.");
                else if( languageContent.equals("") )
                        JOptionPane.showMessageDialog(this, "There is no content!!");
                else {
                        // If both name and content exist then I must create a file containing 
                        // the script so the user can practise it.
                        
                        boolean exists = false; // I want this boolean to check if language name already exists.. But I'll do it later
                        
                        if ( !exists ) {
                                
                                try {
                                        
                                        File toBeCreated = new File("practiceLanguages\\" + languageName.concat(".txt"));  
                                        // createNewFile method creates a file and returns true if it succeeds
                                        
                                        if ( toBeCreated.createNewFile() ){
                                                
                                                // If the file exists this code will add content to it.
                                                
                                                JOptionPane.showMessageDialog(this, "File Created :) ");
                                                PrintWriter contentAdder = new PrintWriter(toBeCreated);
                                                contentAdder.print(languageContent);
                                                contentAdder.close();
                                                
                                        } else {
                                                JOptionPane.showMessageDialog(this, "Couldn't Create File !");
                                        }
                                        
                                        
                                } catch (IOException ex) {
                                        Logger.getLogger(UploadSourceCode.class.getName()).log(Level.SEVERE, null, ex);
                                }
                                        
                        } else {
                                JOptionPane.showMessageDialog(this, "This language already exists, Please pick another name");
                        }
                        
                        
                        
                        
                        
                }
        }//GEN-LAST:event_jButton1ActionPerformed


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
            java.util.logging.Logger.getLogger(UploadSourceCode.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(UploadSourceCode.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(UploadSourceCode.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(UploadSourceCode.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new UploadSourceCode().setVisible(true);
            }
        });
    }

        // Variables declaration - do not modify//GEN-BEGIN:variables
        private javax.swing.JButton jButton1;
        private javax.swing.JLabel jLabel1;
        private javax.swing.JLabel jLabel2;
        private javax.swing.JLabel jLabel3;
        private javax.swing.JScrollPane jScrollPane1;
        private javax.swing.JTextArea langContent;
        private javax.swing.JTextField langName;
        // End of variables declaration//GEN-END:variables
}
