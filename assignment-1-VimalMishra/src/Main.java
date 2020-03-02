import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        ArrayList<Person> ob = new ArrayList<>();
        Scanner sc = new Scanner(System.in);
        System.out.println("Welcome to Rohans Contact List App");
        int a = 0;
        while (a != 5) {
            System.out.println("Press 1 to add a new contact\n" +
                    "Press 2 to view all contacts\n" +
                    "Press 3 to search for a contact\n" +
                    "Press 4 to delete a contact\n" +
                    "Press 5 to exit program ");
            int ch = sc.nextInt();
            a = ch;
            switch (ch) {
                case 1:
                    AddContact ob1 = new AddContact();
                    ob.add(ob1.addContact());
                    a = 1;
                    break;
                case 2:
                    ViewContact obj = new ViewContact();
                    obj.viewContact(ob);
                    a = 2;
                    break;
                case 3:
                    SearchContact obj1 = new SearchContact();
                    obj1.searchContact(ob);
                    a = 3;
                    break;
                case 4:
                    DeleteContact obj2 = new DeleteContact();
                    int ind = obj2.printContacts(ob);
                    System.out.println(ob.get(ind).getFirstName() + " " + ob.get(ind).getLastName() + "'s contact removed!");
                    ob.remove(ob.get(ind));
                    a = 4;
                    break;
                case 5:
                    a = 5;
                    break;
                default:
                    System.out.println("invalid choice please re-enter");
                    break;

            }

        }
    }
}