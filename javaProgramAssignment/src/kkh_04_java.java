//import java.util.Scanner;
//
//public class kkh_04_java {
//	
//	public static void main(String[] args) {
//		Scanner scanner = new Scanner(System.in);
//		System.out.println("{����}");
//		System.out.print("x��>>");
//		int x = scanner.nextInt();
//		System.out.print("��ȣ>>");
//		String sign = scanner.next();
//		System.out.print("y��>>");
//		int y = scanner.nextInt();
//		
//		String plus = "+";
//		String minus = "-";
//		String multiplication = "*";
//		String division = "/";
//		
//		int result = 0;
//		
//		if(sign.equals(plus)) {
//			result = x+y;
//			System.out.println("����>>"+x+" "+plus+" "+y);
//		}
//		else if(sign.equals(minus)){
//			result = x-y;
//			System.out.println("����>>"+x+" "+minus+" "+y);
//		}
//		else if(sign.equals(multiplication)){
//			result = x*y;
//			System.out.println("����>>"+x+" "+multiplication+" "+y);
//		}	
//		else if(sign.equals(division)){
//			if(y==0) {  //0���� �������� ��Ƴ���. 
//				System.out.println("0���� ������ �����ϴ�!");
//			}
//			else if(y >= 1) {
//				result = x/y;
//				System.out.println("����>>"+x+" "+division+" "+y);
//			}		
//		}
//		scanner.close();
//		System.out.print(result);
//	}
//}



//  switch��

import java.util.Scanner;

public class kkh_04_java {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("{����}");
		System.out.print("x��");
		int x = scanner.nextInt();
		System.out.print("��ȣ");
		String sign = scanner.next();
		System.out.print("y��");
		int y = scanner.nextInt();
		
		int result = 0;
		
		switch(sign) {
			
			case "+" :
				result = x+y;
				System.out.println("����>>"+x+" "+"+"+" "+y);
				break;
			case "-":
				result = x-y;
				System.out.println("����>>"+x+" "+"-"+" "+y);
				break;
			case "*":
				result = x*y;
				System.out.println("����>>"+x+" "+"*"+" "+y);
				break;
			case "/":
				if(y==0) {  //0���� �������� ��Ƴ���. 
					System.out.println("0���� ������ �����ϴ�!");
				}
				else if(y >= 1) {
					result = x/y;
					System.out.println("����>>"+x+" "+"/"+" "+y);
				}	
		}
		System.out.println(result);
		scanner.close();
	}
}
	
