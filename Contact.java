//Author: Byron Laferriere
//Date: 21 MAR 2021
//Course: CS-320
//Description: The code provided below will be the main class for our contact service program. This class will contain variable
//definitions and parameters that are to be followed when collecting customer information. It starts by testing variable entries
//against the parameters defined for the program. If all parameters are met, then assignment can begin. This is accomplished by
//using setters and getters to fill the variables. Once this is complete, it was requested that each contactID be a unique ID
//to make databasing easier. The last segment checks that there is no matching records before creating a duplicate ID
package SNHU_ByronLaferriere;

import java.util.ArrayList;

public class Contact {
	public String contactID;
	public String firstName;
	public String lastName;
	public String phoneNumber;
	public String Address;
	private ArrayList<Contact> contacts;

	   /* default constructor */
	   public Contact() {
	       contacts = new ArrayList<>();
	   }
	
	//parameter definition
	public Contact(String ContactID, String FirstName, String LastName, String PhoneNumber, String Address) {
		if (ContactID == null || ContactID.length()>10) {
			throw new IllegalArgumentException("Invalid Contact ID!");
		}
		if (FirstName == null || FirstName.length()>10) {
			throw new IllegalArgumentException("Invalid First Name!");
	}
		if (LastName == null || LastName.length()>10) {
			throw new IllegalArgumentException("Invalid Last Name!");
		}
		if (PhoneNumber == null || PhoneNumber.length() != 10) {
			throw new IllegalArgumentException("Invalid Phone Number!");
		}
		if (Address == null || Address.length()>30) {
			throw new IllegalArgumentException("Invalid Address!");
		}
		
		this.contactID = ContactID;
		this.firstName = FirstName;
		this.lastName = LastName;
		this.phoneNumber = PhoneNumber;
		this.Address = Address;
	}
	  
	/* setters and getters */
	   public String getContactID() {
	       return contactID;
	   }
	   
	   public void setContactID(String contactID) {
		   this.contactID = contactID;
	   }

	   public String getFirstName() {
	       return firstName;
	   }

	   public void setFirstName(String firstName) {
	       this.firstName = firstName;
	   }

	   public String getLastName() {
	       return lastName;
	   }

	   public void setLastName(String lastName) {
	       this.lastName = lastName;
	   }

	   public String getphoneNumber() {
	       return phoneNumber;
	   }

	   public void setphoneNumber(String phoneNumber) {
	       this.phoneNumber = phoneNumber;
	   }
	   
	   public String getAddress() {
		   return Address;
	   }
	   
	   public void setAddress(String Address) {
		   this.Address = Address;
	   }
	   
	   

	   /* method to make sure no two contact ID's are same or not */
	   @Override
	   public boolean equals(Object obj) {
	       if (this == obj)
	           return true;
	       if (obj == null)
	           return false;
	       if (getClass() != obj.getClass())
	           return false;
	       Contact other = (Contact) obj;
	       if (contactID == null) {
	           if (other.contactID != null)
	               return false;
	       } else if (!contactID.equals(other.contactID))
	           return false;
		return false;
	   }
	public Object add(Contact c1) {
		// TODO Auto-generated method stub
		return null;
	}

}
