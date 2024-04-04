import java.util.LinkedList;

public class ContactBook {
    private LinkedList<Contacts> contacts;

    public ContactBook() {
        contacts = new LinkedList<>();
    }

    public void addContact(Contacts contact) {
        contacts.add(contact);
    }

    public void deleteContact(Contacts contact) {
        contacts.remove(contact);
    }

    public Contacts searchEmail (String email) {
        for (Contacts contact : contacts) {
            if (contact.getEmail().equalsIgnoreCase(email)) {
                return contact;
            }
        }
        return null;
    }

    public Contacts searchName (String toSearch) {
        for (Contacts contact : contacts) {
            if (contact.getName().equalsIgnoreCase(toSearch) || contact.getPhoneNumber().equalsIgnoreCase(toSearch)) {
                return contact;
            }
        }
        return null;
    }

    public boolean isEmpty() {
        return contacts.isEmpty();
    }

    public void printContactList() {
        for (Contacts contact : contacts) {
            System.out.println(contact);
        }
    }
}
