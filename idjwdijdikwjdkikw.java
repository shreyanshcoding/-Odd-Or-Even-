package MyPackage;

import java.util.Scanner;

public class idjwdijdikwjdkikw {
	static double number;
	public static void main(String[] args) {
		System.out.println("click on x to end the code ");
		System.out.println("Enter a non - decimal number");
		Boolean flag = true;
		while (flag != false) {
			Scanner input = new Scanner(System.in);
			try {
				String number = input.nextLine();
				if (number.equals("x"))
					flag = false;
				else if (Integer.parseInt(number) % 1 != 0)
					System.out.println("Incorrect Number");
				else if (Integer.parseInt(number) % 2 == 0)
					System.out.println("This is an even number");
				else if (Integer.parseInt(number) % 2 != 0)
					System.out.println("This is an odd number");
			} catch (Exception s) {
				System.out.println("Invalid number");
		}
		}
	}

}
