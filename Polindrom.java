package examplecoding;

import java.util.Scanner;

public class Polindrom {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan=new Scanner(System.in);
		String str=scan.next();
		String rev=new StringBuffer(str).reverse().toString();
		if(str.equals(rev))
		{
			System.out.println("polindrom");
		}
		else
		{
			System.out.println("not a polindrome");
		}
scan.close();
	}

}
