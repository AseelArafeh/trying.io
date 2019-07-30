/*
    Main frame was the first frame appered to user, when run our app "trying.io".
    So, at first we put a welcoming statement in a label.
    Then, a three buttons located at middle of the frame.
    First one, move us to another frame, its 'Upload Source Code' frame.. 
               which give user the ability to upload his/her own code, to practise it.
    While the  second one move us to a 'selectLanguage' frame, to select in which language does user prefer practicing?
    and finally, we have an exit button, to exit from app
    
*/

package typing.io;

import javax.swing.JFrame;
import javax.swing.JOptionPane;

public class Main extends javax.swing.JFrame {

    public Main() {
        initComponents();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        uploadSourceCodeButton = new javax.swing.JButton();
        practiceButton = new javax.swing.JButton();
        exitButton = new javax.swing.JButton();
        image = new javax.swing.JLabel();
        welcomingLabel = new javax.swing.JLabel();

        setTitle("typing.io");

        uploadSourceCodeButton.setFont(new java.awt.Font("Sakkal Majalla", 0, 36)); // NOI18N
        uploadSourceCodeButton.setText("Upload Code");
        uploadSourceCodeButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                uploadSourceCodeButtonActionPerformed(evt);
            }
        });

        practiceButton.setFont(new java.awt.Font("Sakkal Majalla", 0, 36)); // NOI18N
        practiceButton.setText("Practice!");
        practiceButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                practiceButtonActionPerformed(evt);
            }
        });

        exitButton.setFont(new java.awt.Font("Sakkal Majalla", 0, 36)); // NOI18N
        exitButton.setText("Exit");
        exitButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                exitButtonActionPerformed(evt);
            }
        });

        image.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        image.setIcon(new javax.swing.ImageIcon(getClass().getResource("/typing/io/speed.png"))); // NOI18N

        welcomingLabel.setFont(new java.awt.Font("Tahoma", 0, 36)); // NOI18N
        welcomingLabel.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        welcomingLabel.setText("Welcome to typing.io");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(25, 25, 25)
                .addComponent(image, javax.swing.GroupLayout.PREFERRED_SIZE, 255, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(welcomingLabel, javax.swing.GroupLayout.DEFAULT_SIZE, 381, Short.MAX_VALUE)
                                .addContainerGap())
                            .addGroup(layout.createSequentialGroup()
                                .addGap(69, 69, 69)
                                .addComponent(uploadSourceCodeButton, javax.swing.GroupLayout.PREFERRED_SIZE, 223, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(110, 110, 110)
                                .addComponent(practiceButton, javax.swing.GroupLayout.PREFERRED_SIZE, 154, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createSequentialGroup()
                                .addGap(128, 128, 128)
                                .addComponent(exitButton, javax.swing.GroupLayout.PREFERRED_SIZE, 116, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGap(0, 0, Short.MAX_VALUE))))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(58, 58, 58)
                .addComponent(welcomingLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 96, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(uploadSourceCodeButton)
                .addGap(18, 18, 18)
                .addComponent(practiceButton)
                .addGap(18, 18, 18)
                .addComponent(exitButton)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(78, Short.MAX_VALUE)
                .addComponent(image, javax.swing.GroupLayout.PREFERRED_SIZE, 311, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(73, 73, 73))
        );

        setSize(new java.awt.Dimension(693, 501));
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void exitButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_exitButtonActionPerformed
        
        int exitConfirmation = JOptionPane.showConfirmDialog(null, "Are you sure you want to exit ?", "Confirm", JOptionPane.YES_NO_OPTION);

        if(exitConfirmation == JOptionPane.YES_OPTION) {
            System.exit(0);
        }else{
            setDefaultCloseOperation(JFrame.DO_NOTHING_ON_CLOSE);
        }  
            
    }//GEN-LAST:event_exitButtonActionPerformed

    private void practiceButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_practiceButtonActionPerformed
        
        selectLanguage selectLanguageObject = new selectLanguage();
        selectLanguageObject.setVisible(true);
       
    }//GEN-LAST:event_practiceButtonActionPerformed

    private void uploadSourceCodeButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_uploadSourceCodeButtonActionPerformed
        
        UploadSourceCode uploadSourceCodeObject = new UploadSourceCode();
        uploadSourceCodeObject.setVisible(true);
        
    }//GEN-LAST:event_uploadSourceCodeButtonActionPerformed

    public static void main(String args[]) {
       
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Main().setVisible(true);
            }
        });
    }
    
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton exitButton;
    private javax.swing.JLabel image;
    private javax.swing.JButton practiceButton;
    private javax.swing.JButton uploadSourceCodeButton;
    private javax.swing.JLabel welcomingLabel;
    // End of variables declaration//GEN-END:variables

    // exitButton: exit from app.
    // practiceButton: move to practice frame.
    // uploadSourceCodeButton: move to UploadSourceCode frame.
    // welcomingLabel: contain 'welcome to typing.io' statement.

}
