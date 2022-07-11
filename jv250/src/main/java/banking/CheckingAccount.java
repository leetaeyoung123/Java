package banking;

public class CheckingAccount extends Account {
	private double overdraftAmount;	// 한도액

	public CheckingAccount() {
		
	};
	
	public CheckingAccount(String accountNum, double balance, double overdraftAmount) {
		super();
		this.overdraftAmount = overdraftAmount;
	}
	
	public void withdraw(double amount) {	// 잔고
		if( balance < amount ) {
			// 잔고부족시 overdraftAmount 금액 한도 내에서 추가 출금을 승인
			if( overdraftAmount + balance >= amount) {
				System.out.println("출금 전 금액: " + balance + "원");
				balance -= amount;
				System.out.println(amount + " 원 출금 후 금액: " + balance + "원");
			}
		} else {
			// 예외 발생
			throw new InsufficientBalance("한도 부족");
		}
	}
	
	public double getOverdraftAmount() {
		return overdraftAmount;
	}

	public void setOverdraftAmount(double overdraftAmount) {
		this.overdraftAmount = overdraftAmount;
	}

}
