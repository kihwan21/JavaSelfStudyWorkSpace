import java.util.Scanner;
public class ArrayAccess {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		
		int intArray[] = new int[5]; //�迭 ����
		int max = 0;
		System.out.println("��� 5���� �Է��ϼ���");
		for(int i=0; i < 5; i++) {
			intArray[i] = scanner.nextInt(); //�Է¹��� ������ �迭�� ��¡
			if(intArray[i] > max) {
				max = intArray[i];
			}
		}
		System.out.print("���� ū ����" + max + "�Դϴ�");
		scanner.close();
	}
}


//import java.util.Scanner;
//
//public class ArrayAccess {
//	public static void main(String[] args) {
//		int intArray[] = new int[5];
//		int sum = 0;
//		
//		Scanner scanner = new Scanner(System.in);
//		System.out.print(intArray.length + "���� ������ �Է��ϼ���>>");
//		for(int i=0; i<intArray.length; i++) {
//			intArray[i] = scanner.nextInt(); //Ű���忡�� �Է¹��� ���� ����
//		}
//		for(int i=0; i<intArray.length; i++) {
//			sum += intArray[i]; //�迭�� ����� ���� �� ���ϱ�
//		}
//		System.out.print("�����" + (double)sum/intArray.length);
//		scanner.close();
//	}
//}

//public class ArrayAccess {
//	enum Week { ��, ȭ, ��, ��, ��, ��, �� }
//	
//	public static void main(String[] args) {
//		int [] n = {1,2,3,4,5};
//		String names[] = {"���", "��", "�ٳ���", "ü��", "����", "����"};
//		int sum = 0;
//		
//		//�Ʒ� for-each����k�� n[0], n[1], .... , n[4]�� �ݺ�
//		for(int k : n) {   //for each ��
//			System.out.print(k + " ");
//		}
//		System.out.println();
//		
//		//�Ʒ� for each ������ s�� names[0], names[1], ... names[5]�� �ݺ�
//		for (String s : names) {
//			System.out.print(s + " ");
//		}
//		System.out.println();
//		
//		//�Ʒ� for each���� day�� ��,ȭ,��,��,��,��,�� ������ �ݺ�
//		for(Week day : Week.values()) {
//			System.out.print(day + "����");
//			System.out.print(" ");
//		}
//		System.out.println();
//	}
//}