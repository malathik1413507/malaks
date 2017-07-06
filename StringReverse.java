package Example;

import java.util.Scanner;

public class StringReverse {

	public static void main(String[] args) {
		Scanner scan=new Scanner(System.in);
		String str=scan.nextLine();
		int length=str.length();
		String reverse="";
		for(int i=length-1;i>=0;i--)
		
			reverse=reverse+str.charAt(i);
		
		System.out.println(reverse);
	}

}
