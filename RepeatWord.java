package examplecoding;

import java.util.Scanner;

public class RepeatWord {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan=new Scanner(System.in);
		System.out.println("Enter the string");
		String str=scan.nextLine();
		char ch[]=str.toCharArray();
		int count=1;
		int k=0;
		int m=0;
		int len=str.length();
		for(int i=0;i<len-1;i++)
		{
			for(int j=i+1;j<len;j++)
			{
				if(ch[i]==ch[j])
				{
					count++;
				}
			} if(count>k)
			{
				m=i;
				k=count;
				}count=1;
			}System.out.println(ch[m]+" occurs "+k+" times");

	}

}
