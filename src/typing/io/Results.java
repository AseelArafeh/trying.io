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
        float speed = (float) ( ( nummberOfpressedKeys/5.0 ) / (  timeInSeconds/60.0 ) );
        //// 'speed and time' format needed is #.## 
        String speedWithTwoDigits = String.format("%.02f", speed);
        String timeInSecondsWithTwoDigits = String.format("%.02f", timeInSeconds/60.0);
        //// set the speed to NoOfWords text field, after converting float data type to String.
        NoOfWords.setText(speedWithTwoDigits);
        //// set the time to timeSelected text field, after convert seconds to minutes 
        timeSelected.setText(timeInSecondsWithTwoDigits);
        //// set the number of errors to NoOfErrors text field.
        NoOfErrors.setText(String.valueOf(numberOferrors));
        
        
        // Implementing the list of charcters.
        Set< Map.Entry< String,Integer> > wrongTypedKeysSet = wrongTypedKeys.entrySet();
        
        String ErrorList = "";
        
        for (Map.Entry< String, Integer> me:wrongTypedKeysSet) { 
           Set< Map.Entry< String,Integer> > st = wrongTypedKeys.entrySet();
           System.out.print(me.getKey()+":"); 
           System.out.println(me.getValue()); 
           ErrorList += ("    " + me.getKey() + ":    " + me.getValue() + "    Times" + "\n");
       } 
        
        errorListTextArea.setText(ErrorList);
        
        
    } 
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        TypingSpeed = new javax.swing.JLabel();
        NoOfWords = new javax.swing.JLabel();
        per = new javax.swing.JLabel();
        timeSelected = new javax.swing.JLabel();
        NumberOfErrors = new javax.swing.JLabel();
        NoOfErrors = new javax.swing.JLabel();
        jScrollPane2 = new javax.swing.JScrollPane();
        errorListTextArea = new javax.swing.JTextArea();

        TypingSpeed.setText("Typing Speed:");

        NoOfWords.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        NoOfWords.setText("NoW");

        per.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        per.setText("per");

        timeSelected.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        timeSelected.setText("minute");

        NumberOfErrors.setText("Number of Errors:");

        NoOfErrors.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        NoOfErrors.setText("0");

        errorListTextArea.setEditable(false);
        errorListTextArea.setBackground(new java.awt.Color(240, 240, 240));
        errorListTextArea.setColumns(20);
        errorListTextArea.setRows(5);
        errorListTextArea.setBorder(javax.swing.BorderFactory.createTitledBorder("Errors List"));
        jScrollPane2.setViewportView(errorListTextArea);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(27, 27, 27)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(TypingSpeed, javax.swing.GroupLayout.PREFERRED_SIZE, 83, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(NoOfWords, javax.swing.GroupLayout.PREFERRED_SIZE, 48, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(28, 28, 28)
                        .addComponent(per, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(timeSelected, javax.swing.GroupLayout.PREFERRED_SIZE, 59, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(NumberOfErrors, javax.swing.GroupLayout.PREFERRED_SIZE, 102, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(NoOfErrors, javax.swing.GroupLayout.PREFERRED_SIZE, 75, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(19, 19, 19)
                        .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 230, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(43, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(37, 37, 37)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(TypingSpeed, javax.swing.GroupLayout.DEFAULT_SIZE, 40, Short.MAX_VALUE)
                    .addComponent(NoOfWords, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(per, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(timeSelected, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(NumberOfErrors, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(NoOfErrors, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(42, 42, 42)
                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 132, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(34, 34, 34))
        );

        setSize(new java.awt.Dimension(344, 376));
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
    private javax.swing.JLabel per;
    private javax.swing.JLabel timeSelected;
    // End of variables declaration//GEN-END:variables
}
