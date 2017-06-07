package Example;
import java.lang.*;
import java.util.*;
public class String_Example {
public static void main(String args[])
{
	
	Scanner input=new Scanner(System.in);
	System.out.println("Enter the string");
	String name=input.next();
	String reverse=new StringBuffer(name).reverse().toString();
	System.out.println(reverse);
	String strnew=reverse.replaceAll("[aeiouAEIOU]", "");
	System.out.println(strnew);
}
}
