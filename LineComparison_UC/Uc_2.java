package LineComparison_UC;

import java.util.Scanner;

public class Uc_2 
{
	public static void CheckEquality()
    {
		Scanner sc=new Scanner(System.in);
		
		System.out.println("Enter co-ordinates of line1");
		System.out.println("Enter co-ordinates (x1, y1): ");
		double x1=sc.nextDouble();
		double y1=sc.nextDouble();
        System.out.println("Enter co-ordinates (x2, y2): ");
		double x2=sc.nextDouble();
		double y2=sc.nextDouble();


        System.out.println("Enter co-ordinates of line2");
        System.out.println("Enter co-ordinates (a1, b1): ");
		double a1=sc.nextDouble();
		double b1=sc.nextDouble();
        System.out.println("Enter co-ordinates (a2, b2): ");
		double a2=sc.nextDouble();
		double b2=sc.nextDouble();


        double length1 = Math.sqrt(Math.pow((x2 - x1), 2) + Math.pow((y2 - y1), 2));
        double length2 = Math.sqrt(Math.pow((a2 - a1), 2) + Math.pow((b2 - b1), 2));

        //Console.WriteLine("L1 "+length1+ " L2 "+length2 );

        String answer1 = Double.toString(length1);
        String answer2 = Double.toString(length2);

       // System.out.println(answer1.equals(answer2));
        if(answer1.equals(answer2)==true)
        {
        	System.out.println("two lines are equal");
        }
        else
        	System.out.println("two lines are  not equal");

    }
	public static void main(String[] args) 
	{
		CheckEquality();//since static no need for creating object to the class
		
	}
}
