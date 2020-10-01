
public class Account {

	private int id = 0;
	private double balance = 0;
	private double annualInterestRate = 0;
	private java.util.Date dateCreated;
	
	public Account() {
		dateCreated = new java.util.Date();
	}
	
	
	public void setDateCreated(java.util.Date dateCreated) {
		this.dateCreated = dateCreated;
	}



	public Account(int id, int balance) {
		this();
		this.id = id;
		this.balance = balance; 
	}
	
	public int getId() {
		return id;
	}
	
	public void setId(int id) {
		this.id = id;
	}
	
	public double getBalance() {
		return balance; 
	}
	
	public void setBalance(double balance) {
		this.balance = balance; 
	}
	
	
	public double getAnnualInterestRate() {
		return annualInterestRate;
	}
	
	public void setAnnualInterestRate(double annualInterestRate) {
		this.annualInterestRate = annualInterestRate;

	}
	
	public String getDateCreated() {
		return this.dateCreated.toString();
		
	}
	
	public double getMonthlyInterestRate() {
		return (annualInterestRate / 100) / 12;
	}
	
	public double getMonthlyInterest() {
		return balance * getMonthlyInterestRate();
	}
	
	public void withdraw(double amount) {
		balance =- amount; 
	}
	
	public void deposit(double amount) {
		balance =+ amount;
	}
	
	
	
}


