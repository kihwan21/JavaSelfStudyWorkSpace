//public class LoopWhile {
//	public static void main(String[] args) {
//		int i = 0;
//		while(i<10) {
//			System.out.print(i);
//			i++;
//		}
//	}
//}
//import java.util.Scanner;
//
//public class LoopWhile {
//	public static void main(String[] args) {
//		int count = 0;
//		int sum = 0;
//		
//		Scanner scanner = new Scanner(System.in);
//		System.out.println("������ �Է��ϰ� �������� -1�� �Է��ϼ���");
//		
//		int n = scanner.nextInt(); //���� �Է�
//		while(n != -1) {
//			sum += n;
//			count++;
//			n = scanner.nextInt(); // ���� �Է��� �ݺ��ؼ� �������� ��
//		}
//		if(count == 0) {
//			System.out.println("�Էµ� ���� �����ϴ�.");
//		}
//		else {
//			System.out.print("������ ������" + count + "���̸�");
//			System.out.println("�����" + (double)sum/count + "�Դϴ�.");
//		}
//		scanner.close();
//	}
//}	

import java.util.Scanner;
public class LoopWhile {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		
		System.out.println("������ 5�� �Է��ϼ���");
		int sum=0;
		for(int i=0; i<5; i++) {
			int n = scanner.nextInt();
			if(n<=0) {
				continue; // ����� �ƴ� ��� ���� �ݺ����� ����
			}else { 
				sum += n; // ����� ��� 
			} 
		
		} scanner.close();
		System.out.println("����� ����" + sum);
	}
}
