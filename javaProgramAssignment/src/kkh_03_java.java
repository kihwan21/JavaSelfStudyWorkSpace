import java.util.Scanner;

public class kkh_03_java {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("x1, y1�� ��ǥ���� �Է����ּ���");  
		System.out.print("x����>>");
		int x1 = scanner.nextInt(); //x1 ���� ����
		System.out.print("y����>>");
		int y1 = scanner.nextInt(); //y1 ���� ����
		
		System.out.println("x2, y2�� ��ǥ���� �Է����ּ���");
		System.out.print("x����>>");
		int x2 = scanner.nextInt(); //x2�� ���� ����
		System.out.print("y����>>");
		int y2 = scanner.nextInt(); //y2�� ���� ����
		
		if(x1 <=x2 && y1 <= y2) {  // ���� ��
			System.out.print("���簢���� ���� �浹�մϴ�.");
		}
		else {
			System.out.print("���簢���� ���� �浹���� �ʽ��ϴ�.");
		}
		scanner.close();
	}
}
