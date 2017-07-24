package Proandplayerlevel;

import java.util.Scanner;

public class StringIndex {

	public static void main(String[] args) {
		String str;
		Scanner scan=new Scanner(System.in);
		str=scan.nextLine();
		String str1=str.toUpperCase();
		String aa=str1.substring(str1.length()-1);
		String bb=str1.substring(0,2);
		String cc=str.substring(2,str.length()-1);
		//System.out.println(cc);
		String str0=aa.toLowerCase();
		System.out.println(str0);
		String str2=bb.toLowerCase();
		System.out.println(str2);
		String output=str2+cc+str0;
		System.out.println(output);
		scan.close();
	}

}
