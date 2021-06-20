//import java.util.Scanner;
//
//public class kkh_04_java {
//	
//	public static void main(String[] args) {
//		Scanner scanner = new Scanner(System.in);
//		System.out.println("{연산}");
//		System.out.print("x값>>");
//		int x = scanner.nextInt();
//		System.out.print("부호>>");
//		String sign = scanner.next();
//		System.out.print("y값>>");
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
//			System.out.println("연산>>"+x+" "+plus+" "+y);
//		}
//		else if(sign.equals(minus)){
//			result = x-y;
//			System.out.println("연산>>"+x+" "+minus+" "+y);
//		}
//		else if(sign.equals(multiplication)){
//			result = x*y;
//			System.out.println("연산>>"+x+" "+multiplication+" "+y);
//		}	
//		else if(sign.equals(division)){
//			if(y==0) {  //0으로 나눴을때 잡아내기. 
//				System.out.println("0으로 나눌수 없습니다!");
//			}
//			else if(y >= 1) {
//				result = x/y;
//				System.out.println("연산>>"+x+" "+division+" "+y);
//			}		
//		}
//		scanner.close();
//		System.out.print(result);
//	}
//}



//  switch문

import java.util.Scanner;

public class kkh_04_java {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("{연산}");
		System.out.print("x값");
		int x = scanner.nextInt();
		System.out.print("부호");
		String sign = scanner.next();
		System.out.print("y값");
		int y = scanner.nextInt();
		
		int result = 0;
		
		switch(sign) {
			
			case "+" :
				result = x+y;
				System.out.println("연산>>"+x+" "+"+"+" "+y);
				break;
			case "-":
				result = x-y;
				System.out.println("연산>>"+x+" "+"-"+" "+y);
				break;
			case "*":
				result = x*y;
				System.out.println("연산>>"+x+" "+"*"+" "+y);
				break;
			case "/":
				if(y==0) {  //0으로 나눴을때 잡아내기. 
					System.out.println("0으로 나눌수 없습니다!");
				}
				else if(y >= 1) {
					result = x/y;
					System.out.println("연산>>"+x+" "+"/"+" "+y);
				}	
		}
		System.out.println(result);
		scanner.close();
	}
}
	
