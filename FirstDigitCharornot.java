package examplecoding;

import java.util.Scanner;

public class FirstDigitCharornot {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		String s=sc.nextLine();
		sc.close();
		if(Character.isDigit(s.charAt(0)))
		System.out.print(true);
		else
		System.out.print(false);
		

	}

}
