package Proandplayerlevel;
import java.util.*;
public class Gene {

	public static void main(String[] args) {
	Map<String,String>gene=new TreeMap<String,String>();
	Scanner scan=new Scanner(System.in);
	int n=scan.nextInt();
	for(int i=0;i<n;i++)
	{
		gene.put(scan.next(), scan.next());
	}
	String search=scan.next();
	if(gene.containsKey(search))
	{
		System.out.println(gene.get(search));
	}
	else
	{
		System.out.println("The geges doesn't match the input");
	}

	}

}
