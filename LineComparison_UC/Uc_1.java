package LineComparison_UC;

public class Uc_1 
{
	public Uc_1(int x1,int x2,int y1,int y2)
	{
		//int x1=10,x2=15,y1=30,y2=45;
		double length=Math.sqrt((x2-x1)^2+(y2-y1)^2);
		System.out.println("length of line is "+length);
		//display();
	}
	
	public static void main(String[] args) {
		Uc_1 uc=new Uc_1(10,15,30,45);
	}

}
