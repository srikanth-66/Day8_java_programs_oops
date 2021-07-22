package EmployeeWage_UC;

public class Uc_6
{
	public void reac(int total_hours_in_day_work,int parttime_hours_in_day_work,
			int Wage_for_hour,int total_days_in_month_work)
	{
		 if((Math.random()*10 )%2==1)
		    {
			int total_hours_in_month_work=100;
			if(total_hours_in_month_work==100 &&  total_days_in_month_work==20)
		    	{
		   	 	double empWage=Wage_for_hour* total_hours_in_day_work*total_days_in_month_work;
		    	 	System.out.println("employee wage  is="+empWage);
		   	}
		   	else
		    	{
			 	double empWage=Wage_for_hour* parttime_hours_in_day_work*total_days_in_month_work;
			 	System.out.println("employee wage  is="+empWage);
			}
		    }
		    else
		    {
			System.out.println(" logic");
		    }
	        
	}
	public static void main(String[] args) {
		Uc_6 uc =new Uc_6();
		uc.reac(8, 4, 20, 100);
		
	}
}
