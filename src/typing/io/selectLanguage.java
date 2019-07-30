package typing.io;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Scanner;
import java.util.logging.Level;
import java.util.logging.Logger;
import javafx.scene.control.ComboBox;
import javax.swing.ComboBoxModel;
import javax.swing.DefaultComboBoxModel;
import javax.swing.JTextField;


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
        loadingFile();
        
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        langList = new javax.swing.JComboBox<>();
        languageLabel = new javax.swing.JLabel();
        startButton = new javax.swing.JButton();
        timeLabel = new javax.swing.JLabel();
        durationList = new javax.swing.JComboBox<>();
        jScrollPane1 = new javax.swing.JScrollPane();
        preview = new javax.swing.JTextArea();
        selectPracticeInformationTitle = new javax.swing.JLabel();

        setTitle("Practice Information");

        langList.setFont(new java.awt.Font("Sakkal Majalla", 0, 24)); // NOI18N
        langList.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                langListActionPerformed(evt);
            }
        });

        languageLabel.setFont(new java.awt.Font("Sakkal Majalla", 0, 24)); // NOI18N
        languageLabel.setText("Language");

        startButton.setFont(new java.awt.Font("Sakkal Majalla", 1, 24)); // NOI18N
        startButton.setForeground(new java.awt.Color(153, 0, 153));
        startButton.setText("Start");
        startButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                startButtonActionPerformed(evt);
            }
        });

        timeLabel.setFont(new java.awt.Font("Sakkal Majalla", 0, 24)); // NOI18N
        timeLabel.setText("Duration -in minutes-");

        durationList.setFont(new java.awt.Font("Sakkal Majalla", 0, 24)); // NOI18N
        durationList.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "1", "2", "3", "4", "5" }));
        durationList.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                durationListActionPerformed(evt);
            }
        });

        preview.setEditable(false);
        preview.setColumns(20);
        preview.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        preview.setLineWrap(true);
        preview.setRows(5);
        preview.setTabSize(2);
        jScrollPane1.setViewportView(preview);

        selectPracticeInformationTitle.setFont(new java.awt.Font("Tahoma", 1, 36)); // NOI18N
        selectPracticeInformationTitle.setForeground(new java.awt.Color(153, 0, 153));
        selectPracticeInformationTitle.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        selectPracticeInformationTitle.setText("Select Your Practice Information");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(146, 146, 146)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(timeLabel, javax.swing.GroupLayout.DEFAULT_SIZE, 172, Short.MAX_VALUE)
                    .addComponent(languageLabel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(26, 26, 26)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(langList, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(durationList, 0, 238, Short.MAX_VALUE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(layout.createSequentialGroup()
                .addContainerGap(88, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 594, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(selectPracticeInformationTitle)
                    .addComponent(startButton, javax.swing.GroupLayout.PREFERRED_SIZE, 108, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(103, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(38, 38, 38)
                .addComponent(selectPracticeInformationTitle)
                .addGap(30, 30, 30)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(langList, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(languageLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(timeLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(durationList, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(30, 30, 30)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 251, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 31, Short.MAX_VALUE)
                .addComponent(startButton)
                .addContainerGap())
        );

        setSize(new java.awt.Dimension(801, 617));
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

    void loadingFile(){
        try {
            // TODO add your handling code here:
            File f = new File("practiceLanguages" + "//" + (String) langList.getSelectedItem() + ".txt");
            Scanner input = new Scanner(f);
            input.useDelimiter("\\A");
            if (input.hasNext()) {
                preview.setText(input.next());
            }
            preview.setCaretPosition(0);
        } catch (FileNotFoundException ex) {
            Logger.getLogger(selectLanguage.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    
    private void langListActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_langListActionPerformed
        loadingFile();
    }//GEN-LAST:event_langListActionPerformed

    public static void main(String args[]) {
        
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new selectLanguage().setVisible(true);
            }
        });
        
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JComboBox<String> durationList;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JComboBox<String> langList;
    private javax.swing.JLabel languageLabel;
    private javax.swing.JTextArea preview;
    private javax.swing.JLabel selectPracticeInformationTitle;
    private javax.swing.JButton startButton;
    private javax.swing.JLabel timeLabel;
    // End of variables declaration//GEN-END:variables
}
