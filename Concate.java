package Example;

public class Concate {
	 public static String strcat(String str1, String str2){
	        char[] charArr1 = str1.toCharArray();
	        char[] charArr2 = str2.toCharArray();
	        System.out.println(charArr1);
	        System.out.println(charArr2);
	        int counter=charArr1.length+charArr2.length;
	        char[] charContainer=new char[counter];
	        int i=0;
	        for(; i<charArr1.length; i++) {
	            charContainer[i]=charArr1[i];
	        }
	        for(int j=0; i<counter; j++,i++) {
	            charContainer[i]=charArr2[j];
	        }
	        return new String(charContainer);
	    }
	    public static void main(String args[]){
	        String str1 = "Hello";
	        String str2 = "World";
	        String strContainer = strcat(str1,str2);
	        System.out.println(strContainer);  
	    }
}
