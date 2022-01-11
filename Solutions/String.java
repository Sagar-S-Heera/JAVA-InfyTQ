class Tester{
    public static String removeWhiteSpaces(String str){
		String res="";
		for(int i=0;i<str.length();i++){
		    if(str.charAt(i)==' ')
		    continue;
		    else
		    res=res+str.charAt(i);
		}
        return res;
	}
	
	public static void main(String args[]){
		String str = "Hello   How are you   ";
		str = removeWhiteSpaces(str);
		System.out.println(str);
	}
}