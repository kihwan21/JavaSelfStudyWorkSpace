import java.util.Scanner;

public class kkh_05_java {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.print("�ҹ��� ���ĺ� �ϳ��� �Է��Ͻÿ�>>");
		String s = scanner.next();  //���ڿ� �б�
		char c = s.charAt(0);       // ���ڿ��� ù ��° ����
		
		for(int i=0; i<=c-'a'; i++) {
			for(char j='a'; j<=c-i; j++) {
				System.out.print(j);
			}
			System.out.println();
			scanner.close();
		}
	}
}