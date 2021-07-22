package EmployeeWage_UC;

public class Uc_5 
{
	public void wagesForMonth(int total_hours_in_day_work,int parttime_hours_in_day_work,
			int Wage_for_hour,int total_days_in_month_work)
	{
	/*	int total_hours_in_day_work=8;
	    int parttime_hours_in_day_work=4;    
	    float Wage_for_hour=20;
	    int total_days_in_month_work=20;*/
	    if((Math.random()*10 )%2==1)
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
	public static void main(String[] args) {
		Uc_5 uc=new Uc_5();
		uc.wagesForMonth(8,4,20,20);
	}
}

