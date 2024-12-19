package java_study_1219;

/*
 * *상속(다양성)*
 */
class X{
	public void showMeTheMoney() {
		System.out.println("my money : " + 100000 + "$");
	}
}
//extends : 상속하다
class Y extends X{ //Y클래스가 X클래스를 상속받다.
	//Y클래스는 X클래스의 필드변수와 메소드를 사용할 수 있다.
    @Override // 부모클래스에 정의된 메소드 '재정의(오버라이딩)'
	public void showMeTheMoney() {
    	System.out.println("my(Y)money:"+900000+"$");
    }
}
 
    public void showMeTheMessage() {//리턴값이 없는 void 메소드
public class 복습2 {

	public static void main(String[] args) {
		
		X x = new X(); // X클래스 호출(객체 생성 or 인스턴스화)

	}

}
