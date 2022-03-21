
package model;
import java.util.ArrayList;

/**
 *
 * @author dadis
 */
public class Community {
    private String community;
    
    private ArrayList<Home> homeList;

    public String getCommunity() {
        return community;
    }

    public void setCommunity(String community) {
        this.community = community;
    }

    public ArrayList<Home> getHomeList() {
        return homeList;
    }

    public void setHomeList(ArrayList<Home> HouseList) {
        this.homeList = HouseList;
    }
    
    public void addHouse(Home house) {
        homeList.add(house);
    }
    
    
}
