package examplecoding;

import java.util.Scanner;

public class WeekEnd {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan=new Scanner(System.in);
		  System.out.println("Enter a day : ");
	        String day=scan.next();
		 switch(day.toLowerCase()){
         case "sunday":System.out.println("WorkingDay("+day+") : "+false);break;
         default:System.out.println("WorkingDay("+day+") : "+true);
		}
		 scan.close();

	}

}
