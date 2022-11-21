package RecommendDegreesOfFreedom;


public class Activities {
    String firstname;
    String lastname;
    String Activity;

    public Activities() {
    }

    public String getFirstname() {

        return firstname;
    }

    public void setFirstname(String firstname) {
        this.firstname = firstname;
    }

    public String getLastname() {
        return lastname;
    }

    public void setLastname(String lastname) {
        this.lastname = lastname;
    }

    @Override
    public String toString() {
        return firstname + "\t" + lastname + "\t" + Activity;
    }

    public String getActivity() {
        return Activity;
    }

    public void setActivity(String activity) {
        Activity = activity;

    }
}
