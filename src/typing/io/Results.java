/*
    In 'Results frame', we show a user some statistics which reflects his/her performance.
    Statistics includes;
        - typing speed 'number of words per minutes'.
        - number of errors through the practice.
        - list of all errors (all error-ed characters with a counter for each).


    (*) Typing speed is measured in WpM (Word per Minute). 
    (*) WpM is usually measured using a standard word length, which is 5 characters.  
*/

package typing.io;

import java.util.Map;
import java.util.Set;


public class Results extends javax.swing.JFrame {

    public Results(int numberOfCorrectKeystroke, int numberOferrors, int timeInSeconds, Map< String, Integer > wrongTypedKeys) {
        
        initComponents();             
        int speed = (int) ( ( numberOfCorrectKeystroke / 5.0 ) / (  timeInSeconds / 60.0 ) );
        
        // Showing the result
        noOfWords.setText(speed + "  WPM");
        typedCharsNo.setText(Integer.toString(numberOfCorrectKeystroke));
        noOfErrors.setText(String.valueOf(numberOferrors));
           
        // Printing list of Errors
        Set< Map.Entry< String,Integer> > wrongTypedKeysSet = wrongTypedKeys.entrySet();
        String ErrorList = "";
        
        for (Map.Entry< String, Integer> me:wrongTypedKeysSet) { 
            if ( me.getKey().equals(" ")  ){
                String currentError = String.format("       %s\t%c %-5d %s\n", "Space", ':', me.getValue(), me.getValue() == 1 ? "Time" : "Times");
                ErrorList += (currentError);
                continue;
            } else if ( me.getKey().equals("\n")) {
                String currentError = String.format("       %s\t%c %-5d %s\n", "Enter", ':', me.getValue(), me.getValue() == 1 ? "Time" : "Times");
                ErrorList += (currentError);
                continue;
            }
            
            Set< Map.Entry< String,Integer> > st = wrongTypedKeys.entrySet();
            String currentError = String.format("       %s\t%c %-5d %s\n", me.getKey(), ':', me.getValue(), me.getValue() == 1 ? "Time" : "Times");
            ErrorList += (currentError);
        } 
        
        errorListTextArea.setText(ErrorList);
          
    } 
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        typingSpeed = new javax.swing.JLabel();
        typedCharsNo = new javax.swing.JLabel();
        numberOfErrors = new javax.swing.JLabel();
        noOfErrors = new javax.swing.JLabel();
        jScrollPane2 = new javax.swing.JScrollPane();
        errorListTextArea = new javax.swing.JTextArea();
        typedChars = new javax.swing.JLabel();
        noOfWords = new javax.swing.JLabel();
        practiceResultTitle = new javax.swing.JLabel();

        setTitle("Results");

        typingSpeed.setFont(new java.awt.Font("Sakkal Majalla", 0, 24)); // NOI18N
        typingSpeed.setText("Typing Speed:");

        typedCharsNo.setFont(new java.awt.Font("Sakkal Majalla", 0, 24)); // NOI18N
        typedCharsNo.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        typedCharsNo.setText("typedChars");

        numberOfErrors.setFont(new java.awt.Font("Sakkal Majalla", 0, 24)); // NOI18N
        numberOfErrors.setText("Number of Errors:");

        noOfErrors.setFont(new java.awt.Font("Sakkal Majalla", 0, 24)); // NOI18N
        noOfErrors.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        noOfErrors.setText("0");

        errorListTextArea.setEditable(false);
        errorListTextArea.setBackground(new java.awt.Color(240, 240, 240));
        errorListTextArea.setColumns(20);
        errorListTextArea.setFont(new java.awt.Font("Sakkal Majalla", 0, 24)); // NOI18N
        errorListTextArea.setRows(5);
        errorListTextArea.setTabSize(7);
        errorListTextArea.setBorder(javax.swing.BorderFactory.createTitledBorder("Errors List"));
        jScrollPane2.setViewportView(errorListTextArea);

        typedChars.setFont(new java.awt.Font("Sakkal Majalla", 0, 24)); // NOI18N
        typedChars.setText("No. of Typed Characters: ");

        noOfWords.setFont(new java.awt.Font("Sakkal Majalla", 0, 24)); // NOI18N
        noOfWords.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        noOfWords.setText("NoW");

        practiceResultTitle.setFont(new java.awt.Font("Tahoma", 1, 36)); // NOI18N
        practiceResultTitle.setForeground(new java.awt.Color(153, 0, 153));
        practiceResultTitle.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        practiceResultTitle.setText("Practice Result");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(175, 175, 175)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                        .addComponent(typedChars)
                        .addComponent(typingSpeed, javax.swing.GroupLayout.PREFERRED_SIZE, 189, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(numberOfErrors, javax.swing.GroupLayout.PREFERRED_SIZE, 149, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(70, 70, 70)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(noOfWords, javax.swing.GroupLayout.PREFERRED_SIZE, 124, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(typedCharsNo, javax.swing.GroupLayout.PREFERRED_SIZE, 124, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(noOfErrors, javax.swing.GroupLayout.PREFERRED_SIZE, 112, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(223, Short.MAX_VALUE))
            .addGroup(layout.createSequentialGroup()
                .addGap(227, 227, 227)
                .addComponent(practiceResultTitle, javax.swing.GroupLayout.PREFERRED_SIZE, 307, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 507, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(61, 61, 61)
                .addComponent(practiceResultTitle, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 70, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(typingSpeed, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(noOfWords, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(typedChars, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(typedCharsNo, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(noOfErrors, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(numberOfErrors, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(38, 38, 38)
                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(28, 28, 28))
        );

        setSize(new java.awt.Dimension(797, 623));
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    public static void main(String args[]) {
        
        try {
            
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                
                if ("Nimbus".equals(info.getName())) {
                    
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                    
                }
            }
        } catch (ClassNotFoundException ex) {
            
            java.util.logging.Logger.getLogger(Results.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
            
        } catch (InstantiationException ex) {
            
            java.util.logging.Logger.getLogger(Results.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
            
        } catch (IllegalAccessException ex) {
            
            java.util.logging.Logger.getLogger(Results.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
            
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            
            java.util.logging.Logger.getLogger(Results.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
            
        }

        java.awt.EventQueue.invokeLater(new Runnable() {
            
            public void run() {
                new Results(0, 0, 0, null).setVisible(true);
            }
            
        });
        
    }

    
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextArea errorListTextArea;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JLabel noOfErrors;
    private javax.swing.JLabel noOfWords;
    private javax.swing.JLabel numberOfErrors;
    private javax.swing.JLabel practiceResultTitle;
    private javax.swing.JLabel typedChars;
    private javax.swing.JLabel typedCharsNo;
    private javax.swing.JLabel typingSpeed;
    // End of variables declaration//GEN-END:variables

    private void Syste(String string) {
        
        // To change body of generated methods, choose Tools | Templates.
        throw new UnsupportedOperationException("Not supported yet."); 
    
    }
}
