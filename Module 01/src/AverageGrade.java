import java.util.Scanner;
public class AverageGrade {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.println("Enter grade: ");
		double grade = input.nextDouble(); 
		double total = 0;
		double sum = grade;
		
		while(grade <= 100 && grade > 0) {
		    grade = input.nextDouble();
			sum = sum + grade;
		    total++;
			if(grade > 100) 
				System.out.println("Error: Please enter a number less than or equal to 100");
			continue;
			
	        
		}
		System.out.println(sum);
		double average = sum / total;
		System.out.println("The average of the grades are: " + average);
			
		}
		
	}


