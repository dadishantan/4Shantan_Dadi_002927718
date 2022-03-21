
package ui;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import model.EncounterHistory;
import model.Patient;
import model.PatientDirectory;
import model.Person;
import model.PersonDirectory;
import javax.swing.table.DefaultTableModel;
import javax.swing.JOptionPane;

/**
 *
 * @author dadis
 */
public class PersonDirectoryJPanel extends javax.swing.JPanel {

    EncounterHistory encounterHistory;
    PersonDirectory personDirectory;
    PatientDirectory patientDirectory;
    public PersonDirectoryJPanel(EncounterHistory encounterHistory,PersonDirectory personDirectory,PatientDirectory patientDirectory) {
        initComponents();
        this.personDirectory = personDirectory;
        this.patientDirectory = patientDirectory;
        this.encounterHistory = encounterHistory;
        populateTable();
        communityList.addItem("Jamaica Plain");
        communityList.addItem("Roxbury");
        communityList.addItem("Downtown");
        communityList.setSelectedItem("");
        
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        lblLname = new javax.swing.JLabel();
        lblAge = new javax.swing.JLabel();
        lblCommunity = new javax.swing.JLabel();
        lblCity = new javax.swing.JLabel();
        lblHouse = new javax.swing.JLabel();
        inputLastName = new javax.swing.JTextField();
        inputAge = new javax.swing.JTextField();
        inputCity = new javax.swing.JTextField();
        inputHomeNumber = new javax.swing.JTextField();
        btnAdd = new javax.swing.JButton();
        inputFirstName = new javax.swing.JTextField();
        lblFname = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        tablePerson = new javax.swing.JTable();
        btnBookAppointment = new javax.swing.JButton();
        communityList = new javax.swing.JComboBox<>();
        btnEdit = new javax.swing.JButton();
        btnSaveEdit = new javax.swing.JButton();
        btnDelete = new javax.swing.JButton();
        jLabelFname = new javax.swing.JLabel();
        jLabelLname = new javax.swing.JLabel();
        jLabelAge = new javax.swing.JLabel();
        jLabelHouse = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();

        setBackground(new java.awt.Color(255, 204, 204));

        lblLname.setFont(new java.awt.Font("Lucida Grande", 1, 13)); // NOI18N
        lblLname.setText("Last Name");

        lblAge.setFont(new java.awt.Font("Lucida Grande", 1, 13)); // NOI18N
        lblAge.setText("Age");

        lblCommunity.setFont(new java.awt.Font("Lucida Grande", 1, 13)); // NOI18N
        lblCommunity.setText("Community");

        lblCity.setFont(new java.awt.Font("Lucida Grande", 1, 13)); // NOI18N
        lblCity.setText("City");

        lblHouse.setFont(new java.awt.Font("Lucida Grande", 1, 13)); // NOI18N
        lblHouse.setText("House No");

        inputLastName.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                inputLastNameKeyReleased(evt);
            }
        });

        inputAge.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                inputAgeKeyReleased(evt);
            }
        });

        inputCity.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                inputCityFocusGained(evt);
            }
        });
        inputCity.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                inputCityActionPerformed(evt);
            }
        });
        inputCity.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                inputCityKeyReleased(evt);
            }
        });

        inputHomeNumber.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                inputHomeNumberKeyReleased(evt);
            }
        });

        btnAdd.setBackground(new java.awt.Color(102, 255, 102));
        btnAdd.setFont(new java.awt.Font("Lucida Grande", 1, 13)); // NOI18N
        btnAdd.setText("Add");
        btnAdd.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAddActionPerformed(evt);
            }
        });

        inputFirstName.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                inputFirstNameKeyReleased(evt);
            }
        });

        lblFname.setFont(new java.awt.Font("Lucida Grande", 1, 13)); // NOI18N
        lblFname.setText("First Name");

        tablePerson.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null}
            },
            new String [] {
                "First Name", "Last Name", "Age", "City", "Community", "Home"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jScrollPane1.setViewportView(tablePerson);

        btnBookAppointment.setBackground(new java.awt.Color(102, 102, 255));
        btnBookAppointment.setFont(new java.awt.Font("Lucida Grande", 1, 13)); // NOI18N
        btnBookAppointment.setText("Book Appointment");
        btnBookAppointment.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnBookAppointmentActionPerformed(evt);
            }
        });

        communityList.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] {""}));
        communityList.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                communityListActionPerformed(evt);
            }
        });
        communityList.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                communityListKeyReleased(evt);
            }
        });

        btnEdit.setBackground(new java.awt.Color(51, 51, 255));
        btnEdit.setFont(new java.awt.Font("Lucida Grande", 1, 13)); // NOI18N
        btnEdit.setText("View");
        btnEdit.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnEditActionPerformed(evt);
            }
        });

        btnSaveEdit.setBackground(new java.awt.Color(153, 153, 255));
        btnSaveEdit.setFont(new java.awt.Font("Lucida Grande", 1, 13)); // NOI18N
        btnSaveEdit.setText("Edit");
        btnSaveEdit.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSaveEditActionPerformed(evt);
            }
        });

        btnDelete.setBackground(new java.awt.Color(102, 102, 255));
        btnDelete.setFont(new java.awt.Font("Lucida Grande", 1, 13)); // NOI18N
        btnDelete.setText("Delete");
        btnDelete.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnDeleteActionPerformed(evt);
            }
        });

        jLabelFname.setFont(new java.awt.Font("Lucida Grande", 2, 13)); // NOI18N
        jLabelFname.setForeground(new java.awt.Color(102, 102, 0));

        jLabelLname.setFont(new java.awt.Font("Lucida Grande", 2, 13)); // NOI18N
        jLabelLname.setForeground(new java.awt.Color(102, 102, 0));

        jLabelAge.setFont(new java.awt.Font("Lucida Grande", 2, 13)); // NOI18N
        jLabelAge.setForeground(new java.awt.Color(102, 102, 0));

        jLabelHouse.setFont(new java.awt.Font("Lucida Grande", 2, 13)); // NOI18N
        jLabelHouse.setForeground(new java.awt.Color(102, 102, 0));

        jLabel1.setFont(new java.awt.Font("Lucida Grande", 1, 18)); // NOI18N
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("PERSON DIRECTORY");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(lblAge)
                            .addComponent(lblCommunity, javax.swing.GroupLayout.Alignment.LEADING))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(inputAge, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(jLabelLname, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(communityList, javax.swing.GroupLayout.PREFERRED_SIZE, 166, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(jLabelAge, javax.swing.GroupLayout.PREFERRED_SIZE, 174, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addComponent(inputFirstName, javax.swing.GroupLayout.PREFERRED_SIZE, 103, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(0, 0, Short.MAX_VALUE)))
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(99, 99, 99)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(lblLname)
                                    .addComponent(lblCity))
                                .addGap(18, 18, 18))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(lblHouse)
                                .addGap(30, 30, 30)))
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(inputHomeNumber, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(inputCity, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(inputLastName, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addContainerGap(56, Short.MAX_VALUE))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(lblFname)
                                .addGap(9, 9, 9)
                                .addComponent(jLabelFname, javax.swing.GroupLayout.PREFERRED_SIZE, 165, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(jLabelHouse, javax.swing.GroupLayout.PREFERRED_SIZE, 179, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addContainerGap())))
            .addGroup(layout.createSequentialGroup()
                .addGap(77, 77, 77)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(97, 97, 97)
                        .addComponent(btnDelete)
                        .addGap(18, 18, 18)
                        .addComponent(btnEdit)
                        .addGap(26, 26, 26)
                        .addComponent(btnSaveEdit)
                        .addGap(34, 34, 34)
                        .addComponent(btnBookAppointment)
                        .addGap(123, 123, 123))
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 650, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(0, 0, Short.MAX_VALUE))
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(btnAdd, javax.swing.GroupLayout.PREFERRED_SIZE, 125, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(108, 108, 108))
        );

        layout.linkSize(javax.swing.SwingConstants.HORIZONTAL, new java.awt.Component[] {lblAge, lblCity, lblCommunity, lblHouse, lblLname});

        layout.linkSize(javax.swing.SwingConstants.HORIZONTAL, new java.awt.Component[] {btnDelete, btnEdit});

        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 28, Short.MAX_VALUE)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 115, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnBookAppointment)
                    .addComponent(btnEdit)
                    .addComponent(btnDelete)
                    .addComponent(btnSaveEdit))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 66, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(inputFirstName, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lblFname)
                    .addComponent(lblLname)
                    .addComponent(inputLastName, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(1, 1, 1)
                .addComponent(jLabelFname, javax.swing.GroupLayout.PREFERRED_SIZE, 12, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(28, 28, 28)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                        .addComponent(jLabelLname, javax.swing.GroupLayout.PREFERRED_SIZE, 14, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(lblAge)
                            .addComponent(inputAge, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(2, 2, 2)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(lblCity)
                            .addComponent(inputCity, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addGap(32, 32, 32)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabelAge, javax.swing.GroupLayout.PREFERRED_SIZE, 14, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(lblCommunity, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(communityList, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(lblHouse)
                        .addComponent(inputHomeNumber, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(59, 59, 59)
                .addComponent(btnAdd, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(8, 8, 8)
                .addComponent(jLabelHouse, javax.swing.GroupLayout.PREFERRED_SIZE, 15, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(65, 65, 65))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void btnAddActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAddActionPerformed

        if(inputFirstName.getText().isEmpty()||inputLastName.getText().isEmpty()||inputAge.getText().isEmpty()||inputCity.getText().isEmpty() 
          ||inputHomeNumber.getText().isEmpty()|| communityList.getSelectedItem().toString().isEmpty())
        {
            // == "" 
            JOptionPane.showMessageDialog(this, "One or more fields are blank please fill all fields"); 
            
        }
      
        else
        {
        Person p = new Person();
        p.setFirstName(inputFirstName.getText());
        p.setLastName(inputLastName.getText());
        p.setAge(Integer.parseInt(inputAge.getText()));
        p.setCity(inputCity.getText());
        p.setCommunity(communityList.getSelectedItem().toString());
        p.setHomeNo(Integer.parseInt(inputHomeNumber.getText()));
        this.personDirectory.addNewPerson(p);
        populateTable();
        JOptionPane.showMessageDialog(this, "Person Details Added Successfully");
        inputAge.setText("");
        inputFirstName.setText("");
        inputLastName.setText("");
        inputCity.setText("");
        inputHomeNumber.setText("");
        communityList.setSelectedItem("");
       
        }
    }//GEN-LAST:event_btnAddActionPerformed

    private void btnBookAppointmentActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnBookAppointmentActionPerformed
        
        int selectedRowIndex = tablePerson.getSelectedRow();
        DefaultTableModel model = (DefaultTableModel) tablePerson.getModel();
        Person p1 = (Person) model.getValueAt(selectedRowIndex , 0);
        boolean b = false;
        b = isExists(p1.getFirstName(), p1.getLastName(), p1.getAge());
        
        if(!b){
        Patient patient = new Patient();
        patient.setpId(getUniqueId());
        patient.setFirstName(p1.getFirstName());
        patient.setLastName(p1.getLastName());
        patient.setAge(p1.getAge());
        patient.setCity(p1.getCity());
        patient.setCommunity(p1.getCommunity());
        patient.setHome(p1.getHomeNo());
        patientDirectory.addPatient(patient);
        System.out.println(patient.getpId());
        JOptionPane.showMessageDialog(this, "Appointment Confirmed");
        }
        else{
            JOptionPane.showMessageDialog(this, "Appointment Confirmed");
        }
        
        
        
    }//GEN-LAST:event_btnBookAppointmentActionPerformed

    private void communityListActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_communityListActionPerformed
        // TODO add your handling code here:
       
    }//GEN-LAST:event_communityListActionPerformed

    private void btnEditActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnEditActionPerformed
        // TODO add your handling code here:
        
        int selectedRowIndex = tablePerson.getSelectedRow();
        DefaultTableModel model = (DefaultTableModel) tablePerson.getModel();
        System.out.println(model.getValueAt(selectedRowIndex, 0));
        Person person = (Person) model.getValueAt(selectedRowIndex , 0);
        inputFirstName.setText(person.getFirstName());
        inputLastName.setText(person.getLastName());
        inputAge.setText(String.valueOf(person.getAge()));
        inputCity.setText(person.getCity());
        inputHomeNumber.setText(String.valueOf(person.getHomeNo()));
        communityList.setSelectedItem(person.getCommunity());
        btnAdd.setEnabled(false);
       
        
        
    }//GEN-LAST:event_btnEditActionPerformed

    private void btnSaveEditActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSaveEditActionPerformed
        // TODO add your handling code here:
        if(inputAge.getText().isEmpty()||inputCity.getText().isEmpty()
          ||inputFirstName.getText().isEmpty()  || inputLastName.getText().isEmpty()
          ||inputHomeNumber.getText().isEmpty()|| communityList.getSelectedItem().toString()=="")
        {
            JOptionPane.showMessageDialog(this, "One or more fields are blank please check");
            
        }
        else
        {
        
        int selectedRowIndex = tablePerson.getSelectedRow();
        DefaultTableModel model = (DefaultTableModel) tablePerson.getModel();
        Person p = (Person) model.getValueAt(selectedRowIndex , 0);
        p.setFirstName(inputFirstName.getText());
        p.setLastName(inputLastName.getText());
        p.setAge(Integer.parseInt(inputAge.getText()));
        p.setCity(inputCity.getText());
        p.setCommunity(communityList.getSelectedItem().toString());
        p.setHomeNo(Integer.parseInt(inputHomeNumber.getText()));
        populateTable();
        JOptionPane.showMessageDialog(this, "Update Successful");
        inputFirstName.setText("");
        inputLastName.setText("");
        inputAge.setText("");      
        inputCity.setText("");
        communityList.setSelectedItem("");
        inputHomeNumber.setText("");
        btnAdd.setEnabled(true);
        
        }
        
    }//GEN-LAST:event_btnSaveEditActionPerformed

    private void btnDeleteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnDeleteActionPerformed
        // TODO add your handling code here:
        int selectedRowIndex = tablePerson.getSelectedRow();
        DefaultTableModel model = (DefaultTableModel) tablePerson.getModel();
        Person p = (Person) model.getValueAt(selectedRowIndex , 0);
        personDirectory.getPersonDirectory().remove(selectedRowIndex);
        populateTable();
        JOptionPane.showMessageDialog(this, "Record Delected Successfully!");
        
    }//GEN-LAST:event_btnDeleteActionPerformed

    private void inputFirstNameKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_inputFirstNameKeyReleased
        // TODO add your handling code here:
        String PATTERN = "^[a-zA-Z]{0,30}";
        Pattern pat = Pattern.compile(PATTERN);
        Matcher match = pat.matcher(inputFirstName.getText());
        if(!match.matches())
        {
            jLabelFname.setText("Insert only characters");
        }
        else
        {
            jLabelFname.setText("");
        }
    }//GEN-LAST:event_inputFirstNameKeyReleased

    private void inputLastNameKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_inputLastNameKeyReleased
        // TODO add your handling code here:
        String PATTERN = "^[a-zA-Z]{0,30}";
        Pattern pat = Pattern.compile(PATTERN);
        Matcher match = pat.matcher(inputLastName.getText());
        if(!match.matches()){
            jLabelLname.setText("Only Characters are allowed");
        }else{
            jLabelLname.setText("");
        }
    }//GEN-LAST:event_inputLastNameKeyReleased

    private void inputCityKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_inputCityKeyReleased
        // TODO add your handling code here:
    }//GEN-LAST:event_inputCityKeyReleased

    private void communityListKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_communityListKeyReleased
        // TODO add your handling code here:
        //String PATTERN = "^[0-9]{3}";
        
    }//GEN-LAST:event_communityListKeyReleased

    private void inputHomeNumberKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_inputHomeNumberKeyReleased
        // TODO add your handling code here:
         String PATTERN = "^[0-9]{0,3}";
        Pattern pat = Pattern.compile(PATTERN);
        Matcher match = pat.matcher(inputHomeNumber.getText());
        if(!match.matches()){
            jLabelHouse.setText("Only Numbers are allowed");
        }else{
            jLabelHouse.setText("");
        }
    }//GEN-LAST:event_inputHomeNumberKeyReleased

    private void inputAgeKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_inputAgeKeyReleased
        // TODO add your handling code here:
        String PATTERN = "^[0-9]{0,3}";
        Pattern pat = Pattern.compile(PATTERN);
        Matcher match = pat.matcher(inputAge.getText());
        if(!match.matches()){
            jLabelAge.setText("Only Numbers are allowed");
        }else{
            jLabelAge.setText("");
        }
    }//GEN-LAST:event_inputAgeKeyReleased

    private void inputCityActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_inputCityActionPerformed
        // TODO add your handling code here:
        inputCity.setText("BOSTON");
    }//GEN-LAST:event_inputCityActionPerformed

    private void inputCityFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_inputCityFocusGained
        // TODO add your handling code here:
        inputCity.setText("BOSTON");
    }//GEN-LAST:event_inputCityFocusGained


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnAdd;
    private javax.swing.JButton btnBookAppointment;
    private javax.swing.JButton btnDelete;
    private javax.swing.JButton btnEdit;
    private javax.swing.JButton btnSaveEdit;
    private javax.swing.JComboBox<String> communityList;
    private javax.swing.JTextField inputAge;
    private javax.swing.JTextField inputCity;
    private javax.swing.JTextField inputFirstName;
    private javax.swing.JTextField inputHomeNumber;
    private javax.swing.JTextField inputLastName;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabelAge;
    private javax.swing.JLabel jLabelFname;
    private javax.swing.JLabel jLabelHouse;
    private javax.swing.JLabel jLabelLname;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JLabel lblAge;
    private javax.swing.JLabel lblCity;
    private javax.swing.JLabel lblCommunity;
    private javax.swing.JLabel lblFname;
    private javax.swing.JLabel lblHouse;
    private javax.swing.JLabel lblLname;
    private javax.swing.JTable tablePerson;
    // End of variables declaration//GEN-END:variables

    private void populateTable() {
        DefaultTableModel model = (DefaultTableModel) tablePerson.getModel();
        model.setRowCount(0);
        for (Person person: personDirectory.getPersonDirectory()){
        Object[] row = new Object[6];
        row[0] = person;
        row[1] = person.getLastName();
        row[2] = person.getAge();
        row[3] = person.getCity();
        row[4] = person.getCommunity();
        row[5] = person.getHomeNo();
        model.addRow(row);
    }
}
    public static boolean isInteger(String s) {
    try { 
        Integer.parseInt(s); 
    } catch(NumberFormatException e) { 
        return false; 
    } catch(NullPointerException e) {
        return false;
    }
    // only got here if we didn't return false
    return true;
}

    private int getUniqueId() {
        
        int randomPIN = (int)(Math.random()*9000)+1000;
        for(Patient patient : patientDirectory.getPatientDirectory()){
            if(patient.getpId() == randomPIN){
            getUniqueId();
            }
        }
        return randomPIN;
    }

    private boolean isExists(String first, String last, int age) {
        boolean exists = false;
        for(Patient patient : patientDirectory.getPatientDirectory()){
        if(patient.getFirstName().equals(first) && (patient.getLastName()).equals(last) && (patient.getAge() == age)){
            exists = true;
        }
        }
        return exists;
    }
    
}

