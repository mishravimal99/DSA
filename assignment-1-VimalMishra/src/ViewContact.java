import java.util.ArrayList;

public class ViewContact {
    public void viewDetails(Person oj) {
        System.out.println("-------- * -------- * -------- * --------");
        System.out.println("First Name: " + oj.getFirstName());
        System.out.println("Last Name: " + oj.getLastName());
        String s = "" + oj.getContactNumbers();
        System.out.println("Contact Number(s): " + s.substring(1, s.length() - 1));
        System.out.println("Email address: " + oj.getEmailAddress());
        System.out.println("-------- * -------- * -------- * --------");


    }

    public void viewContact(ArrayList<Person> ob) {
        System.out.println("---Here are all your contacts---");
        for (Person oj : ob) {
            viewDetails(oj);
        }
    }
}