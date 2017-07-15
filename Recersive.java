package examplecoding;

import java.util.Scanner;

public class Recersive {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan=new Scanner (System.in);
		System.out.println("Enter the string\n");
		String str=scan.next();
		String rev="";
		scan.close();
    for(int i=str.length()-1;i>=0;i--)
		{
			rev+=str.charAt(i);
			
		}
		System.out.println(rev);
		
	}

}
