package typing.io;

import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;
import javafx.scene.control.ComboBox;
import javax.swing.ComboBoxModel;
import javax.swing.DefaultComboBoxModel;

/**
 *
 * @author Aseel
 */
public class selectLanguage extends javax.swing.JFrame {

        
    public selectLanguage() {
            
        initComponents();
        
        // The following two lines are for listing all files in practiceLanguages directory
        File folder = new File("practiceLanguages");
        File[] listOfFiles = folder.listFiles();
        
        
        ArrayList<String> jumboBoxContent = new ArrayList();
        for (File listOfFile : listOfFiles) {
                
                // The first line cuts the extension name ".txt" from the files names
                String langName = listOfFile.getName().substring(0, listOfFile.getName().lastIndexOf("."));
                jumboBoxContent.add(langName);
                
        }
        
        
        // Converting the ArrayList to an Array so it can be converted to jumboBoxModel.
        String str[] = new String[jumboBoxContent.size()]; 
        for (int j = 0; j < jumboBoxContent.size(); j++) { 
            str[j] = jumboBoxContent.get(j); 
        }
        
        
        // Setting the model to be displayed in the jumboBox.
        ComboBoxModel model;
        model = new DefaultComboBoxModel(str);
        langList.setModel(model);
        
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        langList = new javax.swing.JComboBox<>();
        languageLabel = new javax.swing.JLabel();
        startButton = new javax.swing.JButton();
        timeLabel = new javax.swing.JLabel();
        durationList = new javax.swing.JComboBox<>();

        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("Select your practice information");

        langList.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));

        languageLabel.setText("Language");

        startButton.setText("Start");
        startButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                startButtonActionPerformed(evt);
            }
        });

        timeLabel.setText("Duration -in minutes-");

        durationList.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "1", "2", "3", "4", "5" }));
        durationList.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                durationListActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(57, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 273, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(startButton))
                        .addGap(70, 70, 70))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(timeLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 136, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(durationList, javax.swing.GroupLayout.PREFERRED_SIZE, 148, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(languageLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 136, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(langList, javax.swing.GroupLayout.PREFERRED_SIZE, 148, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGap(51, 51, 51))))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(30, 30, 30)
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(56, 56, 56)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(langList, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(languageLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(timeLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(durationList, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 121, Short.MAX_VALUE)
                .addComponent(startButton)
                .addGap(46, 46, 46))
        );

        setSize(new java.awt.Dimension(426, 409));
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void startButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_startButtonActionPerformed

        Practice practiceObject;
            try {
                    practiceObject = new Practice((String) langList.getSelectedItem() ,Integer.parseInt((String) durationList.getSelectedItem()) );
                    practiceObject.setVisible(true);
                    this.setVisible(false); 
            } catch (IOException ex) {
                    Logger.getLogger(selectLanguage.class.getName()).log(Level.SEVERE, null, ex);
            }
        
    }//GEN-LAST:event_startButtonActionPerformed

    private void durationListActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_durationListActionPerformed
        // TODO add your handling code here:
        
    }//GEN-LAST:event_durationListActionPerformed

    public static void main(String args[]) {
        
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new selectLanguage().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JComboBox<String> durationList;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JComboBox<String> langList;
    private javax.swing.JLabel languageLabel;
    private javax.swing.JButton startButton;
    private javax.swing.JLabel timeLabel;
    // End of variables declaration//GEN-END:variables
}
