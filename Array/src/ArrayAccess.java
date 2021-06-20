//import java.util.Scanner;
//public class ArrayAccess {
//	public static void main(String[] args) {
//		Scanner scanner = new Scanner(System.in);
//		
//		int intArray[] = new int[5]; //배열 생성
//		int max = 0;
//		System.out.println("양수 5개를 입력하세요");
//		for(int i=0; i < 5; i++) {  //5번 반복
//			intArray[i] = scanner.nextInt(); //입력받은 정수를 배열에 저징
//			
//			if(intArray[i] > max) { //intArray[i]가 현제 가장 큰 수보다 크면
//				max = intArray[i]; // intArray[i]를 max로 변경
//			}
//		}
//		System.out.print("가장 큰 수는" + max + "입니다");
//		scanner.close();
//	}
//}
/*
 max = (intArray[i] > max)? intArray[i]: max;
 System.out.print("step" + (i+1) + "값 입니다.")
 */

//import java.util.Scanner;
//
//public class ArrayAccess {
//	public static void main(String[] args) {
//		int intArray[] = new int[5]; // 배열의 선언과 생성
//		int sum = 0;
//		
//		Scanner scanner = new Scanner(System.in);
//		System.out.print(intArray.length + "개의 정수를 입력하세요>>");
//		for(int i=0; i<intArray.length; i++) {
//			intArray[i] = scanner.nextInt(); //키보드에서 입력받은 정수 저장
//		}
//		for(int i=0; i<intArray.length; i++) {
//			sum += intArray[i]; //배열에 저장된 정수 값 더하기
//		}
//		System.out.print("평균은" + (double)sum/intArray.length);
//		scanner.close();
//	}
//}

//public class ArrayAccess {
//	enum Week { 월, 화, 수, 목, 금, 토, 일 }
//	
//	public static void main(String[] args) {
//		int [] n = {1,2,3,4,5};
//		String names[] = {"사과", "배", "바나나", "체리", "딸기", "포도"};
//		int sum = 0;
//		
//		//아래 for-each에서k는 n[0], n[1], .... , n[4]로 반복
//		for(int k : n) {   //for each 문
//			System.out.print(k + " ");
//		}
//		System.out.println();
//		
//		//아래 for each 문에서 s는 names[0], names[1], ... names[5]로 반복
//		for (String s : names) {
//			System.out.print(s + " ");
//		}
//		System.out.println();
//		
//		//아래 for each에서 day는 월,화,수,목,금,토,일 값으로 반복
//		for(Week day : Week.values()) {
//			System.out.print(day + "요일");
//			System.out.print(" ");
//		}
//		System.out.println();
//	}
//}

public class ArrayAccess {
	public static void main(String[] args) {
		int num = 923;
        int adress []  = {104, 120};
        String adress_kor = "경기도 광주시 경충대로";
        System.out.println(adress_kor+"산이리 대주아파트"+ adress[0]+"동"+adress[1]+"호"); 
   }
}




