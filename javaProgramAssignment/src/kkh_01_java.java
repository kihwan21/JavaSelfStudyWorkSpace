import java.util.Scanner;

public class kkh_01_java {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.print("2�ڸ��� ���� �Է�(10~99)>>");  //�Է� �ޱ�
		int num = scanner.nextInt();
		
		if(num<=9 || num > 100 || num == 0) {  //������ �Ѵ°Ŵ� �ɷ�����
			System.out.println("10~99 ���� �־��ּ���");
		}
		else if(num/10 == num%10) { //�Է¹޴� ���� 10���� ������ �������� ���� ���ϱ�
			System.out.println("Yes! 10���ڸ��� 1�� �ڸ��� �����ϴ�.");
		}
		else {
			System.out.println("No! 10�� �ڸ��� 1�� �ڸ��� ���� ���� �Է��ϼ���.");
		}
		scanner.close();		
	}
}
