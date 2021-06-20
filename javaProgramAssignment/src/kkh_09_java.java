import java.util.InputMismatchException;
import java.util.Scanner;

public class kkh_09_java {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
	
		while(true) {
			try {
				System.out.print("���ϰ��� �ϴ� �� �� �Է�>>");
				int x = scanner.nextInt();
				int y = scanner.nextInt();
				int result = x*y;
				System.out.println(x + "x" + y + "=" + result);
				break;
			}
			catch(InputMismatchException e) {
				System.out.println("�Ǽ��� �Է��ϸ� �ȵ˴ϴ�.");
				scanner.next(); //�̹� �Էµ� ���� ����� ���ؼ� �����.
			}
		}
		scanner.close();
	}
}



