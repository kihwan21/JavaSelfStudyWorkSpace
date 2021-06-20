/*
import java.util.Scanner;
public class SwitchPractice {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		
		System.out.println("어떤 커피 드릴까요?");
		String order = scanner.next();
		
		int price = 0;
		switch (order) {
			case "카푸치노":
			case "아메리카노":
			case "라떼":
				price = 3000;
				break;
			case "에스프레소":
				price = 2500;
				break;
			default: 
				System.out.println("메뉴에 없습니다.");
		}
		if (price != 0) System.out.print(order + "는" + price + "원입니다.");
		scanner.close();
	}
}
*/

import java.util.Scanner;
public class SwitchPractice {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		
		System.out.println("어떤 커피 드릴까요?");
		String order = scanner.next();
		String americano = "아메리카노";
		String lattle = "라떼";
		
		int price = 0;
		if (order.equals(americano)) {
			price = 2500;
		}
		else if (order.equals(lattle)) {
			price = 3000;
		}
		if (price != 0) {
			System.out.print(order + "는" + price + "원입니다.");
		}
		scanner.close();
	}
}