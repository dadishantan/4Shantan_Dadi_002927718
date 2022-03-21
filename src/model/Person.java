/**
 *
 * @author dadis
 */
package model;
public class Person {
    
    private String FirstName;
    private String LastName;
    private int age;
    private String City;
    private String Community;
    private int HomeNo;

    public String getFirstName() 
    {
        return FirstName;
    }

    public void setFirstName(String FirstName) 
    {
        this.FirstName = FirstName;
    }

    public String getLastName() 
    {
        return LastName;
    }

    public void setLastName(String LastName) 
    {
        this.LastName = LastName;
    }

    public int getAge() 
    {
        return age;
    }

    public void setAge(int age) 
    {
        this.age = age;
    }

    public String getCity() 
    {
        return City;
    }

    public void setCity(String City) 
    {
        this.City = City;
    }

    public String getCommunity() 
    {
        return Community;
    }

    public void setCommunity(String Community) 
    {
        this.Community = Community;
    }

    public int getHomeNo() 
    {
        return HomeNo;
    }

    public void setHomeNo(int HomeNo) 
    {
        this.HomeNo = HomeNo;
    }

    @Override
    public String toString()
    {
        return FirstName;
    }
    
    
}
