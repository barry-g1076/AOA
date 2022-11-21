package RecommendDegreesOfFreedom;


import java.util.ArrayList;

public class CloseFriend {
    String id ;
    String name ;
    ArrayList<CloseFriend> closeCon = new ArrayList<>();

    public ArrayList<CloseFriend> getCloseCon() {
        return closeCon;
    }

    public void setCloseCon(ArrayList<CloseFriend> closeCon) {
        this.closeCon = closeCon;
    }
    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }


}
