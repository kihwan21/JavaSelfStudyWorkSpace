//public class PlacticeArray {
//	public static void main(String[] args) {
//		double score[] [] = {{3.3, 3.4}, //1�г� 1, 2 �б� ����
//							{3.5, 3.6},	// 2�г� 1, 2 �б� ����
//							{3.7, 4.0}, // 3�г� 1, 2 �б� ����
//							{4.1, 4.2}};	// 4�г� 1, 2 �б� ����
//		double sum=0;
//		for(int year=0; year<score.length; year ++) {  //���г⺰�� �ݺ� 
//		 for(int term = 0; term<score[year].length; term++) {  // �б⺰�� �ݺ�
//			 sum += score[year][term]; //��ü ���� ��
//		 }
//		}
//		int n = score.length;
//		int m = score[0].length;
//		System.out.println("4�г� ��ü �����" + sum/(n*m));
//	}
//}

//public class PlacticeArray {
//	public static void main(String[] args) {
//		int intArray[][] = new int[4][]; // �� ���� ���۷��� �迭 ����
//		intArray[0] = new int[3]; // ù° ���� ���� 3���� �迭 ����
//		intArray[1] = new int[2]; // ��° ���� ���� 2���� �迭 ����
//		intArray[2] = new int[3]; // ��° ���� ���� 3���� �迭 ����
//		intArray[3] = new int[2]; // ��° ���� ���� 2���� �迭 ����
//		
//		for(int i=0; i <intArray.length; i++) { //�࿡ ���� �ݺ�
//			for(int j=0; j<intArray[i].length; j++) { //���� ���� �ݺ�
//				intArray[i][j] = (i+1)*10 + j;
//			}
//		}
//		for(int i=0; i<intArray.length; i++) {
//			for(int j=0; j<intArray[i].length; j++) {
//				System.out.print(intArray[i][j]+ " ");
//			}System.out.println(); // ���� �ٷ� �Ѿ��
//		} 
//	}
//}

//public class PlacticeArray {
//	static int[] makeArray() {
//		int temp[] = new int[4];
//		for(int i=0; i<temp.length; i++) { 
//			temp[i] = i; //�迭�� ���Ҹ� 0,1,2,3���� �ʱ�ȭ
//		}return temp;
//	}
//	
//	public static void main(String[] args) {
//		int intArray[]; // �迭 ���۷��� ���� ����
//		intArray = makeArray(); // �޼ҵ�κ��� ������ ���޹���
//		for(int i=0; i<intArray.length; i++) {
//			System.out.print(intArray[i] + " "); // �迭 ��� ���� ���
//		}
//	}
//}

//import java.util.Scanner;
//
//public class PlacticeArray { // DevideByZeroHandling
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
//	public class PlacticeArray {  //InputException
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

//public class PlacticeArray {      //NumException
//	public static void main (String[] args) {
//		String[] stringNumber = {"23", "12", "3.141592", "998"}; 
//		int i=0;
//		try {
//			for (i=0; i<stringNumber.length; i++) {
//				int j = Integer.parseInt(stringNumber[i]);
//				System.out.println("���ڷ� ��ȯ�� ���� " + j);
//			}
//		}
//		catch (NumberFormatException e) {
//			System.out.println(stringNumber[i] + "�� ������ ��ȯ�� �� �����ϴ�.");
//		}
//	}
//}






