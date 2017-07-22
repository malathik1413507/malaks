package Example;

import java.util.Scanner;

public class NonRepeating {
	public static char findFirstNonRepeatChar(String input){
		 char ch = '\0';
		 for(int i=0;i<input.length();i++){
		    ch = input.charAt(i);
		    if((i!=0) && (ch!=input.charAt(i-1)) && (i==input.lastIndexOf(ch))){
		        return ch;
		    }
		 }
		 return ch;
		}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan=new Scanner(System.in);
		String str=scan.nextLine();
		System.out.println(findFirstNonRepeatChar(str));
		scan.close();
	
			
		
		
		
	}

}
