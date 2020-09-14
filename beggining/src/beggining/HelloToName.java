package beggining;

import java.util.Scanner;

public class HelloToName {

	public static void main(String[] args) {
		System.out.println("enter your  first name");
		
		Scanner scanner = new Scanner(System.in);
		String firstname = scanner.nextLine();
		
		System.out.println("enter your surename name");
		String surname = scanner.nextLine();
		
		System.out.println("enter your age");
		String text = scanner.nextLine();
		int age = Integer.parseInt(text);
		
		System.out.println("Hello " + firstname + " " + surname + ", " + age);
	}

}
