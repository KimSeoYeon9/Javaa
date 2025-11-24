package exam1124;

//import java.util.InputMismatchException;
//import java.util.Scanner;
//
//public class Exam1 {
//	
//	// 사용자로부터 정수 2개를 입력받아 더한 값을 출력.
//	// try, catch를 이용해 비정상 종료되지 않도록 수정.
//	public static void main(String[] args) {
//		Scanner scanner = new Scanner(System.in);
//		try {
//			int num1 = scanner.nextInt();
//			int num2 = scanner.nextInt();
//			System.out.println((num1 + num2));
//		}
//		catch(InputMismatchException e) {
//			System.out.println(0);
//		}
//        
//		scanner.close();
//	}
//}


//import java.util.Scanner;
//
//public class Exam1 {
//	public void main(String[] args) {
//		
//		int[] values = {1, 3, 5, 7, 9};
//		
//		Scanner scanner = new Scanner(System.in);
//		System.out.println("인덱스를 선택하세요.");
//		
//		int index = scanner.nextInt();
//		System.out.println(values[index]);
//		
//		scanner.close();	
//	}
//}

//import java.util.Scanner;
//import java.util.InputMismatchException;
//public class Exam1 {
//	public static void main(String[] args) {
//		int[] values = {1, 3, 5, 7, 9};
//		int index = getIndex();
//		System.out.println(values[index]);
//	}
//	
//	public static int getIndex() {
//		Scanner scanner = scanner = new Scanner(System.in);
//		System.out.println("인덱스를 선택하세요.");
//		int index=0;
//		try {
//			 index = scanner.nextInt();
//		} catch(InputMismatchException e) {}
//		
//		scanner.close();
//		return index;
//	}
//}


