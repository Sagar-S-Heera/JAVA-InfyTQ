class Rectangle {
    public float length;
    public float width;
    
    public double calculateArea(){
        double area = length*width;
        double roundOff = (double) Math.round(area * 100.0) / 100.0;
        return roundOff;
    }
    public double calculatePerimeter(){
        double perimeter = 2*(length+width);
        double roundOff = (double) Math.round(perimeter * 100.0) / 100.0;
        return roundOff;
    }
}

class Tester {
	public static void main(String args[]) {
		Rectangle rectangle=new Rectangle();
		//Assign values to the member variables of Rectangle class
                rectangle.length=12f;
                rectangle.width=5f;
		//Display the area and perimeter using the lines given below
		double area = rectangle.calculateArea();
		double perimeter = rectangle.calculatePerimeter();
		System.out.println("Area of the rectangle is "+ area);
		System.out.println("Perimeter of the rectangle is "+ perimeter );
	}
}