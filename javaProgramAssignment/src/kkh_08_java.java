//public class kkh_08_java {
//	public static void main(String[] args) {
//		
//		int array[][] = new int[10][10];
//		int num=0;
//		
//		for(int i=0; i<array.length; i++) {
//			for(int j=0; j<array.length; j++) {
//				System.out.print(array[i][j]+"\t");
//				if(num<=100) {
//					int a;
//					int b;
//					a=num/10;
//					b=num%10;
//					
//					if((a==3 || a==6 || a==9) && (b==3 || b==6 || b==9)) { //and를 이용해서 ab둘다 만족하는 경우
//						System.out.println("짝짝");
//					
//					}
//					else if((a==3 || a==6 || a==9) || (b==3 || b==6 || b==9)){  //or를 이용해서 ab둘중 하나라도 만족하는 경우
//						System.out.println("짝");
//					}
//				}
//
//			}
//
//		}
//	}
//}

//public class kkh_08_java {
//	public static void main(String[] args) {
//		
//		int array[][] = new int[10][10];
//		int num=0;
//		
//		for(int i=0;i<array.length;i++) { 
//			for(int j=0;j<array.length;j++) {
//				System.out.print(array[i][j]+"\t");
//				if(num<=100) {
//					int a;
//					int b;
//					a=num/10;
//					b=num%10;
//					
//					if((a==3 || a==6 || a==9) && (b==3 || b==6 || b==9)) { //and를 이용해서 ab둘다 만족하는 경우
//						System.out.println("짝짝");
//					
//					}
//					else if((a==3 || a==6 || a==9) || (b==3 || b==6 || b==9)){  //or를 이용해서 ab둘중 하나라도 만족하는 경우
//						System.out.println("짝");
//					}
//				}
//
//			}
//			System.out.println();
//
//		}
//	}
//}


//public class kkh_08_java {
//	public static void main(String[] args) {
//		
//		int array[][] = new int[10][10];
//		int num=0;
//		
//		if(num<=100) {
//			int a;
//			int b;
//			a=num/10;
//			b=num%10;
//			
//			if((a==3 || a==6 || a==9) && (b==3 || b==6 || b==9)) { //and를 이용해서 ab둘다 만족하는 경우
//				String doubleClap = "짝짝";
//			
//			}
//			else if((a==3 || a==6 || a==9) || (b==3 || b==6 || b==9)){  //or를 이용해서 ab둘중 하나라도 만족하는 경우
//				String singleClap = "짝";
//			}
//			for(int i=0; i<array.length; i++) {
//				for(int j=0; j<array.length; j++) {
//					System.out.print(array[i][j]+ "\t");
//				
//				}
//				System.out.println();
//
//			}
//
//		}
//	}
//}




//public class kkh_08_java {
//	public static void main(String[] args) {
//		
//		int array[] = {1,2,3,4,5,6,7,8,9,10,11,12,13,14,15,16,17,18,19,20,21,22,23,24,25,26,27,28,29,30,31,32,33,34,35,36,37,38,39,40,41,42,43,44,45,46,47,48,49,
//				50,51,52,53,54,55,56,57,58,59,60,61,62,63,64,65,66,67,68,69,70,71,72,73,74,75,76,77,78,79,80,81,82,83,84,85,86,87,88,89,90,91,92,93,94,95,96,97,98,99,100} ;
//		int num=0;
//		
//		if(num<=100) {
//			int a;
//			int b;
//			a=num/10;
//			b=num%10;
//			
//			if((a==3 || a==6 || a==9) && (b==3 || b==6 || b==9)) { //and를 이용해서 ab둘다 만족하는 경우
//				String doubleClap = "짝짝";
//			
//			}
//			else if((a==3 || a==6 || a==9) || (b==3 || b==6 || b==9)){  //or를 이용해서 ab둘중 하나라도 만족하는 경우
//				String singleClap = "짝";
//			}
//			for(int i=0; i<10; i++) {
//				for(int j=0; j<10; j++) {
//					System.out.print(array[j]+ "\t");
//				
//				}
//				System.out.println();
//
//			}
//
//		}
//	}
//}

//가능성 있음.
//public class kkh_08_java {
//	public static void main(String[] args) {
//		
//		int array[][] = new int[10][10];
//		
//		int num=0;
//		
//		if(num<=100) {
//			for(num=0; num<=100; num++) {
//				int a=num/10;
//				int b=num%10;
//				
//				if((a==3 || a==6 || a==9) && (b==3 || b==6 || b==9)) { //and를 이용해서 ab둘다 만족하는 경우
//					String DoubleClap = "짝짝";
//				
//				}
//				else if((a==3 || a==6 || a==9) || (b==3 || b==6 || b==9)){  //or를 이용해서 ab둘중 하나라도 만족하는 경우
//					String SingleClap = "짝";
//				}
//			}
//			
//			for(int i=0; i<array.length; i++) {
//				for(int j=0; j<array.length; j++) {
//					System.out.print(array[i][j]+ "\t");	
//				}
//				System.out.println();
//			}
//		}
//	}
//}

//가능성있음 0.0.1
//public class kkh_08_java {
//	public static void main(String[] args) {
//		
//		int array[][] = new int[10][10];
//		int num=0;		
//		String DoubleClap = null;
//		String SingleClap = null;		
//		
//		for(num=0; num<=100; num++) {
//			int a=num/10;
//			int b=num%10;
//			
//			if((a==3 || a==6 || a==9) && (b==3 || b==6 || b==9)) { //and를 이용해서 ab둘다 만족하는 경우
//				DoubleClap = "짝짝";
//			}
//			else if((a==3 || a==6 || a==9) || (b==3 || b==6 || b==9)){  //or를 이용해서 ab둘중 하나라도 만족하는 경우
//				SingleClap = "짝";
//			}
//		}
//		for(int i=0; i<array.length; i++) {
//			for(int j=0; j<array.length; j++) {
//				System.out.print(array[i][j]+ "\t");	
//			}
//			System.out.println();
//		}
//	}
//}

//가능성 있음 0.0.2
public class kkh_08_java {
	public static void main(String[] args) {
		
		int array[][] = new int[10][10];
		int num=0;
		
		String DoubleClap = null;
		String SingleClap = null;		
		
		for(num=0; num<=100; ++num) {
			num+=1;
			for(int i=0; i<array.length; i++) {
				for(int j=0; j<array.length; j++) {
					int a=num/10;
					int b=num%10;
					
					if((a==3 || a==6 || a==9) && (b==3 || b==6 || b==9)) { //and를 이용해서 ab둘다 만족하는 경우
						DoubleClap = "짝짝";
						System.out.println(DoubleClap);
					}
					else if((a==3 || a==6 || a==9) || (b==3 || b==6 || b==9)){  //or를 이용해서 ab둘중 하나라도 만족하는 경우
						SingleClap = "짝";
						System.out.println(SingleClap);
					}
					System.out.print(array[i][j]+ "\t");
				}
				System.out.println();	
			}					
				
		}
				
	}
}



//가능성 없음.
//public class kkh_08_java {
//
//	public static void main(String[] args) {
//		int i=1;
//		int first;
//		int second;
//		while(i<100){
//			first=i/10;
//			second=i%10;
//			if((first%3==0&&first!=0) || second%3==0){
//				System.out.print(i+ " 박수 ");
//				if((first%3==0&&first!=0) && second%3==0)
//					System.out.println("두번");
//				else
//					System.out.println("한번");
//				
//			}
//			i++;
//		}
//	}

//}