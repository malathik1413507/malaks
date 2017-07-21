package Example;

import java.util.Scanner;

public class Example {
	public static void main(String[] args) {
		Scanner scan=new Scanner(System.in);
		String str=scan.nextLine();
		String value="";
		int count[]=new int[str.length()];
		String arr[]=str.split("\\s");
		for(int i=0;i<arr.length;i++)
		{
			value=arr[i];
			for (int j=0;j<arr.length;j++) {
				if(value.equals(arr[j]))
				{
					
					count[i]++;
				}
				
			}
			
		}
		for (int i = 0; i < arr.length; i++) {
			for(int j=0;j<arr.length;j++)
			{
				value=arr[i];
				
					if(value.equals(arr[j]))
					{
						if(i!=j)
						{
							arr[i]="";
						}
					
					}
				
			}
			
		}
		for(int i=0;i<arr.length;i++)
		{
			if(arr[i]!="")
			{
				System.out.println(arr[i]+ "-" +count[i]);
			}
				
		}
		scan.close();
		
	}
}
