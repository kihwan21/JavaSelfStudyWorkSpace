//import java.util.Scanner;
//
//public class PracticeError { // DevideByZeroHandling
//	public static void main(String[] args) {
//		Scanner scanner = new Scanner(System.in);
//		while(true) {
//			System.out.print("�������� �Է��Ͻÿ�:"); 
//			int dividend = scanner.nextInt(); // ������ �Է�
//			System.out.print("�������� �Է��Ͻÿ�:"); 
//			int divisor = scanner.nextInt(); // ������ �Է�
//			try {
//				System.out.println(dividend + "�� "+ divisor + "�� ������ ����" + dividend/divisor + "�Դϴ�.");
//				break; // �������� ������ �Ϸ� �� while �����
//			}
//			catch(ArithmeticException e) { // ArithmeticException ���� ó�� �ڵ�
//				System.out.println("0���� ���� �� �����ϴ�! �ٽ� �Է��ϼ���");
//			}
//		}
//		scanner.close();
//	}
//}

//import java.util.Scanner;
//import java.util.InputMismatchException;
//	public class PracticeError {  //InputException
//		public static void main(String[] args) {
//		Scanner scanner = new Scanner(System.in);
//		System.out.println("���� 3���� �Է��ϼ���");
//		int sum=0, n=0;
//		for(int i=0; i<3; i++) {
//			System.out.print(i+">>");
//			try {
//				n = scanner.nextInt(); // ���� �Է�
//			}
//			catch(InputMismatchException e) {
//				System.out.println("������ �ƴմϴ�. �ٽ� �Է��ϼ���!");
//				scanner.next(); // �Է� ��Ʈ���� �ִ� ������ �ƴ� ��ū�� ������.
//				i--; // �ε����� �������� �ʵ��� �̸� ����
//				continue; // ���� ����
//			}
//			sum += n; // ���ϱ�
//		}
//		System.out.println("���� " + sum);
//		scanner.close();
//	}
//}


public class PracticeError {      //NumException
	public static void main (String[] args) {
		String[] stringNumber = {"23", "12", "3.141592", "998"}; 
		int i=0;
		try {
			for (i=0; i<stringNumber.length; i++) {
				int j = Integer.parseInt(stringNumber[i]);
				System.out.println("���ڷ� ��ȯ�� ���� " + j);
			}
		}
		catch (NumberFormatException e) {
			System.out.println(stringNumber[i] + "�� ������ ��ȯ�� �� �����ϴ�.");
		}
	}
}
