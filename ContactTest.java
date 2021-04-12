//Author: Byron Laferriere
//Date: 21 MAR 2021
//Course: CS-320
//Description: This code is representative of the testing that needs to be done on the class 'contact'. The requirements specify
//needs of the program and what an acceptable entry is for each variable. The tests take these parameters and test the code 
//against them.



package SNHU_ByronLaferriere;

import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.Test;

import org.junit.jupiter.api.Assertions;



class ContactTest {

	@Test
	void testContact() {
		Contact ct =  new Contact("C005", "Michael", "Jordan", "5559879995", "125 LA ST" );
		assertTrue(ct.getContactID().equals("C005"));
		assertTrue(ct.getFirstName().equals("Michael"));
		assertTrue(ct.getLastName().equals("Jordan"));
		assertTrue(ct.getphoneNumber().equals("5559879995"));
		assertTrue(ct.getAddress().equals("125 LA ST"));
	}
	
	@Test
	void testContactID2Long() {
		Contact ct = new Contact();
		 Contact c1 = new Contact("C001", "John", "Bush", "5559879999" , "121 LA ST");
	       Contact c2 = new Contact("C002", "Jim", "Bush", "5559879998" , "122 LA ST");
	       Contact c3 = new Contact("C003", "James", "Bush", "5559879997", "123 LA ST");
	       Assertions.assertThrows(IllegalArgumentException.class, () -> {
	   		Contact c4 = new Contact("C005", "MichaelAnthony", "Jordan", "5559879995", "125 LA ST");
	       }); } 
		
	@Test
	void testContactFN2Long() {
		Contact ct = new Contact();
		 Contact c1 = new Contact("C001", "John", "Bush", "5559879999" , "121 LA ST");
	       Contact c2 = new Contact("C002", "Jim", "Bush", "5559879998" , "122 LA ST");
	       Contact c3 = new Contact("C003", "James", "Bush", "5559879997", "123 LA ST");
		Assertions.assertThrows(IllegalArgumentException.class, () -> {
		Contact c4 = new Contact("C005", "MichaelAnthony", "Jordan", "5559879995", "125 LA ST");
	}); }
	
	@Test
	void testContactLN2Long() {
		Assertions.assertThrows(IllegalArgumentException.class, () -> {
		new Contact("C005", "Michael", "JordanAnthony", "5559879995", "125 LA ST");
	}); }
	
	@Test
	void testContactPN2Long() {
		Contact cs = new Contact();
		 Contact c1 = new Contact("C001", "John", "Bush", "5559879999" , "121 LA ST");
	       Contact c2 = new Contact("C002", "Jim", "Bush", "5559879998" , "122 LA ST");
	       Contact c3 = new Contact("C003", "James", "Bush", "5559879997", "123 LA ST");
		Assertions.assertThrows(IllegalArgumentException.class, () -> {
		new Contact("C005", "Michael", "Jordan", "55559879995", "125 LA ST");
	}); }
	
	@Test
	void testContactPNNot10() {
		Contact cs = new Contact();
		 Contact c1 = new Contact("C001", "John", "Bush", "5559879999" , "121 LA ST");
	       Contact c2 = new Contact("C002", "Jim", "Bush", "5559879998" , "122 LA ST");
	       Contact c3 = new Contact("C003", "James", "Bush", "5559879997", "123 LA ST");
		Assertions.assertThrows(IllegalArgumentException.class, () -> {
		new Contact("C0005", "Michael", "Jordan", "55879995", "125 LA ST");
	}); }
	
	@Test
	void testContactAddress2Long() {
		Contact cs = new Contact();
		 Contact c1 = new Contact("C001", "John", "Bush", "5559879999" , "121 LA ST");
	       Contact c2 = new Contact("C002", "Jim", "Bush", "5559879998" , "122 LA ST");
	       Contact c3 = new Contact("C003", "James", "Bush", "5559879997", "123 LA ST");
		Assertions.assertThrows(IllegalArgumentException.class, () -> {
		new Contact("C005", "Michael", "Jordan", "5559879995", "125 LA ST HUMANAHHUMANAHWHOISTHS");
	}); }

}
