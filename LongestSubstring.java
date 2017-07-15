package examplecoding;

import java.util.Scanner;

public class LongestSubstring {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan=new Scanner(System.in);
		String input=scan.next();
		String output="";
		for(int i=1;i<input.length();i++)
		{
			int s=input.charAt(i)-input.charAt(i-1);
			if(s>0)
			{
				output=input.substring(i);
				break;
			}
		}
		if(output.length()==0)
		{
			System.out.println("no longest substring");
		}
		else
		{
			System.out.println("The longest substring is:"+output);
		}

		scan.close();

	}

}
