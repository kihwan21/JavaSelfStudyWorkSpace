import java.util.Scanner;

public class Dict {
	private static String [] no = {"1", "2", "3", "4", "5"};
	private static String [] eng = {"one", "two", "three", "four", "five"};
	public static String Eng2No(String word) {
		return word;
	}
	public Dict() {
		this.no=no;
		this.eng=eng;
	}
	
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("*** English to Number Translation App ***");
		System.out.println("*** Programmer : Ki-Hwan Kim, 2019680078");
		System.out.print("Input word[if you want to quit, input \"stop\"]>>");
		String num = scanner.next();
		
		while(true) {
			if(num.equals("stop")) {
				System.out.println("=> Program is terminated. Bye!!");
				break;
			}
			else if((num.equals("one")) || (num.equals("two")) || (num.equals("three")) 
					|| (num.equals("four")) || (num.equals("five"))) {
				
				System.out.println("=>"+num+" "+"is"+"�������� ���߽��ϴ�.");
				System.out.print("Input word[if you want to quit, input \"stop\"]>>");
				num = scanner.next();  //�Է� �� �ʱ�ȭ �κ�
				continue;
			}
			else {
				System.out.println(num +"=> dosen't exist in the dictionary");
				System.out.print("Input word[if you want to quit, input \"stop\"]>>");
				num = scanner.next();  //�Է� �� �ʱ�ȭ �κ�
				continue;
			}
		}
	}
}
