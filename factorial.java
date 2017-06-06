import java.util.*;
public class Factorial
{
public static void main(String args[]){
int fact=1,i;
Scanner input=new Scanner(System.in);
System.out.println("Enter the Factorial Number");
int no=input.nextInt();
for(int i=0;i<=no;i++)
{
fact=fact*i;
System.out.println("Factorial number in" fact);
}
}
}
