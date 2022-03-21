/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ui;

import java.util.ArrayList;
import model.Encounter;
import model.EncounterHistory;
import model.Patient;
import model.PatientDirectory;
import model.Person;
import model.VitalSign;
import javax.swing.table.DefaultTableModel;
import javax.swing.JOptionPane;
import java.util.regex.Pattern;
import java.util.regex.Matcher;

/**
 *
 * @author dadis
 */
public class PatientDirectoryJPanel extends javax.swing.JPanel {

    PatientDirectory patientDirectory;
    PatientDirectory atRisk;
    EncounterHistory encounterHistory;
    EncounterHistory encounterRisk;
    
    public PatientDirectoryJPanel(PatientDirectory patientDirectory, EncounterHistory encounterHistory,PatientDirectory atRisk, EncounterHistory encounterRisk) {
        initComponents();
        this.patientDirectory = patientDirectory;
        this.encounterHistory = encounterHistory;
        this.encounterRisk = encounterRisk;
        this.atRisk = atRisk;
        populateTable();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jScrollPane1 = new javax.swing.JScrollPane();
        tablePatientDirectory = new javax.swing.JTable();
        lblSysPressure = new javax.swing.JLabel();
        lblDiasPressure = new javax.swing.JLabel();
        inputSPresure = new javax.swing.JTextField();
        inputDpressure = new javax.swing.JTextField();
        lblPatientID = new javax.swing.JLabel();
        inputLabel = new javax.swing.JLabel();
        btnSave = new javax.swing.JButton();
        btnAddVitals = new javax.swing.JButton();
        btnViewHistory = new javax.swing.JButton();
        jScrollPane2 = new javax.swing.JScrollPane();
        tablePatientHistory = new javax.swing.JTable();
        Serror = new javax.swing.JLabel();
        Herror = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        inputHR = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        inputO2 = new javax.swing.JTextField();
        SPerror = new javax.swing.JLabel();
        Derror = new javax.swing.JLabel();

        setBackground(new java.awt.Color(255, 204, 204));
        setForeground(new java.awt.Color(153, 255, 153));

        tablePatientDirectory.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null}
            },
            new String [] {
                "Patient ID", "First Name", "Last Name", "Age", "City", "Community", "House"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jScrollPane1.setViewportView(tablePatientDirectory);

        lblSysPressure.setFont(new java.awt.Font("Arial Black", 1, 14)); // NOI18N
        lblSysPressure.setText("Systolic Pressure");

        lblDiasPressure.setFont(new java.awt.Font("Arial Black", 1, 14)); // NOI18N
        lblDiasPressure.setText("Diastolic Pressure");

        inputSPresure.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                inputSPresureKeyReleased(evt);
            }
        });

        inputDpressure.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                inputDpressureKeyReleased(evt);
            }
        });

        lblPatientID.setFont(new java.awt.Font("Arial Black", 0, 14)); // NOI18N
        lblPatientID.setText("Patient ID");

        inputLabel.setFont(new java.awt.Font("Lucida Grande", 2, 13)); // NOI18N
        inputLabel.setForeground(new java.awt.Color(102, 102, 0));

        btnSave.setBackground(new java.awt.Color(20, 238, 20));
        btnSave.setFont(new java.awt.Font("Lucida Grande", 1, 13)); // NOI18N
        btnSave.setText("Save");
        btnSave.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSaveActionPerformed(evt);
            }
        });

        btnAddVitals.setBackground(new java.awt.Color(153, 153, 153));
        btnAddVitals.setFont(new java.awt.Font("Lucida Grande", 1, 13)); // NOI18N
        btnAddVitals.setText("Add Vitals");
        btnAddVitals.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAddVitalsActionPerformed(evt);
            }
        });

        btnViewHistory.setBackground(new java.awt.Color(147, 137, 137));
        btnViewHistory.setFont(new java.awt.Font("Lucida Grande", 1, 13)); // NOI18N
        btnViewHistory.setText("View");
        btnViewHistory.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnViewHistoryActionPerformed(evt);
            }
        });

        tablePatientHistory.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null}
            },
            new String [] {
                "Encounter No", "Systolic", "Diastolic", "Heart Ratell", "SPO2"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, true, true
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jScrollPane2.setViewportView(tablePatientHistory);

        Serror.setFont(new java.awt.Font("Arial", 2, 13)); // NOI18N
        Serror.setForeground(new java.awt.Color(102, 102, 0));

        Herror.setFont(new java.awt.Font("Arial", 2, 13)); // NOI18N
        Herror.setForeground(new java.awt.Color(102, 102, 0));
        Herror.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                HerrorKeyReleased(evt);
            }
        });

        jLabel2.setFont(new java.awt.Font("Lucida Grande", 1, 18)); // NOI18N
        jLabel2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel2.setText("PATIENT DIRECTORY");

        jLabel3.setFont(new java.awt.Font("Arial Black", 1, 14)); // NOI18N
        jLabel3.setText("Heart Rate");

        jLabel4.setFont(new java.awt.Font("Arial Black", 1, 14)); // NOI18N
        jLabel4.setText("SPO2 Level");

        SPerror.setFont(new java.awt.Font("Arial", 2, 13)); // NOI18N
        SPerror.setForeground(new java.awt.Color(102, 102, 0));
        SPerror.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                SPerrorKeyReleased(evt);
            }
        });

        Derror.setFont(new java.awt.Font("Arial", 2, 13)); // NOI18N
        Derror.setForeground(new java.awt.Color(102, 102, 0));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(btnViewHistory)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(btnAddVitals))
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 537, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 83, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 111, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(btnSave, javax.swing.GroupLayout.PREFERRED_SIZE, 109, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                    .addGroup(layout.createSequentialGroup()
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                                .addComponent(lblSysPressure)
                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED))
                                            .addGroup(layout.createSequentialGroup()
                                                .addComponent(lblPatientID)
                                                .addGap(12, 12, 12)))
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(inputLabel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                            .addComponent(inputSPresure, javax.swing.GroupLayout.DEFAULT_SIZE, 80, Short.MAX_VALUE)))
                                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                                        .addComponent(lblDiasPressure)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                        .addComponent(inputDpressure)))
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(inputO2, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 110, Short.MAX_VALUE)
                                    .addComponent(inputHR, javax.swing.GroupLayout.Alignment.TRAILING)))
                            .addGroup(layout.createSequentialGroup()
                                .addContainerGap()
                                .addComponent(Serror, javax.swing.GroupLayout.PREFERRED_SIZE, 247, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGap(88, 88, 88)
                        .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 306, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(47, Short.MAX_VALUE))
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addComponent(SPerror, javax.swing.GroupLayout.PREFERRED_SIZE, 243, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addComponent(jLabel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(Herror, javax.swing.GroupLayout.PREFERRED_SIZE, 253, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(Derror, javax.swing.GroupLayout.PREFERRED_SIZE, 209, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, Short.MAX_VALUE))))
        );

        layout.linkSize(javax.swing.SwingConstants.HORIZONTAL, new java.awt.Component[] {lblDiasPressure, lblPatientID, lblSysPressure});

        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel2)
                .addGap(32, 32, 32)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 145, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnAddVitals)
                    .addComponent(btnViewHistory))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblPatientID)
                    .addComponent(inputLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 16, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(lblSysPressure)
                            .addComponent(inputSPresure, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(Serror, javax.swing.GroupLayout.PREFERRED_SIZE, 27, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(inputDpressure, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(lblDiasPressure))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(Derror, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 131, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel3)
                    .addComponent(inputHR, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(Herror, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 11, Short.MAX_VALUE)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(inputO2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel4))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(SPerror, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(31, 31, 31))
                    .addGroup(layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(btnSave, javax.swing.GroupLayout.PREFERRED_SIZE, 65, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void btnAddVitalsActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAddVitalsActionPerformed
        // TODO add your handling code here:
        int selectedRowIndex = tablePatientDirectory.getSelectedRow();
        DefaultTableModel model = (DefaultTableModel) tablePatientDirectory.getModel();
        Patient p = (Patient) model.getValueAt(selectedRowIndex , 0); 
        inputLabel.setText(Integer.toString(p.getpId()));
    }//GEN-LAST:event_btnAddVitalsActionPerformed

    private void btnSaveActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSaveActionPerformed
        // TODO add your handling code here:
         if(inputDpressure.getText().isEmpty()|| inputHR.getText().isEmpty() 
                || inputSPresure.getText().isEmpty()|| inputO2.getText().isEmpty()){
              JOptionPane.showMessageDialog(this, "One or more feilds are blank please check");

        }
        else{

        int selectedRowIndex = tablePatientDirectory.getSelectedRow();
        DefaultTableModel model = (DefaultTableModel) tablePatientDirectory.getModel();
        Patient p = (Patient) model.getValueAt(selectedRowIndex , 0);
        VitalSign vs = new VitalSign();
        Encounter e = new Encounter();
        vs.setHeartRate(Double.parseDouble(inputHR.getText()));
        vs.setSPO2(Double.parseDouble(inputO2.getText()));
        vs.setDiastole(Double.parseDouble(inputDpressure.getText()));
        vs.setSystole(Double.parseDouble(inputSPresure.getText()));
        
        
        boolean check;
        int encounterNumber = 0;
        check = isPresent(p.getpId());
        if(check)
        {
        encounterNumber =  getEncNo(p.getpId());
            e.setEncounterNumber(encounterNumber+1);
        }
        else
        {
            e.setEncounterNumber(1);
        }
        
        e.setPatientEncounterId(p.getpId());
        e.addVitalSign(vs);
        encounterHistory.addEncounterInList(e);
        
        boolean isNormal;
        isNormal = checkVitals(p.getAge(), vs.getSystole(),vs.getDiastole(),vs.getHeartRate(), vs.getSPO2());
        
        if (!isNormal){
            atRisk.addPatient(p);
            encounterRisk.addEncounterInList(e);
        
        }
         JOptionPane.showMessageDialog(this, "Vitals Added!");
         inputLabel.setText("");
         inputDpressure.setText("");
         inputSPresure.setText("");
       }
    }//GEN-LAST:event_btnSaveActionPerformed

    private void btnViewHistoryActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnViewHistoryActionPerformed
        // TODO add your handling code here:
        
       
        int selectedRowIndex = tablePatientDirectory.getSelectedRow();
        DefaultTableModel model = (DefaultTableModel) tablePatientDirectory.getModel();
        Patient patient = (Patient) model.getValueAt(selectedRowIndex , 0);
        DefaultTableModel tblPatientHistoryModel = (DefaultTableModel) tablePatientHistory.getModel();
        tblPatientHistoryModel.setRowCount(0);
        //get filtered data
        ArrayList<Encounter> encounterList = searchFilter(patient.getpId());
        
        //eoc
        //for(Encounter encounter : encounterHistory.getEncounterHistoryList()){
        for(Encounter encounter : encounterList){    
            Object[] row = new Object[5];
            row[0] = encounter.getEncounterNumber();
            VitalSign vitalSign = encounter.getVSList().get(0);
            row[1] = vitalSign.getSystole();
            row[2] = vitalSign.getDiastole();
            row[3] = vitalSign.getHeartRate();
            row[4] = vitalSign.getSPO2();
            tblPatientHistoryModel.addRow(row);
        }
        
        
    }//GEN-LAST:event_btnViewHistoryActionPerformed

    private void inputSPresureKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_inputSPresureKeyReleased
        // TODO add your handling code here:
         String PATTERN = "^[0-9]{2,3}";
        Pattern pat = Pattern.compile(PATTERN);
        Matcher match = pat.matcher(inputSPresure.getText());
        if(!match.matches()){
            Serror.setText("Please enter 3 to 2 digits");
        }else{
            Serror.setText("");
        }
    }//GEN-LAST:event_inputSPresureKeyReleased

    private void inputDpressureKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_inputDpressureKeyReleased
        // TODO add your handling code here:
         String PATTERN = "^[0-9]{2}";
        Pattern pat = Pattern.compile(PATTERN);
        Matcher match = pat.matcher(inputDpressure.getText());
        if(!match.matches()){
            Derror.setText("please enter 2digits");
        }else{
            Derror.setText("");
        }
    }//GEN-LAST:event_inputDpressureKeyReleased

    private void HerrorKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_HerrorKeyReleased
        // TODO add your handling code here:
          String PATTERN = "^[0-9]{2,3}";
        Pattern pat = Pattern.compile(PATTERN);
        Matcher match = pat.matcher(Herror.getText());
        if(!match.matches()){
            Herror.setText("Please enter 3 to 2 digits");
        }else{
            Herror.setText("");
        }
    }//GEN-LAST:event_HerrorKeyReleased

    private void SPerrorKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_SPerrorKeyReleased
        // TODO add your handling code here:
         String PATTERN = "^[0-9]{2,3}";
        Pattern pat = Pattern.compile(PATTERN);
        Matcher match = pat.matcher(SPerror.getText());
        if(!match.matches()){
            SPerror.setText("Please enter 3 to 2 digits");
        }else{
            SPerror.setText("");
    }//GEN-LAST:event_SPerrorKeyReleased
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel Derror;
    private javax.swing.JLabel Herror;
    private javax.swing.JLabel SPerror;
    private javax.swing.JLabel Serror;
    private javax.swing.JButton btnAddVitals;
    private javax.swing.JButton btnSave;
    private javax.swing.JButton btnViewHistory;
    private javax.swing.JTextField inputDpressure;
    private javax.swing.JTextField inputHR;
    private javax.swing.JLabel inputLabel;
    private javax.swing.JTextField inputO2;
    private javax.swing.JTextField inputSPresure;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JLabel lblDiasPressure;
    private javax.swing.JLabel lblPatientID;
    private javax.swing.JLabel lblSysPressure;
    private javax.swing.JTable tablePatientDirectory;
    private javax.swing.JTable tablePatientHistory;
    // End of variables declaration//GEN-END:variables

    private void populateTable() {
        DefaultTableModel model = (DefaultTableModel) tablePatientDirectory.getModel();
        model.setRowCount(0);
        for (Patient patient: patientDirectory.getPatientDirectory()){
        Object[] row = new Object[7];
        row[0] = patient;
        row[1] = patient.getFirstName();
        row[2] = patient.getLastName();
        row[3] = patient.getAge();
        row[4] = patient.getCity();
        row[5] = patient.getCommunity();
        row[6] = patient.getHome();
        model.addRow(row);
    }
}



    private int getEncNo(int pId) {
        ArrayList<Encounter> encounterList = new ArrayList<Encounter>();
        for(Encounter e : encounterHistory.getEncounterHistoryList()){
        if(e.getPatientEncounterId() == pId){
        encounterList.add(e);
            }
        }
        
        Encounter encounter = encounterList.get(encounterList.size()-1);
        return encounter.getEncounterNumber();
            
    }

    private ArrayList<Encounter> searchFilter(int patientId) {
        ArrayList<Encounter> result = new ArrayList<Encounter>();
        for(Encounter enc : encounterHistory.getEncounterHistoryList()){
        if(enc.getPatientEncounterId() == patientId){
        result.add(enc);
            }
        }
        return result;
        
    }

    private boolean checkVitals(int patAge, double Systolic, double Diastolic, double HeartRate, double OxygenLevels) 
    {
        boolean vitals = false;
        if(patAge <= 40){
            if((Systolic<= 135 && Systolic>=95) && (Diastolic <= 80 && Diastolic>=60) && (HeartRate<=45 && HeartRate>=100) && (OxygenLevels < 92))
            {
            vitals = true;
            }
            else{
            vitals = false;
            }
            
        }
        else if (patAge >= 41 && patAge <= 100){
            if((Systolic<= 145 && Systolic>=110) && (Diastolic <= 90 && Diastolic>=70)&& (HeartRate<=50 && HeartRate>=120) && (OxygenLevels < 92))
                    {
            vitals=  true;
            }
            else{
            vitals = false;
            }
        }
        return vitals;
        
    }
    
        private boolean isPresent(int pId) 
        {
        boolean isPresent = false;
        for(Encounter encounter : encounterHistory.getEncounterHistoryList()){
        if(encounter.getPatientEncounterId() == pId){
            isPresent = true;
        }
        else{
            isPresent = false;
        }
        }
       return isPresent;
    }
}
