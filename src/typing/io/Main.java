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

        uploadSourceCodeButton.setFont(new java.awt.Font("Sakkal Majalla", 1, 36)); // NOI18N
        uploadSourceCodeButton.setText("Upload Source Code");
        uploadSourceCodeButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                uploadSourceCodeButtonActionPerformed(evt);
            }
        });

        practiceButton.setFont(new java.awt.Font("Sakkal Majalla", 1, 36)); // NOI18N
        practiceButton.setForeground(new java.awt.Color(153, 0, 153));
        practiceButton.setText("Practice!");
        practiceButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                practiceButtonActionPerformed(evt);
            }
        });

        exitButton.setFont(new java.awt.Font("Sakkal Majalla", 1, 36)); // NOI18N
        exitButton.setText("Exit");
        exitButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                exitButtonActionPerformed(evt);
            }
        });

        image.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        image.setIcon(new javax.swing.ImageIcon(getClass().getResource("/typing/io/speed.png"))); // NOI18N

        welcomingLabel.setFont(new java.awt.Font("Tahoma", 1, 36)); // NOI18N
        welcomingLabel.setForeground(new java.awt.Color(153, 0, 153));
        welcomingLabel.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        welcomingLabel.setText("Welcome to typing.io");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(286, 286, 286)
                .addComponent(welcomingLabel, javax.swing.GroupLayout.DEFAULT_SIZE, 488, Short.MAX_VALUE)
                .addContainerGap())
            .addGroup(layout.createSequentialGroup()
                .addGap(25, 25, 25)
                .addComponent(image, javax.swing.GroupLayout.PREFERRED_SIZE, 332, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(75, 75, 75)
                        .addComponent(practiceButton, javax.swing.GroupLayout.PREFERRED_SIZE, 218, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(105, 105, 105)
                        .addComponent(exitButton, javax.swing.GroupLayout.PREFERRED_SIZE, 157, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(31, 31, 31)
                        .addComponent(uploadSourceCodeButton, javax.swing.GroupLayout.PREFERRED_SIZE, 296, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(68, 68, 68)
                .addComponent(welcomingLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 96, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(48, 48, 48)
                        .addComponent(uploadSourceCodeButton, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGap(18, 18, 18)
                        .addComponent(practiceButton, javax.swing.GroupLayout.PREFERRED_SIZE, 72, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(exitButton, javax.swing.GroupLayout.PREFERRED_SIZE, 72, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(105, 105, 105))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 11, Short.MAX_VALUE)
                        .addComponent(image, javax.swing.GroupLayout.PREFERRED_SIZE, 356, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(47, 47, 47))))
        );

        setSize(new java.awt.Dimension(800, 617));
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void exitButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_exitButtonActionPerformed
        
        int exitConfirmation = JOptionPane.showConfirmDialog(null, "Are you sure you want to exit ?", "Confirm", JOptionPane.YES_NO_OPTION);

        if(exitConfirmation == JOptionPane.YES_OPTION) {
            System.exit(0);
        } else {
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
