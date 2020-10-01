import java.util.Arrays;

/**
 * TODO - add here any import statements that your code needs.
 **/

public class COP2513IE0ArrayOfDigitsToString {

	/**
      TODO - write this method
      
      This method takes a non-null reference to an int array of size greater or equal to
      1 element. Each element of that array will be a single-digit value between 0 and 9 (inclusive).
      You do not have to verify this, you can assume that your method
      will always be called with such arrays.

      Your method returns a new string made of all these digits, in the same order they appear in the array.
      
      Example; Your method will return a string "123" if the array that was passed to it contained
      the int value 1 at index 0, the value 2 at index 1, and the value 3 at index 2.
   **/
   
	 public static String ArrayOfDigitsToString(int[] v){
		String output = "";
		
		 
	
		for (int i = 0; i < v.length; i++) {
			output = output + Integer.toString(v[i]);
		}
		
		
		
	
		
		

	
	      return output; // always returns an empty string for now, replace this with your code
	   }// end method ArrayOfDigitsToString

	public static void main(String[] args) {
		String[] strings = { "3", "9", "12", "123" };

		int[][] vectors = { { 3 }, { 9 }, { 1, 2 }, { 1, 2, 3 } };

		System.out.println("\nTesting your method ArrayOfDigitsToString(...)");
		if (vectors.length != strings.length) {
			System.out.println("All tables must have the same # of tests");
			System.exit(-1);
		} // end if

		for (int test = 0; test < vectors.length; test++) {
			String observed = ArrayOfDigitsToString(vectors[test]);
			System.out.print("\tTest #" + test + " with vector " + Arrays.toString(vectors[test]));
			System.out.println(" " + (observed.equals(strings[test]) ? "SUCCEEDED" : "FAILED"));
		} // end for loop

	}// end main method

} // end class