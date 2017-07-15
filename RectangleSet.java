package examplecoding;

import java.util.Scanner;

public class RectangleSet {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan=new Scanner(System.in);
		System.out.println("First rectangle left side x and y axis");
		int x1=scan.nextInt();
		int y1=scan.nextInt();
		System.out.println("First rectangle right side x and y axis");
		int x2=scan.nextInt();
		int y2=scan.nextInt();
		System.out.println("Second rectangle left side x and y axis");
		int x3=scan.nextInt();
		int y3=scan.nextInt();
		System.out.println("Second rectangle right side x and y axis");
		int x4=scan.nextInt();
		int y4=scan.nextInt();
		if(x3>x2||x4<x1||y3>y2||y4<y1)
		{
			System.out.println("true");
		}
		else
		{
			System.out.println("false");
		}
		scan.close();

	}

}
