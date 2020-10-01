// Feel free to add here any import statements that you need for your tests


/**
   TOTAL 3 points
   Use the main method in this class to test the features of our
   InvoiceItem class. To do so, you are free to create several objects,
   call methods...
**/
public class IE1{
   
   public static void main(String[] args){
      /*
      Write your tests in this main method.
      You will be graded on the thoroughness of your tests; 
         1 point  main code tests each of the available methods at least once, 
                  this includes testing object creation with all available constructors
         1 point  In addition, methods are tested on parameters that they should reject
                  or handle as special cases.
         1 point  All tests result in clear information being displayed on the screen
                  so that, by just reading the programs' output, we can understand exactly
                  what has been tested, with what values, and what was the result or
                  consequences of running the test.
      */
      System.out.println("Starting the testing of the InvoiceItem class...");
      
      InvoiceItem invoiceItem1 = new InvoiceItem();
      
      System.out.println(invoiceItem1.getTotalPrice());      
      
   }
   
} // end public class

