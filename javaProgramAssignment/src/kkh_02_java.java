import java.util.Scanner;

public class kkh_02_java {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.print("1~99������ ������ �Է��Ͻÿ�>>");
		int num = scanner.nextInt();
		
		if(num >=1 && num <= 99) {
			int a = num/10;
			int b = num%10;
			
			if((a==3 || a==6 || a==9) && (b==3 || b==6 || b==9)) { //and�� �̿��ؼ� ab�Ѵ� �����ϴ� ���
				System.out.println("�ڼ�¦¦");
			}
			else if((a==3 || a==6 || a==9) || (b==3 || b==6 || b==9)){  //or�� �̿��ؼ� ab���� �ϳ��� �����ϴ� ���
				System.out.println("�ڼ�¦");
			}
			else { //�ƹ��͵� �ƴ� �׳� ���� ��
				System.out.println(num);
			}
		}
		else if(num == 0 || num > 99) { // 0 Ȥ�� 100 �̻��� ���� �θ� ��
			System.out.println("������ �Ѿ����ϴ�.");
		}
		scanner.close();
	}
}
