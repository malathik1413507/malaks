package examplecoding;

import java.util.Scanner;

public class StartValue {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan=new Scanner(System.in);
		int num=scan.nextInt();
		for(int i=num;i>0;i--)
		{
			for(int j=0;j<i;j++)
			{
				System.out.print("*");
			}
			System.out.print(" ");
			for(int j=1;j<=i;j++)
			{
				System.out.print("*");
			}
			
			System.out.println();
		}

	}

}
