
//public class loop {
//
//	public static void main(String[] args) {
//		int sum = 0;
//		int i;
//		for(i = 0; i <= 100; i++) {
//			sum += i;
//		} System.out.print(sum);
//	}
//}

//public class loop {
//	public static void main(String[] args) {
//		int sum = 0;
//		
//		for(int i=1; i <= 10; i++) {
//			sum +=i;
//			System.out.print(i); //���ϴ� �� ���
//			if(i<=9) { // 1 ~ 9 ������ + ���
//				System.out.print("+");
//			}else { //i �� 10�ΰ��
//				System.out.print("="); // =�� ����ϰ�
//				System.out.print(sum); // ������� ���
//			}
//		}
//	}
//}

public class loop {
	public static void main(String[] args) {
		for(int i=2; i<10; i++) { //2�ܿ��� 9��
			for(int j=1; j<10; j++) { //������ ���
				System.out.print(i + "*" + j + "=" + i*j); //������ ���
				System.out.print('\t'); // �ϳ��� ������ ���
			}
			System.out.println(); //�� ���� ������ ���� �ٷ� Ŀ�� �̵�
		}
	}
}
