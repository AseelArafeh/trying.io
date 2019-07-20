package typing.io;

import java.awt.Color;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.HashMap;
import java.util.Map;
import java.util.NavigableMap;
import java.util.Timer;
import java.util.TimerTask;
import java.util.logging.Level;
import java.util.logging.Logger;
/**
 *
 * @author Aseel
 */
public class Practice extends javax.swing.JFrame {

    //My variables:
    int time = 60;
    Boolean isIt = false;
    int numberOferrors = 0;
    int numberOfpressedKeys = 0;
    
    int currentPosition = 0; //This will hold where the next character is
    
    Map< String, Integer > wrongTypedKeys =  new HashMap< String,Integer>();
    
    
    /*
    this code to be used in results interface
    
    for (Map.Entry< String,Integer> me:st) 
       { 
           Set< Map.Entry< String,Integer> > st = wrongTypedKeys.entrySet();
           System.out.print(me.getKey()+":"); 
           System.out.println(me.getValue()); 
       } 
    */
    
    public Practice() {
        initComponents();
    }

    public Practice(String selectedLanguage) throws IOException {
        initComponents();
        
        languageTextField.setText(selectedLanguage);
        
        try {
                String line = null;
         
                FileReader content = new FileReader("practiceLanguages" + "//" + selectedLanguage + ".txt");
                BufferedReader bufferedReader = new BufferedReader(content); 
                
                //BufferedReader can only read data line by line.. That's why I needed allOfIt string to save all lines together
                String allOfIt = "";
                
                //Reading line by line and adding it to allOfIt;
                while((line = bufferedReader.readLine()) != null) {
                        allOfIt += line;
                        allOfIt += "\n";
                }   

                bufferedReader.close(); 
                origionalCodeTextArea.setText(allOfIt);  
                    
        } catch (FileNotFoundException ex) {
                Logger.getLogger(Practice.class.getName()).log(Level.SEVERE, null, ex);
        }
        

 
        
        Timer timer = new Timer(); //new timer
        time = 60; //setting the counter to 60 sec
        TimerTask task = new TimerTask() {         
            public void run() {                
                timeRemainingTextField.setText(Integer.toString(time)); //the timer lable to counter.
                time --;
                if (time == -1){
                    timer.cancel();
                    Results resultsObject = new Results(numberOfpressedKeys, numberOferrors,time, wrongTypedKeys);
                    resultsObject.setVisible(true);
                    ////this.setVisible(false);
                    isIt = true; // changing the boolian isIt to true, which will stop the timer.
                } else if(isIt){
                    timer.cancel();
                    isIt = false;
                }
            }
            
        };
    timer.scheduleAtFixedRate(task, 1000, 1000); // =  timer.scheduleAtFixedRate(task, delay, period);
        
    }
    @SuppressWarnings("unchecked")
        // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
        private void initComponents() {

                practiceTitle = new javax.swing.JLabel();
                languageLabel = new javax.swing.JLabel();
                timeRemainingLabel = new javax.swing.JLabel();
                jScrollPane1 = new javax.swing.JScrollPane();
                origionalCodeTextArea = new javax.swing.JTextArea();
                jScrollPane2 = new javax.swing.JScrollPane();
                typedTextArea = new javax.swing.JTextArea();
                languageTextField = new javax.swing.JTextField();
                timeRemainingTextField = new javax.swing.JTextField();
                endButton = new javax.swing.JButton();
                secondLabel = new javax.swing.JLabel();

                practiceTitle.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
                practiceTitle.setText("Practice!");

                languageLabel.setText("Language");

                timeRemainingLabel.setText("Time Remaining");

                origionalCodeTextArea.setEditable(false);
                origionalCodeTextArea.setColumns(20);
                origionalCodeTextArea.setRows(5);
                jScrollPane1.setViewportView(origionalCodeTextArea);

                typedTextArea.setColumns(20);
                typedTextArea.setRows(5);
                typedTextArea.addFocusListener(new java.awt.event.FocusAdapter() {
                        public void focusGained(java.awt.event.FocusEvent evt) {
                                typedTextAreaFocusGained(evt);
                        }
                });
                jScrollPane2.setViewportView(typedTextArea);

                languageTextField.setEditable(false);

                timeRemainingTextField.setEditable(false);

                endButton.setText("End");
                endButton.addActionListener(new java.awt.event.ActionListener() {
                        public void actionPerformed(java.awt.event.ActionEvent evt) {
                                endButtonActionPerformed(evt);
                        }
                });

                secondLabel.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
                secondLabel.setText("sec");

                javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
                getContentPane().setLayout(layout);
                layout.setHorizontalGroup(
                        layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addGroup(layout.createSequentialGroup()
                                                .addGap(20, 20, 20)
                                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                                        .addComponent(endButton)
                                                        .addComponent(jScrollPane1, javax.swing.GroupLayout.Alignment.LEADING)
                                                        .addComponent(jScrollPane2, javax.swing.GroupLayout.Alignment.LEADING)
                                                        .addGroup(layout.createSequentialGroup()
                                                                .addComponent(languageLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 71, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                                                .addComponent(languageTextField, javax.swing.GroupLayout.PREFERRED_SIZE, 55, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 109, Short.MAX_VALUE)
                                                                .addComponent(timeRemainingLabel)
                                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                                                .addComponent(timeRemainingTextField, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                                                .addComponent(secondLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 27, javax.swing.GroupLayout.PREFERRED_SIZE))))
                                        .addGroup(layout.createSequentialGroup()
                                                .addGap(115, 115, 115)
                                                .addComponent(practiceTitle, javax.swing.GroupLayout.PREFERRED_SIZE, 158, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                );
                layout.setVerticalGroup(
                        layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(layout.createSequentialGroup()
                                .addContainerGap()
                                .addComponent(practiceTitle, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                        .addComponent(languageLabel)
                                        .addComponent(timeRemainingLabel)
                                        .addComponent(languageTextField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(timeRemainingTextField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(secondLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 78, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 78, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(endButton)
                                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                );

                pack();
                setLocationRelativeTo(null);
        }// </editor-fold>//GEN-END:initComponents

    private void endButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_endButtonActionPerformed
        Results resultsObject = new Results(numberOfpressedKeys, numberOferrors,time, wrongTypedKeys);
        resultsObject.setVisible(true);
        this.setVisible(false);
        isIt = true; // changing the boolian isIt to true, which will stop the timer.
    }//GEN-LAST:event_endButtonActionPerformed

        private void typedTextAreaFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_typedTextAreaFocusGained
                //Ghaid's code starts here 
        
        KeyListener listener = new KeyListener() {

                        @Override

                        public void keyPressed(KeyEvent event) {
                                
                               
                                printEventInfo("Key Pressed", event);
                                if(KeyEvent.getKeyText(event.getKeyCode()) == "Backspace"){
                                        currentPosition--;
                                        numberOferrors++;
                                } else if(KeyEvent.getKeyText(event.getKeyCode()) == "Shift"){
                                        //Don't do Anything
                                        numberOferrors++;
                                        numberOfpressedKeys--;
                                } else {
                                        if (event.getKeyChar() == origionalCodeTextArea.getText().charAt(currentPosition)){
                                                        typedTextArea.setForeground(Color.green);
                                                        currentPosition++;
                                                } else {
                                                        typedTextArea.setForeground(Color.RED);
                                                        currentPosition++;
//                                                      numberOferrors++;

                                                        String keyPressedString = KeyEvent.getKeyText(event.getKeyCode());
                                                        if ( wrongTypedKeys.containsKey(keyPressedString) ) {
                                                                wrongTypedKeys.put(keyPressedString, new Integer(wrongTypedKeys.get(keyPressedString) + 1));
                                                        } else {
                                                                wrongTypedKeys.put(keyPressedString, new Integer(1));
                                                        }
                                                }
                                }
                                numberOfpressedKeys++;
                        }

                        @Override

                        public void keyReleased(KeyEvent event) {
//                                printEventInfo("Key Released", event);
                        }

                        @Override

                        public void keyTyped(KeyEvent event) {
                                //printEventInfo("Key Typed", event);
                        }

                        
                        private void printEventInfo(String str, KeyEvent e) {

                                System.out.println(str);
                                System.out.println("(" + e.getKeyChar() + "," + origionalCodeTextArea.getText().charAt(currentPosition));

                                System.out.println("   Char: " + e.getKeyChar());

                                int mods = e.getModifiersEx(); //mode has the value if shift is pressed

                                System.out.println("    Mods: "

                                    + KeyEvent.getModifiersExText(mods));

                        };
                };
                       
                typedTextArea.addKeyListener(listener);
                
        }//GEN-LAST:event_typedTextAreaFocusGained

    public static void main(String args[]) {
        
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(Practice.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Practice.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Practice.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Practice.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }

        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Practice().setVisible(true);
            }
        });
    }

        // Variables declaration - do not modify//GEN-BEGIN:variables
        private javax.swing.JButton endButton;
        private javax.swing.JScrollPane jScrollPane1;
        private javax.swing.JScrollPane jScrollPane2;
        private javax.swing.JLabel languageLabel;
        private javax.swing.JTextField languageTextField;
        private javax.swing.JTextArea origionalCodeTextArea;
        private javax.swing.JLabel practiceTitle;
        private javax.swing.JLabel secondLabel;
        private javax.swing.JLabel timeRemainingLabel;
        private javax.swing.JTextField timeRemainingTextField;
        private javax.swing.JTextArea typedTextArea;
        // End of variables declaration//GEN-END:variables
}
