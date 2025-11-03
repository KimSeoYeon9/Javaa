package P01.exam01;

import java.util.Scanner;

public class MovieExample {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.print("제목: ");
		String title = sc.nextLine();
		
		System.out.print("감독: ");
		String director = sc.nextLine();
		
		System.out.print("평점: ");
		double rating = sc.nextInt();
		
		sc.close();
		
		Movie movie = new Movie(title, director, rating);
		
		movie.printInfo();
	}

}
