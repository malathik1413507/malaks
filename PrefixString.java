package Example;

import java.lang.reflect.Array;
import java.util.*;
import java.text.*;
import java.math.*;
import java.io.*;

public class PrefixString {
public static void main(String[] args) {
		Scanner scan=new Scanner(System.in);
		String str=scan.next();
		int n=str.length();
		int arr[]=new int[n];
		for(int i=0;i<n;i++)
		{
			arr[i]=str.charAt(i)-48;
		}
		Arrays.sort(arr);
		for(int i=0;i<n;i++)
			System.out.print(arr[i]);
		scan.close();
	}

}
