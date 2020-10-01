import java.util.Scanner;

public class FinalCountdown {

	public static void main(String[] args) {
		
		Scanner input = new Scanner(System.in);
		System.out.println("Please enter a number: ");
		int number = input.nextInt();
		int user = 0;

		while (user >= 0) {
			number--;
			if (number % 2 == 0)
				System.out.println(number);
			else
				continue;
			System.out.println("Enter a number, if it is negative program will stop: ");
			user = input.nextInt();

		}

	}
}
