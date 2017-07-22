package Example;



public class RemoveDuplicate {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//		Scanner scan=new Scanner(System.in);
//		String str=scan.next();
		 String s = "malayalam";
	        String s2 = "";
	        for (int i = 0; i < s.length(); i++) {
	            Boolean found = false;
	            for (int j = 0; j < s2.length(); j++) {
	                if (s.charAt(i) == s2.charAt(j)) {
	                    found = true;
	                    break; //don't need to iterate further
	                }
	            }
	            if (found == false) {
	                s2 = s2.concat(String.valueOf(s.charAt(i)));
	            }
	        }
	        System.out.println(s2);

	}

}
