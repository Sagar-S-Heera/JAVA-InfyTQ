import java.util.Scanner;

class Tester {
    public static String reverseEachWord(String str){
		    String[] words = str.split(" ");
		    String newWords="";
			for(String s: words) {
				StringBuilder sb = new StringBuilder(s);
				sb.reverse();  
			    String rev=sb.toString();
			    newWords = newWords + (rev+" ");
			}
			return newWords;
		}
	
	public static void main(String args[]){
	    Scanner sc = new Scanner(System.in);
	    String str = sc.nextLine();
	    System.out.println(reverseEachWord(str));
	}
}