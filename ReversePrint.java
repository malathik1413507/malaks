package examplecoding;

import java.util.Scanner;

public class ReversePrint {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan=new Scanner(System.in);
		String input=scan.nextLine();
		int a=input.indexOf(" ");
		int len=input.length();
		System.out.println(input.substring(a+1,len)+" "+input.substring(0,a));
		scan.close();

	}

}
