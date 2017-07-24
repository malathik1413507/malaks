package Example;

import java.util.Arrays;
import java.util.Scanner;

public class ArraySort {

	public static void main(String[] args) {
		Scanner scan=new Scanner(System.in);
		String str1=scan.nextLine();
		String[] str=str1.split(" ");
		for(int i=0;i<str.length;i++)
		{
			Arrays.sort(str);
		}
			for(String string:str) {
				System.out.println(string);
			
		
		}
		scan.close();
		

	}

}
