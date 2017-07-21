package Example;

import java.util.Scanner;

public class UpperandLower {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan=new Scanner(System.in);
		String str=scan.next();
		char ch;
		String output="";
		for(int i=0;i<str.length();i++) {
			ch=str.charAt(i);
			if(ch>=65&&ch<=90)
			{
				output=output+(char)(ch+32);
			}
			else if(ch>=97&&ch<=122)
			{
				output=output+(char)(ch-32);
			}
		}
		System.out.println(output);
		scan.close();

	}

}
