
import java.util.Scanner;

public class DaysInMonth
{
	public static void main(String arg[])
	{
		String choice;
		Scanner scan=new Scanner(System.in);
		
		
	    System.out.println("Enter month(First three letters eg. jan/jul) : ");
		choice=scan.nextLine();
		
		switch(choice)
		{
		case "jan" :{ 
						System.out.println("Number of days : 31");
						break;
					} 
		case "feb" :{ 
						System.out.println("Number of days : 28/29");
						break;	
					}
		case "mar" :{
						System.out.println("Number of days : 31");
						break;
					}
		case "apr" :{
						System.out.println("Number of days : 30");
						break;
					}
		case "may" :{
						System.out.println("Number of days : 31");
						break;
					}
		case "jun" :{
						System.out.println("Number of days : 30");
						break;
					}
		case "jul" :{
						System.out.println("Number of days : 31");
						break;
					}
		case "aug" :{
						System.out.println("Number of days : 31");
						break;
					}
		case "sep" :{
						System.out.println("Number of days : 30");
						break;
					}
		case "oct" :{
						System.out.println("Number of days : 31");
						break;
					}
		case "nov" :{
						System.out.println("Number of days : 30");
						break;
					}
		case "dec" :{
						System.out.println("Number of days : 31");
						break;
					}
		}
	}

}

