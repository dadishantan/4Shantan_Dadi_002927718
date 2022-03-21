
package model;
import java.util.ArrayList;

/**
 *
 * @author dadis
 */
public class PatientDirectory 
{
    private ArrayList<Patient> patientDirectory;
    
    public PatientDirectory()
    {
    patientDirectory = new ArrayList<>();
    }
    public void addPatient(Patient patient)
    {
    patientDirectory.add(patient);
    }
    
    public ArrayList<Patient> getPatientDirectory() 
    {
        return patientDirectory;
    }

    public void setPatientDirectory(ArrayList<Patient> patientDirectory) 
    {
        this.patientDirectory = patientDirectory;
    }
    
   
}
