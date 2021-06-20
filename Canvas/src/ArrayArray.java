//public class ArrayArray {
//
//	public static void main(String[] args) {
//		int intArray[][]= new int[5][5]; //배열 선언
//		int sum =0;
//		double mean=0;
//
//		for(int i=0;i<intArray.length;i++) { 
//			for(int j=0;j<intArray.length;j++) {
//				intArray[i][j]=(int)(Math.random()*10+1); //렌덤하게 값을 줌.
//				System.out.print(intArray[i][j]+"\t");
//				sum += intArray[i][j];
//			}
//			System.out.println("");
//		}
//		mean = (double)sum/(double)(intArray.length* intArray[0].length);
//		System.out.println("===> intArray 요소들의 평균 값"+mean);
//		
//		System.out.println("\n 평균이하/이상 효 >> 평균값:"+ mean);
//		for(int i=0;i<intArray.length;i++) { 
//			for(int j=0;j<intArray.length;j++) {
//				if((double)intArray[i][j]>mean) {
//					System.out.print(intArray[i][j]+": ▲" + "\t");
//					System.out.print(intArray[i][j]+"\t");
//				}
//				else {
//					System.out.print(intArray[i][j]+": ▼" + "\t");
//					System.out.print(intArray[i][j]+"\t");
//				}
//				
//				System.out.println();
//				}
//		}
//	}
//}

public class ArrayArray {
	public static void main (String[] args) {
		int intArray[][] = new int[5][5];
		int sum=0;
		double mean=0;
		
		for (int i=0; i<intArray.length; i++)
			for (int j=0; j<intArray[i].length; j++) {
				intArray[i][j] = (int)(Math.random()*9 + 1); // 1부터 9사이의 임의의 수 생성하여 저장
				sum += intArray[i][j]; //누적합
			}
		mean = (double)sum/(double)(intArray.length* intArray[0].length); //평균	
		//값 출력
		for (int i=0; i<intArray.length; i++) {
			for (int j=0; j<intArray[i].length; j++)
				System.out.print(intArray[i][j] + "\t");
			System.out.println();
		}
		System.out.println("==>> intArray 요소들의 평균 값: " + mean);
		System.out.println();
		
		//평균과 비교하여 해당 기호 출력: 값>평균 -> ▲,값<평균 -> ▼
		System.out.println("\n평균 이상/이하 표 >> 평균값: " + + mean);
		for (int i=0; i<intArray.length; i++) {
			for (int j=0; j<intArray[i].length; j++)
				if((double)intArray[i][j]>mean)
					System.out.print(intArray[i][j]+": ▲" + "\t");
				else
					System.out.print(intArray[i][j]+": ▼" + "\t");
			System.out.println();
		}
	}
}

