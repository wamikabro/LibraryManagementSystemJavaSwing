package libraryManagementSystemPro;

import Project.ConnectionProvider;
import java.sql.*;
import javax.swing.JOptionPane;
/**
 *
 * @author Wamique
 */
public class NewStudent extends javax.swing.JFrame {

    /**
     * Creates new form NewStudent
     */
    
    private Home homeFrame;
    
    public NewStudent(Home NewStudent) {
        initComponents();
        this.homeFrame = NewStudent;
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        studentIDField = new javax.swing.JTextField();
        nameField = new javax.swing.JTextField();
        fatherNameField = new javax.swing.JTextField();
        cancelButton = new javax.swing.JButton();
        submitButton = new javax.swing.JButton();
        programComboBox = new javax.swing.JComboBox<>();
        desciplineComboBox = new javax.swing.JComboBox<>();
        jLabel1 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setLocation(new java.awt.Point(325, 125));
        setUndecorated(true);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel2.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 255, 255));
        jLabel2.setText("Student ID");
        getContentPane().add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 100, -1, -1));

        jLabel3.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(255, 255, 255));
        jLabel3.setText("Father Name");
        getContentPane().add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 170, -1, -1));

        jLabel4.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(255, 255, 255));
        jLabel4.setText("Name");
        getContentPane().add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 130, -1, -1));

        jLabel5.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(255, 255, 255));
        jLabel5.setText("Program");
        getContentPane().add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 210, -1, -1));

        jLabel6.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(255, 255, 255));
        jLabel6.setText("Descipline");
        getContentPane().add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 260, -1, -1));
        getContentPane().add(studentIDField, new org.netbeans.lib.awtextra.AbsoluteConstraints(240, 100, 266, -1));
        getContentPane().add(nameField, new org.netbeans.lib.awtextra.AbsoluteConstraints(240, 130, 266, -1));
        getContentPane().add(fatherNameField, new org.netbeans.lib.awtextra.AbsoluteConstraints(240, 170, 266, -1));

        cancelButton.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        cancelButton.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Icons/X.png"))); // NOI18N
        cancelButton.setText("Cancel");
        cancelButton.setFocusable(false);
        cancelButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cancelButtonActionPerformed(evt);
            }
        });
        getContentPane().add(cancelButton, new org.netbeans.lib.awtextra.AbsoluteConstraints(400, 300, -1, -1));

        submitButton.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        submitButton.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Icons/Save.png"))); // NOI18N
        submitButton.setText("Submit");
        submitButton.setFocusable(false);
        submitButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                submitButtonActionPerformed(evt);
            }
        });
        getContentPane().add(submitButton, new org.netbeans.lib.awtextra.AbsoluteConstraints(240, 300, -1, -1));

        programComboBox.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        programComboBox.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Bachelors", "Masters", "M.Phil", "PhD." }));
        programComboBox.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                programComboBoxActionPerformed(evt);
            }
        });
        getContentPane().add(programComboBox, new org.netbeans.lib.awtextra.AbsoluteConstraints(240, 210, 266, -1));

        desciplineComboBox.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        desciplineComboBox.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Software Engineering", "Computer Science", "Information Technology", "Data Science ", "Business Administration", "Chemistry", "English" }));
        getContentPane().add(desciplineComboBox, new org.netbeans.lib.awtextra.AbsoluteConstraints(240, 250, 266, -1));

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Icons/Panel.png"))); // NOI18N
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, -1, -1));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void cancelButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cancelButtonActionPerformed
        homeFrame.setEnabled(true);
        setVisible(false);
    }//GEN-LAST:event_cancelButtonActionPerformed

    private void programComboBoxActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_programComboBoxActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_programComboBoxActionPerformed

    private void submitButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_submitButtonActionPerformed
        String studentID = studentIDField.getText();
        String Name = nameField.getText();
        String fatherName = fatherNameField.getText();
        String Program = (String) programComboBox.getSelectedItem();
        String Descipline = (String) desciplineComboBox.getSelectedItem();
        
        try{
            Connection conn = ConnectionProvider.getCon();
            Statement statement = conn.createStatement();
            statement.executeUpdate("INSERT INTO student VALUES('"+studentID+"','"+Name+"','"+fatherName+"','"+Program+"','"+Descipline+"')");      
            JOptionPane.showMessageDialog(null, "Student Added Successfully", "Successful", JOptionPane.INFORMATION_MESSAGE);
        }catch(Exception e){
            JOptionPane.showMessageDialog(null, "Student ID Already Exists.", "Unsuccessful", JOptionPane.ERROR_MESSAGE);
        }
        
        
    }//GEN-LAST:event_submitButtonActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton cancelButton;
    private javax.swing.JComboBox<String> desciplineComboBox;
    private javax.swing.JTextField fatherNameField;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JTextField nameField;
    private javax.swing.JComboBox<String> programComboBox;
    private javax.swing.JTextField studentIDField;
    private javax.swing.JButton submitButton;
    // End of variables declaration//GEN-END:variables
}
