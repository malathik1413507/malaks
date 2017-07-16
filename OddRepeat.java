package examplecoding;

import java.lang.reflect.Array;
import java.util.Scanner;

public class OddRepeat {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan=new Scanner(System.in);
		int count=1;
		int m=0;
		int k=0;
		int num=scan.nextInt();
		Array[] arr=new Array[num];
		for(int i=0;i<num-1;i++)
		{
			for(int j=i+1;i<=num;j++)
			{
				if(arr[i]==arr[j])
				{
					count++;
				}
			}
			if(count%2==1)
			{
				m=i;
				k=count;
			}
			count=1;
		}
		scan.close();
		System.out.println("repeated values are"+arr[m]+ k);

	}

}
