import java.util.Random;
public class RandomClass {

	public static void main(String[] args) {
		
		// Create a Random object with seed 1000
		Random generator = new Random(1000);
		
		// Displays the first 50 random integers between 0 and 100
		int count = 0;
		for(int i = 1; i <= 50; i++) {
			count++;
			if(i % 10 == 0) 
			System.out.printf("%5d\n",generator.nextInt(100)); /*$5fd\n formats the numbers so every 10 numbers will skip a line
			                                                     and spaces the numbers*/                                                    
			else
				System.out.printf("%5d", generator.nextInt(100));
			
		}
		System.out.println("\nThe number of random integers created are " + count);	
		System.out.println("");
		
	
		
		// Create a Random object named randomNumber1 with seed 1000
				java.util.Random randomNumber1 = new java.util.Random(1000);

				// Displays the first 50 random integers between 0 and 100
				for (int i = 1; i <= 50; i++) {
					if (i % 10 == 0)
						System.out.printf("%5d\n", randomNumber1.nextInt(100));
					else
						System.out.printf("%5d", randomNumber1.nextInt(100));
				}
				System.out.println("\nThe number of random integers created are " + count);	
				

	}

}
