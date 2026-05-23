/* Simple Contact Management. Create a class Contact with fields: name, phoneNumber, emailAddress.
Create 3 Contact objects. Print the contact details only if the emailAddress is not empty (use if condition). */

class Contact{
    String name;
    long phoneNumber;
    String emailAddress;

    Contact(String n, long p, String e){
        this.name = n;
        this.phoneNumber = p;
        this.emailAddress = e;
    }

    public void printDetails(){
        if (emailAddress.equals("")){
            System.out.println("Email address is empty.");
        } else {
            System.out.println("Name: " + name);
            System.out.println("Phone Number: " + phoneNumber);
            System.out.println("Email Address: " + emailAddress);
        }
    }
}

public class Q08{
    public static void main(String[] args){
        Contact contact1 = new Contact("Mark", 9803130206L, "MarkGrayson@gmail.com");
        Contact contact2 = new Contact("Dylan", 9814451173L, "Dylan123@hotmail.com");
        Contact contact3 = new Contact("Leland", 9867671447L, "");

        contact1.printDetails();
        contact2.printDetails();
        contact3.printDetails();
    }
}