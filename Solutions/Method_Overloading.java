import java.lang.Math;
class Point {
	
	private double xCordinate;
	private double yCordinate;	
	
	public double getxCordinate() {
		return xCordinate;
	}

	public void setxCordinate(double xCordinate) {
		this.xCordinate = xCordinate;
	}

	public double getyCordinate() {
		return yCordinate;
	}

	public void setyCordinate(double yCordinate) {
		this.yCordinate = yCordinate;
	}

	public Point(double xCoordinate , double yCoordinate ) {
		this.xCordinate=xCoordinate;
		this.yCordinate=yCoordinate;
	}
	public double calculateDistance() {
		double d = Math.sqrt(Math.pow(xCordinate, 2)+Math.pow(yCordinate, 2));
		double roundOff = Math.round(d * 100.0) / 100.0;
		return roundOff;
	}
	public double calculateDistance(Point point) {
		double d = Math.sqrt(Math.pow(Math.abs(xCordinate-point.xCordinate), 2)+Math.pow(Math.abs(yCordinate-point.yCordinate), 2));
		double roundOff = Math.round(d * 100.0) / 100.0;
		return roundOff;		
	}
}


class Tester {

	public static void main(String[] args) {
		Point point1 = new Point(3.5, 1.5);
        Point point2 = new Point(6, 4);
                                
        System.out.println("Distance of point1 from origin is "+point1.calculateDistance());
        System.out.println("Distance of point2 from origin is "+point2.calculateDistance());
        System.out.println("Distance of point1 from point2 is "+point1.calculateDistance(point2));
        
        //Create more objects for testing your code                

	}
}
