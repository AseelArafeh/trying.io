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
import javax.sound.sampled.AudioInputStream;
import javax.sound.sampled.AudioSystem;
import javax.sound.sampled.Clip;


public class Practice extends javax.swing.JFrame {
    
    //Timer Related Variables
    private int timeRemainingInSeconds = 0;     // Time remaining for down-counting timer  
    private int selectedDurationInMinutes = 0;  // Selected duration for practice in minutes 
    private Boolean timerStatus = false;
    
    //Error manegemnt Variables
    private int numberOferrors = 0;             // Count number of errors 
    private int numberOfpressedKeys = 0;        // Count number of any keystroke
    private int currentPosition = 0;            // This will hold where the next character is
     
    //Map of Errors
    private Map< String, Integer > wrongTypedKeys =  new HashMap< String, Integer >();
    
    public Practice () {
        
        initComponents();
        
    }

    public Practice (String selectedLanguage, int selectedDuration) throws IOException {
        
        initComponents();
        timeRemainingInSeconds = selectedDuration*60;
        selectedDurationInMinutes = selectedDuration;
        languageTextField.setText(selectedLanguage);
        timeRemainingTextField.setText(String.valueOf(selectedDuration));
        
        try {
            
            String line = null;
            FileReader content = new FileReader("practiceLanguages" + "//" + selectedLanguage + ".txt");
            BufferedReader bufferedReader = new BufferedReader(content); 
            // BufferedReader can only read data line by line.. That's why I needed allOfIt string to save all lines together
            String allOfIt = "";

            // Reading line by line and adding it to allOfIt;
            while ((line = bufferedReader.readLine()) != null) {
                
                    allOfIt += line;
                    allOfIt += "\n";
                    
            }   

            bufferedReader.close(); 
            origionalCodeTextArea.setText(allOfIt);
            // Set textArea scroll at the beginning, by moving the caret to position ZERO
            origionalCodeTextArea.setCaretPosition(0);
                    
        } catch (FileNotFoundException ex) {
            
            Logger.getLogger(Practice.class.getName()).log(Level.SEVERE, null, ex);
            
        }
        
        // Initiate a new timer
        Timer timer = new Timer();          
        // Setting the counter to selectedDuration in seconds
        timeRemainingInSeconds = selectedDuration*60;    
        TimerTask task = new TimerTask() {         
            
            public void run () {                
                
                // Update remaining timer lable every second
                timeRemainingTextField.setText(Integer.toString(timeRemainingInSeconds)); 
                timeRemainingInSeconds --;
                if (timeRemainingInSeconds == -1) {
                    
                    timer.cancel();
                    Results resultsObject = new Results(numberOfpressedKeys, numberOferrors, (selectedDurationInMinutes*60)-timeRemainingInSeconds-1, wrongTypedKeys);
                    resultsObject.setVisible(true);
                    //this.setVisible(false);
                    // Changing the boolian isIt to true, which will stop the timer.
                    timerStatus = true; 
                    
                } else if (timerStatus) {
                    
                    timer.cancel();
                    timerStatus = false;
                    
                }
            }
            
        };
     
        // timer.scheduleAtFixedRate(task, delay, period);    
        timer.scheduleAtFixedRate(task, 0, 1000); 
        
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

        setDefaultCloseOperation(javax.swing.WindowConstants.DO_NOTHING_ON_CLOSE);
        setTitle("Practice!");

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
                                .addComponent(secondLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 27, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(endButton, javax.swing.GroupLayout.PREFERRED_SIZE, 72, javax.swing.GroupLayout.PREFERRED_SIZE)))
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
                .addGap(18, 18, 18)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jScrollPane2, javax.swing.GroupLayout.DEFAULT_SIZE, 111, Short.MAX_VALUE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(endButton)
                .addGap(23, 23, 23))
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void endButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_endButtonActionPerformed

        Results resultsObject = new Results(numberOfpressedKeys, numberOferrors,(selectedDurationInMinutes*60)-timeRemainingInSeconds-1, wrongTypedKeys);
        resultsObject.setVisible(true);
        this.setVisible(false);
        // Changing the boolian isIt to true, which will stop the timer.
        timerStatus = true; 
        
    }//GEN-LAST:event_endButtonActionPerformed

    void cutUselessSpaces(){
        
        currentPosition++;
        char currentCh = origionalCodeTextArea.getText().charAt(currentPosition);

        while(currentCh == ' ' || currentCh == '\n'){
            currentPosition++;
            if (currentCh == ' ') {
                typedTextArea.setText(typedTextArea.getText() + " ");
                System.out.println("hi?");
            }
            else {
                typedTextArea.setText(typedTextArea.getText() + "\n");
                System.out.println("bye");
            }

            currentCh = origionalCodeTextArea.getText().charAt(currentPosition);
        }
    
    }
    
        private void typedTextAreaFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_typedTextAreaFocusGained

            // currentPosition holds the index of the letter to be typed 
            KeyListener listener = new KeyListener() {

                @Override
                public void keyPressed(KeyEvent event) {

                    //printEventInfo("Key Pressed", event); 
                    
                }

                @Override

                public void keyReleased (KeyEvent event) {
                    
                     printEventInfo("Key Released", event);
                    if (KeyEvent.getKeyText(event.getKeyCode()) == "Backspace") {
                        
                        if (currentPosition - 1 >= 0)
                            currentPosition--;
                            
                    } else if (KeyEvent.getKeyText(event.getKeyCode()) == "Shift") { 
                        
                        numberOfpressedKeys--;
                        
                    } else if ( event.getKeyChar() == origionalCodeTextArea.getText().charAt(currentPosition) 
                        &&  KeyEvent.getKeyText(event.getKeyCode()) == "Enter"){
                        
                        cutUselessSpaces();
                       
                    } else {
                        
                        if (event.getKeyChar() == origionalCodeTextArea.getText().charAt(currentPosition)) {
                            
                            // If the key typed is correct the text color becomes green
                            typedTextArea.setForeground(new Color(0, 128, 0));
                            currentPosition++;
                            
                        } else {
                            
                            playSound("error.wav");
                            typedTextArea.setForeground(Color.RED);
                            currentPosition++;
                            numberOferrors++;
 
                            // wrongKey holds the value of key typed incorrectly
                            String wrongKey = Character.toString(origionalCodeTextArea.getText().charAt(currentPosition - 1));
                            
                            if ( wrongTypedKeys.containsKey(wrongKey) ) { 
                                
                                wrongTypedKeys.put(wrongKey, new Integer(wrongTypedKeys.get(wrongKey) + 1));
                                
                            } 
                            else {
                                
                                wrongTypedKeys.put(wrongKey, new Integer(1));
                                
                            } 
                                
                        }
                        
                    }
                    
                    numberOfpressedKeys++;
                    // Change the scroll position 
                    origionalCodeTextArea.setCaretPosition(currentPosition);
                }

                @Override

                public void keyTyped (KeyEvent event) {
                    
                    // printEventInfo("Key Typed", event);
                    
                }


                private void printEventInfo (String str, KeyEvent e) {

                    System.out.println(str);
                    System.out.println("(" + e.getKeyChar() + "," + origionalCodeTextArea.getText().charAt(currentPosition));
                    System.out.println("   Char: " + e.getKeyChar());
                    // mode has the value if shift is pressed
                    int mods = e.getModifiersEx(); 
                    System.out.println("    Mods: " + KeyEvent.getModifiersExText(mods));

                };
            };

            typedTextArea.addKeyListener(listener);

        }//GEN-LAST:event_typedTextAreaFocusGained

        
        public void playSound(String soundFileName) {
            
            try {
                
                AudioInputStream audioInputStream = AudioSystem.getAudioInputStream(new File("sound\\"+soundFileName).getAbsoluteFile());
                Clip clip = AudioSystem.getClip();
                clip.open(audioInputStream);
                clip.start();
                
            }
            catch(Exception ex) {
                
                System.out.println("Error with playing sound.");
                ex.printStackTrace();
                
            }
        }
        
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
