class Tester{
    
    public static String moveSpecialCharacters(String str){
		//Implement your code here and change the return value accordingly
		//Special Characters (32–47 / 58–64 / 91–96 / 123–126)
		
		String s="";
		for(int i=0;i<str.length();i++){
		    char c= str.charAt(i);
		    if((c>=32&&c<=47)||(c>=58&&c<=64)||(c>=91&&c<=96)||(c>=123&&c>=126))
		    continue;
		    else
		    s+=c;
		}

		for(int i=0;i<str.length();i++){
		    char c= str.charAt(i);
		    if((c>=32&&c<=47)||(c>=58&&c<=64)||(c>=91&&c<=96)||(c>=123&&c>=126))
		    s+=c;
		}
        return s;
	}
	
	public static void main(String args[]){
	    String str = "He@#$llo!*&";
	    //String s ="%$Wel*&come!";

	    System.out.println(moveSpecialCharacters(str));
	    //System.out.println(moveSpecialCharacters(s));
	}
	
}