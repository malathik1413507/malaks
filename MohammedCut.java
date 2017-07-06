package Example;

import java.util.Scanner;

public class MohammedCut {
	public static int mohamedChocolate(int m,int n){
		if(m==0||n==0)
			return 0;
		return (m*n)-1;
}
	
	        public static void main(String args[]) {
	        	Scanner scr=new Scanner(System.in);
	    		System.out.println("Enter M Value");
	    		int M=scr.nextInt();
	    		int N=scr.nextInt();
	    		System.out.println(mohamedChocolate(M, N));
	    		
	    }

}
