
import java.util.*;

public class StudentsGradeCal {
	public static String gradeCalculation(double percentage)
	{
		
		
			if(percentage>90 && percentage<=100)
				return "Grade O";
			else if(percentage>80 && percentage<=90)
				return "Grade A+";
			else if(percentage>70 && percentage<=80)
				return "Grade A";
			else if(percentage>60 && percentage<=70)
				return "Grade B+";
			else if(percentage>50 && percentage<=60)
				return "Grade B";
			else if(percentage>=45 && percentage<=50)
				return "Pass";	
		
			return "null";
	}

	public static void main(String[] args)
	{
		Scanner scan=new Scanner(System.in);
		
		// Given Input
		int totalmark=0,subjcount;
		String result="Pass",studname;
		
		System.out.println("\n\n\t\t * *  * * * Students Grade Calculation * * * * *");
		System.out.print("\n Student Name : ");
		studname=scan.nextLine();

		System.out.print("\n Enter Your All Subjects count : ");
		subjcount=scan.nextInt();

		System.out.println("\n Enter Your All Subjects Marks (Out of 100) ");
		// Marks Input to get User
		double mark[]=new double[subjcount];
		
		for(int i=0;i<subjcount;i++)
		{
			System.out.print("\n Subject "+(i+1)+" : ");
			mark[i]=scan.nextDouble();
			if(mark[i]>100)
			{
				i--;
				System.out.println("\n Your Mark is out of 100 ");
			}
			else
			{
				totalmark+=mark[i];
				if(mark[i]<45)
					result="Fail";
			}
			
		}

		if(result.equals("Pass"))
		{
			// Total Mark 
			System.out.println("\n Total Mark : "+totalmark);

			// Percentage of total mark
			double avgpercent=totalmark/subjcount;
			System.out.println("\n Average Percentage : "+avgpercent);

			// Grade Calculation 
		 	System.out.println("\n Result : "+gradeCalculation(avgpercent));
		}
		else
			System.out.println("\n Result : "+result);
			
		 
		 scan.close();
	} 
}