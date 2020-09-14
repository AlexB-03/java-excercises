package beggining;

import java.util.Scanner;

public class YearCalculator {

	public static void main(String[] args) {
		System.out.println("What year were you born?");
		
		Scanner scanner = new Scanner(System.in);
		String number = scanner.nextLine();
		int year = Integer.parseInt(number);
		int age = 2020 - year ;
				
		if (age < 10) {
			System.out.println("You must be a primary student");	
		} else if (age < 20) {
			System.out.println("You must be a secondary student");
		} else {
			System.out.println("You must be a student");

	}

	}
} 
