//문제
//BankAccount 클래스
//	•	필드: 모두 private
//	•	String name → 계좌주 이름
//	•	String accountNumber → 계좌 번호
//	•	int balance → 잔액
//	•	생성자:
//	•	(name, accountNumber)
//	•	(name, accountNumber, balance)
//	•	메소드:
//	1.	int deposit(int amount) → 입금: balance += amount, 최종 balance 반환
//	2.	int withdrawal(int amount) → 출금: amount > balance이면 balance만큼만 출금, balance 업데이트, 실제 출금액 반환
//	•	Getter/Setter 모두 추가

package pr01.exam04;

public class BankAccount {
	
	private String name;
	private String accountNumber;
	private int balance;
	
	public BankAccount(String name, String accountNumber) {
		this.name = name;
		this.accountNumber = accountNumber;
		this.balance = 0;
	}
	
	public BankAccount(String name, String accountNumber, int balance) {
		this.name = name;
		this.accountNumber = accountNumber;
		this.balance = balance;
	}
	
	public int deposit(int amount) {
		balance += amount;
		return balance;
	}
	
	public int withdrawal(int amount) {
		int withdrawal;
		if(amount > balance) {
			withdrawal = balance;
		} else {
			withdrawal = amount;
			balance -= amount;
		}
		return withdrawal;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getAccountNumber() {
		return accountNumber;
	}

	public void setAccountNumber(String accountNumber) {
		this.accountNumber = accountNumber;
	}

	public int getBalance() {
		return balance;
	}

	public void setBalance(int balance) {
		this.balance = balance;
	}
	
}
