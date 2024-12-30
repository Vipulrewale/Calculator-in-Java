package prac1;

import java.util.*;

public class Calculator {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);

		System.out.println("1. Add");
		System.out.println("2. Sub");
		System.out.println("3. Multiply");
		System.out.println("4. Divide");

		System.out.println("Choose operator you want to perform");
		int operator = scanner.nextInt();

		System.out.println("Enter the number :");
		int choice1 = scanner.nextInt();

		System.out.println("Enter the number :");
		int choice2 = scanner.nextInt();

		int result = 0;
		switch (operator) {
		case 1:
			result = choice1 + choice2;
			break;

		case 2:
			result = choice1 - choice2;
			break;

		case 3:
			result = choice1 * choice2;
			break;

		case 4:
			result = choice1 / choice2;
			break;

		default:
			System.out.println("Entered no is not valid");

		}
		System.out.println("Result :" + result);

	}
}
