class User{
	private int id;
	private String userName;
	private String emailId;
	private double walletBalance;
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getUserName() {
		return userName;
	}
	public void setUserName(String userName) {
		this.userName = userName;
	}
	public String getEmailId() {
		return emailId;
	}
	public void setEmailId(String emailId) {
		this.emailId = emailId;
	}
	public double getWalletBalance() {
		return walletBalance;
	}
	public void setWalletBalance(double walletBalance) {
		this.walletBalance = walletBalance;
	}
	public User(int id, String userName, String emailId, double walletBalance){
		this.id=id;
		this.userName=userName;
		this.emailId=emailId;
		this.walletBalance=walletBalance;
	}
	public boolean makePayment(double billAmount) {
		if(walletBalance!=0) {
			if(walletBalance>=billAmount) {
				walletBalance-=billAmount;
				setWalletBalance(walletBalance);
				return true;
			}else return false;
		}
		else 
			return false;
	}
}

class PremiumUser extends User{
	
	private int rewardPoints;
	
	public int getRewardPoints() {
		return rewardPoints;
	}
	public void setRewardPoints(int rewardPoints) {
		this.rewardPoints = rewardPoints;
	}
	public PremiumUser(int id, String userName, String emailId, double walletBalance) {
		super(id, userName, emailId, walletBalance);
	}
	@Override
	public boolean makePayment(double billAmount) {
		double walletBalance;
		walletBalance=super.getWalletBalance();
		if(walletBalance!=0) {
			if(walletBalance>=billAmount) {
				walletBalance-=billAmount;
				rewardPoints += 0.1*billAmount;
				setWalletBalance(walletBalance);
				return true;
			}else return false;
		}
		else 
			return false;
	}

}

class Tester {

	public static void main(String[] args) {

        User user = new User(101, "Joe", "joe@abc.com", 100);

		PremiumUser premiumUser = new PremiumUser(201, "Jill", "jill@abc.com", 300);

		processPayment(user, 70);

		processPayment(premiumUser, 150);

		processPayment(premiumUser, 80);

		processPayment(premiumUser, 120);

    }

    public static void processPayment(User user, double billAmount) {
        if (user.makePayment(billAmount)) {
			System.out.println("Congratulations " + user.getUserName() + ", payment of $" + billAmount + " was successful!");
		} else {
			System.out.println("Sorry " + user.getUserName() + ", you do not have enough balance to pay the bill!");
		}
		System.out.println("Your wallet balance is $" + user.getWalletBalance());

		if (user instanceof PremiumUser) {
			PremiumUser premiumUser = (PremiumUser) user;
			System.out.println("You have " + premiumUser.getRewardPoints() + " points!");
		}
		System.out.println();

	}

}
