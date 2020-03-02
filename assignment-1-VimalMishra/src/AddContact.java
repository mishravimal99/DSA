import java.util.Scanner;

public class AddContact {
    Person ob = new Person();
    ValidateInput ob1 = new ValidateInput();

    public void addFirstName(String fn) {
        ob.setFirstName(fn);
    }

    public void addLastName(String ln) {
        ob.setLastName(ln);
    }

    public boolean addNumber(String number) {
        if (ob1.phoneNumber(number)) {
            ob.setContactNumbers(number);
            return true;
        }
        return false;
    }

    public boolean addEmail(String mail) {
        if (ob1.email(mail)) {
            ob.setEmailAddress(mail);
            return true;
        }
        return false;
    }

    public Person addContact() {
        Scanner sc = new Scanner(System.in);
        System.out.println("You have chosen to add a new contact:\nPlease enter the name of the Person");
        System.out.print("First Name: ");
        addFirstName(sc.nextLine());
        System.out.print("Last Name: ");
        addLastName(sc.nextLine());
        boolean a = true;
        while (a) {
            System.out.print("Contact Number: ");
            String no = sc.nextLine();
            a = addNumber(no);
            if (!a) {
                System.out.println("invalid no please re-enter");
                a = true;
                continue;
            }
            System.out.println("Would you like to add another contact number? (y/n): ");
            char c = (sc.nextLine()).charAt(0);
            a = c == 'y';
        }//end of while
        System.out.println("Would you like to add email address? (y/n):");
        char c = (sc.nextLine()).charAt(0);
        if (c == 'y') {
            System.out.print("Email Address: ");
            String mai = sc.nextLine();
            boolean a1 = addEmail(mai);
            while (!a1) {
                System.out.println("invalid email please re-enter");
                System.out.print("Email Address: ");
                a1 = addEmail(sc.nextLine());
                continue;
            }
        }
        return ob;


    }
}