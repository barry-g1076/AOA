package RecommendDegreesOfFreedom;

public class Person {
    String firstname;
    String lastname;
    String phone;
    String email;
    String community;
    String school;
    String employer;
    Boolean privacy;
    public Person() {
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
    public String getPhone() {
        return phone;
    }
    public void setPhone(String phone) {
        this.phone = phone;
    }
    public String getEmail() {
        return email;
    }
    public void setEmail(String email) {
        this.email = email;
    }
    public String getCommunity() {
        return community;
    }
    public void setCommunity(String community) {
        this.community = community;
    }
    public String getSchool() {
        return school;
    }
    public void setSchool(String school) {
        this.school = school;
    }
    public String getEmployer() {
        return employer;
    }
    public void setEmployer(String employer) {
        this.employer = employer;
    }

    public Boolean getPrivacy() {
        return privacy;
    }

    public void setPrivacy(Boolean privacy) {
        this.privacy = privacy;
    }

    @Override
    public String toString(){
        return firstname + "\t" + lastname + "\t" + phone + "\t" + email + "\t"+ community + "\t" + school + "\t" + employer + "\t" + privacy;
    }

}
