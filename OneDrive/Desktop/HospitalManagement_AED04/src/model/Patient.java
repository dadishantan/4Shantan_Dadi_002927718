/**
 *
 * @author dadis
 */
package model;
public class Patient {
    
    
    private int pId;
    private String FirstName;
    private String LastName;
    private String FullName;
    private int age;
    private int Home;
    private String City;
    private String Community;

    public int getpId() {
        return pId;
    }

    public void setpId(int pId) {
        this.pId = pId;
    }

    public String getFirstName() {
        return FirstName;
    }

    public void setFirstName(String FirstName) {
        this.FirstName = FirstName;
    }

    public String getLastName() {
        return LastName;
    }

    public void setLastName(String LastName) {
        this.LastName = LastName;
    }

    public String getFullName() {
        return FullName;
    }

    public void setFullName() {
        this.FullName = this.FirstName+this.LastName;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public int getHome() {
        return Home;
    }

    public void setHome(int Home) {
        this.Home = Home;
    }

    public String getCity() {
        return City;
    }

    public void setCity(String City) {
        this.City = City;
    }

    public String getCommunity() {
        return Community;
    }

    public void setCommunity(String Community) {
        this.Community = Community;
    }
    
    @Override
    public String toString(){
        return String.valueOf(pId);
    }
    
    
    
}
