package typing.io;

import java.io.File;
import javax.swing.JOptionPane;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.logging.Level;
import java.util.logging.Logger;


public class UploadSourceCode extends javax.swing.JFrame {

    public UploadSourceCode() {
        initComponents();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        languageLabel = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        langContent = new javax.swing.JTextArea();
        codeLabel = new javax.swing.JLabel();
        langName = new javax.swing.JTextField();
        saveButton = new javax.swing.JButton();
        cancelButton = new javax.swing.JButton();
        uploadSouceCodeTitle = new javax.swing.JLabel();

        setTitle("Upload Source Code");

        languageLabel.setFont(new java.awt.Font("Sakkal Majalla", 0, 24)); // NOI18N
        languageLabel.setText("Language:");

        langContent.setColumns(20);
        langContent.setFont(new java.awt.Font("Sakkal Majalla", 0, 24)); // NOI18N
        langContent.setRows(5);
        jScrollPane1.setViewportView(langContent);

        codeLabel.setFont(new java.awt.Font("Sakkal Majalla", 0, 24)); // NOI18N
        codeLabel.setText("Code:");

        langName.setFont(new java.awt.Font("Sakkal Majalla", 0, 24)); // NOI18N

        saveButton.setFont(new java.awt.Font("Sakkal Majalla", 1, 24)); // NOI18N
        saveButton.setForeground(new java.awt.Color(153, 0, 153));
        saveButton.setText("Save");
        saveButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                saveButtonActionPerformed(evt);
            }
        });

        cancelButton.setFont(new java.awt.Font("Sakkal Majalla", 1, 24)); // NOI18N
        cancelButton.setForeground(new java.awt.Color(153, 0, 153));
        cancelButton.setText("Cancel");
        cancelButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cancelButtonActionPerformed(evt);
            }
        });

        uploadSouceCodeTitle.setFont(new java.awt.Font("Tahoma", 1, 36)); // NOI18N
        uploadSouceCodeTitle.setForeground(new java.awt.Color(153, 0, 153));
        uploadSouceCodeTitle.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        uploadSouceCodeTitle.setText("Upload Source Code");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(32, 32, 32)
                .addComponent(uploadSouceCodeTitle, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(42, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 701, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(cancelButton)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(saveButton)))
                .addGap(39, 39, 39))
            .addGroup(layout.createSequentialGroup()
                .addGap(89, 89, 89)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(languageLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 140, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(langName, javax.swing.GroupLayout.PREFERRED_SIZE, 339, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(codeLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 140, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(uploadSouceCodeTitle, javax.swing.GroupLayout.PREFERRED_SIZE, 58, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 20, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(languageLabel)
                    .addComponent(langName, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(17, 17, 17)
                .addComponent(codeLabel)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 319, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(16, 16, 16)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(saveButton)
                    .addComponent(cancelButton))
                .addContainerGap())
        );

        setSize(new java.awt.Dimension(798, 621));
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

        private void saveButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_saveButtonActionPerformed
                
            String languageName = langName.getText();
            String languageContent = langContent.getText();
                
            if ( languageName.equals("") ) { 
                
                JOptionPane.showMessageDialog(this, "You need to enter the language name.");
                
            } else if ( languageContent.equals("") ) {
               
                JOptionPane.showMessageDialog(this, "There is no content!!");
                
            } else {
                
                // If both name and content exist then I must create a file containing 
                // the script so the user can practise it.
                        
                // I want 'exists' boolean to check if language name already exists.. But I'll do it later
                boolean exists = false;  
                
                if ( !exists ) {
                                
                    try {
                                        
                        File toBeCreated = new File("practiceLanguages\\" + languageName.concat(".txt"));  
                        // createNewFile method creates a file and returns true if it succeeds
                                        
                        if ( toBeCreated.createNewFile() ) {
                                                
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
            
        }//GEN-LAST:event_saveButtonActionPerformed

    private void cancelButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cancelButtonActionPerformed
        
        // TODO add your handling code here:
        this.setVisible(false);
        
    }//GEN-LAST:event_cancelButtonActionPerformed


    public static void main(String args[]) {

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

        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new UploadSourceCode().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton cancelButton;
    private javax.swing.JLabel codeLabel;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTextArea langContent;
    private javax.swing.JTextField langName;
    private javax.swing.JLabel languageLabel;
    private javax.swing.JButton saveButton;
    private javax.swing.JLabel uploadSouceCodeTitle;
    // End of variables declaration//GEN-END:variables
}
