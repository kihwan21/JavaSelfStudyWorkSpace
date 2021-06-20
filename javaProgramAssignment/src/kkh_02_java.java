import java.util.Scanner;

public class kkh_02_java {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.print("1~99사이의 정수를 입력하시오>>");
		int num = scanner.nextInt();
		
		if(num >=1 && num <= 99) {
			int a = num/10;
			int b = num%10;
			
			if((a==3 || a==6 || a==9) && (b==3 || b==6 || b==9)) { //and를 이용해서 ab둘다 만족하는 경우
				System.out.println("박수짝짝");
			}
			else if((a==3 || a==6 || a==9) || (b==3 || b==6 || b==9)){  //or를 이용해서 ab둘중 하나라도 만족하는 경우
				System.out.println("박수짝");
			}
			else { //아무것도 아닌 그냥 숫자 값
				System.out.println(num);
			}
		}
		else if(num == 0 || num > 99) { // 0 혹은 100 이상의 값을 부를 때
			System.out.println("범위를 넘었습니다.");
		}
		scanner.close();
	}
}
