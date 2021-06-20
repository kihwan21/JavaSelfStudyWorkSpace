/*
import java.util.Scanner;
public class SwitchPractice {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		
		System.out.println("� Ŀ�� �帱���?");
		String order = scanner.next();
		
		int price = 0;
		switch (order) {
			case "īǪġ��":
			case "�Ƹ޸�ī��":
			case "��":
				price = 3000;
				break;
			case "����������":
				price = 2500;
				break;
			default: 
				System.out.println("�޴��� �����ϴ�.");
		}
		if (price != 0) System.out.print(order + "��" + price + "���Դϴ�.");
		scanner.close();
	}
}
*/

import java.util.Scanner;
public class SwitchPractice {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		
		System.out.println("� Ŀ�� �帱���?");
		String order = scanner.next();
		String americano = "�Ƹ޸�ī��";
		String lattle = "��";
		
		int price = 0;
		if (order.equals(americano)) {
			price = 2500;
		}
		else if (order.equals(lattle)) {
			price = 3000;
		}
		if (price != 0) {
			System.out.print(order + "��" + price + "���Դϴ�.");
		}
		scanner.close();
	}
}