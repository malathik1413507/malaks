package Proandplayerlevel;

import java.util.Scanner;

public class ArbitrarilyandNonnegative {
	public static void main(String[] args) {
		Scanner  scan=new Scanner(System.in);
		String one=scan.next();
		String two=scan.next();
		int a=Integer.parseInt(two);
		int b=Integer.parseInt(one);
		int c=0;
		if(a>0&&b>0)
		{
			c=Math.abs(a*b);
		}
		StringBuilder s=new StringBuilder();
		s.append(c);
		System.out.println(s);
		scan.close();
		
	}

}
