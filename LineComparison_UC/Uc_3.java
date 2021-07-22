package LineComparison_UC;

import java.util.Scanner;

public class Uc_3
{
		public static void main(String args[]) {
			System.out.println("Welcome to Line Comparison Computation Program");

	// Calculate the length of First Line	

			Scanner sc = new Scanner(System.in);
			System.out.println("Enter the first co-ordinate for x-axis of First Line");
			int x1 = sc.nextInt();
			System.out.println("Enter the second co-ordinate for x-axis of First Line");
			int x2 = sc.nextInt();
			System.out.println("Enter the first co-ordinate for y-axis of First Line");
			int y1 = sc.nextInt();
			System.out.println("Enter the second co-ordinate for y-axis of First Line");
			int y2 = sc.nextInt();
			double lengthofline1 = Math.sqrt((x2 - x1) * (x2 - x1) + (y2 - y1) * (y2 - y1)); // Calculating length between the two points of First Line
		        System.out.println("The lenth of First Line is :" + lengthofline1);

	// Calculating the length of Second Line	

			System.out.println("Enter the first co-ordinate for x-axis of Second Line");
			int x3 = sc.nextInt();
			System.out.println("Enter the second co-ordinate for x-axis of Second Line");
			int x4 = sc.nextInt();
			System.out.println("Enter the first co-ordinate for y-axis of Second Line");
			int y3 = sc.nextInt();
			System.out.println("Enter the second co-ordinate for y-axis of Second Line");
			int y4 = sc.nextInt();
			double lengthofline2 = Math.sqrt((x4 - x3) * (x4 - x3) + (y4 - y3) * (y4 - y3)); // Calculating length between the two points of Second Line
			System.out.println("The lenth of second Line is :" + lengthofline2);

	// Checking whether both the lines are of same length or different length using java equals method

			String str1 = String.valueOf(lengthofline1);
			String str2 = String.valueOf(lengthofline2);

			if (str1.equals(str2))
				System.out.println("Both lines are of same length");
			else
				System.out.println("Both the lines are of different length");
			
	// Checking whether one line is greater, equal or less than the other  using java compareTo method

			if (str1.compareTo(str2) == 0)
				System.out.println("The length of line 1 is equal to line 2");
			else if (str1.compareTo(str2) < 0)
				System.out.println("The length of line 1 is greater than that of line 2");
			else if (str1.compareTo(str2) > 0)
				System.out.println("The length of line 1 is less than that of line 2");

		}

	}


