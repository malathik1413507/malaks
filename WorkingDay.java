package examplecoding;

import java.util.Scanner;

public class WorkingDay {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan=new Scanner(System.in);
		String workingday=scan.next();
		if(workingday.equals("sunday")||(workingday.equals("saturday")))
		{
			System.out.println("false");
		}
		else
		{
			System.out.println("true");
		}
		scan.close();
	}

}
