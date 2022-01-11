class Calculator {
    public int num;
    public int sumOfDigits(){
        int sum=0,r=0;
        while(num!=0){
            r = num%10;
            sum+=r;
            num = num /10;
        }
        return sum;
    }
}

class Main {

	public static void main(String args[]) {

	Calculator calculator = new Calculator();
        calculator.num=6547;
        System.out.println(calculator.sumOfDigits());
	}
}