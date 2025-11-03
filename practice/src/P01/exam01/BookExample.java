package P01.exam01;

import java.util.Scanner;

public class BookExample {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.print("제목: ");
		String title = sc.nextLine();

		System.out.print("저자: ");
		String author = sc.nextLine();
		
		System.out.print("가격: ");
		int price = sc.nextInt();
		
		System.out.print("파일크기: ");
		int fileSize = sc.nextInt();
		
		sc.close();
		
		EBook ebook = new EBook(title, author, price, fileSize);
		
		ebook.printInfo();
		
	}
	

}
