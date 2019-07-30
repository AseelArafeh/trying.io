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

        selectPracticeInformationLabel = new javax.swing.JLabel();
        langList = new javax.swing.JComboBox<>();
        languageLabel = new javax.swing.JLabel();
        startButton = new javax.swing.JButton();
        timeLabel = new javax.swing.JLabel();
        durationList = new javax.swing.JComboBox<>();
        jScrollPane1 = new javax.swing.JScrollPane();
        preview = new javax.swing.JTextArea();

        setTitle("Practice Information");

        selectPracticeInformationLabel.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        selectPracticeInformationLabel.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        selectPracticeInformationLabel.setText("Select your practice information");

        langList.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        langList.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));
        langList.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                langListActionPerformed(evt);
            }
        });

        languageLabel.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        languageLabel.setText("Language");

        startButton.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        startButton.setText("Start");
        startButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                startButtonActionPerformed(evt);
            }
        });

        timeLabel.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        timeLabel.setText("Duration -in minutes-");

        durationList.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        durationList.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "1", "2", "3", "4", "5" }));
        durationList.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                durationListActionPerformed(evt);
            }
        });

        preview.setColumns(20);
        preview.setFont(new java.awt.Font("Monospaced", 0, 10)); // NOI18N
        preview.setLineWrap(true);
        preview.setRows(5);
        preview.setTabSize(2);
        jScrollPane1.setViewportView(preview);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(startButton)
                .addContainerGap())
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(32, 32, 32)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 507, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(83, 83, 83)
                                .addComponent(selectPracticeInformationLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 343, javax.swing.GroupLayout.PREFERRED_SIZE))))
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                        .addGroup(layout.createSequentialGroup()
                            .addContainerGap()
                            .addComponent(timeLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 136, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGap(18, 18, 18)
                            .addComponent(durationList, javax.swing.GroupLayout.PREFERRED_SIZE, 148, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                            .addGap(144, 144, 144)
                            .addComponent(languageLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 136, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGap(18, 18, 18)
                            .addComponent(langList, javax.swing.GroupLayout.PREFERRED_SIZE, 148, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addGap(0, 40, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(35, 35, 35)
                .addComponent(selectPracticeInformationLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(29, 29, 29)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(languageLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(langList, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(timeLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(durationList, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(41, 41, 41)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 229, Short.MAX_VALUE)
                .addGap(22, 22, 22)
                .addComponent(startButton)
                .addContainerGap())
        );

        setSize(new java.awt.Dimension(595, 531));
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
    private javax.swing.JLabel selectPracticeInformationLabel;
    private javax.swing.JButton startButton;
    private javax.swing.JLabel timeLabel;
    // End of variables declaration//GEN-END:variables
}
