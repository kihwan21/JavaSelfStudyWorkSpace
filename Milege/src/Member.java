interface MembershipInterface { // 인터페이스 선언 각 멤버 별로 꼭 필요한 기능이기 때문에 인터페이스로 선언. 다른거에서도 다르게 구현할 수 있도록
	final int TIMEOUT = 10000; // 상수 필드 선언
	void getPoint(); 		// 추상 메소드
	void losePoint(); 	// 추상 메소드
 	void zero();        // 추상 메소드
	default void Point() { // default 메소드
		System.out.println("** Your Point **");
	}
}

class group implements MembershipInterface { // 인터페이스 구현 
	
	// MembershipInterface의 메소드 구현
	@Override
	public void getPoint() { 
		System.out.println("적립되었습니다");
	}
	@Override
	public void losePoint() { 
		System.out.println("포인트가 차감됩니다");
	}
	
	// 메소드 추가 작성
	public void zero() { 
		System.out.println("모든 포인트가 소멸 됩니다");  }
}

public class Member {
	public static void main(String[] args) {
		group member = new group();
		member.Point(); //포인트 보기
		member.getPoint();  // 얻은 포인트 보기
		member.losePoint();  // 차감된 포인트 보기
		member.zero();  // 졸업 등으로 인한 포인트 소멸
	}
}


 