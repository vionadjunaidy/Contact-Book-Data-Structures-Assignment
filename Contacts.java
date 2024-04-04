public class Contacts {
    private String name;
    private String phoneNumber;
    private String email;

    public Contacts(String name, String phoneNumber, String email) {
        this.name = name;
        this.phoneNumber = phoneNumber;
        this.email = email;
    }

    public String getName() {
        return name;
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }

    public String getEmail() {
        return email;
    }

    public String toString() {
        return "Name: " + name + " || Phone Number: " + phoneNumber + " || E-mail: " + email;
    }
}
