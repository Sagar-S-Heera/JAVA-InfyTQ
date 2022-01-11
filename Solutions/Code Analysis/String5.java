import java.util.HashSet;
import java.util.LinkedHashSet;

class Tester{
    public static String removeDuplicatesandSpaces(String str){
        //Implement your code here and change the return value accordingly
        int n=str.length();
		HashSet<Character> s = new LinkedHashSet<>(n - 1);
	      // HashSet doesn't allow repetition of elements
	        for (char x : str.toCharArray())
	            s.add(x); 
        String newStr=" ";
        for(char i1 : s) {
        	if(i1 ==' ')
        		continue;
        	else
        		newStr +=i1;
        }
        return newStr;
	}
	
	public static void main(String args[]){
	    String str = "object oriented programming";
	    System.out.println(removeDuplicatesandSpaces(str));
	}
}