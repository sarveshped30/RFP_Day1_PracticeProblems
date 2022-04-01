import java.util.Scanner;  // Import the Scanner class

public class LeapYear {
	public static void  main(String[] args) {
		
		Scanner Y = new Scanner(System.in);
		System.out.println("Enter Year : ");
		
		int Year = Y.nextInt();
		
		if(Year >= 1582) {
			if(Year%400 == 0) {
				System.out.println("leap year");
			} else if(Year%100 == 0) {
				System.out.println("Not a leap year");
			} else if(Year%4 == 0) {
				System.out.println("leap year");
			} else {
				System.out.println("Not a leap year");
			}
		} else {
			System.out.println("Enter Year from 1582 and above...");
		}
	}
}
