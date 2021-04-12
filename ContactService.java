//Author: Byron Laferriere
//Date: 21 MAR 2021
//Course: CS-320
//Description: The following code in this section is an extension of the contact class. The contact class merely established the
//variables that were to be stored by the program and what would be an acceptable entry for each. This piece of the software 
//begins adding functionality to the program by initiating features like add/delete/update. 



package SNHU_ByronLaferriere;
import java.util.ArrayList;

public class ContactService {
   /* this contains a list of contacts */
   private ArrayList<Contact> contacts;

   /* default constructor */
   public ContactService() {
       contacts = new ArrayList<>();
   }

   /* this method adds a given contact to our list if its not already present */
   public boolean add(Contact contact) {
       /* first we determine if the contact is already present */
       boolean alreadyPresent = false;
       for (Contact c : contacts) {
           if (c.equals(contact)) {
               alreadyPresent = true;
           }
       }
       /* if the contact is not present then we add it, and return true */
       if (!alreadyPresent) {
           contacts.add(contact);
           System.out.println("Contact Added uccessfully!");
           return true;
       } else {
           System.out.println("Contact already present");
           return false;
       }
   }

   /* this method remove a contact with given contactId if present in our list */
   public boolean remove(String contactID) {
       for (Contact c : contacts) {
           if (c.getContactID().equals(contactID)) {
               contacts.remove(c);
               System.out.println("Contact removed Successfully!");
               return true;
           }
       }
       System.out.println("Contact not present");
   
       return false;
   
   }



   /*
   * this method updates the contact of the given contactID, if found updates its
   * firstname, last name and number address, pass an empty string if certain
   * details are not to be changed
   */
   public boolean update(String contactID, String firstName, String lastName, String phoneNumber , String Address) {
       for (Contact c : contacts) {
           if (c.getContactID().equals(contactID)) {
               if (!firstName.equals(""))
                   c.setFirstName(firstName);
               if (!lastName.equals(""))
                   c.setLastName(lastName);
               if (!phoneNumber.equals(""))
                   c.setphoneNumber(phoneNumber);
               if (!Address.equals(""))
                   c.setAddress(Address);
               System.out.println("Contact updated Successfully!");
               return true;
           }
       }
       System.out.println("Contact not present");
       return false;
   }
}