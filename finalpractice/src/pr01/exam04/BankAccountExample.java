//문제
// BankAccountExample 클래스 (main)
//	•	BankAccount 객체 1개 생성
//	•	10,000원 입금 → 잔액 출력
//	•	5,000원 출금 → 출금액과 잔액 출력
//	•	10,000원 출금 → 출금액과 잔액 출력

package pr01.exam04;

public class BankAccountExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		BankAccount account = new BankAccount("홍길동", "123-456");
		
		System.out.println("입금 후 잔액: " + account.deposit(10000) + "원");
		System.out.println("출금액: " + account.withdrawal(5000) + "원, 잔액" + account.getBalance() + "원");
		System.out.println("출금액: " + account.withdrawal(10000) + "원, 잔액" + account.getBalance() + "원");

	}
}
