import java.util.Scanner;

public class kkh_06_java {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		int [] unit = {50000,10000,1000,500,100,50,10,1}; //ȯ���� ���� ����
		
		System.out.println("�ݾ��� �Է��Ͻÿ�>>");
		int money = scanner.nextInt();
		
		for(int i=0; i<unit.length; i++) {
			if(money/unit[i]!=0) { 
				System.out.println(unit[i]+"�� ¥�� : "+(money/unit[i]+"��")); //�Է¹��� �� ������
				money = money%unit[i]; // �������� ��� ���ֱ� ����. 
			}
		}
		scanner.close();
	}
}
