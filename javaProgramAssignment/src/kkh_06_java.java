import java.util.Scanner;

public class kkh_06_java {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		int [] unit = {50000,10000,1000,500,100,50,10,1}; //환산할 돈의 종류
		
		System.out.println("금액을 입력하시오>>");
		int money = scanner.nextInt();
		
		for(int i=0; i<unit.length; i++) {
			if(money/unit[i]!=0) { 
				System.out.println(unit[i]+"원 짜리 : "+(money/unit[i]+"개")); //입력받은 값 나누기
				money = money%unit[i]; // 나머지도 계산 해주기 위함. 
			}
		}
		scanner.close();
	}
}
