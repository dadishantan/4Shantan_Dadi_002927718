/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ui;

import java.io.BufferedReader;
import java.io.IOException;
import java.nio.charset.StandardCharsets;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import model.EncounterHistory;
import model.Person;
import model.PersonDirectory;
import model.Patient;
import model.PatientDirectory;

/**
 *
 * @author dadis
 */
public class MainJframe extends javax.swing.JFrame {

    /**
     * Creates new form MainJframe
     */
    PersonDirectory personDirectory;
    PatientDirectory patientDirectory;
    EncounterHistory encounterHistory;
    PatientDirectory abnormalPatients;
    EncounterHistory abnormalEncounters;
    public MainJframe() {
        initComponents();
        
       
        patientDirectory = new PatientDirectory();
        encounterHistory = new EncounterHistory();
        abnormalPatients = new PatientDirectory();
        abnormalEncounters = new EncounterHistory();
        personDirectory = readCSV();
    }


    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        SplitPanel = new javax.swing.JSplitPane();
        ControlArea = new javax.swing.JPanel();
        btnPersonDirectory = new javax.swing.JButton();
        btnPatientDirectory = new javax.swing.JButton();
        btnAbnormalCases = new javax.swing.JButton();
        WorkArea = new javax.swing.JPanel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        ControlArea.setBackground(new java.awt.Color(51, 51, 0));
        ControlArea.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));

        btnPersonDirectory.setBackground(new java.awt.Color(153, 255, 255));
        btnPersonDirectory.setFont(new java.awt.Font("Lucida Grande", 1, 14)); // NOI18N
        btnPersonDirectory.setText("Person Directory");
        btnPersonDirectory.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnPersonDirectoryActionPerformed(evt);
            }
        });

        btnPatientDirectory.setBackground(new java.awt.Color(153, 255, 153));
        btnPatientDirectory.setFont(new java.awt.Font("Lucida Grande", 1, 14)); // NOI18N
        btnPatientDirectory.setText("Patient Directory");
        btnPatientDirectory.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnPatientDirectoryActionPerformed(evt);
            }
        });

        btnAbnormalCases.setBackground(new java.awt.Color(255, 51, 51));
        btnAbnormalCases.setFont(new java.awt.Font("Lucida Grande", 1, 14)); // NOI18N
        btnAbnormalCases.setText("View Abnormal Cases");
        btnAbnormalCases.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAbnormalCasesActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout ControlAreaLayout = new javax.swing.GroupLayout(ControlArea);
        ControlArea.setLayout(ControlAreaLayout);
        ControlAreaLayout.setHorizontalGroup(
            ControlAreaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(ControlAreaLayout.createSequentialGroup()
                .addGroup(ControlAreaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(btnPersonDirectory, javax.swing.GroupLayout.PREFERRED_SIZE, 114, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnPatientDirectory)
                    .addComponent(btnAbnormalCases))
                .addGap(0, 0, Short.MAX_VALUE))
        );

        ControlAreaLayout.linkSize(javax.swing.SwingConstants.HORIZONTAL, new java.awt.Component[] {btnAbnormalCases, btnPatientDirectory, btnPersonDirectory});

        ControlAreaLayout.setVerticalGroup(
            ControlAreaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(ControlAreaLayout.createSequentialGroup()
                .addGap(36, 36, 36)
                .addComponent(btnPersonDirectory, javax.swing.GroupLayout.PREFERRED_SIZE, 130, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(52, 52, 52)
                .addComponent(btnPatientDirectory, javax.swing.GroupLayout.PREFERRED_SIZE, 130, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(65, 65, 65)
                .addComponent(btnAbnormalCases, javax.swing.GroupLayout.PREFERRED_SIZE, 130, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(37, Short.MAX_VALUE))
        );

        SplitPanel.setLeftComponent(ControlArea);

        WorkArea.setBackground(new java.awt.Color(153, 153, 255));
        WorkArea.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));

        javax.swing.GroupLayout WorkAreaLayout = new javax.swing.GroupLayout(WorkArea);
        WorkArea.setLayout(WorkAreaLayout);
        WorkAreaLayout.setHorizontalGroup(
            WorkAreaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 726, Short.MAX_VALUE)
        );
        WorkAreaLayout.setVerticalGroup(
            WorkAreaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 580, Short.MAX_VALUE)
        );

        SplitPanel.setRightComponent(WorkArea);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(SplitPanel))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(SplitPanel)
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnPersonDirectoryActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnPersonDirectoryActionPerformed
        // TODO add your handling code here:
        PersonDirectoryJPanel viewDirectory = new PersonDirectoryJPanel(encounterHistory,personDirectory,patientDirectory);
        SplitPanel.setRightComponent(viewDirectory);
    }//GEN-LAST:event_btnPersonDirectoryActionPerformed

    private void btnPatientDirectoryActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnPatientDirectoryActionPerformed
        // TODO add your handling code here:
        PatientDirectoryJPanel viewPatDirectory = new PatientDirectoryJPanel(patientDirectory, encounterHistory,abnormalPatients,abnormalEncounters);
        SplitPanel.setRightComponent(viewPatDirectory);
    }//GEN-LAST:event_btnPatientDirectoryActionPerformed

    private void btnAbnormalCasesActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAbnormalCasesActionPerformed
        // TODO add your handling code here:
        AbnormalJPanel abnormalCases = new AbnormalJPanel(abnormalPatients,abnormalEncounters,personDirectory);
        SplitPanel.setRightComponent(abnormalCases);
    }//GEN-LAST:event_btnAbnormalCasesActionPerformed

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(MainJframe.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(MainJframe.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(MainJframe.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(MainJframe.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new MainJframe().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel ControlArea;
    private javax.swing.JSplitPane SplitPanel;
    private javax.swing.JPanel WorkArea;
    private javax.swing.JButton btnAbnormalCases;
    private javax.swing.JButton btnPatientDirectory;
    private javax.swing.JButton btnPersonDirectory;
    // End of variables declaration//GEN-END:variables

   

    private Person addPerson(String[] attributes) {
        Person person = new Person();
        person.setFirstName(attributes[0]);
        person.setLastName(attributes[1]);
        person.setAge(Integer.parseInt(attributes[2]));
        person.setCity(attributes[3]);
        person.setCommunity(attributes[4]);
        person.setHomeNo(Integer.parseInt(attributes[5]));
        return person;
    }
    
    
     private PersonDirectory readCSV() 
     {
       PersonDirectory csvData = new PersonDirectory();
        Path pathToFile = Paths.get("DATA.csv");
        try(BufferedReader br = Files.newBufferedReader(pathToFile,StandardCharsets.US_ASCII)){
            String line = br.readLine();
            while(line!= null){
            String[] var = line.split(",");
            Person person = addPerson(var);
            csvData.addNewPerson(person);
            line = br.readLine();
            
            }
        }catch(IOException ioe){
        ioe.printStackTrace();
        }
        return csvData;
    }
}
