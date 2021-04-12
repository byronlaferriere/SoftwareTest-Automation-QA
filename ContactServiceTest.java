//Author: Byron Laferriere
//Date: 21 MAR 2021
//Course: CS-320
//Description: This code contained below holds the tests for the contactservice class that extends the contact class. this class
//adds features to the program that allow the program to add/delete/update contact information in the system. These tests 
//measure each feature to ensure that they will work when tested now and in the future. Each test is performed to seek out 
//failing measures for each variable parameter that was previously defined.



package SNHU_ByronLaferriere;
import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;




/*This Junit Class will help us in testing ContactService class and its methods*/
public class ContactServiceTest {

   /* testing the add method to work fine, when details provided should work */
	
   @Test
   public void testMethodAddPass() {
       ContactService cs = new ContactService();
       Contact c1 = new Contact("C001", "John", "Bush", "5559879999" , "121 LA ST");
       Contact c2 = new Contact("C002", "Jim", "Bush", "5559879998" , "122 LA ST");
       Contact c3 = new Contact("C003", "James", "Bush", "5559879997", "123 LA ST");
       assertEquals(true, cs.add(c1));
       assertEquals(true, cs.add(c2));
       assertEquals(true, cs.add(c3));
   }

   /* testing the add method to work fine,when details provided should not work */
   @Test
   public void testMethodAddFail() {
       ContactService cs = new ContactService();
       Contact c1 = new Contact("C001", "John", "Bush", "5559879999" , "121 LA ST");
       Contact c2 = new Contact("C002", "Jim", "Bush", "5559879998" , "122 LA ST");
       Contact c3 = new Contact("C003", "James", "Bush", "5559879997", "123 LA ST");
       assertEquals(true, cs.add(c1));
       assertEquals(false, cs.add(c1));
       assertEquals(true, cs.add(c3));
       assertEquals(true, cs.add(c2));
   }

   /* test the delete method */
   @Test
   public void testMethodDeletePass() {
       ContactService cs = new ContactService();
       Contact c1 = new Contact("C001", "John", "Bush", "5559879999" , "121 LA ST");
       Contact c2 = new Contact("C002", "Jim", "Bush", "5559879998" , "122 LA ST");
       Contact c3 = new Contact("C003", "James", "Bush", "5559879997", "123 LA ST");
       assertEquals(true, cs.add(c1));
       assertEquals(true, cs.add(c2));
       assertEquals(true, cs.add(c3));

       assertEquals(true, cs.remove("C003"));
       assertEquals(true, cs.remove("C002"));
   }

   /* test the delete method */
   @Test
   public void testMethodDeleteFail() {
       ContactService cs = new ContactService();
       Contact c1 = new Contact("C001", "John", "Bush", "5559879999" , "121 LA ST");
       Contact c2 = new Contact("C002", "Jim", "Bush", "5559879998" , "122 LA ST");
       Contact c3 = new Contact("C003", "James", "Bush", "5559879997", "123 LA ST");
       assertEquals(true, cs.add(c1));
       assertEquals(true, cs.add(c3));
       assertEquals(true, cs.add(c2));

       assertEquals(false, cs.remove("C004"));
       assertEquals(true, cs.remove("C002"));
   }

   /* test the update method */
   @Test
   public void testUpdatePass() {
       ContactService cs = new ContactService();
       Contact c1 = new Contact("C001", "John", "Bush", "5559879999" , "121 LA ST");
       Contact c2 = new Contact("C002", "Jim", "Bush", "5559879998" , "122 LA ST");
       Contact c3 = new Contact("C003", "James", "Bush", "5559879997", "123 LA ST");
       assertEquals(true, cs.add(c1));
       assertEquals(true, cs.add(c3));
       assertEquals(true, cs.add(c2));

       assertEquals(true, cs.update("C003", "Sean", "Paul", "5559879997", ""));
       assertEquals(true, cs.update("C002", "Jimmy", "Bush", "5559879998", "124 LA ST"));
   }

   /* test the update method */
   @Test
   public void testUpdateFail() {
       ContactService cs = new ContactService();
       Contact c1 = new Contact("C001", "John", "Bush", "5559879999" , "121 LA ST");
       Contact c2 = new Contact("C002", "Jim", "Bush", "5559879998" , "122 LA ST");
       Contact c3 = new Contact("C003", "James", "Bush", "5559879997", "123 LA ST");
       assertEquals(true, cs.add(c1));
       assertEquals(true, cs.add(c3));
       assertEquals(true, cs.add(c2));

       assertEquals(false, cs.update("C004", "Sean", "Paul", "5559879996" ,""));
       assertEquals(true, cs.update("C002", "Jimmy", "Bush", "5559879998" ,"124 LA ST"));
   }

}
