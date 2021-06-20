interface MembershipInterface { // �������̽� ���� �� ��� ���� �� �ʿ��� ����̱� ������ �������̽��� ����. �ٸ��ſ����� �ٸ��� ������ �� �ֵ���
	final int TIMEOUT = 10000; // ��� �ʵ� ����
	void getPoint(); 		// �߻� �޼ҵ�
	void losePoint(); 	// �߻� �޼ҵ�
 	void zero();        // �߻� �޼ҵ�
	default void Point() { // default �޼ҵ�
		System.out.println("** Your Point **");
	}
}

class group implements MembershipInterface { // �������̽� ���� 
	
	// MembershipInterface�� �޼ҵ� ����
	@Override
	public void getPoint() { 
		System.out.println("�����Ǿ����ϴ�");
	}
	@Override
	public void losePoint() { 
		System.out.println("����Ʈ�� �����˴ϴ�");
	}
	
	// �޼ҵ� �߰� �ۼ�
	public void zero() { 
		System.out.println("��� ����Ʈ�� �Ҹ� �˴ϴ�");  }
}

public class Member {
	public static void main(String[] args) {
		group member = new group();
		member.Point(); //����Ʈ ����
		member.getPoint();  // ���� ����Ʈ ����
		member.losePoint();  // ������ ����Ʈ ����
		member.zero();  // ���� ������ ���� ����Ʈ �Ҹ�
	}
}


 