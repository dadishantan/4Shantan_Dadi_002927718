
package model;
import java.util.ArrayList;

/**
 *
 * @author dadis
 */
public class Encounter {
    
    private int serialNumber;
    private int patientEncounterId;
    private int EncounterNumber;
    private ArrayList<VitalSign> VSList;

    public int getPatientEncounterId() 
    {
        return patientEncounterId;
    }

    public void setPatientEncounterId(int patientEncounterId) 
    {
        this.patientEncounterId = patientEncounterId;
    }
    public int getEncounterNumber() 
    {
        return EncounterNumber;
    }

    public void setEncounterNumber(int EncounterNumber) 
    {
        this.EncounterNumber = EncounterNumber;
    }

    public ArrayList<VitalSign> getVSList() 
    {
        return VSList;
    }

    public void setVSList(ArrayList<VitalSign> VSList) 
    {
        this.VSList = VSList;
    }
    
    public void addVitalSign(VitalSign vitalSign)
    {
    this.VSList.add(vitalSign);
    }
    
    public Encounter()
    {
    VSList = new ArrayList<>();
    }

}
