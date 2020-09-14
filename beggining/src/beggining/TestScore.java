package beggining;

import java.util.Scanner;

public class TestScore {

	public static void main(String[] args) {
		System.out.println("Enter your score out of 100");
		
		Scanner scanner = new Scanner(System.in);
		String number = scanner.nextLine();
		int score = Integer.parseInt(number);
		int result = score / 100 ;
				
		if (score > 90) {
			System.out.println("You have recieved an A*");	
		} else if (score > 80) {
			System.out.println("You have recived an A");
		} else if (score > 70) {
			System.out.println("You have recived an B");
		} else if (score > 60) {
			System.out.println("You have recived an C");
		} else {
			System.out.println("You have recived an F, Please redo the exam");

	}

}
}
