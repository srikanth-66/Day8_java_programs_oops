package EmployeeWage_UC;

public class Uc_1 
{
	public void empPresentAbsent()
	{
		int check;
		check=(int) Math.floor(Math.random()*10%2);
		if(check==0)
		{
			System.out.println("Employee is absent");
		}
		else
			System.out.println("Employee is present");
	}
	public static void main(String[] args) {
		
	Uc_1 uc1=new Uc_1();
	uc1.empPresentAbsent();
	}
}
