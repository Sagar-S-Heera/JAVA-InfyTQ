import java.util.Scanner;

class Calculator {
    public double findAverage(int number1, int number2, int number3){
        double r = (number1+number2+number3)/3.0;
        double roundOff = Math.round(r*100.0)/100.0;
        //System.out.printf("%.2f", r/3.0 );
        return roundOff;
    }
}

class Tester {
	public static void main(String args[]) {
		Calculator calculator = new Calculator();
		Scanner sc = new Scanner(System.in);
		int a,b,c;
		a=sc.nextInt();
		b=sc.nextInt();
		c=sc.nextInt();
		calculator.findAverage(a,b,c);
		//System.out.printf("%.2f",d);
	}
}