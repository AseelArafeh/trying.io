/*
    Main frame was the first frame appered to user, when run our app "trying.io".
    So, at first we put a welcoming statement in a label.
    Then, a three buttons located at middle of the frame.
    First one, move us to another frame, its 'Upload Source Code' frame.. 
               which give user the ability to upload his/her own code, to practise it.
    While the  second one move us to a 'selectLanguage' frame, to select in which language does user prefer practicing?
    and finally, we have an exit button, to exit from app.
    
*/

package typing.io;

/**
 *
 * @author Aseel
 */


// Add documentation please... DONE
// All buttons names should all be changed to a name similar to their action... DONE
// After a new frame appears the main frame should disappear .. Add the following statement.. this.setVisible(false);
 
//// I think it's better to stay it or to put a 'main' button in each frame, which move to the 'Main' frame,
//// this is importent if a user wanna to return to the main interface at anytime.
 
 
// Add a comment before each button declaring its functionality.
//// they are in 'do not modify' block, so i put all comments before it....DONE
 
// All buttons need to be moved a little bit.. They're not in the middle of the screen
//// You can update it... i could not found a property releated to that.
 
// The frame always appears in the top right corner of the user's screen.. It must be moved into the middle....DONE
//// Okay, I update it for every frames. 
 

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

        uploadSourceCodeButton.setText("Upload Code");
        uploadSourceCodeButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                uploadSourceCodeButtonActionPerformed(evt);
            }
        });

        practiceButton.setText("Practice!");
        practiceButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                practiceButtonActionPerformed(evt);
            }
        });

        exitButton.setText("Exit");
        exitButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                exitButtonActionPerformed(evt);
            }
        });

        image.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        image.setIcon(new javax.swing.ImageIcon(getClass().getResource("/typing/io/speed.png"))); // NOI18N

        welcomingLabel.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        welcomingLabel.setText("Welcome to typing.io");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(image, javax.swing.GroupLayout.PREFERRED_SIZE, 255, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                        .addComponent(practiceButton, javax.swing.GroupLayout.DEFAULT_SIZE, 129, Short.MAX_VALUE)
                        .addComponent(exitButton, javax.swing.GroupLayout.DEFAULT_SIZE, 129, Short.MAX_VALUE))
                    .addComponent(uploadSourceCodeButton, javax.swing.GroupLayout.PREFERRED_SIZE, 129, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(welcomingLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 129, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(18, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(welcomingLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 46, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(37, 37, 37)
                .addComponent(uploadSourceCodeButton)
                .addGap(18, 18, 18)
                .addComponent(practiceButton)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(exitButton)
                .addGap(75, 75, 75))
            .addGroup(layout.createSequentialGroup()
                .addGap(27, 27, 27)
                .addComponent(image, javax.swing.GroupLayout.PREFERRED_SIZE, 311, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(30, Short.MAX_VALUE))
        );

        setSize(new java.awt.Dimension(424, 407));
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void exitButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_exitButtonActionPerformed
        System.exit(0);
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

    
    
//// Here, i explain functionality of each button declared in the below, do not modify block.
 
//// button declaring its functionality.
//// exitButton: exit from app.
//// practiceButton: move to practice frame.
//// uploadSourceCodeButton: move to UploadSourceCode frame.
//// welcomingLabel: contain 'welcome to typing.io' statement.
 
    
    
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton exitButton;
    private javax.swing.JLabel image;
    private javax.swing.JButton practiceButton;
    private javax.swing.JButton uploadSourceCodeButton;
    private javax.swing.JLabel welcomingLabel;
    // End of variables declaration//GEN-END:variables

//// Please acknowledge me when reading the this updated code, and remove every unnecessary comments.
//// Thanks for reviewing my code :) 

}
