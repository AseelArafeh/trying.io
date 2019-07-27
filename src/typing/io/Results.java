/*
    In 'Results frame', we show a user some statistics which reflects his/her performance.
    Statistics includes;
        - typing speed 'number of words per minutes'.
        - number of errors through the practice.
        - list of all errors (all error-ed characters with a counter for each).
*/

//// Aseel's comments 

package typing.io;

import java.util.Map;
import java.util.Set;

/**
 *
 * @author ghaid
 */

public class Results extends javax.swing.JFrame {

    public Results() {
        initComponents();
    }
    
    //// Here i override the constructor, to accept data from 'Practice' Frame.
    public Results(int nummberOfpressedKeys, int numberOferrors, int timeInSeconds, Map< String, Integer > wrongTypedKeys) {
        
        initComponents();
        
        //// Typing speed is measured in WpM (Word per Minute) 
        //// WpM is usually measured using a standard word length, which is 5 characters
        //// any keystroke is considered as a character... 
        //// so speed variable will calculated by the follwing equation.
        ////  speed =           ( number of standard words ) / (time spent in minutes)
                
        float speed = (float) ( ( nummberOfpressedKeys / 5.0 ) / (  timeInSeconds / 60.0 ) );
        //// 'speed and time' format needed is #.## 
        String speedWithTwoDigits = String.format("%.02f", speed);
        String timeInSecondsWithTwoDigits = String.format("%.02f", timeInSeconds / 60.0);
        
        // Showing the result
        NoOfWords.setText(speedWithTwoDigits.toString() + "  WPM");
        typedCharsNo.setText(Integer.toString(nummberOfpressedKeys));
        NoOfErrors.setText(String.valueOf(numberOferrors));
        
        
        // Printing list of Errors
        Set< Map.Entry< String,Integer> > wrongTypedKeysSet = wrongTypedKeys.entrySet();
        String ErrorList = "";
        
        for (Map.Entry< String, Integer> me:wrongTypedKeysSet) { 
            if(me.getKey().equals(" ") || me.getKey().equals("\n"))
                continue;
            
            Set< Map.Entry< String,Integer> > st = wrongTypedKeys.entrySet();
            System.out.print(me.getKey()+":"); 
            System.out.println(me.getValue()); 
            String currentError = String.format("   %s\t%c%-5d Times\n", me.getKey(), ':', me.getValue());
            ErrorList += (currentError);
       } 
        
        errorListTextArea.setText(ErrorList);
          
    } 
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        TypingSpeed = new javax.swing.JLabel();
        typedCharsNo = new javax.swing.JLabel();
        NumberOfErrors = new javax.swing.JLabel();
        NoOfErrors = new javax.swing.JLabel();
        jScrollPane2 = new javax.swing.JScrollPane();
        errorListTextArea = new javax.swing.JTextArea();
        typedChars = new javax.swing.JLabel();
        NoOfWords = new javax.swing.JLabel();

        setTitle("Results");

        TypingSpeed.setFont(new java.awt.Font("Sakkal Majalla", 0, 24)); // NOI18N
        TypingSpeed.setText("Typing Speed:");

        typedCharsNo.setFont(new java.awt.Font("Sakkal Majalla", 0, 24)); // NOI18N
        typedCharsNo.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        typedCharsNo.setText("typedChars");

        NumberOfErrors.setFont(new java.awt.Font("Sakkal Majalla", 0, 24)); // NOI18N
        NumberOfErrors.setText("Number of Errors:");

        NoOfErrors.setFont(new java.awt.Font("Sakkal Majalla", 0, 24)); // NOI18N
        NoOfErrors.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        NoOfErrors.setText("0");

        errorListTextArea.setEditable(false);
        errorListTextArea.setBackground(new java.awt.Color(240, 240, 240));
        errorListTextArea.setColumns(20);
        errorListTextArea.setRows(5);
        errorListTextArea.setBorder(javax.swing.BorderFactory.createTitledBorder("Errors List"));
        jScrollPane2.setViewportView(errorListTextArea);

        typedChars.setFont(new java.awt.Font("Sakkal Majalla", 0, 24)); // NOI18N
        typedChars.setText("No. of Typed Characters: ");

        NoOfWords.setFont(new java.awt.Font("Sakkal Majalla", 0, 24)); // NOI18N
        NoOfWords.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        NoOfWords.setText("NoW");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(27, 27, 27)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(typedChars)
                            .addComponent(NumberOfErrors, javax.swing.GroupLayout.PREFERRED_SIZE, 149, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(typedCharsNo, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 124, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(NoOfErrors, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 112, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(TypingSpeed, javax.swing.GroupLayout.PREFERRED_SIZE, 189, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(NoOfWords, javax.swing.GroupLayout.PREFERRED_SIZE, 124, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 344, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(39, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap(36, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(TypingSpeed, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(NoOfWords, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(typedChars, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(typedCharsNo, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(NumberOfErrors, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(NoOfErrors, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 30, Short.MAX_VALUE)
                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 132, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(33, 33, 33))
        );

        setSize(new java.awt.Dimension(426, 408));
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
        //</editor-fold>

        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Results().setVisible(true);
            }
        });
    }

    
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel NoOfErrors;
    private javax.swing.JLabel NoOfWords;
    private javax.swing.JLabel NumberOfErrors;
    private javax.swing.JLabel TypingSpeed;
    private javax.swing.JTextArea errorListTextArea;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JLabel typedChars;
    private javax.swing.JLabel typedCharsNo;
    // End of variables declaration//GEN-END:variables

    private void Syste(String string) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
}
