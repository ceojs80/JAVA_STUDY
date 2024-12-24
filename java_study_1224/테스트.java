package java_study_1224;

public class 테스트 {

	public static void main(String[] args) {
		//1. 입금, 출금 테스트하기
		
		String 계좌번호 = "174509";
		BasicAccount account1 = new BasicAccount(계좌번호);
		
		//System.out.println("계좌 번호 : " + account1.accountNumber);//private 접근못함
		
		//private 필드변수를 호출하는 메소드를 'getter' 함수라고 한다.
		double 잔액 = account1.getBalance();
		String 계좌번호출력 = account1.getAccountNumber();
		System.out.println("잔액: " + 잔액);
		System.out.println("계좌번호출력 : " + 계좌번호출력);
		
		account1.deposit(5000); //5천원 입금
		잔액 = account1.getBalance(); //잔액 getter 메소드 재호출
		System.out.println("잔액: " + 잔액);
	}

}
