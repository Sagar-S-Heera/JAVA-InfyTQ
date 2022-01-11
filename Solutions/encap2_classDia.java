class MovieTicket{
	private int movieId;
	private int noOfSeats;
	private double costPerTicket;
	
	public int getMovieId() {
		return movieId;
	}

	public void setMovieId(int movieId) {
		this.movieId = movieId;
	}

	public int getNoOfSeats() {
		return noOfSeats;
	}

	public void setNoOfSeats(int noOfSeats) {
		this.noOfSeats = noOfSeats;
	}

	public double getCostPerTicket() {
		return costPerTicket;
	}

	public void setCostPerTicket(double costPerTicket) {
		this.costPerTicket = costPerTicket;
	}

	
	public MovieTicket(int movieId, int noOfSeats) {
		this.movieId=movieId;
		this.noOfSeats=noOfSeats;
	}
	
	public double calculateTotalAmount() {
		double amt=0;
		if(movieId==111) {
			setCostPerTicket(7);
			amt=costPerTicket*noOfSeats;
			amt=amt+(0.02*amt);
			return amt;
		}
		if(movieId==112) {
			setCostPerTicket(8);
			amt=costPerTicket*noOfSeats;
			amt=amt+(0.02*amt);
			return amt;
		}
		if(movieId==113) {
			setCostPerTicket(8.5);
			amt=costPerTicket*noOfSeats;
			amt=amt+(0.02*amt);
			return amt;
		}
		return amt;
	}
}

public class Tester {

	public static void main(String[] args) {
		
	MovieTicket movieTicket = new MovieTicket(112, 3);
        double amount = movieTicket.calculateTotalAmount();
        if (amount==0)
            System.out.println("Sorry! Please enter valid movie Id and number of seats");
        else
            System.out.println("Total amount for booking : $" + Math.round(amount*100)/100.0);

	}

}
