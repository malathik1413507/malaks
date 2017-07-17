package examplecoding;

import java.util.Scanner;

public class Coprime {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan=new Scanner(System.in);
		int count1=1;
		int count2=1;
		int n1=scan.nextInt();
		int n2=scan.nextInt();
		for(int i=1;i<n1;i++)
		{
			if(n1%i==1)
			{
				count1++;
			}
		}
		for(int j=1;j<n2;j++)
		{
			if(n2%j==1)
			{
				count2++;
			}
		}
		if(count1==count2)
		{
			System.out.println("co-prime");
		}
		else
		{
			System.out.println("no prime");
		}
		scan.close();

	}

}
