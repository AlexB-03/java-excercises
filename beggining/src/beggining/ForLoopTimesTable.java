package beggining;

import java.util.Scanner;

public class ForLoopTimesTable {

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		System.out.println("What times table do you want?");
		String text = s.nextLine();
		Integer multiple = Integer.parseInt(text);
		
		for (Integer n = 1; n <= 12; n += 1) {
			System.out.println(n * multiple);
		}
		Integer x = 1 ;
		while (x < 100) {
			System.out.println(x);
			x+=x;
		}
	}

}