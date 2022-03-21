package model;
import java.util.ArrayList;

/**
 *
 * @author dadis
 */
public class PersonDirectory {
    private ArrayList<Person> personDirectory;
    
    public PersonDirectory(){
    personDirectory = new ArrayList<>();
    }

    public ArrayList<Person> getPersonDirectory() {
        return personDirectory;
    }

    public void setPersonDirectory(ArrayList<Person> personDirectory) {
        this.personDirectory = personDirectory;
    }
    
    public void addNewPerson(Person person){
    personDirectory.add(person);
    }
    
    
}
