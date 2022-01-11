class Tester{
    public static boolean checkPalindrome(String str){
	    //Implement your code here and change the return value accordingly
		
	    StringBuilder sb=new StringBuilder(str);  
	    sb.reverse();  
	    String rev=sb.toString();  
	    if(str.equals(rev))  
	        return true;  
	    else
	        return false; 
	}
	
	public static void main(String args[]){
		String str = "radar";
		if(checkPalindrome(str))
			System.out.println("The string is a palindrome!");
		else
			System.out.println("The string is not a palindrome!");
	}
}