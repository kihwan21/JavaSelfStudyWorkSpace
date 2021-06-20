//public class LoopWhile {
//	public static void main(String[] args) {
//		int i = 0;
//		while(i<10) {
//			System.out.print(i);
//			i++;
//		}
//	}
//}
//import java.util.Scanner;
//
//public class LoopWhile {
//	public static void main(String[] args) {
//		int count = 0;
//		int sum = 0;
//		
//		Scanner scanner = new Scanner(System.in);
//		System.out.println("정수를 입력하고 마지막에 -1을 입력하세요");
//		
//		int n = scanner.nextInt(); //정수 입력
//		while(n != -1) {
//			sum += n;
//			count++;
//			n = scanner.nextInt(); // 정수 입력을 반복해서 받으려고 씀
//		}
//		if(count == 0) {
//			System.out.println("입력된 수가 없습니다.");
//		}
//		else {
//			System.out.print("정수의 개수는" + count + "개이며");
//			System.out.println("평균은" + (double)sum/count + "입니다.");
//		}
//		scanner.close();
//	}
//}	

import java.util.Scanner;
public class LoopWhile {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		
		System.out.println("정수를 5개 입력하세요");
		int sum=0;
		for(int i=0; i<5; i++) {
			int n = scanner.nextInt();
			if(n<=0) {
				continue; // 양수가 아닌 경우 다음 반복으로 진행
			}else { 
				sum += n; // 양수인 경우 
			} 
		
		} scanner.close();
		System.out.println("양수의 합은" + sum);
	}
}
