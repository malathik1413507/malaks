package examplecoding;

import java.util.Scanner;

public class RemoveDuplicate {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan=new Scanner(System.in);
		String str=scan.next();
		char ch;
		String s="";
		scan.close();
		for(int i=0;i<str.length();i++)
		{
			ch=str.charAt(i);
			if(ch!=' ')
			{
				s=s+ch;
				str=str.replace(ch, ' ');
			}
			
		}
		System.out.println(s);

	}

}
