package RecommendDegreesOfFreedom;


import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Scanner;

public class InfoReader {
    ArrayList<Person> persons = new ArrayList();
    ArrayList<Activities> activities = new ArrayList();
    public void ReadInfo(){
        //find file with person data
        try {
            String fileLocation = File.separator + "Users" + File.separator + "user" + File.separator + "Downloads" + File.separator + "SamplefilePersons2022Oct31text.csv";

            File personList = new File(fileLocation);
            //scanner to read from file
            Scanner personScanner = new Scanner(personList);

            while (personScanner.hasNextLine()) {
                String nextline = personScanner.nextLine();
                // split file into parts
                String[] personComponents = nextline.split(",");
                //get components of Persons
                String firstname = personComponents[0];
                String lastname = personComponents[1];
                String phone = personComponents[2];
                String email = personComponents[3];
                String community = personComponents[4];
                String school = personComponents[5];
                String employer = personComponents[6];
                String privacy = personComponents[7];

                //creating new person
                Person newPerson = new Person();

                //set data attributes for persons as we read from file
                newPerson.setFirstname(firstname);
                newPerson.setLastname(lastname);
                newPerson.setPhone(phone);
                newPerson.setEmail(email);
                newPerson.setCommunity(community);
                newPerson.setSchool(school);
                newPerson.setEmployer(employer);
                Boolean Privacy = Boolean.parseBoolean(privacy);
                if (privacy.equalsIgnoreCase("Y")) {
                    Privacy = true;
                } else if (privacy.equalsIgnoreCase("N")){
                    Privacy = false;
                }
                newPerson.setPrivacy(Privacy);

                persons.add(newPerson);
                /*if (Privacy == true){
                    persons.remove(newPerson);
                }*/
            }

            //System.out.println(persons.size());
            //for (int i = 0; i < 100; i++){
            //System.out.println(persons.get(i));
            //}
        } catch (FileNotFoundException e) {
            throw new RuntimeException(e);
        }
        //find file with activity data
        try {
            String fileLocation = File.separator + "Users" + File.separator + "user" + File.separator + "Downloads" + File.separator + "SamplefileActivities2022Oct31text.csv";

            File activityList = new File(fileLocation);
            //scanner to read from file
            Scanner activityScanner = new Scanner(activityList);
            while (activityScanner.hasNextLine()) {
                String nextLine = activityScanner.nextLine();
                // split file into parts
                String[] activityComponents = nextLine.split(",");
                //get components of Persons Activities
                String firstname = activityComponents[0];
                String lastname = activityComponents[1];
                String Activity = activityComponents[2];
                //creating new person activity
                Activities newActivity = new Activities();
                //set data attributes for persons as we read from file
                newActivity.setFirstname(firstname);
                newActivity.setLastname(lastname);
                newActivity.setActivity(Activity);
                //System.out.println(newActivity);
                activities.add(newActivity);

            }
            //System.out.println(activities.size());
        }catch (FileNotFoundException e) {
            throw new RuntimeException(e);
        }

    }
}
