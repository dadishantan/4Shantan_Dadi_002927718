
package model;

import java.util.ArrayList;

/**
 *
 * @author dadis
 */
public class City {

    private String city;
    private ArrayList<Community> communityList;
    
    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }
   


    public ArrayList<Community> getCommunityList() {
        return communityList;
    }

    public void setCommunityList(ArrayList<Community> communityList) {
        this.communityList = communityList;
    }
    
    public void addCommunity(Community commName) {
        communityList.add(commName);
    }
     
}
