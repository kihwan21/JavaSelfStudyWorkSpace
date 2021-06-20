//public class Hello1 {
//	public static void main(String[] args) {
//		double score[] [] = {{3.3, 3.4}, //1학년 1, 2 학기 평점
//							{3.5, 3.6},	// 2학년 1, 2 학기 평점
//							{3.7, 4.0}, // 3학년 1, 2 학기 평점
//							{4.1, 4.2}};	// 4학년 1, 2 학기 평점
//		double sum=0;
//		for(int year=0; year<score.length; year ++) {  //각학년별로 반복 
//		 for(int term = 0; term<score[year].length; term++) {  // 학기별로 반복
//			 sum += score[year][term]; //전체 평점 합
//		 }
//		}
//		int n = score.length;
//		int m = score[0].length;
//		System.out.println("4학년 전체 평균은" + sum/(n*m));
//	}
//}

public class Hello1 {
	public static void main(String[] args) {
		double score[][] = {{1, 2}, {3, 4}};	// 4학년 1, 2 학기 평점
		double sum=0;
		int year = 0;
		int term = 0;
		String name = "위";
		
		System.out.println(score.length);
		for(year=0; year<score.length; year ++) {  //각학년별로 반복
			System.out.println(term<score[year].length);
			System.out.print(name);
		 for(term = 0; term<score[year].length; term++) {  // 학기별로 반복
			 sum += score[year][term]; //전체 평점 합
			 System.out.println(term<score[year].length);
		 }
		
		int n = score.length;
		int m = score[0].length;
		
		System.out.println(n);
		System.out.println(m);
		System.out.println(sum);
		System.out.println("4학년 전체 평균은" + sum/(n*m));
		}
	}
}	