import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        ContactBook contactInformation = new ContactBook();
        Scanner scanner = new Scanner(System.in);

        char option;
        do {
            System.out.println("****************************");
            System.out.println("(A)dd");
            System.out.println("(D)elete");
            System.out.println("(E)mail Search");
            System.out.println("(P)rint List");
            System.out.println("(S)earch");
            System.out.println("(Q)uit");
            System.out.println("****************************");
            System.out.println("Select: ");
            option = scanner.next().charAt(0);

            switch (option) {
                case 'A':
                case 'a':
                    System.out.println("Name: ");
                    String name = scanner.next();
                    System.out.println("Phone Number: ");
                    String phoneNumber = scanner.next();
                    System.out.println("E-mail Address: ");
                    String email = scanner.next();
                    contactInformation.addContact(new Contacts(name, phoneNumber, email));
                    break;

                case 'D':
                case 'd':
                    System.out.println("Enter name to delete: ");
                    String nameToDelete = scanner.next();
                    Contacts deletedContact = contactInformation.searchName(nameToDelete);
                    if (deletedContact != null) {
                        contactInformation.deleteContact(deletedContact);
                        System.out.println(deletedContact.getName() + " is deleted.");
                    } else {
                        System.out.println("Contact not found.");
                    }
                    break;
                case'E':
                case'e':
                    System.out.println("Enter e-mail to search: ");
                    String emailToSearch = scanner.next();
                    Contacts searchedEmail = contactInformation.searchEmail(emailToSearch);
                    if (searchedEmail != null) {
                        System.out.println(searchedEmail);
                    }else {
                        System.out.println("E-mail not found.");
                    }
                    break;
                case 'P':
                case 'p':
                    if (contactInformation.isEmpty()) {
                        System.out.println("Contact book is empty.");
                    } else {
                        System.out.println("Contact List: ");
                        contactInformation.printContactList();
                    }
                    break;
                case 'S':
                case 's':
                    System.out.println("Enter name or phone number to search: ");
                    String contactToSearch = scanner.next();
                    Contacts searchedContact = contactInformation.searchName(contactToSearch);
                    if (searchedContact != null) {
                        System.out.println(searchedContact);
                    } else {
                        System.out.println("Contact not found.");
                    }
                    break;
                case 'Q':
                case 'q':
                    System.out.println("Exiting contact book...");
                    break;
                default:
                    System.out.println("Unknown entry.");
            }
        } while (option != 'Q' && option != 'q');
        scanner.close();
    }
}