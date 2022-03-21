package model;
import java.util.ArrayList;

/**
 *
 * @author dadis
 */
public class EncounterHistory {
    
    private ArrayList<Encounter> encounterHistoryList;

    public EncounterHistory() {
        encounterHistoryList = new ArrayList<>();
    }

    
    public ArrayList<Encounter> getEncounterHistoryList() {
        return encounterHistoryList;
    }

    public void setEncounterHistoryList(ArrayList<Encounter> encounterHistoryList) {
        this.encounterHistoryList = encounterHistoryList;
    }
    
    public void addEncounterInList(Encounter encounter){
        encounterHistoryList.add(encounter);
    }
    
    
}
