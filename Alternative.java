package examplecoding;

import java.util.Scanner;

public class Alternative {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan=new Scanner(System.in);
		int last;
		int b=1;
		System.out.println("Enter the number");
		int n=scan.nextInt();
		last=n;
		int arr[]=new int[n];
		for(int i=0;i<n;i++)
		{
			arr[i]=i+1;
		}
		for(int i=0;i<n;i++)
		{
			if(i%2==0)
			{
				arr[i]=last;
				last--;
			}
			else{
				arr[i]=b;
				b++;
			}
		}
		for(int i=0;i<n;i++)
		{
			System.out.print(arr[i]+" ");
		}
		scan.close();
		
	
		}
		

	}


